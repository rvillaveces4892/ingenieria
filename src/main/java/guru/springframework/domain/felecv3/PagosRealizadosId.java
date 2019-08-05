//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * PagosRealizadosId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class PagosRealizadosId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=2453140165337587369L;
    private Long identificacionObligado;
     private String noDocumento;
     private Long numResoluDian;
     private Integer idPago;
     private Short idTipoDocFe;


    // Constructors

    /** default constructor */
    public PagosRealizadosId() {
    }

    
    /** full constructor */
    public PagosRealizadosId(Long identificacionObligado, String noDocumento, Long numResoluDian, Integer idPago, Short idTipoDocFe) {
        this.identificacionObligado = identificacionObligado;
        this.noDocumento = noDocumento;
        this.numResoluDian = numResoluDian;
        this.idPago = idPago;
        this.idTipoDocFe = idTipoDocFe;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="NO_DOCUMENTO", nullable=false, length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    @Column(name="NUM_RESOLU_DIAN", nullable=false)

    public Long getNumResoluDian() {
        return this.numResoluDian;
    }
    
    public void setNumResoluDian(Long numResoluDian) {
        this.numResoluDian = numResoluDian;
    }

    @Column(name="ID_PAGO", nullable=false)

    public Integer getIdPago() {
        return this.idPago;
    }
    
    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    @Column(name="ID_TIPO_DOC_FE", nullable=false)

    public Short getIdTipoDocFe() {
        return this.idTipoDocFe;
    }
    
    public void setIdTipoDocFe(Short idTipoDocFe) {
        this.idTipoDocFe = idTipoDocFe;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PagosRealizadosId) ) return false;
		 PagosRealizadosId castOther = ( PagosRealizadosId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getNoDocumento()==castOther.getNoDocumento()) || ( this.getNoDocumento()!=null && castOther.getNoDocumento()!=null && this.getNoDocumento().equals(castOther.getNoDocumento()) ) )
 && ( (this.getNumResoluDian()==castOther.getNumResoluDian()) || ( this.getNumResoluDian()!=null && castOther.getNumResoluDian()!=null && this.getNumResoluDian().equals(castOther.getNumResoluDian()) ) )
 && ( (this.getIdPago()==castOther.getIdPago()) || ( this.getIdPago()!=null && castOther.getIdPago()!=null && this.getIdPago().equals(castOther.getIdPago()) ) )
 && ( (this.getIdTipoDocFe()==castOther.getIdTipoDocFe()) || ( this.getIdTipoDocFe()!=null && castOther.getIdTipoDocFe()!=null && this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getNoDocumento() == null ? 0 : this.getNoDocumento().hashCode() );
         result = 37 * result + ( getNumResoluDian() == null ? 0 : this.getNumResoluDian().hashCode() );
         result = 37 * result + ( getIdPago() == null ? 0 : this.getIdPago().hashCode() );
         result = 37 * result + ( getIdTipoDocFe() == null ? 0 : this.getIdTipoDocFe().hashCode() );
         return result;
   }   





}
