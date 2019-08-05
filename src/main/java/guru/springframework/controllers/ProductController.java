package guru.springframework.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jcraft.jsch.SftpException;

import guru.springframework.commands.BuzonSFTP;
import guru.springframework.domain.ConfEnvioObligado;
import guru.springframework.domain.ConfEnvioObligadoId;
import guru.springframework.domain.ConfNotificacionObligado;
import guru.springframework.domain.ConfNotificacionObligadoId;
import guru.springframework.domain.Enviador;
import guru.springframework.domain.TipoAdjunto;
import guru.springframework.domain.TipoEnvio;
import guru.springframework.domain.felecv3.MotivoRechazo;
import guru.springframework.domain.felecv3.MotivoRechazoOfe;
import guru.springframework.domain.felecv3.MotivoRechazoOfeId;
import guru.springframework.dto.ConfEnvioObliDto;
import guru.springframework.dto.ConfNotificacionObliDto;
import guru.springframework.services.ConfEnvioObligadoServices;
import guru.springframework.services.ConfNotificacionObligadoServices;
import guru.springframework.services.DocumentoFeServices;
import guru.springframework.services.MotivoRechazoOfeServices;
import guru.springframework.utils.Archivos;

//import guru.springframework.commands.ProductForm;
//import guru.springframework.converters.ProductToProductForm;
////import guru.springframework.domain.Product;
//import guru.springframework.services.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.validation.Valid;

/**
 * Created by jt on 1/10/17.
 */
@RestController
public class ProductController{

    @Autowired
    private ConfEnvioObligadoServices confEnvioObligadoService;
    @Autowired
    private ConfNotificacionObligadoServices confNotificacionObligadoService;

    @Autowired
    private DocumentoFeServices documentoFeServices;

