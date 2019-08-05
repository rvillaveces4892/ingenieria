package guru.springframework.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

/**
 * Class MessageReader. Utileria lector de properties
 * 
 * Clase que permite leer archivos properties interpretarlos y pasar parametros para reemplazo en los mensajes.
 * 
 * @author Jorge Jimenez
 * @version: 1.0.0
 * @FechaCreacion: Jun 16, 2008
 * @FechaModificacion: Jun 16, 2008 10:26:50 AM
 */
public final class MessageReader{

    /* RUTAS DE UBICACION DE ARCHIVS PROPERTIES */
    /** Clave para properties asociada con operacion exitosa. */
    public static final String MESSAGE_NAME_FILE="messages";
    /** Clave para properties asociada con operacion exitosa. */
    public static final String SOS_MESSAGE_FILE="co.com.sos.guiMessages";

    private static final Logger LOG=Logger.getLogger(MessageReader.class.getName());

    /** The instance. */
    private static MessageReader instance=new MessageReader();

    /**
     * Creates a new MessageReader object.
     */
    private MessageReader(){
    }

    /**
     * implementacion de Singleton.
     * 
     * @return the instance
     */
    public static MessageReader getInstance(){
        return instance;
    }

    /**
     * Permite leer cualquier properties y subirlo a memoria como un ResourceBundle
     * 
     * @param prop
     * 
     * @return
     */
    public static ResourceBundle loadBundle(String prop,ClassLoader loader){

        ResourceBundle rsb=ResourceBundle.getBundle(prop,new Locale("en"),loader);

        return rsb;
    }

    /**
     * Permite leer un properties cuyo nombre corresponda con la constante KeyConstants.MESSAGE_NAME_FILE ubicado en el mismo package donde se ubica el objeto que se pasa como
     * parametro, el resultado se retorna como un ResourceBundle
     * 
     * @param o
     * 
     * @return
     */
    public static ResourceBundle loadBundle(Object o,ClassLoader loader){
        String prop=o.getClass().getPackage().getName()+"."+MESSAGE_NAME_FILE;

        return loadBundle(prop,loader);
    }

    /**
     * Retorna el string.
     * 
     * @param pKey , objeto key
     * 
     * @return el string
     */
    public static String getString(String pKey,ClassLoader loader){
        ResourceBundle rsb=loadBundle(loader);

        return rsb.getString(pKey);
    }

    /**
     * Retorna el valor definido en el properties definido en el primer parametro, que corresponde a la clave definida en el segundo parametro
     * 
     * @param pBundle
     * @param pKey
     * 
     * @return
     */
    public static String getString(String pBundle,String pKey,ClassLoader loader){
        ResourceBundle rsb=loadBundle(pBundle,loader);

        return rsb.getString(pKey);
    }

    /**
     * Retorna el string.
     * 
     * @param o un o .
     * @param pKey , objeto key
     * 
     * @return el string
     */
    public static String getString(Object o,String pKey,ClassLoader loader){
        ResourceBundle rsb=loadBundle(o,loader);

        return rsb.getString(pKey);
    }

    /**
     * Permite leer un properties cuyo nombre corresponda con la constante KeyConstants.SAT_MESSAGE_FILE, el resultado se retorna como un ResourceBundle
     * 
     * @return
     */
    public static ResourceBundle loadBundle(ClassLoader loader){
        String prop=SOS_MESSAGE_FILE;

        return loadBundle(prop,loader);
    }

    /**
     * Retorna el message.
     * 
     * @param pKey , objeto key
     * @param pParams , objeto params
     * 
     * @return el message
     */
    public static String getMessage(String pKey,String[] pParams,ClassLoader loader){
        String msg=getString(pKey,loader);
        msg=replaceParams(msg,pParams);

        return msg;
    }

