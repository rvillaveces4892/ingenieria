//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EstadoTransXml entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_TRANS_XML"
    ,schema="FELECV3"
)

public class EstadoTransXml   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6818237386900779003L;
    private Short codTransXml;
     private String descripcion;


    // Constructors

    /** default constructor */
    public EstadoTransXml() {
    }

	/** minimal constructor */
    public EstadoTransXml(Short codTransXml) {
        this.codTransXml = codTransXml;
    }
    
    /** full constructor */
    public EstadoTransXml(Short codTransXml, String descripcion) {
        this.codTransXml = codTransXml;
        this.descripcion = descripcion;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="COD_TRANS_XML", unique=true, nullable=false)

    public Short getCodTransXml() {
        return this.codTransXml;
    }
    
    public void setCodTransXml(Short codTransXml) {
        this.codTransXml = codTransXml;
    }
    
    @Column(name="DESCRIPCION", length=200)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   








}
