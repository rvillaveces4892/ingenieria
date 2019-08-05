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
 * TipoNotificacion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_NOTIFICACION"
    ,schema="FELECV3"
)

public class TipoNotificacion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5967328866895236110L;
    private Short idTipoNotificacion;
     private String descripcion;
     private Set<Notificacion> notificacions = new HashSet<Notificacion>(0);


    // Constructors

    /** default constructor */
    public TipoNotificacion() {
    }

	/** minimal constructor */
    public TipoNotificacion(Short idTipoNotificacion) {
        this.idTipoNotificacion = idTipoNotificacion;
    }
    
    /** full constructor */
    public TipoNotificacion(Short idTipoNotificacion, String descripcion, Set<Notificacion> notificacions) {
        this.idTipoNotificacion = idTipoNotificacion;
        this.descripcion = descripcion;
        this.notificacions = notificacions;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TIPO_NOTIFICACION", unique=true, nullable=false)

    public Short getIdTipoNotificacion() {
        return this.idTipoNotificacion;
    }
    
    public void setIdTipoNotificacion(Short idTipoNotificacion) {
        this.idTipoNotificacion = idTipoNotificacion;
    }
    
    @Column(name="DESCRIPCION", length=20)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoNotificacion")

    public Set<Notificacion> getNotificacions() {
        return this.notificacions;
    }
    
    public void setNotificacions(Set<Notificacion> notificacions) {
        this.notificacions = notificacions;
    }
   








}
