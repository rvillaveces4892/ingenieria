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
 * AcuerdoMovimientoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ACUERDO_MOVIMIENTO_FE"
    ,schema="FELECV3"
)

public class AcuerdoMovimientoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-3151836304210693914L;
    private Long idAcuerdoMovimiento;
     private AccionAcuerdo accionAcuerdo;
     private UsuarioFelec usuarioFelec;
     private AdquirienteFe adquirienteFe;
     private ObligadoFe obligadoFe;
     private Timestamp fechaAccion;
     private String ipAccion;


    // Constructors

    /** default constructor */
    public AcuerdoMovimientoFe() {
    }

	/** minimal constructor */
    public AcuerdoMovimientoFe(Long idAcuerdoMovimiento) {
        this.idAcuerdoMovimiento = idAcuerdoMovimiento;
    }
    
    /** full constructor */
    public AcuerdoMovimientoFe(Long idAcuerdoMovimiento, AccionAcuerdo accionAcuerdo, UsuarioFelec usuarioFelec, AdquirienteFe adquirienteFe, ObligadoFe obligadoFe, Timestamp fechaAccion, String ipAccion) {
        this.idAcuerdoMovimiento = idAcuerdoMovimiento;
        this.accionAcuerdo = accionAcuerdo;
        this.usuarioFelec = usuarioFelec;
        this.adquirienteFe = adquirienteFe;
        this.obligadoFe = obligadoFe;
        this.fechaAccion = fechaAccion;
        this.ipAccion = ipAccion;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_ACUERDO_MOVIMIENTO", unique=true, nullable=false)
    
    public Long getIdAcuerdoMovimiento() {
        return this.idAcuerdoMovimiento;
    }
    
    public void setIdAcuerdoMovimiento(Long idAcuerdoMovimiento) {
        this.idAcuerdoMovimiento = idAcuerdoMovimiento;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ACCION_ACUERDO")

    public AccionAcuerdo getAccionAcuerdo() {
        return this.accionAcuerdo;
    }
    
    public void setAccionAcuerdo(AccionAcuerdo accionAcuerdo) {
        this.accionAcuerdo = accionAcuerdo;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_USUARIO")

    public UsuarioFelec getUsuarioFelec() {
        return this.usuarioFelec;
    }
    
    public void setUsuarioFelec(UsuarioFelec usuarioFelec) {
        this.usuarioFelec = usuarioFelec;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_ADQUIRIENTE")

    public AdquirienteFe getAdquirienteFe() {
        return this.adquirienteFe;
    }
    
    public void setAdquirienteFe(AdquirienteFe adquirienteFe) {
        this.adquirienteFe = adquirienteFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO")

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
    
    @Column(name="FECHA_ACCION", length=26)

    public Timestamp getFechaAccion() {
        return this.fechaAccion;
    }
    
    public void setFechaAccion(Timestamp fechaAccion) {
        this.fechaAccion = fechaAccion;
    }
    
    @Column(name="IP_ACCION", length=20)

    public String getIpAccion() {
        return this.ipAccion;
    }
    
    public void setIpAccion(String ipAccion) {
        this.ipAccion = ipAccion;
    }
   








}