    @Autowired
    private MotivoRechazoOfeServices motivoRechazoOfeServices;
    
    
    @RequestMapping("/byte")
    public ResponseEntity<?> subirArchivo() {
    	File file = new File("C:\\MotorEnvios\\spring-boot-db2-example-master.zip");
    	// ...(file is initialised)...
    	byte[] fileContent = null;
		try {
			fileContent = Files.readAllBytes(file.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	    javax.ws.rs.core.Response.ResponseBuilder responseBuilder = javax.ws.rs.core.Response.ok((Object) fileInputStream);
//	    responseBuilder.type("application/pdf");
//	    responseBuilder.header("Content-Disposition", "filename=test.pdf");
//	    return responseBuilder.build();
	    return new ResponseEntity<>(fileInputStream,HttpStatus.BAD_REQUEST);
    	
//    	return fileContent;
    }
    
    

    @RequestMapping("/sftp")
    public void subirArchivo(@RequestParam("id") String idOblig,@RequestParam("nameOblig") String nombreObligado,@RequestParam("ambiente") int ambiente){
        Archivos archive=new Archivos();
        archive.crearArchivo(nombreObligado,ambiente);
        BuzonSFTP sftp=new BuzonSFTP(ambiente);
        File plantilla=new File("C:\\Users\\rvillaveces\\Documents\\plantillaComputec.html");
        File plantillaRechazo=new File("C:\\Users\\rvillaveces\\Documents\\plantillaRechazo.html");
        try{
            System.out.println(sftp.getSftp().pwd());
            sftp.cd("/opt/Apache/DocsMotorEnvios/plantillaEnvioEmail");
            System.out.println(sftp.getSftp().pwd());
            try{
                sftp.getSftp().mkdir(""+idOblig);
            }
            catch(Exception e){
                System.out.println("Ya existe la carpeta");
            }
            sftp.cd(""+idOblig);
            System.out.println(sftp.getSftp().pwd());
            FileInputStream targetStream1=new FileInputStream(plantilla);
            sftp.uploadFile(targetStream1,"plantillaComputec.html");
            FileInputStream targetStream2=new FileInputStream(plantillaRechazo);
            sftp.uploadFile(targetStream2,"plantillaRechazo.html");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(SftpException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // TODO Escribir archivos de byte[] to file java
//    for(AdjuntoDTO adjuntoDTO:listAdjunto){
//        FileUtils.writeByteArrayToFile(new File("C:\\MotorEnvios\\tempA\\"+adjuntoDTO.getNombreArchivo()), adjuntoDTO.getContenido());
//        System.out.println("nombre : "+adjuntoDTO.getNombreArchivo()+" - Contenido : "+adjuntoDTO.getContenido());
//    }

//    public String getPlantillaBase(final String rutaPlant) throws FileNotFoundException{
//        final File html=new File(rutaPlant);
//        final StringBuilder plantilla=new StringBuilder();
//        try{
//            final FileInputStream htmlInput=new FileInputStream(html);
//            byte[] buffer=new byte[1024];
////            int bytes=0;
////            while((bytes=htmlInput.read(buffer))!=-1){
////                String texto=new String(buffer,0,bytes);
////                plantilla.append(texto);
////            }
//        }
//        catch(FileNotFoundException e){
////            LOG.warn("Error plantilla no encontrada: "+rutaPlant);
//            throw e;
//        }
//        catch(IOException e){
////            LOG.warn("Error de lectura de plantilla"+rutaPlant);
//            return plantilla.toString();
//        }
//        return plantilla.toString();
//    }

    @RequestMapping("/archive/base64")
    public String listConf(@RequestParam("ruta") String ruta){
        try{
            return encodeFileToBase64Binary(ruta);
        }
        catch(IOException e){
            e.printStackTrace();
            return "1";
        }
    }

    private String encodeFileToBase64Binary(String fileName) throws IOException{

        File file=new File(fileName);
        byte[] bytes=loadFile(file);
        byte[] encoded=Base64.encodeBase64(bytes);
        String encodedString=new String(encoded);

        return encodedString;
    }

    private static byte[] loadFile(File file) throws IOException{
        InputStream is=new FileInputStream(file);

        long length=file.length();
        if(length>Integer.MAX_VALUE){
            // File is too large
        }
        byte[] bytes=new byte[(int)length];

        int offset=0;
        int numRead=0;
        while(offset<bytes.length&&(numRead=is.read(bytes,offset,bytes.length-offset))>=0){
            offset+=numRead;
        }

        if(offset<bytes.length){
            throw new IOException("Could not completely read file "+file.getName());
        }

        is.close();
        return bytes;
    }

    @RequestMapping("/ceo/list")
    public List<ConfEnvioObligado> listConf(){
        return confEnvioObligadoService.getConfEnvioObligado();
    }

    @RequestMapping(value="/ceo/{ambiente}",method=RequestMethod.POST,consumes="application/json")
    public ResponseEntity<?> crear(@RequestBody List<ConfEnvioObliDto> dto,@PathVariable int ambiente){
        List<ConfEnvioObligadoId> id=new ArrayList<>();
        try{
            for(ConfEnvioObliDto configuracionesDto:dto){
                String razonSocial=confEnvioObligadoService.getRazonSocial(configuracionesDto.getIdentificacionObligado());
                if(razonSocial!=null){
                    for(int i=1;i<5;i++){
                        try{
                            ConfEnvioObligado conf=getInstanceConfiguracion(ambiente,configuracionesDto,(short)i);
                            ConfEnvioObligado find=confEnvioObligadoService.findById(conf.getId());
                            if(find!=null&&find.getId()!=null&&find.getId().getIdentificacionObligado()!=null){
                                System.out.println("Ya existe : "+configuracionesDto.getIdentificacionObligado()+" - "+configuracionesDto.getNumResoluDian()+" - "+i);
                            }
                            else{
                                conf.setMascara("Factura Electrónica de "+razonSocial);
                                ConfEnvioObligado confCreated=confEnvioObligadoService.create(conf);
                                id.add(confCreated.getId());
                            }
                        }
                        catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                }
                else{
                    return new ResponseEntity<>("No existe el obligado",HttpStatus.BAD_REQUEST);
                }
                if(configuracionesDto.getIdentificacionObligado()!=null&&configuracionesDto.getIdentificacionObligado()!=9004226148L){
                    this.subirArchivo(configuracionesDto.getIdentificacionObligado().toString(),razonSocial,ambiente);
                }
                List<ConfNotificacionObliDto> configNotificacion = new ArrayList<>();
                ConfNotificacionObliDto confNoti =new ConfNotificacionObliDto();
                confNoti.setIdentificacionObligado(configuracionesDto.getIdentificacionObligado());
                confNoti.setSender(configuracionesDto.getSenderRechazo());
                confNoti.setDestino(configuracionesDto.getDestinoRechazo());
                confNoti.setEstado((short)1);
                configNotificacion.add(confNoti);
                crearConfNotificacionObligado(configNotificacion);
            }
            return new ResponseEntity<>(id,HttpStatus.OK);

        }
        catch(NullPointerException e){
            return new ResponseEntity<>("No existe el obligado",HttpStatus.BAD_REQUEST);
        }
        catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }
    
    @RequestMapping(value="/cno",method=RequestMethod.POST,consumes="application/json")
    public ResponseEntity<?> crearConfNotificacionObligado(@RequestBody List<ConfNotificacionObliDto> ids){
    	
        try {
        	if(ids!=null&&!ids.isEmpty()) {
        		for (ConfNotificacionObliDto confNotificacionObliDto : ids) {
            		ConfNotificacionObligado confCreate1 = new ConfNotificacionObligado();
            		ConfNotificacionObligado confCreate2 = new ConfNotificacionObligado();
            		ConfNotificacionObligadoId idNotifi1 = new ConfNotificacionObligadoId(confNotificacionObliDto.getIdentificacionObligado(), (short)1, (short)1);
            		ConfNotificacionObligado confNotifi1 = confNotificacionObligadoService.findById(idNotifi1);
            		if(confNotifi1!=null&&confNotifi1.getId()!=null&&confNotifi1.getId().getNitObligado()!=null){
            			System.out.println("Ya existe para rechazo motor envios : "+confNotifi1.getId().getNitObligado()+" - "+confNotifi1.getId().getIdTipoNotificacion());
        			} else {
        				try {
        					confCreate1 = getInstanceConfiguracionNoti((short)1, confNotificacionObliDto);
        					confNotificacionObligadoService.create(confCreate1);
    					} catch (Exception e) {
    						e.printStackTrace();
    					}
        			}
            		ConfNotificacionObligadoId idNotifi2 = new ConfNotificacionObligadoId(confNotificacionObliDto.getIdentificacionObligado(), (short)2, (short)1);
            		ConfNotificacionObligado confNotifi2 = confNotificacionObligadoService.findById(idNotifi2);
            		if(confNotifi2!=null&&confNotifi2.getId()!=null&&confNotifi2.getId().getNitObligado()!=null){
            			System.out.println("Ya existe para rechazo desde select : "+confNotifi2.getId().getNitObligado()+" - "+confNotifi2.getId().getIdTipoNotificacion());
        			} else {
        				try {
        					confCreate2 = getInstanceConfiguracionNoti((short)2, confNotificacionObliDto);
        					confNotificacionObligadoService.create(confCreate2);
    					} catch (Exception e) {
    						e.printStackTrace();
    					}
        			}
    			}
        	}
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
        return new ResponseEntity<>("se gestiono la configuracion de notificaciones de rechazo",HttpStatus.OK);
    }
    

    @RequestMapping(value="/mr/{idObligado}",method=RequestMethod.POST,consumes="application/json")
    public ResponseEntity<?> crearMotivosRechazo(@RequestBody List<Integer> ids,@PathVariable long idObligado){
        List<String> idExist=new ArrayList<>();
        if(ids!=null&&!ids.isEmpty()){
            for(Integer motivo:ids){
                try{
                    MotivoRechazoOfeId id=new MotivoRechazoOfeId(idObligado,motivo.shortValue());
                    MotivoRechazoOfe motivoRechazoOfeexist=motivoRechazoOfeServices.findById(id);
                    if(motivoRechazoOfeexist!=null){
                        idExist.add("Ya existe el motivo con id : "+motivo);
                    }
                    else{
                        MotivoRechazoOfe motivoRechazoOfe=new MotivoRechazoOfe();
                        motivoRechazoOfe.setId(id);
                        motivoRechazoOfe.setEmision((short)1);
                        motivoRechazoOfe.setMotivoRechazo(new MotivoRechazo(motivo.shortValue()));
                        motivoRechazoOfeServices.create(motivoRechazoOfe);
                        idExist.add("Se inserto el motivo con id : "+motivo);
                    }
                }
                catch(Exception e){
                    idExist.add("No se pudo insertar el motivo con id : "+motivo);
                }
            }
        }
        return new ResponseEntity<>(idExist,HttpStatus.OK);
    }
    
    private ConfNotificacionObligado getInstanceConfiguracionNoti(short idTipoNotificacion , ConfNotificacionObliDto dto) {
    	ConfNotificacionObligadoId id = new ConfNotificacionObligadoId(dto.getIdentificacionObligado(), idTipoNotificacion, (short)1);
    	ConfNotificacionObligado obj = new ConfNotificacionObligado();
    	obj.setId(id);
    	obj.setSender(dto.getSender()!=null&&!dto.getSender().isEmpty()?dto.getSender():"FACTURA ELECTRONICA RECHAZADA <facturaelectronica@computec.com>");
    	obj.setAsunto("Documento # :NO_DOCUMENTO:  Rechazado por adquirente con documento numero :IDENTIFICACION_ADQUIRIENTE:");
    	obj.setDestino(dto.getDestino()!=null&&!dto.getDestino().trim().isEmpty()?dto.getDestino(): obj.getSender().substring(obj.getSender().indexOf("<")+1,obj.getSender().indexOf(">")));
    	obj.setEstado((short)1);
    	obj.setRutaPlantilla("/opt/Apache/DocsMotorEnvios/plantillaEnvioEmail/:IDENTIFICACION_OBLIGADO:/plantillaRechazo.html");
		return obj;
    }

    private ConfEnvioObligado getInstanceConfiguracion(int ambiente,ConfEnvioObliDto dto,short idTipoDoc){
        ConfEnvioObligado conf=new ConfEnvioObligado();
        ConfEnvioObligadoId id=new ConfEnvioObligadoId();
        id.setIdentificacionObligado(dto.getIdentificacionObligado());
        id.setIdTipoDocFe(idTipoDoc);
        id.setIdPrefijo((short)1);
        id.setIdTipoEnvio((short)1);
        id.setNumResoluDian(dto.getNumResoluDian());
        conf.setId(id);
        conf.setSender(dto.getSender());

        conf.setTipoAdjunto(new TipoAdjunto((short)2));
        conf.setEnviador(new Enviador((short)2));
        conf.setTipoEnvio(new TipoEnvio((short)1));
        conf.setXpathNombrePdf("/AccountingSupplierParty/Party/PartyIdentification/ID;/UBLExtensions/UBLExtension/ExtensionContent/DianExtensions/InvoiceControl/InvoiceAuthorization;/ID");
        conf.setRutaInsertos("RUTA_INSERTOS");
        conf.setRutaAdjuntos("RUTA_ADJUNTOS");
        conf.setPrioridadEnvio((short)1);
        conf.setMensajeBaseSms("MENSAJE_BASE_SMS");
        conf.setIncluirLecturabilidad((short)1);
        conf.setEstado(dto.getEstado());
        Short tipoDoc=id.getIdTipoDocFe()!=(short)4?id.getIdTipoDocFe():(short)1;
        switch(ambiente){
            case 1:
                conf.setRutaPlantilla("C:\\\\MotorEnvios\\\\plantillaComputec.html");
                conf.setRutaXml("C:\\\\MotorEnvios");
                conf.setRutaPdf("C:\\\\MotorEnvios");
                conf.setUrlLecturabilidad("http://localhost:9080/LecturaRegistroEnvios/SrvLecturabilidadEnvios?idrm_fe");
                conf.setUrlAceptacionRechazo("http://localhost:9080/gestionFactura/?idOfe=:IDENTIFICACION_OBLIGADO:&noDoc=:NO_DOCUMENTO:&res=:NUM_RESOLU_DIAN:&tipoDoc=:ID_TIPO_DOC_KEY:&acepta=");
                conf.setRutaSalidaPdfXml(new StringBuilder("/Datos/Archivos/").append(id.getIdentificacionObligado()).append("/"+id.getIdentificacionObligado()+"-"+id.getNumResoluDian()+"-"+tipoDoc).append("/enviadosOk").toString());
                break;
            case 2:
                conf.setRutaPlantilla(new StringBuilder("/opt/Apache/DocsMotorEnvios/plantillaEnvioEmail/").append(id.getIdentificacionObligado()).append("/plantillaComputec.html").toString());
                conf.setRutaXml(new StringBuilder("/Datos/Archivos/").append(id.getIdentificacionObligado()).append("/"+id.getIdentificacionObligado()+"-"+id.getNumResoluDian()+"-"+tipoDoc).append("/transmitidosOk").toString());
                conf.setRutaPdf(new StringBuilder("/Datos/Archivos/").append(id.getIdentificacionObligado()).append("/"+id.getIdentificacionObligado()+"-"+id.getNumResoluDian()+"-"+tipoDoc).append("/transmitidosOk").toString());
                conf.setUrlLecturabilidad("https://pruebasselect.computec.com/LecturaRegistroEnvios/SrvLecturabilidadEnvios?idrm_fe");
                conf.setUrlAceptacionRechazo("https://pruebasselect.computec.com/gestionFactura/?idOfe=:IDENTIFICACION_OBLIGADO:&noDoc=:NO_DOCUMENTO:&res=:NUM_RESOLU_DIAN:&tipoDoc=:ID_TIPO_DOC_KEY:&acepta=");
                conf.setRutaSalidaPdfXml(new StringBuilder("/Datos/Archivos/").append(id.getIdentificacionObligado()).append("/"+id.getIdentificacionObligado()+"-"+id.getNumResoluDian()+"-"+tipoDoc).append("/enviadosOk").toString());
                break;
            case 3:
                conf.setRutaPlantilla(new StringBuilder("/opt/Apache/DocsMotorEnvios/plantillaEnvioEmail/").append(id.getIdentificacionObligado()).append("/plantillaComputec.html").toString());
                conf.setRutaXml(new StringBuilder("/Datos/Archivos/").append(id.getIdentificacionObligado()).append("/"+id.getIdentificacionObligado()+"-"+id.getNumResoluDian()+"-"+tipoDoc).append("/transmitidosOk").toString());
                conf.setRutaPdf(new StringBuilder("/Datos/Archivos/").append(id.getIdentificacionObligado()).append("/"+id.getIdentificacionObligado()+"-"+id.getNumResoluDian()+"-"+tipoDoc).append("/transmitidosOk").toString());
                conf.setUrlLecturabilidad("https://select.computec.com/LecturaRegistroEnvios/SrvLecturabilidadEnvios?idrm_fe");
                conf.setUrlAceptacionRechazo("https://select.computec.com/gestionFactura/?idOfe=:IDENTIFICACION_OBLIGADO:&noDoc=:NO_DOCUMENTO:&res=:NUM_RESOLU_DIAN:&tipoDoc=:ID_TIPO_DOC_KEY:&acepta=");
                conf.setRutaSalidaPdfXml(new StringBuilder("/Datos/Archivos/").append(id.getIdentificacionObligado()).append("/"+id.getIdentificacionObligado()+"-"+id.getNumResoluDian()+"-"+tipoDoc).append("/enviadosOk").toString());
                break;

            default:
                break;
        }
        return conf;

    }

    @RequestMapping(value="/ceo",method=RequestMethod.DELETE,consumes="application/json")
    public void delete(@RequestBody ConfEnvioObligadoId id){
        confEnvioObligadoService.delete(id);
    }

    @RequestMapping("/fecha")
    public ResponseEntity<?> getFecha(@RequestParam("io") Long identificacionObligado,@RequestParam("no") String noDocumento,@RequestParam("nu") Long numResoluDian,@RequestParam("it") Short idTipoDocFe){
//        DocumentoFeId id=new DocumentoFeId(identificacionObligado,noDocumento,numResoluDian,idTipoDocFe);
//        DocumentoFe doc=documentoFeServices.findById(id);
        String date=documentoFeServices.fechaFactura(identificacionObligado,noDocumento,numResoluDian,idTipoDocFe);
        return new ResponseEntity<>(date,HttpStatus.ACCEPTED);
    }

    private String formatoFecha(Date fecha){
        if(fecha==null){
            return "";
        }
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }
}
