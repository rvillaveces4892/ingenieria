//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

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
 * AuditoriaNotificacion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="AUDITORIA_NOTIFICACION"
    ,schema="FELECV3"
)

public class AuditoriaNotificacion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2624516835743591609L;
    private Long idAuditoriaNotificacion;
     private Notificacion notificacion;
     private Short idEstadoNotificacion;
     private Timestamp fecha;


    // Constructors

    /** default constructor */
    public AuditoriaNotificacion() {
    }

	/** minimal constructor */
    public AuditoriaNotificacion(Long idAuditoriaNotificacion) {
        this.idAuditoriaNotificacion = idAuditoriaNotificacion;
    }
    
    /** full constructor */
    public AuditoriaNotificacion(Long idAuditoriaNotificacion, Notificacion notificacion, Short idEstadoNotificacion, Timestamp fecha) {
        this.idAuditoriaNotificacion = idAuditoriaNotificacion;
        this.notificacion = notificacion;
        this.idEstadoNotificacion = idEstadoNotificacion;
        this.fecha = fecha;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_AUDITORIA_NOTIFICACION", unique=true, nullable=false)
    
    public Long getIdAuditoriaNotificacion() {
        return this.idAuditoriaNotificacion;
    }
    
    public void setIdAuditoriaNotificacion(Long idAuditoriaNotificacion) {
        this.idAuditoriaNotificacion = idAuditoriaNotificacion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_NOTIFICACION")

    public Notificacion getNotificacion() {
        return this.notificacion;
    }
    
    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
    
    @Column(name="ID_ESTADO_NOTIFICACION")

    public Short getIdEstadoNotificacion() {
        return this.idEstadoNotificacion;
    }
    
    public void setIdEstadoNotificacion(Short idEstadoNotificacion) {
        this.idEstadoNotificacion = idEstadoNotificacion;
    }
    
    @Column(name="FECHA", length=26)

    public Timestamp getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
   








}
