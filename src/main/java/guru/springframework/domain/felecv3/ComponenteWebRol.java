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
 * ComponenteWebRol entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="COMPONENTE_WEB_ROL"
    ,schema="FELECV3"
)

public class ComponenteWebRol   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-8361367028280109025L;
    private ComponenteWebRolId id;
     private Rol rol;
     private ComponenteWeb componenteWeb;


    // Constructors

    /** default constructor */
    public ComponenteWebRol() {
    }

    
    /** full constructor */
    public ComponenteWebRol(ComponenteWebRolId id, Rol rol, ComponenteWeb componenteWeb) {
        this.id = id;
        this.rol = rol;
        this.componenteWeb = componenteWeb;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idComponenteWeb", column=@Column(name="ID_COMPONENTE_WEB", nullable=false) ), 
        @AttributeOverride(name="idRol", column=@Column(name="ID_ROL", nullable=false) ) } )

    public ComponenteWebRolId getId() {
        return this.id;
    }
    
    public void setId(ComponenteWebRolId id) {
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
        @JoinColumn(name="ID_COMPONENTE_WEB", nullable=false, insertable=false, updatable=false)

    public ComponenteWeb getComponenteWeb() {
        return this.componenteWeb;
    }
    
    public void setComponenteWeb(ComponenteWeb componenteWeb) {
        this.componenteWeb = componenteWeb;
    }
   








}
