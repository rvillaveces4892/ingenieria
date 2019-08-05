//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EstadoDocRecepcion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_DOC_RECEPCION"
    ,schema="FELECV3"
)

public class EstadoDocRecepcion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7592499421544465307L;
    private Short idEstadoDocRecepcion;
     private String descripcion;


    // Constructors

    /** default constructor */
    public EstadoDocRecepcion() {
    }

	/** minimal constructor */
    public EstadoDocRecepcion(Short idEstadoDocRecepcion) {
        this.idEstadoDocRecepcion = idEstadoDocRecepcion;
    }
    
    @Id 
    
    @Column(name="ID_ESTADO_DOC_RECEPCION", unique=true, nullable=false)

    public Short getIdEstadoDocRecepcion() {
        return this.idEstadoDocRecepcion;
    }
    
    public void setIdEstadoDocRecepcion(Short idEstadoDocRecepcion) {
        this.idEstadoDocRecepcion = idEstadoDocRecepcion;
    }
    
    @Column(name="DESCRIPCION", length=30)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
