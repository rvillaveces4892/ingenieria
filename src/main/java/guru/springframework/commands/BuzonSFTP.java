package guru.springframework.commands;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;

/**
 * Nombre de clase = Sftp Descripci�n = Clase encarga de gestionar transacciones por el protocolo sftp
 * 
 * @version 1.0
 */
public class BuzonSFTP{

    private static Logger LOG=Logger.getLogger(BuzonSFTP.class);

    private static final String ROUTE_TMP_WIN=System.getProperty("os.name").equals("Windows 7")?"C:/tmp":"";

    /**
     * Atributos de Clase
     **/
    private JSch jsch;
    private Session session;
    private static ChannelSftp sftp;
    private String user;
    private String password;
    private String host;
    private Integer port;

    // ---------------------------------------------------------------------
    /**
     * Constructor de la clase
     * 
     * @param user
     * @param pasword
     * @param host
     */
    public BuzonSFTP(String user,String pasword,String host,Integer puerto){
        this.host=host;
        this.password=pasword;
        this.user=user;
        this.port=puerto;
        boolean conexion=false;
        if(sftp != null&& !sftp.isConnected()) {
            conexion=conectar();
        }
        System.out.println("Conecto ? "+conexion);
//        LOG.info("conectado ? "+(conexion?"si":"no"));
    }

    public BuzonSFTP(int ambiente){

        switch(ambiente){
            case 1:
                this.host="";
                this.password="";
                this.user="";
                this.port=0;
                break;
            case 2:
                this.host="172.24.1.184";
                this.user="admwas";
                this.password="w4s4dmin";
                this.port=22;
                break;
            case 3:
                this.host="172.25.13.40";
                this.password="w4s4dm1n$$";
                this.user="wasadmin";
                this.port=22;
                break;

            default:
                break;
        }
       
        boolean conexion=conectar();
        System.out.println("Conecto ? "+conexion);
    }

    // ---------------------------------------------------------------------
    /**
     * Constructor por defecto
     */
    public BuzonSFTP(){
        super();
    }
    // ---------------------------------------------------------------------

    /**
     * M�todo que establece la conexi�n con el ftp
     * 
     * @return boolean
     * @exception IOException
     */
    public boolean conectar(){
        boolean conect=true;

        try{
            // Connect to an SFTP server on port 22
            jsch=new JSch();
            session=jsch.getSession(user,host,port);
            session.setPassword(password);
            // El protocolo SFTP requiere un intercambio de claves
            // al asignarle esta propiedad le decimos que acepte la clave
            // sin pedir confirmaci�n
            Properties prop=new Properties();
            prop.put("StrictHostKeyChecking","no");
            session.setConfig(prop);
            session.connect();
            // Abrimos el canal de sftp y conectamos
            sftp=(ChannelSftp)session.openChannel("sftp");
            sftp.connect();
        }
        catch(JSchException e){
//            LOG.error("Error coneccion sftp JSchException = "+e.getMessage(),e);
            // System.out.println("JSchException ="+e.getMessage());
            conect=false;
        }
        return conect;
    }

    // -------------------------------------------------------------------
    /**
     * M�todo que cambia de directorio ,siendo este en el que queremos trabajar
     * 
     * @param String directorio
     * @return boolean
     * @exception IOException
     */
    public boolean cd(String directorio){
        Boolean ok=Boolean.TRUE;
        try{
            sftp.cd(directorio);
        }
        catch(SftpException e){
            ok=Boolean.FALSE;
            LOG.error("Error abrir directorio JSchException = "+e.getMessage(),e);
        }
        catch(Exception e){
            ok=Boolean.FALSE;
            LOG.error("Error abrir directorio JSchException = "+e.getMessage(),e);
        }
        return ok;
    }

    // -------------------------------------------------------------------
    /**
     * M�todo que crea un fichero en el sftp
     * 
     * @param String rutaFicheroSftp (ruta remota)
     * @param String rutaFichero (ruta local donde esta el fichero)
     * @return boolean
     * @exception IOException
     */
    public boolean crearFichero(String rutaFicheroSftp,String rutaFichero){
        try{
            sftp.put(rutaFichero,rutaFicheroSftp);
            return true;
        }
        catch(SftpException e){
            LOG.error("Error subir archivo JSchException = "+e.getMessage(),e);
        }
        return false;
    }

