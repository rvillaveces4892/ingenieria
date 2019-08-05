//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ComponenteWebRolId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class ComponenteWebRolId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=3145132195908522901L;
    private Short idComponenteWeb;
     private Short idRol;


    // Constructors

    /** default constructor */
    public ComponenteWebRolId() {
    }

    
    /** full constructor */
    public ComponenteWebRolId(Short idComponenteWeb, Short idRol) {
        this.idComponenteWeb = idComponenteWeb;
        this.idRol = idRol;
    }

   
    // Property accessors

    @Column(name="ID_COMPONENTE_WEB", nullable=false)

    public Short getIdComponenteWeb() {
        return this.idComponenteWeb;
    }
    
    public void setIdComponenteWeb(Short idComponenteWeb) {
        this.idComponenteWeb = idComponenteWeb;
    }

    @Column(name="ID_ROL", nullable=false)

    public Short getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(Short idRol) {
        this.idRol = idRol;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ComponenteWebRolId) ) return false;
		 ComponenteWebRolId castOther = ( ComponenteWebRolId ) other; 
         
		 return ( (this.getIdComponenteWeb()==castOther.getIdComponenteWeb()) || ( this.getIdComponenteWeb()!=null && castOther.getIdComponenteWeb()!=null && this.getIdComponenteWeb().equals(castOther.getIdComponenteWeb()) ) )
 && ( (this.getIdRol()==castOther.getIdRol()) || ( this.getIdRol()!=null && castOther.getIdRol()!=null && this.getIdRol().equals(castOther.getIdRol()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdComponenteWeb() == null ? 0 : this.getIdComponenteWeb().hashCode() );
         result = 37 * result + ( getIdRol() == null ? 0 : this.getIdRol().hashCode() );
         return result;
   }   





}
