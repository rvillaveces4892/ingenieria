//marcado
package guru.springframework.domain.felecv3;

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
 * DetalleVerificacionDocDian entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DETALLE_VERIFICACION_DOC_DIAN"
    ,schema="FELECV3"
)

public class DetalleVerificacionDocDian   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-3623868793881349869L;
    private Long idVerificacionDocDian;
     private TipoDocumentoFe tipoDocumentoFe;
     private CodigoRtaWsValidacionDocDian codigoRtaWsValidacionDocDian;
     private CodigoFuncinalWsDian codigoFuncinalWsDian;
     private ObligadoFe obligadoFe;
     private String noDocumento;
     private Short verificacionFuncionalCorrecta;


    // Constructors

    /** default constructor */
    public DetalleVerificacionDocDian() {
    }

	/** minimal constructor */
    public DetalleVerificacionDocDian(Long idVerificacionDocDian, TipoDocumentoFe tipoDocumentoFe, CodigoRtaWsValidacionDocDian codigoRtaWsValidacionDocDian, ObligadoFe obligadoFe, String noDocumento) {
        this.idVerificacionDocDian = idVerificacionDocDian;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.codigoRtaWsValidacionDocDian = codigoRtaWsValidacionDocDian;
        this.obligadoFe = obligadoFe;
        this.noDocumento = noDocumento;
    }
    
    /** full constructor */
    public DetalleVerificacionDocDian(Long idVerificacionDocDian, TipoDocumentoFe tipoDocumentoFe, CodigoRtaWsValidacionDocDian codigoRtaWsValidacionDocDian, CodigoFuncinalWsDian codigoFuncinalWsDian, ObligadoFe obligadoFe, String noDocumento, Short verificacionFuncionalCorrecta) {
        this.idVerificacionDocDian = idVerificacionDocDian;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.codigoRtaWsValidacionDocDian = codigoRtaWsValidacionDocDian;
        this.codigoFuncinalWsDian = codigoFuncinalWsDian;
        this.obligadoFe = obligadoFe;
        this.noDocumento = noDocumento;
        this.verificacionFuncionalCorrecta = verificacionFuncionalCorrecta;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_VERIFICACION_DOC_DIAN", unique=true, nullable=false)

    public Long getIdVerificacionDocDian() {
        return this.idVerificacionDocDian;
    }
    
    public void setIdVerificacionDocDian(Long idVerificacionDocDian) {
        this.idVerificacionDocDian = idVerificacionDocDian;
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
        @JoinColumn(name="CODIGO_RTA_WS_DIAN", nullable=false)

    public CodigoRtaWsValidacionDocDian getCodigoRtaWsValidacionDocDian() {
        return this.codigoRtaWsValidacionDocDian;
    }
    
    public void setCodigoRtaWsValidacionDocDian(CodigoRtaWsValidacionDocDian codigoRtaWsValidacionDocDian) {
        this.codigoRtaWsValidacionDocDian = codigoRtaWsValidacionDocDian;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_CODIGO_FUNCIONAL_WS_DIAN")

    public CodigoFuncinalWsDian getCodigoFuncinalWsDian() {
        return this.codigoFuncinalWsDian;
    }
    
    public void setCodigoFuncinalWsDian(CodigoFuncinalWsDian codigoFuncinalWsDian) {
        this.codigoFuncinalWsDian = codigoFuncinalWsDian;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
    
    @Column(name="NO_DOCUMENTO", nullable=false, length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }
    
    @Column(name="VERIFICACION_FUNCIONAL_CORRECTA")

    public Short getVerificacionFuncionalCorrecta() {
        return this.verificacionFuncionalCorrecta;
    }
    
    public void setVerificacionFuncionalCorrecta(Short verificacionFuncionalCorrecta) {
        this.verificacionFuncionalCorrecta = verificacionFuncionalCorrecta;
    }
   








}
