//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * RangoNotaCreditoDebitoOfeId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class RangoNotaCreditoDebitoOfeId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=4864133140624861301L;
    private Long numResoluDian;
     private Long identificacionObligado;
     private Short idTipoDocFe;
     private String prefijo;


    // Constructors

    /** default constructor */
    public RangoNotaCreditoDebitoOfeId() {
    }

    
    /** full constructor */
    public RangoNotaCreditoDebitoOfeId(Long numResoluDian, Long identificacionObligado, Short idTipoDocFe, String prefijo) {
        this.numResoluDian = numResoluDian;
        this.identificacionObligado = identificacionObligado;
        this.idTipoDocFe = idTipoDocFe;
        this.prefijo = prefijo;
    }

   
    // Property accessors

    @Column(name="NUM_RESOLU_DIAN", nullable=false)

    public Long getNumResoluDian() {
        return this.numResoluDian;
    }
    
    public void setNumResoluDian(Long numResoluDian) {
        this.numResoluDian = numResoluDian;
    }

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="ID_TIPO_DOC_FE", nullable=false)

    public Short getIdTipoDocFe() {
        return this.idTipoDocFe;
    }
    
    public void setIdTipoDocFe(Short idTipoDocFe) {
        this.idTipoDocFe = idTipoDocFe;
    }

    @Column(name="PREFIJO", nullable=false, length=12)

    public String getPrefijo() {
        return this.prefijo;
    }
    
    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RangoNotaCreditoDebitoOfeId) ) return false;
		 RangoNotaCreditoDebitoOfeId castOther = ( RangoNotaCreditoDebitoOfeId ) other; 
         
		 return ( (this.getNumResoluDian()==castOther.getNumResoluDian()) || ( this.getNumResoluDian()!=null && castOther.getNumResoluDian()!=null && this.getNumResoluDian().equals(castOther.getNumResoluDian()) ) )
 && ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getIdTipoDocFe()==castOther.getIdTipoDocFe()) || ( this.getIdTipoDocFe()!=null && castOther.getIdTipoDocFe()!=null && this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe()) ) )
 && ( (this.getPrefijo()==castOther.getPrefijo()) || ( this.getPrefijo()!=null && castOther.getPrefijo()!=null && this.getPrefijo().equals(castOther.getPrefijo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNumResoluDian() == null ? 0 : this.getNumResoluDian().hashCode() );
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getIdTipoDocFe() == null ? 0 : this.getIdTipoDocFe().hashCode() );
         result = 37 * result + ( getPrefijo() == null ? 0 : this.getPrefijo().hashCode() );
         return result;
   }   





}