    // -------------------------------------------------------------------
    /**
     * M�todo que crea una carpeta en el sftp
     * 
     * @param String nombre de carpeta a crear
     * @return boolean
     * @exception IOException
     */
    public boolean crearCarpeta(String nombreCarpeta){
        try{
            sftp.mkdir(nombreCarpeta);
            return true;
        }
        catch(SftpException e){
            LOG.error("Error crear carpeta JSchException = "+e.getMessage(),e);
        }
        return false;
    }

    // -------------------------------------------------------------------
    /**
     * M�todo que elimina un fichero del SFTP
     * 
     * @param String rutaFichero = ruta del fichero en el SFTP
     * @return boolean
     * @exception IOException
     */
    public boolean eliminarFichero(String rutaFichero){
        try{
            sftp.rm(rutaFichero);
            return true;
        }
        catch(SftpException e){
            LOG.error("Error eliminar archivo JSchException = "+e.getMessage(),e);
        }
        return false;
    }

    // -----------------------------------------------------------------
    /**
     * M�todo que cierra la conexion con el FTP
     * 
     * @return boolean
     * @exception IOException
     */
    public boolean desconectar(){
        sftp.exit();
        sftp.disconnect();
        session.disconnect();
        return true;
    }

    // -----------------------------------------------------------------
    /**
     * M�todo que obtiene el directorio actual, comando pwd
     * 
     * @return String
     * @exception IOException
     */
    public String directorioActual(){
        String ruta=null;
        try{
            ruta=sftp.pwd();
        }
        catch(SftpException e){
            System.out.println("SftpException ="+e.getMessage());
        }
        return ruta;
    }

    // -----------------------------------------------------------------
    /**
     * M�todo que obtiene un fichero del SFTP y lo crea en un otro directorio local
     * 
     * @param String rutaFichero = ruta del fichero en el SFTP
     * @param String rutaLocal = ruta en donde se creara el fichero
     * @return boolean
     * @exception IOException
     */
    public boolean getFichero(String rutaFichero,String rutaLocal){
        boolean retorno=true;
        try{
            OutputStream os=new BufferedOutputStream(new FileOutputStream(new File(rutaLocal)));
            // Iniciamos la transferencia
            sftp.get(rutaFichero,os);
            os.close();
        }
        catch(IOException e){
            LOG.error("Error leer fichero = "+e.getMessage(),e);
            retorno=false;
        }
        catch(SftpException e){
            LOG.error("Error al descargar fichero = "+e.getMessage(),e);
            retorno=false;
        }
        return retorno;
    }

    // -----------------------------------------------------------------

    public boolean uploadFile(FileInputStream src,String dst){
        Boolean ok=Boolean.TRUE;
        try{
            sftp.put(src,dst);
        }
        catch(Exception e){
            ok=Boolean.FALSE;
            LOG.error("Error al subir fichero = "+e.getMessage(),e);
        }
        return ok;
    }

    public boolean downloadFile(String directorioSFTP,String archivoSFTP,String directorioLocal){
        boolean retorno=false;
        try{
            directorioSFTP=directorioSFTP.endsWith("/")?directorioSFTP:directorioSFTP.concat("/");
            directorioLocal=directorioLocal.endsWith("/")?directorioLocal:directorioLocal.concat("/");
            OutputStream os=new BufferedOutputStream(new FileOutputStream(new File(directorioLocal+archivoSFTP)));
            // Iniciamos la transferencia
            sftp.get(directorioSFTP+archivoSFTP,os);
            os.close();
            retorno=true;
        }
        catch(Exception e){
            LOG.error("Error al subir fichero = "+e.getMessage(),e);
        }
        return retorno;
    }

    // -----------------------------------------------------------------

    /**
     * Renombra un archivo o una carpeta
     * 
     * @param oldpath ruta completa del archivo a renonbrar
     * @param newpath ruta completa del nuevo archivo
     * @return
     */
    public boolean renombrarArchivo(String oldpath,String newpath){
        Boolean modify=Boolean.TRUE;
        try{
            sftp.rename(oldpath,newpath);
        }
        catch(Exception e){
            LOG.error("Error al renombrar fichero = "+e.getMessage(),e);
            modify=Boolean.FALSE;
        }
        return modify;
    }
    // -----------------------------------------------------------------

