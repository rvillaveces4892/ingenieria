//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EstadoTransaccionPayu entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_TRANSACCION_PAYU"
    ,schema="FELECV3"
)

public class EstadoTransaccionPayu   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=3391145593373994545L;
    private String mensajeCodigoRespuesta;
     private Integer idCodigoRespuesta;
     private String estadoTransaccion;
     private String descripcion;
     private Set<AuditoriaTransaccionPayuSelect> auditoriaTransaccionPayuSelects = new HashSet<AuditoriaTransaccionPayuSelect>(0);


    // Constructors

    /** default constructor */
    public EstadoTransaccionPayu() {
    }

	/** minimal constructor */
    public EstadoTransaccionPayu(String mensajeCodigoRespuesta) {
        this.mensajeCodigoRespuesta = mensajeCodigoRespuesta;
    }
    
    /** full constructor */
    public EstadoTransaccionPayu(String mensajeCodigoRespuesta, Integer idCodigoRespuesta, String estadoTransaccion, String descripcion, Set<AuditoriaTransaccionPayuSelect> auditoriaTransaccionPayuSelects) {
        this.mensajeCodigoRespuesta = mensajeCodigoRespuesta;
        this.idCodigoRespuesta = idCodigoRespuesta;
        this.estadoTransaccion = estadoTransaccion;
        this.descripcion = descripcion;
        this.auditoriaTransaccionPayuSelects = auditoriaTransaccionPayuSelects;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="MENSAJE_CODIGO_RESPUESTA", unique=true, nullable=false, length=100)

    public String getMensajeCodigoRespuesta() {
        return this.mensajeCodigoRespuesta;
    }
    
    public void setMensajeCodigoRespuesta(String mensajeCodigoRespuesta) {
        this.mensajeCodigoRespuesta = mensajeCodigoRespuesta;
    }
    
    @Column(name="ID_CODIGO_RESPUESTA")

    public Integer getIdCodigoRespuesta() {
        return this.idCodigoRespuesta;
    }
    
    public void setIdCodigoRespuesta(Integer idCodigoRespuesta) {
        this.idCodigoRespuesta = idCodigoRespuesta;
    }
    
    @Column(name="ESTADO_TRANSACCION", length=20)

    public String getEstadoTransaccion() {
        return this.estadoTransaccion;
    }
    
    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }
    
    @Column(name="DESCRIPCION", length=300)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoTransaccionPayu")

    public Set<AuditoriaTransaccionPayuSelect> getAuditoriaTransaccionPayuSelects() {
        return this.auditoriaTransaccionPayuSelects;
    }
    
    public void setAuditoriaTransaccionPayuSelects(Set<AuditoriaTransaccionPayuSelect> auditoriaTransaccionPayuSelects) {
        this.auditoriaTransaccionPayuSelects = auditoriaTransaccionPayuSelects;
    }
   








}