    /**
     * Reemplaza parametros por los valores indicados
     * 
     * @param pMsg
     * @param pParams
     * 
     * @return
     */
    public static String replaceParams(String pMsg,String[] pParams){
        try{
            String msg=null;

            if(pParams==null){
                return clearParams(pMsg);
            }

            StringBuilder bufer=new StringBuilder(pMsg);

            for(int i=0;i<pParams.length;i++){
                String cad="{"+i+"}";
                int ini=bufer.indexOf(cad);

                if(pParams[i]!=null){
                    bufer.replace(ini,ini+cad.length(),pParams[i]);
                }
                else{
                    bufer.replace(ini,ini+cad.length(),"");
                }
            }

            msg=clearParams(bufer.toString());

            return msg;
        }
        catch(Exception e){
            // log.error("Error en MSG Reader, " + pMsg + " : " + printArray(pParams));
            return pMsg+" "+printArray(pParams);
        }
    }

    /**
     * Metodo encargado de Imprimir el array.
     * 
     * @param pParam , objeto param
     * 
     * @return un objeto de tipo string
     */
    private static String printArray(String[] pParam){
        StringBuilder bufer=new StringBuilder("");

        for(int i=0;i<pParam.length;i++){
            bufer.append(pParam[i]);
        }

        return bufer.toString();
    }

    /**
     * Metodo encargado de limpiar parametros
     * @param pMsg , objeto msg
     * 
     * @return un objeto de tipo string
     */
    private static String clearParams(String pMsg){
        String msg=null;

        if(pMsg==null){
            return "";
        }

        StringBuilder bufer=new StringBuilder(pMsg);
        int ini=bufer.indexOf("{");
        int fin=bufer.indexOf("}")+1;

        while((ini!=-1)&&(fin>ini)){
            bufer.replace(ini,fin,"");
            ini=bufer.indexOf("{");
            fin=bufer.indexOf("}")+1;
        }

        msg=bufer.toString();

        return msg;
    }

    /**
     * Retorna el message.
     * 
     * @param pPath , objeto path
     * @param pKey , objeto key
     * @param pParams , objeto params /
     * 
     * @return el message
     */
    public static String getMessage(String pPath,String pKey,String[] pParams,ClassLoader loader){
        String msg=getString(pPath,pKey,loader);
        msg=replaceParams(msg,pParams);

        return msg;
    }

    /**
     * Retorna el message.
     * 
     * @param o un o .
     * @param pKey , objeto key
     * @param pParams , objeto params
     * 
     * @return el message
     */
    public static String getMessage(Object o,String pKey,String[] pParams,ClassLoader loader){
        String msg=getString(o,pKey,loader);
        msg=replaceParams(msg,pParams);

        return msg;
    }

    /**
     * Metodo encargado de leer un archivo .
     * 
     * @param pNombreArchivo , objeto nombre archivo
     * 
     * @return un objeto de tipo string
     */
    public static String readFileFromResource(String pNombreArchivo,ClassLoader loader){
        StringBuilder sb=new StringBuilder("");
        InputStream is=null;
        try{
            is=loader.getResourceAsStream("META-INF/"+pNombreArchivo);
            Reader vFReader=new InputStreamReader(is);
            int ch=0;
            while((ch=vFReader.read())!=-1)
                sb.append((char)ch);
        }
        catch(Exception e){
            LOG.error("Error ",e);
        }
        finally{
            try{
                is.close();

            }
            catch(IOException e){
                // TODO Auto-generated catch block
                LOG.error("exception in MessageREader "+e.getLocalizedMessage(),e);
            }
        }

        return sb.toString();
    }

    /**
     * Metodo encargado de leer un archivo .
     * 
     * @param pNombreArchivo , objeto nombre archivo
     * 
     * @return un objeto de tipo string
     */
    public static Properties getPropertiesFromResource(String pNombreArchivo){

        ClassLoader classLoader=MessageReader.class.getClassLoader();
        InputStream is = null;
        try{
             is=classLoader.getResourceAsStream("META-INF/"+pNombreArchivo);
            Properties ps=new Properties();
            ps.load(is);
            is.close();

            return ps;
        }
        catch(Exception e){
            LOG.error("Error ",e);
        }
        finally{
            try{
                is.close();

            }
            catch(IOException e){
                // TODO Auto-generated catch block
                LOG.error("exception in MessageREader "+e.getLocalizedMessage(),e);
            }
        }
        return null;

    }

}
