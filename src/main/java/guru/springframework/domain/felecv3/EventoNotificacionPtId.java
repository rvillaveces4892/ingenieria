//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EventoNotificacionPtId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class EventoNotificacionPtId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-8730162819664003592L;
    private Short idEventoNotificacion;
     private Long idProveedorTecnologico;


    // Constructors

    /** default constructor */
    public EventoNotificacionPtId() {
    }

    
    /** full constructor */
    public EventoNotificacionPtId(Short idEventoNotificacion, Long idProveedorTecnologico) {
        this.idEventoNotificacion = idEventoNotificacion;
        this.idProveedorTecnologico = idProveedorTecnologico;
    }

   
    // Property accessors

    @Column(name="ID_EVENTO_NOTIFICACION", nullable=false)

    public Short getIdEventoNotificacion() {
        return this.idEventoNotificacion;
    }
    
    public void setIdEventoNotificacion(Short idEventoNotificacion) {
        this.idEventoNotificacion = idEventoNotificacion;
    }

    @Column(name="ID_PROVEEDOR_TECNOLOGICO", nullable=false)

    public Long getIdProveedorTecnologico() {
        return this.idProveedorTecnologico;
    }
    
    public void setIdProveedorTecnologico(Long idProveedorTecnologico) {
        this.idProveedorTecnologico = idProveedorTecnologico;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EventoNotificacionPtId) ) return false;
		 EventoNotificacionPtId castOther = ( EventoNotificacionPtId ) other; 
         
		 return ( (this.getIdEventoNotificacion()==castOther.getIdEventoNotificacion()) || ( this.getIdEventoNotificacion()!=null && castOther.getIdEventoNotificacion()!=null && this.getIdEventoNotificacion().equals(castOther.getIdEventoNotificacion()) ) )
 && ( (this.getIdProveedorTecnologico()==castOther.getIdProveedorTecnologico()) || ( this.getIdProveedorTecnologico()!=null && castOther.getIdProveedorTecnologico()!=null && this.getIdProveedorTecnologico().equals(castOther.getIdProveedorTecnologico()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEventoNotificacion() == null ? 0 : this.getIdEventoNotificacion().hashCode() );
         result = 37 * result + ( getIdProveedorTecnologico() == null ? 0 : this.getIdProveedorTecnologico().hashCode() );
         return result;
   }   





}
