//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * RevisorDocumentoRadicadoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class RevisorDocumentoRadicadoId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-7821367144716456630L;
    private String usuario;
     private String noDocumento;
     private Long identificacionObligado;


    // Constructors

    /** default constructor */
    public RevisorDocumentoRadicadoId() {
    }

    
    /** full constructor */
    public RevisorDocumentoRadicadoId(String usuario, String noDocumento, Long identificacionObligado) {
        this.usuario = usuario;
        this.noDocumento = noDocumento;
        this.identificacionObligado = identificacionObligado;
    }

   
    // Property accessors

    @Column(name="USUARIO", nullable=false, length=80)

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

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
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RevisorDocumentoRadicadoId) ) return false;
		 RevisorDocumentoRadicadoId castOther = ( RevisorDocumentoRadicadoId ) other; 
         
		 return ( (this.getUsuario()==castOther.getUsuario()) || ( this.getUsuario()!=null && castOther.getUsuario()!=null && this.getUsuario().equals(castOther.getUsuario()) ) )
 && ( (this.getNoDocumento()==castOther.getNoDocumento()) || ( this.getNoDocumento()!=null && castOther.getNoDocumento()!=null && this.getNoDocumento().equals(castOther.getNoDocumento()) ) )
 && ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUsuario() == null ? 0 : this.getUsuario().hashCode() );
         result = 37 * result + ( getNoDocumento() == null ? 0 : this.getNoDocumento().hashCode() );
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         return result;
   }   





}
