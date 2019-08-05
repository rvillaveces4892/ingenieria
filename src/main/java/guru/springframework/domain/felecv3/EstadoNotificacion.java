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
 * EstadoNotificacion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_NOTIFICACION"
    ,schema="FELECV3"
)

public class EstadoNotificacion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=2577918678418494482L;
    private Short idEstadoNotificacion;
     private String descripcion;
     private Set<Notificacion> notificacions = new HashSet<Notificacion>(0);


    // Constructors

    /** default constructor */
    public EstadoNotificacion() {
    }

	/** minimal constructor */
    public EstadoNotificacion(Short idEstadoNotificacion) {
        this.idEstadoNotificacion = idEstadoNotificacion;
    }
    
    /** full constructor */
    public EstadoNotificacion(Short idEstadoNotificacion, String descripcion, Set<Notificacion> notificacions) {
        this.idEstadoNotificacion = idEstadoNotificacion;
        this.descripcion = descripcion;
        this.notificacions = notificacions;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ESTADO_NOTIFICACION", unique=true, nullable=false)

    public Short getIdEstadoNotificacion() {
        return this.idEstadoNotificacion;
    }
    
    public void setIdEstadoNotificacion(Short idEstadoNotificacion) {
        this.idEstadoNotificacion = idEstadoNotificacion;
    }
    
    @Column(name="DESCRIPCION", length=20)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoNotificacion")

    public Set<Notificacion> getNotificacions() {
        return this.notificacions;
    }
    
    public void setNotificacions(Set<Notificacion> notificacions) {
        this.notificacions = notificacions;
    }
   








}
