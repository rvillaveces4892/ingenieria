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
 * ConfigNotificacionPt entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONFIG_NOTIFICACION_PT"
    ,schema="FELECV3"
)

public class ConfigNotificacionPt   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=6400693479939014714L;
    private Long idConfigNotificacionPt;
     private EventoNotificacion eventoNotificacion;
     private Long identificacionPt;
     private Short horaNotificacion;


    // Constructors

    /** default constructor */
    public ConfigNotificacionPt() {
    }

	/** minimal constructor */
    public ConfigNotificacionPt(Long idConfigNotificacionPt) {
        this.idConfigNotificacionPt = idConfigNotificacionPt;
    }
    
    /** full constructor */
    public ConfigNotificacionPt(Long idConfigNotificacionPt, EventoNotificacion eventoNotificacion, Long identificacionPt, Short horaNotificacion) {
        this.idConfigNotificacionPt = idConfigNotificacionPt;
        this.eventoNotificacion = eventoNotificacion;
        this.identificacionPt = identificacionPt;
        this.horaNotificacion = horaNotificacion;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_CONFIG_NOTIFICACION_PT", unique=true, nullable=false)

    public Long getIdConfigNotificacionPt() {
        return this.idConfigNotificacionPt;
    }
    
    public void setIdConfigNotificacionPt(Long idConfigNotificacionPt) {
        this.idConfigNotificacionPt = idConfigNotificacionPt;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_EVENTO_NOTIFICACION")

    public EventoNotificacion getEventoNotificacion() {
        return this.eventoNotificacion;
    }
    
    public void setEventoNotificacion(EventoNotificacion eventoNotificacion) {
        this.eventoNotificacion = eventoNotificacion;
    }
    
    @Column(name="IDENTIFICACION_PT")

    public Long getIdentificacionPt() {
        return this.identificacionPt;
    }
    
    public void setIdentificacionPt(Long identificacionPt) {
        this.identificacionPt = identificacionPt;
    }
    
    @Column(name="HORA_NOTIFICACION")

    public Short getHoraNotificacion() {
        return this.horaNotificacion;
    }
    
    public void setHoraNotificacion(Short horaNotificacion) {
        this.horaNotificacion = horaNotificacion;
    }
   








}
