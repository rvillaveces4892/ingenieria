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
 * PlantillaMail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="PLANTILLA_MAIL"
    ,schema="FELECV3"
)

public class PlantillaMail   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5610251250814005990L;
    private Short idPlantillaMail;
     private TipoPlantilla tipoPlantilla;
     private String plantilla;
     private Set<EventoNotificacion> eventoNotificacions = new HashSet<EventoNotificacion>(0);


    // Constructors

    /** default constructor */
    public PlantillaMail() {
    }

	/** minimal constructor */
    public PlantillaMail(Short idPlantillaMail) {
        this.idPlantillaMail = idPlantillaMail;
    }
    
    /** full constructor */
    public PlantillaMail(Short idPlantillaMail, TipoPlantilla tipoPlantilla, String plantilla, Set<EventoNotificacion> eventoNotificacions) {
        this.idPlantillaMail = idPlantillaMail;
        this.tipoPlantilla = tipoPlantilla;
        this.plantilla = plantilla;
        this.eventoNotificacions = eventoNotificacions;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_PLANTILLA_MAIL", unique=true, nullable=false)

    public Short getIdPlantillaMail() {
        return this.idPlantillaMail;
    }
    
    public void setIdPlantillaMail(Short idPlantillaMail) {
        this.idPlantillaMail = idPlantillaMail;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_PLANTILLA")

    public TipoPlantilla getTipoPlantilla() {
        return this.tipoPlantilla;
    }
    
    public void setTipoPlantilla(TipoPlantilla tipoPlantilla) {
        this.tipoPlantilla = tipoPlantilla;
    }
    
    @Column(name="PLANTILLA", length=2000)

    public String getPlantilla() {
        return this.plantilla;
    }
    
    public void setPlantilla(String plantilla) {
        this.plantilla = plantilla;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="plantillaMail")

    public Set<EventoNotificacion> getEventoNotificacions() {
        return this.eventoNotificacions;
    }
    
    public void setEventoNotificacions(Set<EventoNotificacion> eventoNotificacions) {
        this.eventoNotificacions = eventoNotificacions;
    }
   








}
