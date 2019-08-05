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
 * AccionDocFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ACCION_DOC_FE"
    ,schema="FELECV3"
)

public class AccionDocFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=2280944796295680401L;
    private Short idAccion;
     private String descripcion;
     private Set<MovimientoDocFe> movimientoDocFes = new HashSet<MovimientoDocFe>(0);


    // Constructors

    /** default constructor */
    public AccionDocFe() {
    }

	/** minimal constructor */
    public AccionDocFe(Short idAccion) {
        this.idAccion = idAccion;
    }
    
    /** full constructor */
    public AccionDocFe(Short idAccion, String descripcion, Set<MovimientoDocFe> movimientoDocFes) {
        this.idAccion = idAccion;
        this.descripcion = descripcion;
        this.movimientoDocFes = movimientoDocFes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ACCION", unique=true, nullable=false)

    public Short getIdAccion() {
        return this.idAccion;
    }
    
    public void setIdAccion(Short idAccion) {
        this.idAccion = idAccion;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="accionDocFe")

    public Set<MovimientoDocFe> getMovimientoDocFes() {
        return this.movimientoDocFes;
    }
    
    public void setMovimientoDocFes(Set<MovimientoDocFe> movimientoDocFes) {
        this.movimientoDocFes = movimientoDocFes;
    }
   








}
