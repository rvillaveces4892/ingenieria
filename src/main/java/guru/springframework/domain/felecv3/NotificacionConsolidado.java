//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * NotificacionConsolidado entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="NOTIFICACION_CONSOLIDADO"
    ,schema="FELECV3"
)

public class NotificacionConsolidado   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5299714813065646919L;
    private Long idNotificacionConsolidado;
     private ProveedorTecnologico proveedorTecnologico;
     private EventoNotificacion eventoNotificacion;
     private ObligadoFe obligadoFe;
     private Notificacion notificacion;
     private Long identificacionAdquiriente;


    // Constructors

    /** default constructor */
    public NotificacionConsolidado() {
    }

	/** minimal constructor */
    public NotificacionConsolidado(Long idNotificacionConsolidado) {
        this.idNotificacionConsolidado = idNotificacionConsolidado;
    }
    
    /** full constructor */
    public NotificacionConsolidado(Long idNotificacionConsolidado, ProveedorTecnologico proveedorTecnologico, EventoNotificacion eventoNotificacion, ObligadoFe obligadoFe, Notificacion notificacion, Long identificacionAdquiriente) {
        this.idNotificacionConsolidado = idNotificacionConsolidado;
        this.proveedorTecnologico = proveedorTecnologico;
        this.eventoNotificacion = eventoNotificacion;
        this.obligadoFe = obligadoFe;
        this.notificacion = notificacion;
        this.identificacionAdquiriente = identificacionAdquiriente;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_NOTIFICACION_CONSOLIDADO", unique=true, nullable=false)

    public Long getIdNotificacionConsolidado() {
        return this.idNotificacionConsolidado;
    }
    
    public void setIdNotificacionConsolidado(Long idNotificacionConsolidado) {
        this.idNotificacionConsolidado = idNotificacionConsolidado;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_NOTIFICACION")

    public Notificacion getNotificacion() {
        return this.notificacion;
    }
    
    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE")

    public Long getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(Long identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
   








}
