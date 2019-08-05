//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * RegistroDocumentoRecepcionId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class RegistroDocumentoRecepcionId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-1095548283453221081L;
    private Long identificacionObligado;
     private String noDocumento;


    // Constructors

    /** default constructor */
    public RegistroDocumentoRecepcionId() {
    }

    
    /** full constructor */
    public RegistroDocumentoRecepcionId(Long identificacionObligado, String noDocumento) {
        this.identificacionObligado = identificacionObligado;
        this.noDocumento = noDocumento;
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
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RegistroDocumentoRecepcionId) ) return false;
		 RegistroDocumentoRecepcionId castOther = ( RegistroDocumentoRecepcionId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getNoDocumento()==castOther.getNoDocumento()) || ( this.getNoDocumento()!=null && castOther.getNoDocumento()!=null && this.getNoDocumento().equals(castOther.getNoDocumento()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getNoDocumento() == null ? 0 : this.getNoDocumento().hashCode() );
         return result;
   }   





}
