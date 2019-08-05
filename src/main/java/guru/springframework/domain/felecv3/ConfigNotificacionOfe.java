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
 * ConfigNotificacionOfe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONFIG_NOTIFICACION_OFE"
    ,schema="FELECV3"
)

public class ConfigNotificacionOfe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-1366009335212802975L;
    private Long idConfigNotificacionOfe;
     private EventoNotificacion eventoNotificacion;
     private ObligadoFe obligadoFe;
     private Short horaNotificacion;


    // Constructors

    /** default constructor */
    public ConfigNotificacionOfe() {
    }

	/** minimal constructor */
    public ConfigNotificacionOfe(Long idConfigNotificacionOfe) {
        this.idConfigNotificacionOfe = idConfigNotificacionOfe;
    }
    
    /** full constructor */
    public ConfigNotificacionOfe(Long idConfigNotificacionOfe, EventoNotificacion eventoNotificacion, ObligadoFe obligadoFe, Short horaNotificacion) {
        this.idConfigNotificacionOfe = idConfigNotificacionOfe;
        this.eventoNotificacion = eventoNotificacion;
        this.obligadoFe = obligadoFe;
        this.horaNotificacion = horaNotificacion;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_CONFIG_NOTIFICACION_OFE", unique=true, nullable=false)

    public Long getIdConfigNotificacionOfe() {
        return this.idConfigNotificacionOfe;
    }
    
    public void setIdConfigNotificacionOfe(Long idConfigNotificacionOfe) {
        this.idConfigNotificacionOfe = idConfigNotificacionOfe;
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
    
    @Column(name="HORA_NOTIFICACION")

    public Short getHoraNotificacion() {
        return this.horaNotificacion;
    }
    
    public void setHoraNotificacion(Short horaNotificacion) {
        this.horaNotificacion = horaNotificacion;
    }
   








}
