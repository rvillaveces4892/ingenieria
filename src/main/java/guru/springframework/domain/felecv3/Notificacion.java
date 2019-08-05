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
 * Notificacion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="NOTIFICACION"
    ,schema="FELECV3"
)

public class Notificacion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5175999057896542448L;
    private Long idNotificacion;
     private TipoNotificacion tipoNotificacion;
     private EstadoNotificacion estadoNotificacion;
     private ProveedorTecnologico proveedorTecnologico;
     private EventoNotificacion eventoNotificacion;
     private ObligadoFe obligadoFe;
     private Long identificacionAdquiriente;
     private Timestamp fechaEvento;
     private String correo;
     private String celular;
     private Short cantidadIntentos;
     private String mensaje;
     private Short esConsolidado;
     private String noDocumento;
     private Set<AuditoriaNotificacion> auditoriaNotificacions = new HashSet<AuditoriaNotificacion>(0);
     private Set<NotificacionConsolidado> notificacionConsolidados = new HashSet<NotificacionConsolidado>(0);


    // Constructors

    /** default constructor */
    public Notificacion() {
    }

	/** minimal constructor */
    public Notificacion(Long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }
    
    /** full constructor */
    public Notificacion(Long idNotificacion, TipoNotificacion tipoNotificacion, EstadoNotificacion estadoNotificacion, ProveedorTecnologico proveedorTecnologico, EventoNotificacion eventoNotificacion, ObligadoFe obligadoFe, Long identificacionAdquiriente, Timestamp fechaEvento, String correo, String celular, Short cantidadIntentos, String mensaje, Short esConsolidado, String noDocumento, Set<AuditoriaNotificacion> auditoriaNotificacions, Set<NotificacionConsolidado> notificacionConsolidados) {
        this.idNotificacion = idNotificacion;
        this.tipoNotificacion = tipoNotificacion;
        this.estadoNotificacion = estadoNotificacion;
        this.proveedorTecnologico = proveedorTecnologico;
        this.eventoNotificacion = eventoNotificacion;
        this.obligadoFe = obligadoFe;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.fechaEvento = fechaEvento;
        this.correo = correo;
        this.celular = celular;
        this.cantidadIntentos = cantidadIntentos;
        this.mensaje = mensaje;
        this.esConsolidado = esConsolidado;
        this.noDocumento = noDocumento;
        this.auditoriaNotificacions = auditoriaNotificacions;
        this.notificacionConsolidados = notificacionConsolidados;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_NOTIFICACION", unique=true, nullable=false)

    public Long getIdNotificacion() {
        return this.idNotificacion;
    }
    
    public void setIdNotificacion(Long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_NOTIFICACION")

    public TipoNotificacion getTipoNotificacion() {
        return this.tipoNotificacion;
    }
    
    public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_NOTIFICACION")

    public EstadoNotificacion getEstadoNotificacion() {
        return this.estadoNotificacion;
    }
    
    public void setEstadoNotificacion(EstadoNotificacion estadoNotificacion) {
        this.estadoNotificacion = estadoNotificacion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_PROVEEDOR_TECNOLOGICO")

    public ProveedorTecnologico getProveedorTecnologico() {
        return this.proveedorTecnologico;
    }
    
    public void setProveedorTecnologico(ProveedorTecnologico proveedorTecnologico) {
        this.proveedorTecnologico = proveedorTecnologico;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_EVENTO_NOTIFICACION")

    public EventoNotificacion getEventoNotificacion() {
        return this.eventoNotificacion;
    }
    
    public void setEventoNotificacion(EventoNotificacion eventoNotificacion) {
        this.eventoNotificacion = eventoNotificacion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO")

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE")

    public Long getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(Long identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
    
    @Column(name="FECHA_EVENTO", length=26)

    public Timestamp getFechaEvento() {
        return this.fechaEvento;
    }
    
    public void setFechaEvento(Timestamp fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
    
    @Column(name="CORREO", length=50)

    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Column(name="CELULAR", length=20)

    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    @Column(name="CANTIDAD_INTENTOS")

    public Short getCantidadIntentos() {
        return this.cantidadIntentos;
    }
    
    public void setCantidadIntentos(Short cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }
    
    @Column(name="MENSAJE", length=5000)

    public String getMensaje() {
        return this.mensaje;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Column(name="ES_CONSOLIDADO")

    public Short getEsConsolidado() {
        return this.esConsolidado;
    }
    
    public void setEsConsolidado(Short esConsolidado) {
        this.esConsolidado = esConsolidado;
    }
    
    @Column(name="NO_DOCUMENTO", length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="notificacion")

    public Set<AuditoriaNotificacion> getAuditoriaNotificacions() {
        return this.auditoriaNotificacions;
    }
    
    public void setAuditoriaNotificacions(Set<AuditoriaNotificacion> auditoriaNotificacions) {
        this.auditoriaNotificacions = auditoriaNotificacions;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="notificacion")

    public Set<NotificacionConsolidado> getNotificacionConsolidados() {
        return this.notificacionConsolidados;
    }
    
    public void setNotificacionConsolidados(Set<NotificacionConsolidado> notificacionConsolidados) {
        this.notificacionConsolidados = notificacionConsolidados;
    }
   








}
