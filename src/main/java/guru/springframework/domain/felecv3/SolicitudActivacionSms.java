//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * SolicitudActivacionSms entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="SOLICITUD_ACTIVACION_SMS"
    ,schema="FELECV3"
)

public class SolicitudActivacionSms   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-3670231382489272418L;
    private Long idSolicitud;
     private EstadoSolicitudSms estadoSolicitudSms;
     private EventoNotificacion eventoNotificacion;
     private Long identificacionObligado;
     private Long identificacionAdquiriente;
     private Timestamp fechaSolicitud;
     private Set<AuditoriaSolicitudSms> auditoriaSolicitudSmses = new HashSet<AuditoriaSolicitudSms>(0);


    // Constructors

    /** default constructor */
    public SolicitudActivacionSms() {
    }

	/** minimal constructor */
    public SolicitudActivacionSms(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
    
    /** full constructor */
    public SolicitudActivacionSms(Long idSolicitud, EstadoSolicitudSms estadoSolicitudSms, EventoNotificacion eventoNotificacion, Long identificacionObligado, Long identificacionAdquiriente, Timestamp fechaSolicitud, Set<AuditoriaSolicitudSms> auditoriaSolicitudSmses) {
        this.idSolicitud = idSolicitud;
        this.estadoSolicitudSms = estadoSolicitudSms;
        this.eventoNotificacion = eventoNotificacion;
        this.identificacionObligado = identificacionObligado;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.fechaSolicitud = fechaSolicitud;
        this.auditoriaSolicitudSmses = auditoriaSolicitudSmses;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_SOLICITUD", unique=true, nullable=false)

    public Long getIdSolicitud() {
        return this.idSolicitud;
    }
    
    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_SOLICITUD_SMS")

    public EstadoSolicitudSms getEstadoSolicitudSms() {
        return this.estadoSolicitudSms;
    }
    
    public void setEstadoSolicitudSms(EstadoSolicitudSms estadoSolicitudSms) {
        this.estadoSolicitudSms = estadoSolicitudSms;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_EVENTO_NOTIFICACION")

    public EventoNotificacion getEventoNotificacion() {
        return this.eventoNotificacion;
    }
    
    public void setEventoNotificacion(EventoNotificacion eventoNotificacion) {
        this.eventoNotificacion = eventoNotificacion;
    }
    
    @Column(name="IDENTIFICACION_OBLIGADO")

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE")

    public Long getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(Long identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
    
    @Column(name="FECHA_SOLICITUD", length=26)

    public Timestamp getFechaSolicitud() {
        return this.fechaSolicitud;
    }
    
    public void setFechaSolicitud(Timestamp fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="solicitudActivacionSms")

    public Set<AuditoriaSolicitudSms> getAuditoriaSolicitudSmses() {
        return this.auditoriaSolicitudSmses;
    }
    
    public void setAuditoriaSolicitudSmses(Set<AuditoriaSolicitudSms> auditoriaSolicitudSmses) {
        this.auditoriaSolicitudSmses = auditoriaSolicitudSmses;
    }
   








}
