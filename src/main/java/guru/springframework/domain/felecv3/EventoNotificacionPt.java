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
 * EventoNotificacionPt entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="EVENTO_NOTIFICACION_PT"
    ,schema="FELECV3"
)

public class EventoNotificacionPt   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-1396794152406247876L;
    private EventoNotificacionPtId id;
     private ProveedorTecnologico proveedorTecnologico;
     private EventoNotificacion eventoNotificacion;
     private Short notificar;
     private Short notificarCorreo;
     private Short notificarSms;
     private String emailNotificacion;
     private String celularNotificacion;


    // Constructors

    /** default constructor */
    public EventoNotificacionPt() {
    }

	/** minimal constructor */
    public EventoNotificacionPt(EventoNotificacionPtId id, ProveedorTecnologico proveedorTecnologico, EventoNotificacion eventoNotificacion) {
        this.id = id;
        this.proveedorTecnologico = proveedorTecnologico;
        this.eventoNotificacion = eventoNotificacion;
    }
    
    /** full constructor */
    public EventoNotificacionPt(EventoNotificacionPtId id, ProveedorTecnologico proveedorTecnologico, EventoNotificacion eventoNotificacion, Short notificar, Short notificarCorreo, Short notificarSms, String emailNotificacion, String celularNotificacion) {
        this.id = id;
        this.proveedorTecnologico = proveedorTecnologico;
        this.eventoNotificacion = eventoNotificacion;
        this.notificar = notificar;
        this.notificarCorreo = notificarCorreo;
        this.notificarSms = notificarSms;
        this.emailNotificacion = emailNotificacion;
        this.celularNotificacion = celularNotificacion;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idEventoNotificacion", column=@Column(name="ID_EVENTO_NOTIFICACION", nullable=false) ), 
        @AttributeOverride(name="idProveedorTecnologico", column=@Column(name="ID_PROVEEDOR_TECNOLOGICO", nullable=false) ) } )

    public EventoNotificacionPtId getId() {
        return this.id;
    }
    
    public void setId(EventoNotificacionPtId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_PROVEEDOR_TECNOLOGICO", nullable=false, insertable=false, updatable=false)

    public ProveedorTecnologico getProveedorTecnologico() {
        return this.proveedorTecnologico;
    }
    
    public void setProveedorTecnologico(ProveedorTecnologico proveedorTecnologico) {
        this.proveedorTecnologico = proveedorTecnologico;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_EVENTO_NOTIFICACION", nullable=false, insertable=false, updatable=false)

    public EventoNotificacion getEventoNotificacion() {
        return this.eventoNotificacion;
    }
    
    public void setEventoNotificacion(EventoNotificacion eventoNotificacion) {
        this.eventoNotificacion = eventoNotificacion;
    }
    
    @Column(name="NOTIFICAR")

    public Short getNotificar() {
        return this.notificar;
    }
    
    public void setNotificar(Short notificar) {
        this.notificar = notificar;
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
