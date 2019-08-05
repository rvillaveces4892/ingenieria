//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EventoNotificacion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="EVENTO_NOTIFICACION"
    ,schema="FELECV3"
)

public class EventoNotificacion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6810792566572776517L;
    private Short idEventoNotificacion;
     private ComponenteSoftware componenteSoftware;
     private ModuloWeb moduloWeb;
     private PlantillaMail plantillaMail;
     private String descripcion;
     private String cuerpoMail;
     private String cuerpoMailConsolidado;
     private String cuerpoSms;
     private String asunto;
     private Short notificableOfe;
     private Short notificableAdq;
     private Short notificablePt;
     private Set<ConfigNotificacionAdq> configNotificacionAdqs = new HashSet<ConfigNotificacionAdq>(0);
     private Set<ConfigNotificacionOfe> configNotificacionOfes = new HashSet<ConfigNotificacionOfe>(0);
     private Set<ConfigNotificacionPt> configNotificacionPts = new HashSet<ConfigNotificacionPt>(0);
     private Set<Notificacion> notificacions = new HashSet<Notificacion>(0);
     private Set<SolicitudActivacionSms> solicitudActivacionSmses = new HashSet<SolicitudActivacionSms>(0);
     private Set<NotificacionConsolidado> notificacionConsolidados = new HashSet<NotificacionConsolidado>(0);
     private Set<EventoNotificacionPt> eventoNotificacionPts = new HashSet<EventoNotificacionPt>(0);
     private Set<EventoNotificacionAdq> eventoNotificacionAdqs = new HashSet<EventoNotificacionAdq>(0);
     private Set<EventoNotificacionOfe> eventoNotificacionOfes = new HashSet<EventoNotificacionOfe>(0);


    // Constructors

    /** default constructor */
    public EventoNotificacion() {
    }

	/** minimal constructor */
    public EventoNotificacion(Short idEventoNotificacion) {
        this.idEventoNotificacion = idEventoNotificacion;
    }
    
    /** full constructor */
    public EventoNotificacion(Short idEventoNotificacion, ComponenteSoftware componenteSoftware, ModuloWeb moduloWeb, PlantillaMail plantillaMail, String descripcion, String cuerpoMail, String cuerpoMailConsolidado, String cuerpoSms, String asunto, Short notificableOfe, Short notificableAdq, Short notificablePt, Set<ConfigNotificacionAdq> configNotificacionAdqs, Set<ConfigNotificacionOfe> configNotificacionOfes, Set<ConfigNotificacionPt> configNotificacionPts, Set<Notificacion> notificacions, Set<SolicitudActivacionSms> solicitudActivacionSmses, Set<NotificacionConsolidado> notificacionConsolidados, Set<EventoNotificacionPt> eventoNotificacionPts, Set<EventoNotificacionAdq> eventoNotificacionAdqs, Set<EventoNotificacionOfe> eventoNotificacionOfes) {
        this.idEventoNotificacion = idEventoNotificacion;
        this.componenteSoftware = componenteSoftware;
        this.moduloWeb = moduloWeb;
        this.plantillaMail = plantillaMail;
        this.descripcion = descripcion;
        this.cuerpoMail = cuerpoMail;
        this.cuerpoMailConsolidado = cuerpoMailConsolidado;
        this.cuerpoSms = cuerpoSms;
        this.asunto = asunto;
        this.notificableOfe = notificableOfe;
        this.notificableAdq = notificableAdq;
        this.notificablePt = notificablePt;
        this.configNotificacionAdqs = configNotificacionAdqs;
        this.configNotificacionOfes = configNotificacionOfes;
        this.configNotificacionPts = configNotificacionPts;
        this.notificacions = notificacions;
        this.solicitudActivacionSmses = solicitudActivacionSmses;
        this.notificacionConsolidados = notificacionConsolidados;
        this.eventoNotificacionPts = eventoNotificacionPts;
        this.eventoNotificacionAdqs = eventoNotificacionAdqs;
        this.eventoNotificacionOfes = eventoNotificacionOfes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_EVENTO_NOTIFICACION", unique=true, nullable=false)

    public Short getIdEventoNotificacion() {
        return this.idEventoNotificacion;
    }
    
    public void setIdEventoNotificacion(Short idEventoNotificacion) {
        this.idEventoNotificacion = idEventoNotificacion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_COMPONENTE_SOFTWARE")

    public ComponenteSoftware getComponenteSoftware() {
        return this.componenteSoftware;
    }
    
    public void setComponenteSoftware(ComponenteSoftware componenteSoftware) {
        this.componenteSoftware = componenteSoftware;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_MODULO_WEB")

    public ModuloWeb getModuloWeb() {
        return this.moduloWeb;
    }
    
    public void setModuloWeb(ModuloWeb moduloWeb) {
        this.moduloWeb = moduloWeb;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_PLANTILLA_MAIL")

    public PlantillaMail getPlantillaMail() {
        return this.plantillaMail;
    }
    
    public void setPlantillaMail(PlantillaMail plantillaMail) {
        this.plantillaMail = plantillaMail;
    }
    
    @Column(name="DESCRIPCION", length=200)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="CUERPO_MAIL", length=500)

    public String getCuerpoMail() {
        return this.cuerpoMail;
    }
    
    public void setCuerpoMail(String cuerpoMail) {
        this.cuerpoMail = cuerpoMail;
    }
    
    @Column(name="CUERPO_MAIL_CONSOLIDADO", length=500)

    public String getCuerpoMailConsolidado() {
        return this.cuerpoMailConsolidado;
    }
    
    public void setCuerpoMailConsolidado(String cuerpoMailConsolidado) {
        this.cuerpoMailConsolidado = cuerpoMailConsolidado;
    }
    
    @Column(name="CUERPO_SMS", length=500)

    public String getCuerpoSms() {
        return this.cuerpoSms;
    }
    
    public void setCuerpoSms(String cuerpoSms) {
        this.cuerpoSms = cuerpoSms;
    }
    
    @Column(name="ASUNTO", length=150)

    public String getAsunto() {
        return this.asunto;
    }
    
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
    @Column(name="NOTIFICABLE_OFE")

    public Short getNotificableOfe() {
        return this.notificableOfe;
    }
    
    public void setNotificableOfe(Short notificableOfe) {
        this.notificableOfe = notificableOfe;
    }
    
    @Column(name="NOTIFICABLE_ADQ")

    public Short getNotificableAdq() {
        return this.notificableAdq;
    }
    
    public void setNotificableAdq(Short notificableAdq) {
        this.notificableAdq = notificableAdq;
    }
    
    @Column(name="NOTIFICABLE_PT")

    public Short getNotificablePt() {
        return this.notificablePt;
    }
    
    public void setNotificablePt(Short notificablePt) {
        this.notificablePt = notificablePt;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eventoNotificacion")

    public Set<ConfigNotificacionAdq> getConfigNotificacionAdqs() {
        return this.configNotificacionAdqs;
    }
    
    public void setConfigNotificacionAdqs(Set<ConfigNotificacionAdq> configNotificacionAdqs) {
        this.configNotificacionAdqs = configNotificacionAdqs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eventoNotificacion")

    public Set<ConfigNotificacionOfe> getConfigNotificacionOfes() {
        return this.configNotificacionOfes;
    }
    
    public void setConfigNotificacionOfes(Set<ConfigNotificacionOfe> configNotificacionOfes) {
        this.configNotificacionOfes = configNotificacionOfes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eventoNotificacion")

    public Set<ConfigNotificacionPt> getConfigNotificacionPts() {
        return this.configNotificacionPts;
    }
    
    public void setConfigNotificacionPts(Set<ConfigNotificacionPt> configNotificacionPts) {
        this.configNotificacionPts = configNotificacionPts;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eventoNotificacion")

    public Set<Notificacion> getNotificacions() {
        return this.notificacions;
    }
    
    public void setNotificacions(Set<Notificacion> notificacions) {
        this.notificacions = notificacions;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eventoNotificacion")

    public Set<SolicitudActivacionSms> getSolicitudActivacionSmses() {
        return this.solicitudActivacionSmses;
    }
    
    public void setSolicitudActivacionSmses(Set<SolicitudActivacionSms> solicitudActivacionSmses) {
        this.solicitudActivacionSmses = solicitudActivacionSmses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eventoNotificacion")

    public Set<NotificacionConsolidado> getNotificacionConsolidados() {
        return this.notificacionConsolidados;
    }
    
    public void setNotificacionConsolidados(Set<NotificacionConsolidado> notificacionConsolidados) {
        this.notificacionConsolidados = notificacionConsolidados;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eventoNotificacion")

    public Set<EventoNotificacionPt> getEventoNotificacionPts() {
        return this.eventoNotificacionPts;
    }
    
    public void setEventoNotificacionPts(Set<EventoNotificacionPt> eventoNotificacionPts) {
        this.eventoNotificacionPts = eventoNotificacionPts;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eventoNotificacion")

    public Set<EventoNotificacionAdq> getEventoNotificacionAdqs() {
        return this.eventoNotificacionAdqs;
    }
    
    public void setEventoNotificacionAdqs(Set<EventoNotificacionAdq> eventoNotificacionAdqs) {
        this.eventoNotificacionAdqs = eventoNotificacionAdqs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eventoNotificacion")

    public Set<EventoNotificacionOfe> getEventoNotificacionOfes() {
        return this.eventoNotificacionOfes;
    }
    
    public void setEventoNotificacionOfes(Set<EventoNotificacionOfe> eventoNotificacionOfes) {
        this.eventoNotificacionOfes = eventoNotificacionOfes;
    }
   








}
