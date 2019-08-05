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
 * TipoPlantilla entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_PLANTILLA"
    ,schema="FELECV3"
)

public class TipoPlantilla   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5232943477799758517L;
    private Short idTipoPlantilla;
     private String descripcion;
     private Set<PlantillaMail> plantillaMails = new HashSet<PlantillaMail>(0);


    // Constructors

    /** default constructor */
    public TipoPlantilla() {
    }

	/** minimal constructor */
    public TipoPlantilla(Short idTipoPlantilla) {
        this.idTipoPlantilla = idTipoPlantilla;
    }
    
    /** full constructor */
    public TipoPlantilla(Short idTipoPlantilla, String descripcion, Set<PlantillaMail> plantillaMails) {
        this.idTipoPlantilla = idTipoPlantilla;
        this.descripcion = descripcion;
        this.plantillaMails = plantillaMails;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TIPO_PLANTILLA", unique=true, nullable=false)

    public Short getIdTipoPlantilla() {
        return this.idTipoPlantilla;
    }
    
    public void setIdTipoPlantilla(Short idTipoPlantilla) {
        this.idTipoPlantilla = idTipoPlantilla;
    }
    
    @Column(name="DESCRIPCION", length=30)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoPlantilla")

    public Set<PlantillaMail> getPlantillaMails() {
        return this.plantillaMails;
    }
    
    public void setPlantillaMails(Set<PlantillaMail> plantillaMails) {
        this.plantillaMails = plantillaMails;
    }
   








}
