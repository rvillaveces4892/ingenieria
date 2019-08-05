//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * IncidenteModulo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="INCIDENTE_MODULO"
    ,schema="FELECV3"
)

public class IncidenteModulo   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-927203990710249660L;
    private Long idIncidenteComposicionXml;
     private EstadoIncidente estadoIncidente;
     private ModuloIncidente moduloIncidente;
     private Short codError;
     private Timestamp fechaIncidente;
     private Long idOfe;
     private String noDocumento;
     private Long idObligado;
     private String resumenIncidente;


    // Constructors

    /** default constructor */
    public IncidenteModulo() {
    }

	/** minimal constructor */
    public IncidenteModulo(Long idIncidenteComposicionXml) {
        this.idIncidenteComposicionXml = idIncidenteComposicionXml;
    }
    
    /** full constructor */
    public IncidenteModulo(Long idIncidenteComposicionXml, EstadoIncidente estadoIncidente, ModuloIncidente moduloIncidente, Short codError, Timestamp fechaIncidente, Long idOfe, String noDocumento, Long idObligado, String resumenIncidente) {
        this.idIncidenteComposicionXml = idIncidenteComposicionXml;
        this.estadoIncidente = estadoIncidente;
        this.moduloIncidente = moduloIncidente;
        this.codError = codError;
        this.fechaIncidente = fechaIncidente;
        this.idOfe = idOfe;
        this.noDocumento = noDocumento;
        this.idObligado = idObligado;
        this.resumenIncidente = resumenIncidente;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_INCIDENTE_COMPOSICION_XML", unique=true, nullable=false)

    public Long getIdIncidenteComposicionXml() {
        return this.idIncidenteComposicionXml;
    }
    
    public void setIdIncidenteComposicionXml(Long idIncidenteComposicionXml) {
        this.idIncidenteComposicionXml = idIncidenteComposicionXml;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_INCIDENTE")

    public EstadoIncidente getEstadoIncidente() {
        return this.estadoIncidente;
    }
    
    public void setEstadoIncidente(EstadoIncidente estadoIncidente) {
        this.estadoIncidente = estadoIncidente;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_MODULO_INCIDENTE")

    public ModuloIncidente getModuloIncidente() {
        return this.moduloIncidente;
    }
    
    public void setModuloIncidente(ModuloIncidente moduloIncidente) {
        this.moduloIncidente = moduloIncidente;
    }
    
    @Column(name="COD_ERROR")

    public Short getCodError() {
        return this.codError;
    }
    
    public void setCodError(Short codError) {
        this.codError = codError;
    }
    
    @Column(name="FECHA_INCIDENTE", length=26)

    public Timestamp getFechaIncidente() {
        return this.fechaIncidente;
    }
    
    public void setFechaIncidente(Timestamp fechaIncidente) {
        this.fechaIncidente = fechaIncidente;
    }
    
    @Column(name="ID_OFE")

    public Long getIdOfe() {
        return this.idOfe;
    }
    
    public void setIdOfe(Long idOfe) {
        this.idOfe = idOfe;
    }
    
    @Column(name="NO_DOCUMENTO", length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }
    
    @Column(name="ID_OBLIGADO")

    public Long getIdObligado() {
        return this.idObligado;
    }
    
    public void setIdObligado(Long idObligado) {
        this.idObligado = idObligado;
    }
    
    @Column(name="RESUMEN_INCIDENTE", length=100)

    public String getResumenIncidente() {
        return this.resumenIncidente;
    }
    
    public void setResumenIncidente(String resumenIncidente) {
        this.resumenIncidente = resumenIncidente;
    }
   








}
