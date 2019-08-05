//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * Inconterms entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="INCONTERMS"
    ,schema="FELECV3"
)

public class Inconterms   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=20009218851950964L;
    private String codigo;
     private String descripcion;


    // Constructors

    /** default constructor */
    public Inconterms() {
    }

	/** minimal constructor */
    public Inconterms(String codigo) {
        this.codigo = codigo;
    }
    
    /** full constructor */
    public Inconterms(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="CODIGO", unique=true, nullable=false, length=10)

    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Column(name="DESCRIPCION", length=100)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   








}
