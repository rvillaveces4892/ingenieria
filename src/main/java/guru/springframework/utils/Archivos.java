package guru.springframework.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    
//    public static void main(String[] args) {
//        crearArchivo("Tigo");
//    }
	private Utility util;

    public Archivos(){
    	util = new Utility();
        // TODO Auto-generated constructor stub
    }

    public void crearArchivo(String nombreobligado,int ambiente) {
        try {
            String ruta = "C:\\Users\\rvillaveces\\Documents\\plantillaComputec.html";
            String contenido = nombreobligado;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            escribirContenido(ambiente,contenido,file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void escribirContenido(int ambiente,String contenido,File file) throws IOException{
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        contenido=replaceCarateresEspecialesHtml(contenido);
        bw.write("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN'                                                                                                                                                                                                                                                                   \n");
        bw.write("'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>                                                                                                                                                                                                                                                                       \n");
        bw.write("<!-- saved from url=(0014)about:internet -->                                                                                                                                                                                                                                                                                     \n");
        bw.write("<html>                                                                                                                                                                                                                                                                                                                           \n");
        bw.write("<head>                                                                                                                                                                                                                                                                                                                           \n");
        bw.write("<title>Plantilla</title>                                                                                                                                                                                                                                                                                                         \n");
        bw.write("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />                                                                                                                                                                                                                                                            \n");
        bw.write("<style type='text/css'>td img {display: block;}</style>                                                                                                                                                                                                                                                                          \n");
        bw.write("</head>                                                                                                                                                                                                                                                                                                                          \n");
        bw.write("<body bgcolor='#ffffff'>                                                                                                                                                                                                                                                                                                         \n");
        bw.write("<table style=border=&quot;0&quot; color: #00B050; cellpadding='0' cellspacing='0' width='488' align='center'>                                                                                                                                                                                                                    \n");
        bw.write("  <tr>                                                                                                                                                                                                                                                                                                                           \n");
        bw.write("   <td><img src='spacer.gif' width='488' height='1' alt='' /></td>                                                                                                                                                                                                                                                               \n");
        bw.write("   <td><img src='spacer.gif' width='1' height='1' alt='' /></td>                                                                                                                                                                                                                                                                 \n");
        bw.write("  </tr>                                                                                                                                                                                                                                                                                                                          \n");
        bw.write("                                                                                                                                                                                                                                                                                                                                 \n");
        bw.write("  <tr>                                                                                                                                                                                                                                                                                                                           \n");
        bw.write("   <td><table width='479' height='351' border='0' align='center'>                                                                                                                                                                                                                                                                \n");
        bw.write("     <tbody>                                                                                                                                                                                                                                                                                                                     \n");
        bw.write("       <tr>                                                                                                                                                                                                                                                                                                                      \n");
        bw.write("         <td width='323'><p style='font-family: arial; font-size: 13px; text-align: center'>"+contenido+"</p>                                                                                                                                                                                                 \n");
        bw.write("           <p style='font-family: arial; font-size: 13px; text-align: center'>NIT :IDENTIFICACION_OBLIGADO: </p>                                                                                                                                                                                                                 \n");
        bw.write("           <p style='font-family: arial; font-size: 13px; text-align:left'>Estimado (a) Cliente<br />                                                                                                                                                                                                                            \n");
        bw.write("             <span style='color: #000000'><strong>:RAZON_SOCIAL: :NOMBRE_PN: :NOMBRE2_PN: :APELLIDO_PN:</strong></span>                                                                                                                                                                                                          \n");
        bw.write("           <p style='font-family: arial; font-size: 13px; text-align:left'>Le  informamos que ha recibido su factura electr&oacute;nica con N <span style='color: #000000'><span style='color: #000000'><strong> :NO_DOCUMENTO: </strong></span></p>                                                                             \n");
        bw.write("           <p style='font-family: arial; font-size: 13px; text-align:left'><br />                                                                                                                                                                                                                                                \n");
        bw.write("             Tipo de documento:<span style='color: #000000'><strong>:ID_TIPO_DOC:</strong></span><br />                                                                                                                                                                                                                          \n");
        bw.write("             Fecha de emisi&oacute;n:<span style='color: #000000'><strong>:FECHA_FACTURA:</strong></span><br />                                                                                                                                                                                                                  \n");
        bw.write("             Valor: <span style='color: #000000'><strong>:VALOR_NETO_DOCUMENTO:</strong></span></p>                                                                                                                                                                                                                              \n");
        bw.write("           <p style='font-family: arial; font-size: 13px; text-align:left'>En el sitio <u><span style='color: #000000'><strong>https://"+(ambiente==3?"":"pruebas")+"select.computec.com/</strong></span></u><strong><u> </u></strong>se  encuentra disponible este documento en su formato XML y PDF, para lo cual  necesitar&aacute; registrarse.</p> \n");
        bw.write("                                                                                                                                                                                                                                                                                                                                 \n");
        bw.write("           <p style='font-family: arial; font-size: 13px; text-align:left'>Atentamente, <br />                                                                                                                                                                                                                                   \n");
        bw.write("           <span style='color: #000000'><strong>"+contenido+"</strong> </span></p>                                                                                                                                                                                                                            \n");
        bw.write("           <p>_____________________________________________</p>                                                                                                                                                                                                                                                                  \n");
        bw.write("           <p style='font-family: arial; font-size: 13px; text-align:center; color:#000000'><strong>Esta  informaci&oacute;n fue enviada por <br />                                                                                                                                                                              \n");
        bw.write("               <u>Computec Outsourcing SAS<br />                                                                                                                                                                                                                                                                                 \n");
        bw.write("               </u>proveedor  tecnol&oacute;gico autorizado de facturaci&oacute;n electr&oacute;nica<br />                                                                                                                                                                                                                       \n");
        bw.write("            Resoluci&oacute;n 2535 de 2017 </strong></p></td>                                                                                                                                                                                                                                                                          \n");
        bw.write("       </tr>                                                                                                                                                                                                                                                                                                                     \n");
        bw.write("     </tbody>                                                                                                                                                                                                                                                                                                                    \n");
        bw.write("   </table></td>                                                                                                                                                                                                                                                                                                                 \n");
        bw.write("   <td><img src='spacer.gif' width='1' height='551' alt='' /></td>                                                                                                                                                                                                                                                               \n");
        bw.write("  </tr>                                                                                                                                                                                                                                                                                                                          \n");
        bw.write("  <tr>                                                                                                                                                                                                                                                                                                                           \n");
        bw.write("   <td><img name='PlantillaComputec_r2_c1' src='http://tr.computec.com.co/computec/Plantilla/PlantillaComputec_r2_c1.jpg' width='488' height='42' id='PlantillaComputec_r2_c1' alt='' /></td>                                                                                                                                    \n");
        bw.write("   <td><img src='spacer.gif' width='1' height='42' alt='' /></td>                                                                                                                                                                                                                                                                \n");
        bw.write("  </tr>                                                                                                                                                                                                                                                                                                                          \n");
        bw.write("                                                                                                                                                                                                                                                                                                                                 \n");
        bw.write("</table>                                                                                                                                                                                                                                                                                                                         \n");
        bw.write("<table style=border=&quot;0&quot; color: #00B050; cellpadding='0' cellspacing='0' width='488' align='center'>                                                                                                                                                                                                                    \n");
        bw.write("  <tr>                                                                                                                                                                                                                                                                                                                           \n");
        bw.write("    <td>:TAG_BUTTON_ADJUNTO:</td>                                                                                                                                                                                                                                                                                             \n");
        bw.write("  </tr>                                                                                                                                                                                                                                                                                                                          \n");
        bw.write("</table>                                                                                                                                                                                                                                                                                                                         \n");
        bw.write("<table style=border=&quot;0&quot; color: #00B050; cellpadding='0' cellspacing='0' width='488' align='center'>                                                                                                                                                                                                                    \n");
        bw.write("  <tr>                                                                                                                                                                                                                                                                                                                           \n");
        bw.write("    <td>:TAG_BUTTON_ACEPTACION:</td>                                                                                                                                                                                                                                                                                             \n");
        bw.write("    <td>:TAG_BUTTON_RECHAZO:</td>                                                                                                                                                                                                                                                                                                \n");
        bw.write("  </tr>                                                                                                                                                                                                                                                                                                                          \n");
        bw.write("</table>                                                                                                                                                                                                                                                                                                                         \n");
        bw.write(" :TAG_IMAGE_LECTURABILIDAD:                                                                                                                                                                                                                                                                                                      \n");
        bw.write("</body>                                                                                                                                                                                                                                                                                                                          \n");
        bw.write("</html>                                                                                                                                                                                                                                                                                                                          \n");

        bw.close();
    }
    public static String replaceCarateresEspecialesHtml(String cadena) {
		cadena = cadena.replaceAll("á", "&aacute;");
		cadena = cadena.replaceAll("é", "&eacute;");
		cadena = cadena.replaceAll("í", "&iacute;");
		cadena = cadena.replaceAll("ó", "&oacute;");
		cadena = cadena.replaceAll("ú", "&uacute;");
		cadena = cadena.replaceAll("Á", "&Aacute;");
		cadena = cadena.replaceAll("É", "&Eacute;");
		cadena = cadena.replaceAll("Í", "&Iacute;");
		cadena = cadena.replaceAll("Ó", "&Oacute;");
		cadena = cadena.replaceAll("Ú", "&Uacute;");
		cadena = cadena.replaceAll("ñ", "&ntilde;");
		cadena = cadena.replaceAll("Ñ", "&Ntilde;");
		return cadena;
	}
}
