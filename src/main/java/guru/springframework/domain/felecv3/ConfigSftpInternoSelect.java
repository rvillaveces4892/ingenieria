//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ConfigSftpInternoSelect entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONFIG_SFTP_INTERNO_SELECT"
    ,schema="FELECV3"
)

public class ConfigSftpInternoSelect   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=117285054267295562L;
    private Long identificacionObligado;
     private ObligadoFe obligadoFe;
     private String direccionSftp;
     private String usernameSftp;
     private String passwordSftp;
     private String passwordDescompresionArchivo;
     private String rutaArchivoClavePublicaPgp;
     private String rutaArchivoClavePrivadaPgp;
     private String frasePrivadaPgp;
     private String rutaCarpetaOrigenSftp;
     private String rutaCarpetaProcesadosSftp;
     private String rutaCarpetaArchivosLocal;
     private String rutaCarpetaDestinoSftp;
     private String rutaCarpetaLocalTranformados;


    // Constructors

    /** default constructor */
    public ConfigSftpInternoSelect() {
    }

	/** minimal constructor */
    public ConfigSftpInternoSelect(Long identificacionObligado, ObligadoFe obligadoFe, String direccionSftp, String usernameSftp, String passwordSftp) {
        this.identificacionObligado = identificacionObligado;
        this.obligadoFe = obligadoFe;
        this.direccionSftp = direccionSftp;
        this.usernameSftp = usernameSftp;
        this.passwordSftp = passwordSftp;
    }
    
    /** full constructor */
    public ConfigSftpInternoSelect(Long identificacionObligado, ObligadoFe obligadoFe, String direccionSftp, String usernameSftp, String passwordSftp, String passwordDescompresionArchivo, String rutaArchivoClavePublicaPgp, String rutaArchivoClavePrivadaPgp, String frasePrivadaPgp, String rutaCarpetaOrigenSftp, String rutaCarpetaProcesadosSftp, String rutaCarpetaArchivosLocal, String rutaCarpetaDestinoSftp, String rutaCarpetaLocalTranformados) {
        this.identificacionObligado = identificacionObligado;
        this.obligadoFe = obligadoFe;
        this.direccionSftp = direccionSftp;
        this.usernameSftp = usernameSftp;
        this.passwordSftp = passwordSftp;
        this.passwordDescompresionArchivo = passwordDescompresionArchivo;
        this.rutaArchivoClavePublicaPgp = rutaArchivoClavePublicaPgp;
        this.rutaArchivoClavePrivadaPgp = rutaArchivoClavePrivadaPgp;
        this.frasePrivadaPgp = frasePrivadaPgp;
        this.rutaCarpetaOrigenSftp = rutaCarpetaOrigenSftp;
        this.rutaCarpetaProcesadosSftp = rutaCarpetaProcesadosSftp;
        this.rutaCarpetaArchivosLocal = rutaCarpetaArchivosLocal;
        this.rutaCarpetaDestinoSftp = rutaCarpetaDestinoSftp;
        this.rutaCarpetaLocalTranformados = rutaCarpetaLocalTranformados;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="IDENTIFICACION_OBLIGADO", unique=true, nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", unique=true, nullable=false, insertable=false, updatable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
    
    @Column(name="DIRECCION_SFTP", nullable=false, length=16)

    public String getDireccionSftp() {
        return this.direccionSftp;
    }
    
    public void setDireccionSftp(String direccionSftp) {
        this.direccionSftp = direccionSftp;
    }
    
    @Column(name="USERNAME_SFTP", nullable=false, length=35)

    public String getUsernameSftp() {
        return this.usernameSftp;
    }
    
    public void setUsernameSftp(String usernameSftp) {
        this.usernameSftp = usernameSftp;
    }
    
    @Column(name="PASSWORD_SFTP", nullable=false, length=50)

    public String getPasswordSftp() {
        return this.passwordSftp;
    }
    
    public void setPasswordSftp(String passwordSftp) {
        this.passwordSftp = passwordSftp;
    }
    
    @Column(name="PASSWORD_DESCOMPRESION_ARCHIVO", length=50)

    public String getPasswordDescompresionArchivo() {
        return this.passwordDescompresionArchivo;
    }
    
    public void setPasswordDescompresionArchivo(String passwordDescompresionArchivo) {
        this.passwordDescompresionArchivo = passwordDescompresionArchivo;
    }
    
    @Column(name="RUTA_ARCHIVO_CLAVE_PUBLICA_PGP", length=160)

    public String getRutaArchivoClavePublicaPgp() {
        return this.rutaArchivoClavePublicaPgp;
    }
    
    public void setRutaArchivoClavePublicaPgp(String rutaArchivoClavePublicaPgp) {
        this.rutaArchivoClavePublicaPgp = rutaArchivoClavePublicaPgp;
    }
    
    @Column(name="RUTA_ARCHIVO_CLAVE_PRIVADA_PGP", length=160)

    public String getRutaArchivoClavePrivadaPgp() {
        return this.rutaArchivoClavePrivadaPgp;
    }
    
    public void setRutaArchivoClavePrivadaPgp(String rutaArchivoClavePrivadaPgp) {
        this.rutaArchivoClavePrivadaPgp = rutaArchivoClavePrivadaPgp;
    }
    
    @Column(name="FRASE_PRIVADA_PGP", length=50)

    public String getFrasePrivadaPgp() {
        return this.frasePrivadaPgp;
    }
    
    public void setFrasePrivadaPgp(String frasePrivadaPgp) {
        this.frasePrivadaPgp = frasePrivadaPgp;
    }
    
    @Column(name="RUTA_CARPETA_ORIGEN_SFTP", length=160)

    public String getRutaCarpetaOrigenSftp() {
        return this.rutaCarpetaOrigenSftp;
    }
    
    public void setRutaCarpetaOrigenSftp(String rutaCarpetaOrigenSftp) {
        this.rutaCarpetaOrigenSftp = rutaCarpetaOrigenSftp;
    }
    
    @Column(name="RUTA_CARPETA_PROCESADOS_SFTP", length=160)

    public String getRutaCarpetaProcesadosSftp() {
        return this.rutaCarpetaProcesadosSftp;
    }
    
    public void setRutaCarpetaProcesadosSftp(String rutaCarpetaProcesadosSftp) {
        this.rutaCarpetaProcesadosSftp = rutaCarpetaProcesadosSftp;
    }
    
    @Column(name="RUTA_CARPETA_ARCHIVOS_LOCAL", length=160)

    public String getRutaCarpetaArchivosLocal() {
        return this.rutaCarpetaArchivosLocal;
    }
    
    public void setRutaCarpetaArchivosLocal(String rutaCarpetaArchivosLocal) {
        this.rutaCarpetaArchivosLocal = rutaCarpetaArchivosLocal;
    }
    
    @Column(name="RUTA_CARPETA_DESTINO_SFTP", length=160)

    public String getRutaCarpetaDestinoSftp() {
        return this.rutaCarpetaDestinoSftp;
    }
    
    public void setRutaCarpetaDestinoSftp(String rutaCarpetaDestinoSftp) {
        this.rutaCarpetaDestinoSftp = rutaCarpetaDestinoSftp;
    }
    
    @Column(name="RUTA_CARPETA_LOCAL_TRANFORMADOS", length=160)

    public String getRutaCarpetaLocalTranformados() {
        return this.rutaCarpetaLocalTranformados;
    }
    
    public void setRutaCarpetaLocalTranformados(String rutaCarpetaLocalTranformados) {
        this.rutaCarpetaLocalTranformados = rutaCarpetaLocalTranformados;
    }
   








}
