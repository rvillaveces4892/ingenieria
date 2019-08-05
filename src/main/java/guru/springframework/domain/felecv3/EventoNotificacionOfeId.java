//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EventoNotificacionOfeId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class EventoNotificacionOfeId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=6528507546497970766L;
    private Short idEventoNotificacion;
     private Long identificacionObligado;


    // Constructors

    /** default constructor */
    public EventoNotificacionOfeId() {
    }

    
    /** full constructor */
    public EventoNotificacionOfeId(Short idEventoNotificacion, Long identificacionObligado) {
        this.idEventoNotificacion = idEventoNotificacion;
        this.identificacionObligado = identificacionObligado;
    }

   
    // Property accessors

    @Column(name="ID_EVENTO_NOTIFICACION", nullable=false)

    public Short getIdEventoNotificacion() {
        return this.idEventoNotificacion;
    }
    
    public void setIdEventoNotificacion(Short idEventoNotificacion) {
        this.idEventoNotificacion = idEventoNotificacion;
    }

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EventoNotificacionOfeId) ) return false;
		 EventoNotificacionOfeId castOther = ( EventoNotificacionOfeId ) other; 
         
		 return ( (this.getIdEventoNotificacion()==castOther.getIdEventoNotificacion()) || ( this.getIdEventoNotificacion()!=null && castOther.getIdEventoNotificacion()!=null && this.getIdEventoNotificacion().equals(castOther.getIdEventoNotificacion()) ) )
 && ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEventoNotificacion() == null ? 0 : this.getIdEventoNotificacion().hashCode() );
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         return result;
   }   





}
