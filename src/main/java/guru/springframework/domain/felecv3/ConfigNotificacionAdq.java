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
 * ConfigNotificacionAdq entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONFIG_NOTIFICACION_ADQ"
    ,schema="FELECV3"
)

public class ConfigNotificacionAdq   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=8474014026834287242L;
    private Long idConfigNotificacionAdq;
     private EventoNotificacion eventoNotificacion;
     private Long identificacionAdquiriente;
     private Short horaNotificacion;


    // Constructors

    /** default constructor */
    public ConfigNotificacionAdq() {
    }

	/** minimal constructor */
    public ConfigNotificacionAdq(Long idConfigNotificacionAdq) {
        this.idConfigNotificacionAdq = idConfigNotificacionAdq;
    }
    
    /** full constructor */
    public ConfigNotificacionAdq(Long idConfigNotificacionAdq, EventoNotificacion eventoNotificacion, Long identificacionAdquiriente, Short horaNotificacion) {
        this.idConfigNotificacionAdq = idConfigNotificacionAdq;
        this.eventoNotificacion = eventoNotificacion;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.horaNotificacion = horaNotificacion;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_CONFIG_NOTIFICACION_ADQ", unique=true, nullable=false)

    public Long getIdConfigNotificacionAdq() {
        return this.idConfigNotificacionAdq;
    }
    
    public void setIdConfigNotificacionAdq(Long idConfigNotificacionAdq) {
        this.idConfigNotificacionAdq = idConfigNotificacionAdq;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_EVENTO_NOTIFICACION")

    public EventoNotificacion getEventoNotificacion() {
        return this.eventoNotificacion;
    }
    
    public void setEventoNotificacion(EventoNotificacion eventoNotificacion) {
        this.eventoNotificacion = eventoNotificacion;
    }
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE")

    public Long getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(Long identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
    
    @Column(name="HORA_NOTIFICACION")

    public Short getHoraNotificacion() {
        return this.horaNotificacion;
    }
    
    public void setHoraNotificacion(Short horaNotificacion) {
        this.horaNotificacion = horaNotificacion;
    }
   








}
