//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EventoNotificacionAdqId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class EventoNotificacionAdqId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5161990589752084056L;
    private Short idEventoNotificacion;
     private Long identificacionAdquiriente;


    // Constructors

    /** default constructor */
    public EventoNotificacionAdqId() {
    }

    
    /** full constructor */
    public EventoNotificacionAdqId(Short idEventoNotificacion, Long identificacionAdquiriente) {
        this.idEventoNotificacion = idEventoNotificacion;
        this.identificacionAdquiriente = identificacionAdquiriente;
    }

   
    // Property accessors

    @Column(name="ID_EVENTO_NOTIFICACION", nullable=false)

    public Short getIdEventoNotificacion() {
        return this.idEventoNotificacion;
    }
    
    public void setIdEventoNotificacion(Short idEventoNotificacion) {
        this.idEventoNotificacion = idEventoNotificacion;
    }

    @Column(name="IDENTIFICACION_ADQUIRIENTE", nullable=false)

    public Long getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(Long identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EventoNotificacionAdqId) ) return false;
		 EventoNotificacionAdqId castOther = ( EventoNotificacionAdqId ) other; 
         
		 return ( (this.getIdEventoNotificacion()==castOther.getIdEventoNotificacion()) || ( this.getIdEventoNotificacion()!=null && castOther.getIdEventoNotificacion()!=null && this.getIdEventoNotificacion().equals(castOther.getIdEventoNotificacion()) ) )
 && ( (this.getIdentificacionAdquiriente()==castOther.getIdentificacionAdquiriente()) || ( this.getIdentificacionAdquiriente()!=null && castOther.getIdentificacionAdquiriente()!=null && this.getIdentificacionAdquiriente().equals(castOther.getIdentificacionAdquiriente()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEventoNotificacion() == null ? 0 : this.getIdEventoNotificacion().hashCode() );
         result = 37 * result + ( getIdentificacionAdquiriente() == null ? 0 : this.getIdentificacionAdquiriente().hashCode() );
         return result;
   }   





}