    /**
     * Obtiene la �ltima fecha de modificacion de un fichero en milisegundos
     * 
     * @param filename
     * @return long de milisegundos de la ultima modificacion del fichero.
     * @throws IOException
     * @throws ParseException
     */
    public long getLastModifiedTime(String filename) throws IOException,ParseException{
        try{
            final SftpATTRS attrs=sftp.stat(filename);
            final DateFormat formater=new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",Locale.US);
            final String fechaString=attrs.getMtimeString();
            // System.out.println("obteniendo fecha ultima modificacion: "
            // +fechaString);
            final Date date=formater.parse(fechaString);
            return date.getTime();
            // return attrs.getMTime()*1000L;
        }
        catch(SftpException e){
            LOG.error("Error al obtener ultima fecha de modificacion de fichero = "+e.getMessage(),e);
            throw new IOException(e.getMessage());
        }
        catch(ParseException e){
            LOG.error("Error de parseo fecha al obtener ultima fecha de modificacion de fichero = "+e.getMessage(),e);
            throw e;
        }
    }
    // -----------------------------------------------------------------

    /**
     * lista los archivos que se encuentran en una ruta remota
     * 
     * @param path path a listar
     * @return {@link List} <{@link String}>
     * @throws Exception
     */
    public List<String> listarFichero(String path) throws Exception{
        final List<String> lista=new ArrayList<String>();
        try{
            @SuppressWarnings("unchecked")
            final Vector<LsEntry> vector=sftp.ls(path);
            for(int i=0;i<vector.size();i++){
                // System.out.println(vector.get(i).getFilename());
                // System.out.println("Time: "
                // +vector.get(i).getAttrs().getMtimeString());
                // DateFormat date=new SimpleDateFormat("EE MMM dd HH:mm:ss z
                // yyyy",Locale.US);
                // DateFormat datep=new SimpleDateFormat("dd/MM/yyyy");
                // System.out.println("HOLL: "+ date.format(new
                // Date(System.currentTimeMillis())));
                // System.out.println(date.parse(vector.get(i).getAttrs().getMtimeString()));
                // System.out.println(datep.format(date.parse(vector.get(i).getAttrs().getMtimeString())));
                lista.add(vector.get(i).getFilename());
            }
        }
        catch(Exception e){
            LOG.error("Error listar fichero = "+e.getMessage(),e);
        }
        return lista;
    }

    public String ejecutarComandoSH(String comando){
        Channel channel;
        StringBuilder outputBuffer=new StringBuilder();

        try{
            channel=session.openChannel("exec");
            ((ChannelExec)channel).setCommand(comando);
            InputStream commandOutput=channel.getInputStream();
            channel.connect();
            int readByte=commandOutput.read();

            while(readByte!=0xffffffff){
                outputBuffer.append((char)readByte);
                readByte=commandOutput.read();
            }
            channel.disconnect();

            return outputBuffer.toString();
        }
        catch(JSchException e){
            LOG.error("Error ejecutar comando = "+e.getMessage(),e);
            return "";
        }
        catch(IOException e){
            LOG.error("Error ejecutar comando = "+e.getMessage(),e);
            return "";
        }

    }

