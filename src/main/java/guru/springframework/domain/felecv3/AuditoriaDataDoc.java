//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * AuditoriaDataDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="AUDITORIA_DATA_DOC"
    ,schema="FELECV3"
)

public class AuditoriaDataDoc   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=3267970421649547837L;
    private AuditoriaDataDocId id;
     private Timestamp fechaCargueData;
     private Timestamp fechaGeneraXml;
     private Timestamp fechaTransXml;
     private Long codigoRtaWsDian;
     private Short generoXml;
     private Short envioXml;
     private Short envioMailXml;
     private String nombreXmlDoc;
     private String consecutivoDoc;
     private Short codigoGeneraXml;
     private Short codigoTransXml;
     private Short consultoWsValidacionDian;
     private String valorPrefijo;
     private Short idEstadoCargaDoc;


    // Constructors

    /** default constructor */
    public AuditoriaDataDoc() {
    }

	/** minimal constructor */
    public AuditoriaDataDoc(AuditoriaDataDocId id, Short consultoWsValidacionDian) {
        this.id = id;
        this.consultoWsValidacionDian = consultoWsValidacionDian;
    }
    
    /** full constructor */
    public AuditoriaDataDoc(AuditoriaDataDocId id, Timestamp fechaCargueData, Timestamp fechaGeneraXml, Timestamp fechaTransXml, Long codigoRtaWsDian, Short generoXml, Short envioXml, Short envioMailXml, String nombreXmlDoc, String consecutivoDoc, Short codigoGeneraXml, Short codigoTransXml, Short consultoWsValidacionDian, String valorPrefijo, Short idEstadoCargaDoc) {
        this.id = id;
        this.fechaCargueData = fechaCargueData;
        this.fechaGeneraXml = fechaGeneraXml;
        this.fechaTransXml = fechaTransXml;
        this.codigoRtaWsDian = codigoRtaWsDian;
        this.generoXml = generoXml;
        this.envioXml = envioXml;
        this.envioMailXml = envioMailXml;
        this.nombreXmlDoc = nombreXmlDoc;
        this.consecutivoDoc = consecutivoDoc;
        this.codigoGeneraXml = codigoGeneraXml;
        this.codigoTransXml = codigoTransXml;
        this.consultoWsValidacionDian = consultoWsValidacionDian;
        this.valorPrefijo = valorPrefijo;
        this.idEstadoCargaDoc = idEstadoCargaDoc;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idTipoDoc", column=@Column(name="ID_TIPO_DOC", nullable=false) ) } )

    public AuditoriaDataDocId getId() {
        return this.id;
    }
    
    public void setId(AuditoriaDataDocId id) {
        this.id = id;
    }
    
    @Column(name="FECHA_CARGUE_DATA", length=26)

    public Timestamp getFechaCargueData() {
        return this.fechaCargueData;
    }
    
    public void setFechaCargueData(Timestamp fechaCargueData) {
        this.fechaCargueData = fechaCargueData;
    }
    
    @Column(name="FECHA_GENERA_XML", length=26)

    public Timestamp getFechaGeneraXml() {
        return this.fechaGeneraXml;
    }
    
    public void setFechaGeneraXml(Timestamp fechaGeneraXml) {
        this.fechaGeneraXml = fechaGeneraXml;
    }
    
    @Column(name="FECHA_TRANS_XML", length=26)

    public Timestamp getFechaTransXml() {
        return this.fechaTransXml;
    }
    
    public void setFechaTransXml(Timestamp fechaTransXml) {
        this.fechaTransXml = fechaTransXml;
    }
    
    @Column(name="CODIGO_RTA_WS_DIAN")

    public Long getCodigoRtaWsDian() {
        return this.codigoRtaWsDian;
    }
    
    public void setCodigoRtaWsDian(Long codigoRtaWsDian) {
        this.codigoRtaWsDian = codigoRtaWsDian;
    }
    
    @Column(name="GENERO_XML")

    public Short getGeneroXml() {
        return this.generoXml;
    }
    
    public void setGeneroXml(Short generoXml) {
        this.generoXml = generoXml;
    }
    
    @Column(name="ENVIO_XML")

    public Short getEnvioXml() {
        return this.envioXml;
    }
    
    public void setEnvioXml(Short envioXml) {
        this.envioXml = envioXml;
    }
    
    @Column(name="ENVIO_MAIL_XML")

    public Short getEnvioMailXml() {
        return this.envioMailXml;
    }
    
    public void setEnvioMailXml(Short envioMailXml) {
        this.envioMailXml = envioMailXml;
    }
    
    @Column(name="NOMBRE_XML_DOC", length=100)

    public String getNombreXmlDoc() {
        return this.nombreXmlDoc;
    }
    
    public void setNombreXmlDoc(String nombreXmlDoc) {
        this.nombreXmlDoc = nombreXmlDoc;
    }
    
    @Column(name="CONSECUTIVO_DOC", length=100)

    public String getConsecutivoDoc() {
        return this.consecutivoDoc;
    }
    
    public void setConsecutivoDoc(String consecutivoDoc) {
        this.consecutivoDoc = consecutivoDoc;
    }
    
    @Column(name="CODIGO_GENERA_XML")

    public Short getCodigoGeneraXml() {
        return this.codigoGeneraXml;
    }
    
    public void setCodigoGeneraXml(Short codigoGeneraXml) {
        this.codigoGeneraXml = codigoGeneraXml;
    }
    
    @Column(name="CODIGO_TRANS_XML")

    public Short getCodigoTransXml() {
        return this.codigoTransXml;
    }
    
    public void setCodigoTransXml(Short codigoTransXml) {
        this.codigoTransXml = codigoTransXml;
    }
    
    @Column(name="CONSULTO_WS_VALIDACION_DIAN", nullable=false)

    public Short getConsultoWsValidacionDian() {
        return this.consultoWsValidacionDian;
    }
    
    public void setConsultoWsValidacionDian(Short consultoWsValidacionDian) {
        this.consultoWsValidacionDian = consultoWsValidacionDian;
    }
    
    @Column(name="VALOR_PREFIJO", length=12)

    public String getValorPrefijo() {
        return this.valorPrefijo;
    }
    
    public void setValorPrefijo(String valorPrefijo) {
        this.valorPrefijo = valorPrefijo;
    }
    
    @Column(name="ID_ESTADO_CARGA_DOC")

    public Short getIdEstadoCargaDoc() {
        return this.idEstadoCargaDoc;
    }
    
    public void setIdEstadoCargaDoc(Short idEstadoCargaDoc) {
        this.idEstadoCargaDoc = idEstadoCargaDoc;
    }
   








}
