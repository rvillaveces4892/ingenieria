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
 * ModuloIncidente entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MODULO_INCIDENTE"
    ,schema="FELECV3"
)

public class ModuloIncidente   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=6549538017106640362L;
    private Short idModuloIncidente;
     private String descripcion;
     private Short idModuloPapa;
     private Set<IncidenteModulo> incidenteModulos = new HashSet<IncidenteModulo>(0);


    // Constructors

    /** default constructor */
    public ModuloIncidente() {
    }

	/** minimal constructor */
    public ModuloIncidente(Short idModuloIncidente) {
        this.idModuloIncidente = idModuloIncidente;
    }
    
    /** full constructor */
    public ModuloIncidente(Short idModuloIncidente, String descripcion, Short idModuloPapa, Set<IncidenteModulo> incidenteModulos) {
        this.idModuloIncidente = idModuloIncidente;
        this.descripcion = descripcion;
        this.idModuloPapa = idModuloPapa;
        this.incidenteModulos = incidenteModulos;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_MODULO_INCIDENTE", unique=true, nullable=false)

    public Short getIdModuloIncidente() {
        return this.idModuloIncidente;
    }
    
    public void setIdModuloIncidente(Short idModuloIncidente) {
        this.idModuloIncidente = idModuloIncidente;
    }
    
    @Column(name="DESCRIPCION", length=70)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="ID_MODULO_PAPA")

    public Short getIdModuloPapa() {
        return this.idModuloPapa;
    }
    
    public void setIdModuloPapa(Short idModuloPapa) {
        this.idModuloPapa = idModuloPapa;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="moduloIncidente")

    public Set<IncidenteModulo> getIncidenteModulos() {
        return this.incidenteModulos;
    }
    
    public void setIncidenteModulos(Set<IncidenteModulo> incidenteModulos) {
        this.incidenteModulos = incidenteModulos;
    }
   








}
