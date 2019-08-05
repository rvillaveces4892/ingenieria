//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EstadoGeneracionXml entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_GENERACION_XML"
    ,schema="FELECV3"
)

public class EstadoGeneracionXml   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-8814864143919299298L;
    private Short codGeneraXml;
     private String descripcion;


    // Constructors

    /** default constructor */
    public EstadoGeneracionXml() {
    }

	/** minimal constructor */
    public EstadoGeneracionXml(Short codGeneraXml) {
        this.codGeneraXml = codGeneraXml;
    }
    
    /** full constructor */
    public EstadoGeneracionXml(Short codGeneraXml, String descripcion) {
        this.codGeneraXml = codGeneraXml;
        this.descripcion = descripcion;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="COD_GENERA_XML", unique=true, nullable=false)

    public Short getCodGeneraXml() {
        return this.codGeneraXml;
    }
    
    public void setCodGeneraXml(Short codGeneraXml) {
        this.codGeneraXml = codGeneraXml;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   








}
