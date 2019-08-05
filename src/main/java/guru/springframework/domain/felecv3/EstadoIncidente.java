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
 * EstadoIncidente entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_INCIDENTE"
    ,schema="FELECV3"
)

public class EstadoIncidente   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=58243800093050376L;
    private Short idEstadoIncidente;
     private String descripcion;
     private Set<IncidenteModulo> incidenteModulos = new HashSet<IncidenteModulo>(0);
     private Set<ValidacionSecuenciaRota> validacionSecuenciaRotas = new HashSet<ValidacionSecuenciaRota>(0);


    // Constructors

    /** default constructor */
    public EstadoIncidente() {
    }

	/** minimal constructor */
    public EstadoIncidente(Short idEstadoIncidente) {
        this.idEstadoIncidente = idEstadoIncidente;
    }
    
    /** full constructor */
    public EstadoIncidente(Short idEstadoIncidente, String descripcion, Set<IncidenteModulo> incidenteModulos, Set<ValidacionSecuenciaRota> validacionSecuenciaRotas) {
        this.idEstadoIncidente = idEstadoIncidente;
        this.descripcion = descripcion;
        this.incidenteModulos = incidenteModulos;
        this.validacionSecuenciaRotas = validacionSecuenciaRotas;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ESTADO_INCIDENTE", unique=true, nullable=false)

    public Short getIdEstadoIncidente() {
        return this.idEstadoIncidente;
    }
    
    public void setIdEstadoIncidente(Short idEstadoIncidente) {
        this.idEstadoIncidente = idEstadoIncidente;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoIncidente")

    public Set<IncidenteModulo> getIncidenteModulos() {
        return this.incidenteModulos;
    }
    
    public void setIncidenteModulos(Set<IncidenteModulo> incidenteModulos) {
        this.incidenteModulos = incidenteModulos;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoIncidente")

    public Set<ValidacionSecuenciaRota> getValidacionSecuenciaRotas() {
        return this.validacionSecuenciaRotas;
    }
    
    public void setValidacionSecuenciaRotas(Set<ValidacionSecuenciaRota> validacionSecuenciaRotas) {
        this.validacionSecuenciaRotas = validacionSecuenciaRotas;
    }
   








}
