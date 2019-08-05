//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * TipoConceptoNotaFeId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class TipoConceptoNotaFeId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=4915749605215266909L;
    private Short idTipoConceptoNota;
     private Short codigoConcepto;


    // Constructors

    /** default constructor */
    public TipoConceptoNotaFeId() {
    }

    
    /** full constructor */
    public TipoConceptoNotaFeId(Short idTipoConceptoNota, Short codigoConcepto) {
        this.idTipoConceptoNota = idTipoConceptoNota;
        this.codigoConcepto = codigoConcepto;
    }

   
    // Property accessors

    @Column(name="ID_TIPO_CONCEPTO_NOTA", nullable=false)

    public Short getIdTipoConceptoNota() {
        return this.idTipoConceptoNota;
    }
    
    public void setIdTipoConceptoNota(Short idTipoConceptoNota) {
        this.idTipoConceptoNota = idTipoConceptoNota;
    }

    @Column(name="CODIGO_CONCEPTO", nullable=false)

    public Short getCodigoConcepto() {
        return this.codigoConcepto;
    }
    
    public void setCodigoConcepto(Short codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TipoConceptoNotaFeId) ) return false;
		 TipoConceptoNotaFeId castOther = ( TipoConceptoNotaFeId ) other; 
         
		 return ( (this.getIdTipoConceptoNota()==castOther.getIdTipoConceptoNota()) || ( this.getIdTipoConceptoNota()!=null && castOther.getIdTipoConceptoNota()!=null && this.getIdTipoConceptoNota().equals(castOther.getIdTipoConceptoNota()) ) )
 && ( (this.getCodigoConcepto()==castOther.getCodigoConcepto()) || ( this.getCodigoConcepto()!=null && castOther.getCodigoConcepto()!=null && this.getCodigoConcepto().equals(castOther.getCodigoConcepto()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdTipoConceptoNota() == null ? 0 : this.getIdTipoConceptoNota().hashCode() );
         result = 37 * result + ( getCodigoConcepto() == null ? 0 : this.getCodigoConcepto().hashCode() );
         return result;
   }   





}
