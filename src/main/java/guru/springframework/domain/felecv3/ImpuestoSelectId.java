//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ImpuestoSelectId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class ImpuestoSelectId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7003316432199063914L;
    private String codigoImpuestoSelect;
     private Long identificacionObligado;


    // Constructors

    /** default constructor */
    public ImpuestoSelectId() {
    }

    
    /** full constructor */
    public ImpuestoSelectId(String codigoImpuestoSelect, Long identificacionObligado) {
        this.codigoImpuestoSelect = codigoImpuestoSelect;
        this.identificacionObligado = identificacionObligado;
    }

   
    // Property accessors

    @Column(name="CODIGO_IMPUESTO_SELECT", nullable=false, length=10)

    public String getCodigoImpuestoSelect() {
        return this.codigoImpuestoSelect;
    }
    
    public void setCodigoImpuestoSelect(String codigoImpuestoSelect) {
        this.codigoImpuestoSelect = codigoImpuestoSelect;
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
		 if ( !(other instanceof ImpuestoSelectId) ) return false;
		 ImpuestoSelectId castOther = ( ImpuestoSelectId ) other; 
         
		 return ( (this.getCodigoImpuestoSelect()==castOther.getCodigoImpuestoSelect()) || ( this.getCodigoImpuestoSelect()!=null && castOther.getCodigoImpuestoSelect()!=null && this.getCodigoImpuestoSelect().equals(castOther.getCodigoImpuestoSelect()) ) )
 && ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodigoImpuestoSelect() == null ? 0 : this.getCodigoImpuestoSelect().hashCode() );
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         return result;
   }   





}
