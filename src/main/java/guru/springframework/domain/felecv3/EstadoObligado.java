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
 * EstadoObligado entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_OBLIGADO"
    ,schema="FELECV3"
)

public class EstadoObligado   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=161574466039195923L;
    private Short idEstadoObligado;
     private String descripcion;
     private Set<ObligadoFe> obligadoFes = new HashSet<ObligadoFe>(0);


    // Constructors

    /** default constructor */
    public EstadoObligado() {
    }

	/** minimal constructor */
    public EstadoObligado(Short idEstadoObligado) {
        this.idEstadoObligado = idEstadoObligado;
    }
    
    /** full constructor */
    public EstadoObligado(Short idEstadoObligado, String descripcion, Set<ObligadoFe> obligadoFes) {
        this.idEstadoObligado = idEstadoObligado;
        this.descripcion = descripcion;
        this.obligadoFes = obligadoFes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ESTADO_OBLIGADO", unique=true, nullable=false)

    public Short getIdEstadoObligado() {
        return this.idEstadoObligado;
    }
    
    public void setIdEstadoObligado(Short idEstadoObligado) {
        this.idEstadoObligado = idEstadoObligado;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoObligado")

    public Set<ObligadoFe> getObligadoFes() {
        return this.obligadoFes;
    }
    
    public void setObligadoFes(Set<ObligadoFe> obligadoFes) {
        this.obligadoFes = obligadoFes;
    }
   








}
