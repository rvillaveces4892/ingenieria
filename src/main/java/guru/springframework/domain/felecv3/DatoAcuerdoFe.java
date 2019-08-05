//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * DatoAcuerdoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DATO_ACUERDO_FE"
    ,schema="FELECV3"
)

public class DatoAcuerdoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=4687665644848318153L;
    private DatoAcuerdoFeId id;
     private AccionAcuerdo accionAcuerdo;
     private AdquirienteFe adquirienteFe;
     private ObligadoFe obligadoFe;
     private Timestamp fechaAccion;
     private String ipAccion;


    // Constructors

    /** default constructor */
    public DatoAcuerdoFe() {
    }

	/** minimal constructor */
    public DatoAcuerdoFe(DatoAcuerdoFeId id, AdquirienteFe adquirienteFe, ObligadoFe obligadoFe) {
        this.id = id;
        this.adquirienteFe = adquirienteFe;
        this.obligadoFe = obligadoFe;
    }
    
    /** full constructor */
    public DatoAcuerdoFe(DatoAcuerdoFeId id, AccionAcuerdo accionAcuerdo, AdquirienteFe adquirienteFe, ObligadoFe obligadoFe, Timestamp fechaAccion, String ipAccion) {
        this.id = id;
        this.accionAcuerdo = accionAcuerdo;
        this.adquirienteFe = adquirienteFe;
        this.obligadoFe = obligadoFe;
        this.fechaAccion = fechaAccion;
        this.ipAccion = ipAccion;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="identificacionAdquiriente", column=@Column(name="IDENTIFICACION_ADQUIRIENTE", nullable=false, length=30) ) } )

    public DatoAcuerdoFeId getId() {
        return this.id;
    }
    
    public void setId(DatoAcuerdoFeId id) {
        this.id = id;
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
        @JoinColumn(name="IDENTIFICACION_ADQUIRIENTE", nullable=false, insertable=false, updatable=false)

    public AdquirienteFe getAdquirienteFe() {
        return this.adquirienteFe;
    }
    
    public void setAdquirienteFe(AdquirienteFe adquirienteFe) {
        this.adquirienteFe = adquirienteFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false)

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
