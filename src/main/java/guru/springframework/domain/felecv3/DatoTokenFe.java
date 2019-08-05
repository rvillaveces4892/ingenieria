//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * DatoTokenFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DATO_TOKEN_FE"
    ,schema="FELECV3"
)

public class DatoTokenFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-8540773268070680682L;
    private Long idToken;
     private Short aperturas;
     private String emails;
     private Timestamp fechaCreacion;
     private String identificacionAdquiriente;
     private Long identificacionObligado;
     private String token;


    // Constructors

    /** default constructor */
    public DatoTokenFe() {
    }

	/** minimal constructor */
    public DatoTokenFe(Long idToken) {
        this.idToken = idToken;
    }
    
    /** full constructor */
    public DatoTokenFe(Long idToken, Short aperturas, String emails, Timestamp fechaCreacion, String identificacionAdquiriente, Long identificacionObligado, String token) {
        this.idToken = idToken;
        this.aperturas = aperturas;
        this.emails = emails;
        this.fechaCreacion = fechaCreacion;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.identificacionObligado = identificacionObligado;
        this.token = token;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TOKEN", unique=true, nullable=false)

    public Long getIdToken() {
        return this.idToken;
    }
    
    public void setIdToken(Long idToken) {
        this.idToken = idToken;
    }
    
    @Column(name="APERTURAS")

    public Short getAperturas() {
        return this.aperturas;
    }
    
    public void setAperturas(Short aperturas) {
        this.aperturas = aperturas;
    }
    
    @Column(name="EMAILS", length=250)

    public String getEmails() {
        return this.emails;
    }
    
    public void setEmails(String emails) {
        this.emails = emails;
    }
    
    @Column(name="FECHA_CREACION", length=26)

    public Timestamp getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE", length=30)

    public String getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(String identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
    
    @Column(name="IDENTIFICACION_OBLIGADO")

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
    
    @Column(name="TOKEN", length=100)

    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
   








}
