//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ModuloWeb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MODULO_WEB"
    ,schema="FELECV3"
)

public class ModuloWeb   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=8550929119731599851L;
    private Short idModuloWeb;
     private String descripcion;
     private Set<EventoNotificacion> eventoNotificacions = new HashSet<EventoNotificacion>(0);
     private Set<ComponenteWeb> componenteWebs = new HashSet<ComponenteWeb>(0);
     private Set<ModuloWebRol> moduloWebRols = new HashSet<ModuloWebRol>(0);


    // Constructors

    /** default constructor */
    public ModuloWeb() {
    }

	/** minimal constructor */
    public ModuloWeb(Short idModuloWeb, String descripcion) {
        this.idModuloWeb = idModuloWeb;
        this.descripcion = descripcion;
    }
    
    /** full constructor */
    public ModuloWeb(Short idModuloWeb, String descripcion, Set<EventoNotificacion> eventoNotificacions, Set<ComponenteWeb> componenteWebs, Set<ModuloWebRol> moduloWebRols) {
        this.idModuloWeb = idModuloWeb;
        this.descripcion = descripcion;
        this.eventoNotificacions = eventoNotificacions;
        this.componenteWebs = componenteWebs;
        this.moduloWebRols = moduloWebRols;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_MODULO_WEB", unique=true, nullable=false)

    public Short getIdModuloWeb() {
        return this.idModuloWeb;
    }
    
    public void setIdModuloWeb(Short idModuloWeb) {
        this.idModuloWeb = idModuloWeb;
    }
    
    @Column(name="DESCRIPCION", nullable=false, length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="moduloWeb")

    public Set<EventoNotificacion> getEventoNotificacions() {
        return this.eventoNotificacions;
    }
    
    public void setEventoNotificacions(Set<EventoNotificacion> eventoNotificacions) {
        this.eventoNotificacions = eventoNotificacions;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="moduloWeb")

    public Set<ComponenteWeb> getComponenteWebs() {
        return this.componenteWebs;
    }
    
    public void setComponenteWebs(Set<ComponenteWeb> componenteWebs) {
        this.componenteWebs = componenteWebs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="moduloWeb")

    public Set<ModuloWebRol> getModuloWebRols() {
        return this.moduloWebRols;
    }
    
    public void setModuloWebRols(Set<ModuloWebRol> moduloWebRols) {
        this.moduloWebRols = moduloWebRols;
    }
   








}
