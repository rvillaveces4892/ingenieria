//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ComponenteWeb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="COMPONENTE_WEB"
    ,schema="FELECV3"
)

public class ComponenteWeb   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-7944998028396384114L;
    private Short idComponenteWeb;
     private ModuloWeb moduloWeb;
     private String descripcion;
     private Set<ComponenteWebRol> componenteWebRols = new HashSet<ComponenteWebRol>(0);


    // Constructors

    /** default constructor */
    public ComponenteWeb() {
    }

	/** minimal constructor */
    public ComponenteWeb(Short idComponenteWeb, ModuloWeb moduloWeb, String descripcion) {
        this.idComponenteWeb = idComponenteWeb;
        this.moduloWeb = moduloWeb;
        this.descripcion = descripcion;
    }
    
    /** full constructor */
    public ComponenteWeb(Short idComponenteWeb, ModuloWeb moduloWeb, String descripcion, Set<ComponenteWebRol> componenteWebRols) {
        this.idComponenteWeb = idComponenteWeb;
        this.moduloWeb = moduloWeb;
        this.descripcion = descripcion;
        this.componenteWebRols = componenteWebRols;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_COMPONENTE_WEB", unique=true, nullable=false)

    public Short getIdComponenteWeb() {
        return this.idComponenteWeb;
    }
    
    public void setIdComponenteWeb(Short idComponenteWeb) {
        this.idComponenteWeb = idComponenteWeb;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_MODULO_WEB", nullable=false)

    public ModuloWeb getModuloWeb() {
        return this.moduloWeb;
    }
    
    public void setModuloWeb(ModuloWeb moduloWeb) {
        this.moduloWeb = moduloWeb;
    }
    
    @Column(name="DESCRIPCION", nullable=false, length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="componenteWeb")

    public Set<ComponenteWebRol> getComponenteWebRols() {
        return this.componenteWebRols;
    }
    
    public void setComponenteWebRols(Set<ComponenteWebRol> componenteWebRols) {
        this.componenteWebRols = componenteWebRols;
    }
   








}
