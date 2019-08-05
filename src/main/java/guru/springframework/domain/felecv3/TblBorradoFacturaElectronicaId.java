//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * TblBorradoFacturaElectronicaId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class TblBorradoFacturaElectronicaId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-452268427876691400L;
    private String noDocumento;
     private Long identificacionObligado;
     private Long numResolucion;
     private Short idTipoDoc;


    // Constructors

    /** default constructor */
    public TblBorradoFacturaElectronicaId() {
    }

    
    /** full constructor */
    public TblBorradoFacturaElectronicaId(String noDocumento, Long identificacionObligado, Long numResolucion, Short idTipoDoc) {
        this.noDocumento = noDocumento;
        this.identificacionObligado = identificacionObligado;
        this.numResolucion = numResolucion;
        this.idTipoDoc = idTipoDoc;
    }

   
    // Property accessors

    @Column(name="NO_DOCUMENTO", nullable=false, length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="NUM_RESOLUCION", nullable=false)

    public Long getNumResolucion() {
        return this.numResolucion;
    }
    
    public void setNumResolucion(Long numResolucion) {
        this.numResolucion = numResolucion;
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
		 if ( !(other instanceof TblBorradoFacturaElectronicaId) ) return false;
		 TblBorradoFacturaElectronicaId castOther = ( TblBorradoFacturaElectronicaId ) other; 
         
		 return ( (this.getNoDocumento()==castOther.getNoDocumento()) || ( this.getNoDocumento()!=null && castOther.getNoDocumento()!=null && this.getNoDocumento().equals(castOther.getNoDocumento()) ) )
 && ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getNumResolucion()==castOther.getNumResolucion()) || ( this.getNumResolucion()!=null && castOther.getNumResolucion()!=null && this.getNumResolucion().equals(castOther.getNumResolucion()) ) )
 && ( (this.getIdTipoDoc()==castOther.getIdTipoDoc()) || ( this.getIdTipoDoc()!=null && castOther.getIdTipoDoc()!=null && this.getIdTipoDoc().equals(castOther.getIdTipoDoc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoDocumento() == null ? 0 : this.getNoDocumento().hashCode() );
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getNumResolucion() == null ? 0 : this.getNumResolucion().hashCode() );
         result = 37 * result + ( getIdTipoDoc() == null ? 0 : this.getIdTipoDoc().hashCode() );
         return result;
   }   





}
