//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ModuloWebRol entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MODULO_WEB_ROL"
    ,schema="FELECV3"
)

public class ModuloWebRol   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=2892891705632367646L;
    private ModuloWebRolId id;
     private Rol rol;
     private ModuloWeb moduloWeb;


    // Constructors

    /** default constructor */
    public ModuloWebRol() {
    }

    
    /** full constructor */
    public ModuloWebRol(ModuloWebRolId id, Rol rol, ModuloWeb moduloWeb) {
        this.id = id;
        this.rol = rol;
        this.moduloWeb = moduloWeb;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idModuloWeb", column=@Column(name="ID_MODULO_WEB", nullable=false) ), 
        @AttributeOverride(name="idRol", column=@Column(name="ID_ROL", nullable=false) ) } )

    public ModuloWebRolId getId() {
        return this.id;
    }
    
    public void setId(ModuloWebRolId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ROL", nullable=false, insertable=false, updatable=false)

    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_MODULO_WEB", nullable=false, insertable=false, updatable=false)

    public ModuloWeb getModuloWeb() {
        return this.moduloWeb;
    }
    
    public void setModuloWeb(ModuloWeb moduloWeb) {
        this.moduloWeb = moduloWeb;
    }
   








}
