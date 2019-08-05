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
 * ImpuestoDian entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="IMPUESTO_DIAN"
    ,schema="FELECV3"
)

public class ImpuestoDian   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-3667376053799492107L;
    private String codigoImpuestoDian;
     private String descripcion;
     private Short retenido;
     private Set<ImpuestoSelect> impuestoSelects = new HashSet<ImpuestoSelect>(0);


    // Constructors

    /** default constructor */
    public ImpuestoDian() {
    }

	/** minimal constructor */
    public ImpuestoDian(String codigoImpuestoDian) {
        this.codigoImpuestoDian = codigoImpuestoDian;
    }
    
    /** full constructor */
    public ImpuestoDian(String codigoImpuestoDian, String descripcion, Short retenido, Set<ImpuestoSelect> impuestoSelects) {
        this.codigoImpuestoDian = codigoImpuestoDian;
        this.descripcion = descripcion;
        this.retenido = retenido;
        this.impuestoSelects = impuestoSelects;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="CODIGO_IMPUESTO_DIAN", unique=true, nullable=false, length=10)

    public String getCodigoImpuestoDian() {
        return this.codigoImpuestoDian;
    }
    
    public void setCodigoImpuestoDian(String codigoImpuestoDian) {
        this.codigoImpuestoDian = codigoImpuestoDian;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="RETENIDO")

    public Short getRetenido() {
        return this.retenido;
    }
    
    public void setRetenido(Short retenido) {
        this.retenido = retenido;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="impuestoDian")

    public Set<ImpuestoSelect> getImpuestoSelects() {
        return this.impuestoSelects;
    }
    
    public void setImpuestoSelects(Set<ImpuestoSelect> impuestoSelects) {
        this.impuestoSelects = impuestoSelects;
    }
   








}
