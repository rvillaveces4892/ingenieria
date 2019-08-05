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
 * MovimientoDocFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MOVIMIENTO_DOC_FE"
    ,schema="FELECV3"
)

public class MovimientoDocFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-7336886526560435007L;
    private Long idMovimiento;
     private AccionDocFe accionDocFe;
     private String noDocumento;
     private Timestamp fechaAccion;
     private String comentarioAccion;
     private Long idUsuario;
     private Short idTipoDocFe;
     private Long identificacionObligado;
     private String identificacionAdquiriente;
     private Long numResoluDian;


    // Constructors

    /** default constructor */
    public MovimientoDocFe() {
    }

	/** minimal constructor */
    public MovimientoDocFe(Long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }
    
    /** full constructor */
    public MovimientoDocFe(Long idMovimiento, AccionDocFe accionDocFe, String noDocumento, Timestamp fechaAccion, String comentarioAccion, Long idUsuario, Short idTipoDocFe, Long identificacionObligado, String identificacionAdquiriente, Long numResoluDian) {
        this.idMovimiento = idMovimiento;
        this.accionDocFe = accionDocFe;
        this.noDocumento = noDocumento;
        this.fechaAccion = fechaAccion;
        this.comentarioAccion = comentarioAccion;
        this.idUsuario = idUsuario;
        this.idTipoDocFe = idTipoDocFe;
        this.identificacionObligado = identificacionObligado;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.numResoluDian = numResoluDian;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_MOVIMIENTO", unique=true, nullable=false)

    public Long getIdMovimiento() {
        return this.idMovimiento;
    }
    
    public void setIdMovimiento(Long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ACCION")

    public AccionDocFe getAccionDocFe() {
        return this.accionDocFe;
    }
    
    public void setAccionDocFe(AccionDocFe accionDocFe) {
        this.accionDocFe = accionDocFe;
    }
    
    @Column(name="NO_DOCUMENTO", length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }
    
    @Column(name="FECHA_ACCION", length=26)

    public Timestamp getFechaAccion() {
        return this.fechaAccion;
    }
    
    public void setFechaAccion(Timestamp fechaAccion) {
        this.fechaAccion = fechaAccion;
    }
    
    @Column(name="COMENTARIO_ACCION")

    public String getComentarioAccion() {
        return this.comentarioAccion;
    }
    
    public void setComentarioAccion(String comentarioAccion) {
        this.comentarioAccion = comentarioAccion;
    }
    
    @Column(name="ID_USUARIO")

    public Long getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    @Column(name="ID_TIPO_DOC_FE")

    public Short getIdTipoDocFe() {
        return this.idTipoDocFe;
    }
    
    public void setIdTipoDocFe(Short idTipoDocFe) {
        this.idTipoDocFe = idTipoDocFe;
    }
    
    @Column(name="IDENTIFICACION_OBLIGADO")

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE", length=30)

    public String getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(String identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
    
    @Column(name="NUM_RESOLU_DIAN")

    public Long getNumResoluDian() {
        return this.numResoluDian;
    }
    
    public void setNumResoluDian(Long numResoluDian) {
        this.numResoluDian = numResoluDian;
    }
   








}
