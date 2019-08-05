//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * WsConfigDianId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class WsConfigDianId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5565326860503479457L;
    private Long identificacionObligado;
     private Short idAplicacion;


    // Constructors

    /** default constructor */
    public WsConfigDianId() {
    }

    
    /** full constructor */
    public WsConfigDianId(Long identificacionObligado, Short idAplicacion) {
        this.identificacionObligado = identificacionObligado;
        this.idAplicacion = idAplicacion;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="ID_APLICACION", nullable=false)

    public Short getIdAplicacion() {
        return this.idAplicacion;
    }
    
    public void setIdAplicacion(Short idAplicacion) {
        this.idAplicacion = idAplicacion;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof WsConfigDianId) ) return false;
		 WsConfigDianId castOther = ( WsConfigDianId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getIdAplicacion()==castOther.getIdAplicacion()) || ( this.getIdAplicacion()!=null && castOther.getIdAplicacion()!=null && this.getIdAplicacion().equals(castOther.getIdAplicacion()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getIdAplicacion() == null ? 0 : this.getIdAplicacion().hashCode() );
         return result;
   }   





}
