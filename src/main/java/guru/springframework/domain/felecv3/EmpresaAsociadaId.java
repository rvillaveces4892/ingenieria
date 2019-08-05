//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EmpresaAsociadaId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class EmpresaAsociadaId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=4792069823805478834L;
    private String usuario;
     private Long identificacionObligado;


    // Constructors

    /** default constructor */
    public EmpresaAsociadaId() {
    }

    
    /** full constructor */
    public EmpresaAsociadaId(String usuario, Long identificacionObligado) {
        this.usuario = usuario;
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
		 if ( !(other instanceof EmpresaAsociadaId) ) return false;
		 EmpresaAsociadaId castOther = ( EmpresaAsociadaId ) other; 
         
		 return ( (this.getUsuario()==castOther.getUsuario()) || ( this.getUsuario()!=null && castOther.getUsuario()!=null && this.getUsuario().equals(castOther.getUsuario()) ) )
 && ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUsuario() == null ? 0 : this.getUsuario().hashCode() );
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         return result;
   }   





}
