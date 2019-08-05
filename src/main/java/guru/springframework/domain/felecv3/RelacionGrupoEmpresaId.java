//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * RelacionGrupoEmpresaId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class RelacionGrupoEmpresaId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-4657181141579501211L;
    private Long identificacionObligado;
     private Long idGrupoEmpresarial;


    // Constructors

    /** default constructor */
    public RelacionGrupoEmpresaId() {
    }

    
    /** full constructor */
    public RelacionGrupoEmpresaId(Long identificacionObligado, Long idGrupoEmpresarial) {
        this.identificacionObligado = identificacionObligado;
        this.idGrupoEmpresarial = idGrupoEmpresarial;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="ID_GRUPO_EMPRESARIAL", nullable=false)

    public Long getIdGrupoEmpresarial() {
        return this.idGrupoEmpresarial;
    }
    
    public void setIdGrupoEmpresarial(Long idGrupoEmpresarial) {
        this.idGrupoEmpresarial = idGrupoEmpresarial;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RelacionGrupoEmpresaId) ) return false;
		 RelacionGrupoEmpresaId castOther = ( RelacionGrupoEmpresaId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getIdGrupoEmpresarial()==castOther.getIdGrupoEmpresarial()) || ( this.getIdGrupoEmpresarial()!=null && castOther.getIdGrupoEmpresarial()!=null && this.getIdGrupoEmpresarial().equals(castOther.getIdGrupoEmpresarial()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getIdGrupoEmpresarial() == null ? 0 : this.getIdGrupoEmpresarial().hashCode() );
         return result;
   }   





}
