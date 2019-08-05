//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ModuloWebRolId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class ModuloWebRolId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5141034651977355103L;
    private Short idModuloWeb;
     private Short idRol;


    // Constructors

    /** default constructor */
    public ModuloWebRolId() {
    }

    
    /** full constructor */
    public ModuloWebRolId(Short idModuloWeb, Short idRol) {
        this.idModuloWeb = idModuloWeb;
        this.idRol = idRol;
    }

   
    // Property accessors

    @Column(name="ID_MODULO_WEB", nullable=false)

    public Short getIdModuloWeb() {
        return this.idModuloWeb;
    }
    
    public void setIdModuloWeb(Short idModuloWeb) {
        this.idModuloWeb = idModuloWeb;
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
		 if ( !(other instanceof ModuloWebRolId) ) return false;
		 ModuloWebRolId castOther = ( ModuloWebRolId ) other; 
         
		 return ( (this.getIdModuloWeb()==castOther.getIdModuloWeb()) || ( this.getIdModuloWeb()!=null && castOther.getIdModuloWeb()!=null && this.getIdModuloWeb().equals(castOther.getIdModuloWeb()) ) )
 && ( (this.getIdRol()==castOther.getIdRol()) || ( this.getIdRol()!=null && castOther.getIdRol()!=null && this.getIdRol().equals(castOther.getIdRol()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdModuloWeb() == null ? 0 : this.getIdModuloWeb().hashCode() );
         result = 37 * result + ( getIdRol() == null ? 0 : this.getIdRol().hashCode() );
         return result;
   }   





}
