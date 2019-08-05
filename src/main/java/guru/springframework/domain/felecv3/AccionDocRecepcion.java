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
 * AccionDocRecepcion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ACCION_DOC_RECEPCION"
    ,schema="FELECV3"
)

public class AccionDocRecepcion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=1145186969635812938L;
    private Short idAccionDocRecepcion;
     private String descripcion;
     private Set<MovimientoDocRecepcion> movimientoDocRecepcions = new HashSet<MovimientoDocRecepcion>(0);


    // Constructors

    /** default constructor */
    public AccionDocRecepcion() {
    }

	/** minimal constructor */
    public AccionDocRecepcion(Short idAccionDocRecepcion) {
        this.idAccionDocRecepcion = idAccionDocRecepcion;
    }
    
    /** full constructor */
    public AccionDocRecepcion(Short idAccionDocRecepcion, String descripcion, Set<MovimientoDocRecepcion> movimientoDocRecepcions) {
        this.idAccionDocRecepcion = idAccionDocRecepcion;
        this.descripcion = descripcion;
        this.movimientoDocRecepcions = movimientoDocRecepcions;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ACCION_DOC_RECEPCION", unique=true, nullable=false)

    public Short getIdAccionDocRecepcion() {
        return this.idAccionDocRecepcion;
    }
    
    public void setIdAccionDocRecepcion(Short idAccionDocRecepcion) {
        this.idAccionDocRecepcion = idAccionDocRecepcion;
    }
    
    @Column(name="DESCRIPCION", length=20)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="accionDocRecepcion")

    public Set<MovimientoDocRecepcion> getMovimientoDocRecepcions() {
        return this.movimientoDocRecepcions;
    }
    
    public void setMovimientoDocRecepcions(Set<MovimientoDocRecepcion> movimientoDocRecepcions) {
        this.movimientoDocRecepcions = movimientoDocRecepcions;
    }
   








}
