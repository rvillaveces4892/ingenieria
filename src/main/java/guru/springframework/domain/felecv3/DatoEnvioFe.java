//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * DatoEnvioFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DATO_ENVIO_FE"
    ,schema="FELECV3"
)

public class DatoEnvioFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=4040955905078535270L;
    private Long idEnvio;
     private Timestamp fechaEnvio;
     private String email;
     private String noDocumento;
     private Integer idUsuarioEnvia;
     private Short idGestion;
     private Long identificacionObligado;
     private Short idTipoDocFe;
     private String identificacionAdquiriente;


    // Constructors

    /** default constructor */
    public DatoEnvioFe() {
    }

	/** minimal constructor */
    public DatoEnvioFe(Long idEnvio) {
        this.idEnvio = idEnvio;
    }
    
    /** full constructor */
    public DatoEnvioFe(Long idEnvio, Timestamp fechaEnvio, String email, String noDocumento, Integer idUsuarioEnvia, Short idGestion, Long identificacionObligado, Short idTipoDocFe, String identificacionAdquiriente) {
        this.idEnvio = idEnvio;
        this.fechaEnvio = fechaEnvio;
        this.email = email;
        this.noDocumento = noDocumento;
        this.idUsuarioEnvia = idUsuarioEnvia;
        this.idGestion = idGestion;
        this.identificacionObligado = identificacionObligado;
        this.idTipoDocFe = idTipoDocFe;
        this.identificacionAdquiriente = identificacionAdquiriente;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_ENVIO", unique=true, nullable=false)

    public Long getIdEnvio() {
        return this.idEnvio;
    }
    
    public void setIdEnvio(Long idEnvio) {
        this.idEnvio = idEnvio;
    }
    
    @Column(name="FECHA_ENVIO", length=26)

    public Timestamp getFechaEnvio() {
        return this.fechaEnvio;
    }
    
    public void setFechaEnvio(Timestamp fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    
    @Column(name="EMAIL", length=100)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="NO_DOCUMENTO", length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }
    
    @Column(name="ID_USUARIO_ENVIA")

    public Integer getIdUsuarioEnvia() {
        return this.idUsuarioEnvia;
    }
    
    public void setIdUsuarioEnvia(Integer idUsuarioEnvia) {
        this.idUsuarioEnvia = idUsuarioEnvia;
    }
    
    @Column(name="ID_GESTION")

    public Short getIdGestion() {
        return this.idGestion;
    }
    
    public void setIdGestion(Short idGestion) {
        this.idGestion = idGestion;
    }
    
    @Column(name="IDENTIFICACION_OBLIGADO")

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
    
    @Column(name="ID_TIPO_DOC_FE")

    public Short getIdTipoDocFe() {
        return this.idTipoDocFe;
    }
    
    public void setIdTipoDocFe(Short idTipoDocFe) {
        this.idTipoDocFe = idTipoDocFe;
    }
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE", length=30)

    public String getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(String identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
   








}
