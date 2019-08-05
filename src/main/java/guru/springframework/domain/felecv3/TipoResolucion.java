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
 * TipoResolucion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_RESOLUCION"
    ,schema="FELECV3"
)

public class TipoResolucion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-1860359196192821234L;
    private Short idTipoResolucion;
     private String descripcion;
     private Set<ObligadoFe> obligadoFes = new HashSet<ObligadoFe>(0);


    // Constructors

    /** default constructor */
    public TipoResolucion() {
    }

	/** minimal constructor */
    public TipoResolucion(Short idTipoResolucion) {
        this.idTipoResolucion = idTipoResolucion;
    }
    
    /** full constructor */
    public TipoResolucion(Short idTipoResolucion, String descripcion, Set<ObligadoFe> obligadoFes) {
        this.idTipoResolucion = idTipoResolucion;
        this.descripcion = descripcion;
        this.obligadoFes = obligadoFes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TIPO_RESOLUCION", unique=true, nullable=false)

    public Short getIdTipoResolucion() {
        return this.idTipoResolucion;
    }
    
    public void setIdTipoResolucion(Short idTipoResolucion) {
        this.idTipoResolucion = idTipoResolucion;
    }
    
    @Column(name="DESCRIPCION", length=40)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoResolucion")

    public Set<ObligadoFe> getObligadoFes() {
        return this.obligadoFes;
    }
    
    public void setObligadoFes(Set<ObligadoFe> obligadoFes) {
        this.obligadoFes = obligadoFes;
    }
   








}
