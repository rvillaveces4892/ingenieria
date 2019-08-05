package guru.springframework.utils;

import java.io.File;

import org.apache.log4j.Logger;


public class Utility{
    
    private static final Logger LOG=Logger.getLogger(Utility.class);

    public Utility(){
        
    }

    public static void moverArchivo(String origen,String destino){
        try{
            File rutaDestino=new File(destino);
            if(!rutaDestino.exists()){
                rutaDestino.mkdirs();
            }
            File archivoOriginal=new File(origen);
            File archivoDestino=new File(destino+File.separator+archivoOriginal.getName());
            boolean estatus=archivoOriginal.renameTo(archivoDestino);
            if(!estatus){
                LOG.error("Error no se ha podido mover el archivo "+archivoOriginal.getName()+" moverArchivo");
            }
            else{
                LOG.info("Se movió el archivo "+archivoOriginal.getName()+" exitosamente - moverArchivo");
            }
        }
        catch(Exception e){
            LOG.error("Error no se ha podido mover el  archivo "+origen+" moverArchivo",e);
        }
    }
    
   
}
