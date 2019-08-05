//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EstadoPagoFactura entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_PAGO_FACTURA"
    ,schema="FELECV3"
)

public class EstadoPagoFactura   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6665252664754303954L;
    private Short idEstadoPago;
     private String descripcion;


    // Constructors

    /** default constructor */
    public EstadoPagoFactura() {
    }

	/** minimal constructor */
    public EstadoPagoFactura(Short idEstadoPago) {
        this.idEstadoPago = idEstadoPago;
    }
    
    /** full constructor */
    public EstadoPagoFactura(Short idEstadoPago, String descripcion) {
        this.idEstadoPago = idEstadoPago;
        this.descripcion = descripcion;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ESTADO_PAGO", unique=true, nullable=false)

    public Short getIdEstadoPago() {
        return this.idEstadoPago;
    }
    
    public void setIdEstadoPago(Short idEstadoPago) {
        this.idEstadoPago = idEstadoPago;
    }
    
    @Column(name="DESCRIPCION", length=100)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   








}
