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
 * ComponenteSoftware entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="COMPONENTE_SOFTWARE"
    ,schema="FELECV3"
)

public class ComponenteSoftware   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6976567853193392976L;
    private Short idComponenteSoftware;
     private String descripcion;
     private Set<EventoNotificacion> eventoNotificacions = new HashSet<EventoNotificacion>(0);


    // Constructors

    /** default constructor */
    public ComponenteSoftware() {
    }

	/** minimal constructor */
    public ComponenteSoftware(Short idComponenteSoftware) {
        this.idComponenteSoftware = idComponenteSoftware;
    }
    
    /** full constructor */
    public ComponenteSoftware(Short idComponenteSoftware, String descripcion, Set<EventoNotificacion> eventoNotificacions) {
        this.idComponenteSoftware = idComponenteSoftware;
        this.descripcion = descripcion;
        this.eventoNotificacions = eventoNotificacions;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_COMPONENTE_SOFTWARE", unique=true, nullable=false)

    public Short getIdComponenteSoftware() {
        return this.idComponenteSoftware;
    }
    
    public void setIdComponenteSoftware(Short idComponenteSoftware) {
        this.idComponenteSoftware = idComponenteSoftware;
    }
    
    @Column(name="DESCRIPCION", length=20)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="componenteSoftware")

    public Set<EventoNotificacion> getEventoNotificacions() {
        return this.eventoNotificacions;
    }
    
    public void setEventoNotificacions(Set<EventoNotificacion> eventoNotificacions) {
        this.eventoNotificacions = eventoNotificacions;
    }
   








}
