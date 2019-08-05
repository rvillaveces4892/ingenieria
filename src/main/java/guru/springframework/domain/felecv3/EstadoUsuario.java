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
 * EstadoUsuario entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_USUARIO"
    ,schema="FELECV3"
)

public class EstadoUsuario   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7531579710441102315L;
    private Short idEstadoUsuario;
     private String descripcion;
     private Set<UsuarioFelec> usuarioFelecs = new HashSet<UsuarioFelec>(0);


    // Constructors

    /** default constructor */
    public EstadoUsuario() {
    }

	/** minimal constructor */
    public EstadoUsuario(Short idEstadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
    }
    
    /** full constructor */
    public EstadoUsuario(Short idEstadoUsuario, String descripcion, Set<UsuarioFelec> usuarioFelecs) {
        this.idEstadoUsuario = idEstadoUsuario;
        this.descripcion = descripcion;
        this.usuarioFelecs = usuarioFelecs;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ESTADO_USUARIO", unique=true, nullable=false)

    public Short getIdEstadoUsuario() {
        return this.idEstadoUsuario;
    }
    
    public void setIdEstadoUsuario(Short idEstadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoUsuario")

    public Set<UsuarioFelec> getUsuarioFelecs() {
        return this.usuarioFelecs;
    }
    
    public void setUsuarioFelecs(Set<UsuarioFelec> usuarioFelecs) {
        this.usuarioFelecs = usuarioFelecs;
    }
   








}
