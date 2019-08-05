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
 * EstadoSolicitudSms entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_SOLICITUD_SMS"
    ,schema="FELECV3"
)

public class EstadoSolicitudSms   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-4774681418580557652L;
    private Short idEstadoSolicitudSms;
     private String descripcion;
     private Set<AuditoriaSolicitudSms> auditoriaSolicitudSmses = new HashSet<AuditoriaSolicitudSms>(0);
     private Set<SolicitudActivacionSms> solicitudActivacionSmses = new HashSet<SolicitudActivacionSms>(0);


    // Constructors

    /** default constructor */
    public EstadoSolicitudSms() {
    }

	/** minimal constructor */
    public EstadoSolicitudSms(Short idEstadoSolicitudSms) {
        this.idEstadoSolicitudSms = idEstadoSolicitudSms;
    }
    
    /** full constructor */
    public EstadoSolicitudSms(Short idEstadoSolicitudSms, String descripcion, Set<AuditoriaSolicitudSms> auditoriaSolicitudSmses, Set<SolicitudActivacionSms> solicitudActivacionSmses) {
        this.idEstadoSolicitudSms = idEstadoSolicitudSms;
        this.descripcion = descripcion;
        this.auditoriaSolicitudSmses = auditoriaSolicitudSmses;
        this.solicitudActivacionSmses = solicitudActivacionSmses;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ESTADO_SOLICITUD_SMS", unique=true, nullable=false)

    public Short getIdEstadoSolicitudSms() {
        return this.idEstadoSolicitudSms;
    }
    
    public void setIdEstadoSolicitudSms(Short idEstadoSolicitudSms) {
        this.idEstadoSolicitudSms = idEstadoSolicitudSms;
    }
    
    @Column(name="DESCRIPCION", length=20)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoSolicitudSms")

    public Set<AuditoriaSolicitudSms> getAuditoriaSolicitudSmses() {
        return this.auditoriaSolicitudSmses;
    }
    
    public void setAuditoriaSolicitudSmses(Set<AuditoriaSolicitudSms> auditoriaSolicitudSmses) {
        this.auditoriaSolicitudSmses = auditoriaSolicitudSmses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoSolicitudSms")

    public Set<SolicitudActivacionSms> getSolicitudActivacionSmses() {
        return this.solicitudActivacionSmses;
    }
    
    public void setSolicitudActivacionSmses(Set<SolicitudActivacionSms> solicitudActivacionSmses) {
        this.solicitudActivacionSmses = solicitudActivacionSmses;
    }
   








}
