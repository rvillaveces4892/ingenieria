//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * AuditoriaDataDocId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class AuditoriaDataDocId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7226856705695812789L;
    private Long identificacionObligado;
     private String noDocumento;
     private Long numResoluDian;
     private Short idTipoDoc;


    // Constructors

    /** default constructor */
    public AuditoriaDataDocId() {
    }

    
    /** full constructor */
    public AuditoriaDataDocId(Long identificacionObligado, String noDocumento, Long numResoluDian, Short idTipoDoc) {
        this.identificacionObligado = identificacionObligado;
        this.noDocumento = noDocumento;
        this.numResoluDian = numResoluDian;
        this.idTipoDoc = idTipoDoc;
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

    @Column(name="ID_TIPO_DOC", nullable=false)

    public Short getIdTipoDoc() {
        return this.idTipoDoc;
    }
    
    public void setIdTipoDoc(Short idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AuditoriaDataDocId) ) return false;
		 AuditoriaDataDocId castOther = ( AuditoriaDataDocId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getNoDocumento()==castOther.getNoDocumento()) || ( this.getNoDocumento()!=null && castOther.getNoDocumento()!=null && this.getNoDocumento().equals(castOther.getNoDocumento()) ) )
 && ( (this.getNumResoluDian()==castOther.getNumResoluDian()) || ( this.getNumResoluDian()!=null && castOther.getNumResoluDian()!=null && this.getNumResoluDian().equals(castOther.getNumResoluDian()) ) )
 && ( (this.getIdTipoDoc()==castOther.getIdTipoDoc()) || ( this.getIdTipoDoc()!=null && castOther.getIdTipoDoc()!=null && this.getIdTipoDoc().equals(castOther.getIdTipoDoc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getNoDocumento() == null ? 0 : this.getNoDocumento().hashCode() );
         result = 37 * result + ( getNumResoluDian() == null ? 0 : this.getNumResoluDian().hashCode() );
         result = 37 * result + ( getIdTipoDoc() == null ? 0 : this.getIdTipoDoc().hashCode() );
         return result;
   }   





}
