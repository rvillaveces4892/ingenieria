//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * MovimientoDocRecepcion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MOVIMIENTO_DOC_RECEPCION"
    ,schema="FELECV3"
)

public class MovimientoDocRecepcion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6770077060688189968L;
    private Long idMovimientoDocRecepcion;
     private AccionDocRecepcion accionDocRecepcion;
     private String usuario;
     private Long identificacionAdquiriente;
     private Long identificacionObligado;
     private String noDocumento;
     private Timestamp fechaAccion;


    // Constructors

    /** default constructor */
    public MovimientoDocRecepcion() {
    }

	/** minimal constructor */
    public MovimientoDocRecepcion(Long idMovimientoDocRecepcion, AccionDocRecepcion accionDocRecepcion, Timestamp fechaAccion) {
        this.idMovimientoDocRecepcion = idMovimientoDocRecepcion;
        this.accionDocRecepcion = accionDocRecepcion;
        this.fechaAccion = fechaAccion;
    }
    
    /** full constructor */
    public MovimientoDocRecepcion(Long idMovimientoDocRecepcion, AccionDocRecepcion accionDocRecepcion, String usuario, Long identificacionAdquiriente, Long identificacionObligado, String noDocumento, Timestamp fechaAccion) {
        this.idMovimientoDocRecepcion = idMovimientoDocRecepcion;
        this.accionDocRecepcion = accionDocRecepcion;
        this.usuario = usuario;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.identificacionObligado = identificacionObligado;
        this.noDocumento = noDocumento;
        this.fechaAccion = fechaAccion;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_MOVIMIENTO_DOC_RECEPCION", unique=true, nullable=false)

    public Long getIdMovimientoDocRecepcion() {
        return this.idMovimientoDocRecepcion;
    }
    
    public void setIdMovimientoDocRecepcion(Long idMovimientoDocRecepcion) {
        this.idMovimientoDocRecepcion = idMovimientoDocRecepcion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ACCION_DOC_RECEPCION", nullable=false)

    public AccionDocRecepcion getAccionDocRecepcion() {
        return this.accionDocRecepcion;
    }
    
    public void setAccionDocRecepcion(AccionDocRecepcion accionDocRecepcion) {
        this.accionDocRecepcion = accionDocRecepcion;
    }
    
    @Column(name="USUARIO", length=80)

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE")

    public Long getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(Long identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
    
    @Column(name="IDENTIFICACION_OBLIGADO")

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
    
    @Column(name="NO_DOCUMENTO", length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }
    
    @Column(name="FECHA_ACCION", nullable=false, length=26)

    public Timestamp getFechaAccion() {
        return this.fechaAccion;
    }
    
    public void setFechaAccion(Timestamp fechaAccion) {
        this.fechaAccion = fechaAccion;
    }
   








}
