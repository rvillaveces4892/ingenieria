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
 * Parametros entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="PARAMETROS"
    ,schema="FELECV3"
)

public class Parametros   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2947891542130261437L;
    private Short idParametro;
     private String descripcion;
     private Set<ParametroObligado> parametroObligados = new HashSet<ParametroObligado>(0);


    // Constructors

    /** default constructor */
    public Parametros() {
    }

	/** minimal constructor */
    public Parametros(Short idParametro) {
        this.idParametro = idParametro;
    }
    
    /** full constructor */
    public Parametros(Short idParametro, String descripcion, Set<ParametroObligado> parametroObligados) {
        this.idParametro = idParametro;
        this.descripcion = descripcion;
        this.parametroObligados = parametroObligados;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_PARAMETRO", unique=true, nullable=false)

    public Short getIdParametro() {
        return this.idParametro;
    }
    
    public void setIdParametro(Short idParametro) {
        this.idParametro = idParametro;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="parametros")

    public Set<ParametroObligado> getParametroObligados() {
        return this.parametroObligados;
    }
    
    public void setParametroObligados(Set<ParametroObligado> parametroObligados) {
        this.parametroObligados = parametroObligados;
    }
   








}
