//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ConfTransformacionXsltId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class ConfTransformacionXsltId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=8434390877807406230L;
    private Long identificacionObligado;
     private Short idTipoDocumento;
     private Short versionDoc;
     private Long numResoluDian;


    // Constructors

    /** default constructor */
    public ConfTransformacionXsltId() {
    }

    
    /** full constructor */
    public ConfTransformacionXsltId(Long identificacionObligado, Short idTipoDocumento, Short versionDoc, Long numResoluDian) {
        this.identificacionObligado = identificacionObligado;
        this.idTipoDocumento = idTipoDocumento;
        this.versionDoc = versionDoc;
        this.numResoluDian = numResoluDian;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="ID_TIPO_DOCUMENTO", nullable=false)

    public Short getIdTipoDocumento() {
        return this.idTipoDocumento;
    }
    
    public void setIdTipoDocumento(Short idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Column(name="VERSION_DOC", nullable=false)

    public Short getVersionDoc() {
        return this.versionDoc;
    }
    
    public void setVersionDoc(Short versionDoc) {
        this.versionDoc = versionDoc;
    }

    @Column(name="NUM_RESOLU_DIAN", nullable=false)

    public Long getNumResoluDian() {
        return this.numResoluDian;
    }
    
    public void setNumResoluDian(Long numResoluDian) {
        this.numResoluDian = numResoluDian;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ConfTransformacionXsltId) ) return false;
		 ConfTransformacionXsltId castOther = ( ConfTransformacionXsltId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getIdTipoDocumento()==castOther.getIdTipoDocumento()) || ( this.getIdTipoDocumento()!=null && castOther.getIdTipoDocumento()!=null && this.getIdTipoDocumento().equals(castOther.getIdTipoDocumento()) ) )
 && ( (this.getVersionDoc()==castOther.getVersionDoc()) || ( this.getVersionDoc()!=null && castOther.getVersionDoc()!=null && this.getVersionDoc().equals(castOther.getVersionDoc()) ) )
 && ( (this.getNumResoluDian()==castOther.getNumResoluDian()) || ( this.getNumResoluDian()!=null && castOther.getNumResoluDian()!=null && this.getNumResoluDian().equals(castOther.getNumResoluDian()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getIdTipoDocumento() == null ? 0 : this.getIdTipoDocumento().hashCode() );
         result = 37 * result + ( getVersionDoc() == null ? 0 : this.getVersionDoc().hashCode() );
         result = 37 * result + ( getNumResoluDian() == null ? 0 : this.getNumResoluDian().hashCode() );
         return result;
   }   





}
