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
 * EstadoCuentaCurd entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_CUENTA_CURD"
    ,schema="FELECV3"
)

public class EstadoCuentaCurd   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=263513222589994962L;
    private Short idEstadoCuentaCurd;
     private String descripcion;
     private Set<ConfCargaOfe> confCargaOfes = new HashSet<ConfCargaOfe>(0);


    // Constructors

    /** default constructor */
    public EstadoCuentaCurd() {
    }

	/** minimal constructor */
    public EstadoCuentaCurd(Short idEstadoCuentaCurd) {
        this.idEstadoCuentaCurd = idEstadoCuentaCurd;
    }
    
    /** full constructor */
    public EstadoCuentaCurd(Short idEstadoCuentaCurd, String descripcion, Set<ConfCargaOfe> confCargaOfes) {
        this.idEstadoCuentaCurd = idEstadoCuentaCurd;
        this.descripcion = descripcion;
        this.confCargaOfes = confCargaOfes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ESTADO_CUENTA_CURD", unique=true, nullable=false)

    public Short getIdEstadoCuentaCurd() {
        return this.idEstadoCuentaCurd;
    }
    
    public void setIdEstadoCuentaCurd(Short idEstadoCuentaCurd) {
        this.idEstadoCuentaCurd = idEstadoCuentaCurd;
    }
    
    @Column(name="DESCRIPCION", length=20)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoCuentaCurd")

    public Set<ConfCargaOfe> getConfCargaOfes() {
        return this.confCargaOfes;
    }
    
    public void setConfCargaOfes(Set<ConfCargaOfe> confCargaOfes) {
        this.confCargaOfes = confCargaOfes;
    }
   








}
