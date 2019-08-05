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
 * Rol entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ROL"
    ,schema="FELECV3"
)

public class Rol   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7082127424943333779L;
    private Short idRol;
     private String descripcion;
     private Set<UsuarioFelec> usuarioFelecs = new HashSet<UsuarioFelec>(0);
     private Set<ComponenteWebRol> componenteWebRols = new HashSet<ComponenteWebRol>(0);
     private Set<ModuloWebRol> moduloWebRols = new HashSet<ModuloWebRol>(0);
     private Set<CuentaAsociada> cuentaAsociadas = new HashSet<CuentaAsociada>(0);


    // Constructors

    /** default constructor */
    public Rol() {
    }

	/** minimal constructor */
    public Rol(Short idRol) {
        this.idRol = idRol;
    }
    
    /** full constructor */
    public Rol(Short idRol, String descripcion, Set<UsuarioFelec> usuarioFelecs, Set<ComponenteWebRol> componenteWebRols, Set<ModuloWebRol> moduloWebRols, Set<CuentaAsociada> cuentaAsociadas) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.usuarioFelecs = usuarioFelecs;
        this.componenteWebRols = componenteWebRols;
        this.moduloWebRols = moduloWebRols;
        this.cuentaAsociadas = cuentaAsociadas;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ROL", unique=true, nullable=false)

    public Short getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(Short idRol) {
        this.idRol = idRol;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rol")

    public Set<UsuarioFelec> getUsuarioFelecs() {
        return this.usuarioFelecs;
    }
    
    public void setUsuarioFelecs(Set<UsuarioFelec> usuarioFelecs) {
        this.usuarioFelecs = usuarioFelecs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rol")

    public Set<ComponenteWebRol> getComponenteWebRols() {
        return this.componenteWebRols;
    }
    
    public void setComponenteWebRols(Set<ComponenteWebRol> componenteWebRols) {
        this.componenteWebRols = componenteWebRols;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rol")

    public Set<ModuloWebRol> getModuloWebRols() {
        return this.moduloWebRols;
    }
    
    public void setModuloWebRols(Set<ModuloWebRol> moduloWebRols) {
        this.moduloWebRols = moduloWebRols;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rol")

    public Set<CuentaAsociada> getCuentaAsociadas() {
        return this.cuentaAsociadas;
    }
    
    public void setCuentaAsociadas(Set<CuentaAsociada> cuentaAsociadas) {
        this.cuentaAsociadas = cuentaAsociadas;
    }
   








}
