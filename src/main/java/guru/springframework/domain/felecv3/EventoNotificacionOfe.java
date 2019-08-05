//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EventoNotificacionOfe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="EVENTO_NOTIFICACION_OFE"
    ,schema="FELECV3"
)

public class EventoNotificacionOfe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-4043637177213938383L;
    private EventoNotificacionOfeId id;
     private EventoNotificacion eventoNotificacion;
     private ObligadoFe obligadoFe;
     private Short notificarCorreo;
     private Short notificarSms;
     private Short solicitudSms;
     private String emailNotificacion;
     private String celularNotificacion;


    // Constructors

    /** default constructor */
    public EventoNotificacionOfe() {
    }

	/** minimal constructor */
    public EventoNotificacionOfe(EventoNotificacionOfeId id, EventoNotificacion eventoNotificacion, ObligadoFe obligadoFe) {
        this.id = id;
        this.eventoNotificacion = eventoNotificacion;
        this.obligadoFe = obligadoFe;
    }
    
    /** full constructor */
    public EventoNotificacionOfe(EventoNotificacionOfeId id, EventoNotificacion eventoNotificacion, ObligadoFe obligadoFe, Short notificarCorreo, Short notificarSms, Short solicitudSms, String emailNotificacion, String celularNotificacion) {
        this.id = id;
        this.eventoNotificacion = eventoNotificacion;
        this.obligadoFe = obligadoFe;
        this.notificarCorreo = notificarCorreo;
        this.notificarSms = notificarSms;
        this.solicitudSms = solicitudSms;
        this.emailNotificacion = emailNotificacion;
        this.celularNotificacion = celularNotificacion;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idEventoNotificacion", column=@Column(name="ID_EVENTO_NOTIFICACION", nullable=false) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ) } )

    public EventoNotificacionOfeId getId() {
        return this.id;
    }
    
    public void setId(EventoNotificacionOfeId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_EVENTO_NOTIFICACION", nullable=false, insertable=false, updatable=false)

    public EventoNotificacion getEventoNotificacion() {
        return this.eventoNotificacion;
    }
    
    public void setEventoNotificacion(EventoNotificacion eventoNotificacion) {
        this.eventoNotificacion = eventoNotificacion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
    
    @Column(name="NOTIFICAR_CORREO")

    public Short getNotificarCorreo() {
        return this.notificarCorreo;
    }
    
    public void setNotificarCorreo(Short notificarCorreo) {
        this.notificarCorreo = notificarCorreo;
    }
    
    @Column(name="NOTIFICAR_SMS")

    public Short getNotificarSms() {
        return this.notificarSms;
    }
    
    public void setNotificarSms(Short notificarSms) {
        this.notificarSms = notificarSms;
    }
    
    @Column(name="SOLICITUD_SMS")

    public Short getSolicitudSms() {
        return this.solicitudSms;
    }
    
    public void setSolicitudSms(Short solicitudSms) {
        this.solicitudSms = solicitudSms;
    }
    
    @Column(name="EMAIL_NOTIFICACION", length=50)

    public String getEmailNotificacion() {
        return this.emailNotificacion;
    }
    
    public void setEmailNotificacion(String emailNotificacion) {
        this.emailNotificacion = emailNotificacion;
    }
    
    @Column(name="CELULAR_NOTIFICACION", length=20)

    public String getCelularNotificacion() {
        return this.celularNotificacion;
    }
    
    public void setCelularNotificacion(String celularNotificacion) {
        this.celularNotificacion = celularNotificacion;
    }
   








}