    public InputStream descargarZIP(String rutaFichero) throws SftpException{
        LOG.info("Inicio BuzonSFTP - descargarZIP -> "+new Date());
        InputStream archivoTempora=null;
        LOG.info("ruta fichero : "+rutaFichero+" directorio actual : "+directorioActual());
        try{
            archivoTempora=sftp.get(rutaFichero);

            LOG.info("Fin BuzonSFTP - descargarZIP -> "+new Date());
        }
        catch(SftpException e){
            LOG.error(e.id+" Error al descargar fichero = "+e.getMessage(),e);
            throw new SftpException(412,e.getMessage());
        }
        catch(Exception e){
            LOG.error("Error fichero "+e.getMessage(),e);
        }
        return archivoTempora;
    }

//    public ArchivoZipDTO iterarArchivoZip(InputStream archivoZip,ArchivoZipDTO out) throws BusinessRuleException{
//        LOG.info("Inicio BuzonSFTP - iterarArchivoZip -> "+new Date());
//        String rutaDestino=ROUTE_TMP_WIN+File.separator+"tmp"+File.separator+out.getNombreSinExt()+"-p/";
//        File directorioDestino=new File(rutaDestino);
//        InputStream inputStream=null;
//        ZipInputStream zipInputStream=null;
//        List<String> archivosDescomprimidos=new ArrayList<String>();
//        try{
//            if(!directorioDestino.exists()){
//                directorioDestino.mkdirs();
//            }
//
//            inputStream=archivoZip;
//            zipInputStream=new ZipInputStream(inputStream);
//            ZipEntry zipEntry=null;
//            while((zipEntry=zipInputStream.getNextEntry())!=null){
//                FileOutputStream fileOutputStream=new FileOutputStream(rutaDestino+zipEntry.getName());
//                int leer;
//                byte[] buffer=new byte[8192];
//                while(0<(leer=zipInputStream.read(buffer))){
//                    fileOutputStream.write(buffer,0,leer);
//                }
//                fileOutputStream.close();
//                zipInputStream.closeEntry();
//
//                archivosDescomprimidos.add(rutaDestino+zipEntry.getName());
//            }
//
//            if(archivosDescomprimidos.isEmpty())
//                throw new BusinessRuleException(415);
//
//            for(String rutaNombreArchivo:archivosDescomprimidos){
//                File archivo=new File(rutaNombreArchivo);
//                String nombreDocumento=archivo.getName();
//                String extension=FilenameUtils.getExtension(nombreDocumento);
//                DocumentosZipDTO doc=new DocumentosZipDTO(nombreDocumento,extension,archivo);
//                out.getDocumentos().put(nombreDocumento,doc);
//            }
//
//            LOG.info("Fin BuzonSFTP - iterarArchivoZip -> "+new Date());
//            return out;
//        }
//        catch(BusinessRuleException e){
//            LOG.error(e);
//            throw e;
//        }
//        catch(Exception e){
//            LOG.error(e);
//            return out;
//        }
//    }

    /**
     * lista los archivos que se encuentran en una ruta remota
     * 
     * @param path path a listar
     * @param extension extension de archivos a listar en el path
     * @return {@link List} <{@link String}>
     * @throws Exception
     */
    public List<String> listarFichero(String path,String extension) throws Exception{
        final List<String> lista=new ArrayList<String>();
        try{
            @SuppressWarnings("unchecked")
            final Vector<LsEntry> vector=sftp.ls(path);
            for(int i=0;i<vector.size();i++){
                if(vector.get(i).getFilename().toLowerCase().endsWith(extension.trim().toLowerCase())){
                    lista.add(vector.get(i).getFilename());
                }
            }
        }
        catch(Exception e){
            LOG.error("Error listar fichero = "+e.getMessage(),e);
        }
        return lista;
    }

    // -----------------------------------------------------------------

    // -----------------------------------------------------------------
    /**
     * Define el host al cual se va a realizar la conexion
     */
    public void setHost(String host){
        this.host=host;
    }

    // -----------------------------------------------------------------
    /**
     * Define la clave del host cual se va a realizar la conexion
     */
    public void setPassword(String password){
        this.password=password;
    }

    // -----------------------------------------------------------------
    /**
     * Define el usaurio con el que se van a conectar a la sesion sftp
     */
    public void setUser(String user){
        this.user=user;
    }

    // -----------------------------------------------------------------
    /**
     * Define el usaurio con el que se van a conectar a la sesion sftp
     */
    public Boolean close(){
        try{
            sftp.disconnect();
            session.disconnect();
            return true;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(session!=null&&session.isConnected()){
                session.disconnect();
            }
        }
        return false;
    }

    public String bytesToHex(byte[] hash){
        StringBuffer hexString=new StringBuffer();
        for(int i=0;i<hash.length;i++){
            String hex=Integer.toHexString(0xff&hash[i]);
            if(hex.length()==1)
                hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public ChannelSftp getSftp(){
        return sftp;
    }

    public void setSftp(ChannelSftp sftp){
        this.sftp=sftp;
    }

}
