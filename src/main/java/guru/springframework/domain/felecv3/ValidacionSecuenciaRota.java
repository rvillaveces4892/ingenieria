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
 * ValidacionSecuenciaRota entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="VALIDACION_SECUENCIA_ROTA"
    ,schema="FELECV3"
)

public class ValidacionSecuenciaRota   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=4413654217616525261L;
    private Long idIncidente;
     private TipoDocumentoFe tipoDocumentoFe;
     private EstadoIncidente estadoIncidente;
     private TipoValidacion tipoValidacion;
     private Long identificacionObligado;
     private String identificacionAdquiriente;
     private String noDocumentoCorrecto;
     private String noDocumentoError;
     private Long numResoluDian;
     private Timestamp fechaAccion;
     private Short codError;


    // Constructors

    /** default constructor */
    public ValidacionSecuenciaRota() {
    }

	/** minimal constructor */
    public ValidacionSecuenciaRota(Long idIncidente, TipoDocumentoFe tipoDocumentoFe, EstadoIncidente estadoIncidente, TipoValidacion tipoValidacion, Long identificacionObligado, String noDocumentoCorrecto, Long numResoluDian, Short codError) {
        this.idIncidente = idIncidente;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.estadoIncidente = estadoIncidente;
        this.tipoValidacion = tipoValidacion;
        this.identificacionObligado = identificacionObligado;
        this.noDocumentoCorrecto = noDocumentoCorrecto;
        this.numResoluDian = numResoluDian;
        this.codError = codError;
    }
    
    /** full constructor */
    public ValidacionSecuenciaRota(Long idIncidente, TipoDocumentoFe tipoDocumentoFe, EstadoIncidente estadoIncidente, TipoValidacion tipoValidacion, Long identificacionObligado, String identificacionAdquiriente, String noDocumentoCorrecto, String noDocumentoError, Long numResoluDian, Timestamp fechaAccion, Short codError) {
        this.idIncidente = idIncidente;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.estadoIncidente = estadoIncidente;
        this.tipoValidacion = tipoValidacion;
        this.identificacionObligado = identificacionObligado;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.noDocumentoCorrecto = noDocumentoCorrecto;
        this.noDocumentoError = noDocumentoError;
        this.numResoluDian = numResoluDian;
        this.fechaAccion = fechaAccion;
        this.codError = codError;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_INCIDENTE", unique=true, nullable=false)

    public Long getIdIncidente() {
        return this.idIncidente;
    }
    
    public void setIdIncidente(Long idIncidente) {
        this.idIncidente = idIncidente;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_DOC_FE", nullable=false)

    public TipoDocumentoFe getTipoDocumentoFe() {
        return this.tipoDocumentoFe;
    }
    
    public void setTipoDocumentoFe(TipoDocumentoFe tipoDocumentoFe) {
        this.tipoDocumentoFe = tipoDocumentoFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_INCIDENTE", nullable=false)

    public EstadoIncidente getEstadoIncidente() {
        return this.estadoIncidente;
    }
    
    public void setEstadoIncidente(EstadoIncidente estadoIncidente) {
        this.estadoIncidente = estadoIncidente;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_VALIDACION", nullable=false)

    public TipoValidacion getTipoValidacion() {
        return this.tipoValidacion;
    }
    
    public void setTipoValidacion(TipoValidacion tipoValidacion) {
        this.tipoValidacion = tipoValidacion;
    }
    
    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

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
    
    @Column(name="NO_DOCUMENTO_CORRECTO", nullable=false, length=30)

    public String getNoDocumentoCorrecto() {
        return this.noDocumentoCorrecto;
    }
    
    public void setNoDocumentoCorrecto(String noDocumentoCorrecto) {
        this.noDocumentoCorrecto = noDocumentoCorrecto;
    }
    
    @Column(name="NO_DOCUMENTO_ERROR", length=30)

    public String getNoDocumentoError() {
        return this.noDocumentoError;
    }
    
    public void setNoDocumentoError(String noDocumentoError) {
        this.noDocumentoError = noDocumentoError;
    }
    
    @Column(name="NUM_RESOLU_DIAN", nullable=false)

    public Long getNumResoluDian() {
        return this.numResoluDian;
    }
    
    public void setNumResoluDian(Long numResoluDian) {
        this.numResoluDian = numResoluDian;
    }
    
    @Column(name="FECHA_ACCION", length=26)

    public Timestamp getFechaAccion() {
        return this.fechaAccion;
    }
    
    public void setFechaAccion(Timestamp fechaAccion) {
        this.fechaAccion = fechaAccion;
    }
    
    @Column(name="COD_ERROR", nullable=false)

    public Short getCodError() {
        return this.codError;
    }
    
    public void setCodError(Short codError) {
        this.codError = codError;
    }
   








}
