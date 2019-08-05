//marcado
package guru.springframework.domain.felecv3;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.experian.computec.referencia.model.EntidadPaginacion;
import guru.springframework.domain.manual.DocumentoManual;


/**
 * NodoObligadoDocumento entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="NODO_OBLIGADO_DOCUMENTO"
    ,schema="FELECV3"
)

public class NodoObligadoDocumento   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=1307019280013909009L;
    private NodoObligadoDocumentoId id;
     private ObligadoFe obligadoFe;
     private String aliasCertificado;
     private String claveTecnica;
     private String contreasenaAlmacen;
     private String contreasenaLlavePrivada;
     private String descripcion;
     private Date fechaFinResolu;
     private Date fechaIniResolu;
     private Short idEstadoResolu;
     private Long rangoFinNumDian;
     private Long rangoIniNumDian;
     private String rutaAlmacen;
     private String softwSecurityCode;
     private String softwareId;
     private String tipoAlmacen;
     private Short contingencia;
     private Short facturacionManual;
     private Integer consecutivoActualManual;
     private Short versionDocManual;
     private String tipoFirmaCertificado;
     private Set<DocumentoManual> documentoManuals = new HashSet<DocumentoManual>(0);


    // Constructors

    /** default constructor */
    public NodoObligadoDocumento() {
    }

	/** minimal constructor */
    public NodoObligadoDocumento(NodoObligadoDocumentoId id, ObligadoFe obligadoFe, String rutaAlmacen, String tipoAlmacen) {
        this.id = id;
        this.obligadoFe = obligadoFe;
        this.rutaAlmacen = rutaAlmacen;
        this.tipoAlmacen = tipoAlmacen;
    }
    
    /** full constructor */
    public NodoObligadoDocumento(NodoObligadoDocumentoId id, ObligadoFe obligadoFe, String aliasCertificado, String claveTecnica, String contreasenaAlmacen, String contreasenaLlavePrivada, String descripcion, Date fechaFinResolu, Date fechaIniResolu, Short idEstadoResolu, Long rangoFinNumDian, Long rangoIniNumDian, String rutaAlmacen, String softwSecurityCode, String softwareId, String tipoAlmacen, Short contingencia, Short facturacionManual, Integer consecutivoActualManual, Short versionDocManual, String tipoFirmaCertificado, Set<DocumentoManual> documentoManuals) {
        this.id = id;
        this.obligadoFe = obligadoFe;
        this.aliasCertificado = aliasCertificado;
        this.claveTecnica = claveTecnica;
        this.contreasenaAlmacen = contreasenaAlmacen;
        this.contreasenaLlavePrivada = contreasenaLlavePrivada;
        this.descripcion = descripcion;
        this.fechaFinResolu = fechaFinResolu;
        this.fechaIniResolu = fechaIniResolu;
        this.idEstadoResolu = idEstadoResolu;
        this.rangoFinNumDian = rangoFinNumDian;
        this.rangoIniNumDian = rangoIniNumDian;
        this.rutaAlmacen = rutaAlmacen;
        this.softwSecurityCode = softwSecurityCode;
        this.softwareId = softwareId;
        this.tipoAlmacen = tipoAlmacen;
        this.contingencia = contingencia;
        this.facturacionManual = facturacionManual;
        this.consecutivoActualManual = consecutivoActualManual;
        this.versionDocManual = versionDocManual;
        this.tipoFirmaCertificado = tipoFirmaCertificado;
        this.documentoManuals = documentoManuals;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="idPrefijo", column=@Column(name="ID_PREFIJO", nullable=false) ) } )

    public NodoObligadoDocumentoId getId() {
        return this.id;
    }
    
    public void setId(NodoObligadoDocumentoId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
    
    @Column(name="ALIAS_CERTIFICADO", length=20)

    public String getAliasCertificado() {
        return this.aliasCertificado;
    }
    
    public void setAliasCertificado(String aliasCertificado) {
        this.aliasCertificado = aliasCertificado;
    }
    
    @Column(name="CLAVE_TECNICA", length=100)

    public String getClaveTecnica() {
        return this.claveTecnica;
    }
    
    public void setClaveTecnica(String claveTecnica) {
        this.claveTecnica = claveTecnica;
    }
    
    @Column(name="CONTREASENA_ALMACEN", length=100)

    public String getContreasenaAlmacen() {
        return this.contreasenaAlmacen;
    }
    
    public void setContreasenaAlmacen(String contreasenaAlmacen) {
        this.contreasenaAlmacen = contreasenaAlmacen;
    }
    
    @Column(name="CONTREASENA_LLAVE_PRIVADA", length=100)

    public String getContreasenaLlavePrivada() {
        return this.contreasenaLlavePrivada;
    }
    
    public void setContreasenaLlavePrivada(String contreasenaLlavePrivada) {
        this.contreasenaLlavePrivada = contreasenaLlavePrivada;
    }
    
    @Column(name="DESCRIPCION", length=100)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_FIN_RESOLU", length=10)

    public Date getFechaFinResolu() {
        return this.fechaFinResolu;
    }
    
    public void setFechaFinResolu(Date fechaFinResolu) {
        this.fechaFinResolu = fechaFinResolu;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_INI_RESOLU", length=10)

    public Date getFechaIniResolu() {
        return this.fechaIniResolu;
    }
    
    public void setFechaIniResolu(Date fechaIniResolu) {
        this.fechaIniResolu = fechaIniResolu;
    }
    
    @Column(name="ID_ESTADO_RESOLU")

    public Short getIdEstadoResolu() {
        return this.idEstadoResolu;
    }
    
    public void setIdEstadoResolu(Short idEstadoResolu) {
        this.idEstadoResolu = idEstadoResolu;
    }
    
    @Column(name="RANGO_FIN_NUM_DIAN")

    public Long getRangoFinNumDian() {
        return this.rangoFinNumDian;
    }
    
    public void setRangoFinNumDian(Long rangoFinNumDian) {
        this.rangoFinNumDian = rangoFinNumDian;
    }
    
    @Column(name="RANGO_INI_NUM_DIAN")

    public Long getRangoIniNumDian() {
        return this.rangoIniNumDian;
    }
    
    public void setRangoIniNumDian(Long rangoIniNumDian) {
        this.rangoIniNumDian = rangoIniNumDian;
    }
    
    @Column(name="RUTA_ALMACEN", nullable=false, length=100)

    public String getRutaAlmacen() {
        return this.rutaAlmacen;
    }
    
    public void setRutaAlmacen(String rutaAlmacen) {
        this.rutaAlmacen = rutaAlmacen;
    }
    
    @Column(name="SOFTW_SECURITY_CODE", length=100)

    public String getSoftwSecurityCode() {
        return this.softwSecurityCode;
    }
    
    public void setSoftwSecurityCode(String softwSecurityCode) {
        this.softwSecurityCode = softwSecurityCode;
    }
    
    @Column(name="SOFTWARE_ID", length=100)

    public String getSoftwareId() {
        return this.softwareId;
    }
    
    public void setSoftwareId(String softwareId) {
        this.softwareId = softwareId;
    }
    
    @Column(name="TIPO_ALMACEN", nullable=false, length=20)

    public String getTipoAlmacen() {
        return this.tipoAlmacen;
    }
    
    public void setTipoAlmacen(String tipoAlmacen) {
        this.tipoAlmacen = tipoAlmacen;
    }
    
    @Column(name="CONTINGENCIA")

    public Short getContingencia() {
        return this.contingencia;
    }
    
    public void setContingencia(Short contingencia) {
        this.contingencia = contingencia;
    }
    
    @Column(name="FACTURACION_MANUAL")

    public Short getFacturacionManual() {
        return this.facturacionManual;
    }
    
    public void setFacturacionManual(Short facturacionManual) {
        this.facturacionManual = facturacionManual;
    }
    
    @Column(name="CONSECUTIVO_ACTUAL_MANUAL")

    public Integer getConsecutivoActualManual() {
        return this.consecutivoActualManual;
    }
    
    public void setConsecutivoActualManual(Integer consecutivoActualManual) {
        this.consecutivoActualManual = consecutivoActualManual;
    }
    
    @Column(name="VERSION_DOC_MANUAL")

    public Short getVersionDocManual() {
        return this.versionDocManual;
    }
    
    public void setVersionDocManual(Short versionDocManual) {
        this.versionDocManual = versionDocManual;
    }
    
    @Column(name="TIPO_FIRMA_CERTIFICADO", length=12)

    public String getTipoFirmaCertificado() {
        return this.tipoFirmaCertificado;
    }
    
    public void setTipoFirmaCertificado(String tipoFirmaCertificado) {
        this.tipoFirmaCertificado = tipoFirmaCertificado;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="nodoObligadoDocumento")

    public Set<DocumentoManual> getDocumentoManuals() {
        return this.documentoManuals;
    }
    
    public void setDocumentoManuals(Set<DocumentoManual> documentoManuals) {
        this.documentoManuals = documentoManuals;
    }
   








}
