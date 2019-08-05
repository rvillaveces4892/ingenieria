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
 * AuditoriaXmlDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="AUDITORIA_XML_DOC"
    ,schema="FELECV3"
)

public class AuditoriaXmlDoc   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7018319680107602611L;
    private Long idAuditoriaXml;
     private EstadoXml estadoXml;
     private Long identificacionObligado;
     private String noDocumento;
     private Timestamp fechaAccion;
     private String consecutivoDoc;
     private String nombreXmlDoc;
     private String archivoCargaOd;
     private Long numResoluDian;


    // Constructors

    /** default constructor */
    public AuditoriaXmlDoc() {
    }

	/** minimal constructor */
    public AuditoriaXmlDoc(Long idAuditoriaXml) {
        this.idAuditoriaXml = idAuditoriaXml;
    }
    
    /** full constructor */
    public AuditoriaXmlDoc(Long idAuditoriaXml, EstadoXml estadoXml, Long identificacionObligado, String noDocumento, Timestamp fechaAccion, String consecutivoDoc, String nombreXmlDoc, String archivoCargaOd, Long numResoluDian) {
        this.idAuditoriaXml = idAuditoriaXml;
        this.estadoXml = estadoXml;
        this.identificacionObligado = identificacionObligado;
        this.noDocumento = noDocumento;
        this.fechaAccion = fechaAccion;
        this.consecutivoDoc = consecutivoDoc;
        this.nombreXmlDoc = nombreXmlDoc;
        this.archivoCargaOd = archivoCargaOd;
        this.numResoluDian = numResoluDian;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_AUDITORIA_XML", unique=true, nullable=false)
    
    public Long getIdAuditoriaXml() {
        return this.idAuditoriaXml;
    }
    
    public void setIdAuditoriaXml(Long idAuditoriaXml) {
        this.idAuditoriaXml = idAuditoriaXml;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_XML")

    public EstadoXml getEstadoXml() {
        return this.estadoXml;
    }
    
    public void setEstadoXml(EstadoXml estadoXml) {
        this.estadoXml = estadoXml;
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
    
    @Column(name="FECHA_ACCION", length=26)

    public Timestamp getFechaAccion() {
        return this.fechaAccion;
    }
    
    public void setFechaAccion(Timestamp fechaAccion) {
        this.fechaAccion = fechaAccion;
    }
    
    @Column(name="CONSECUTIVO_DOC", length=100)

    public String getConsecutivoDoc() {
        return this.consecutivoDoc;
    }
    
    public void setConsecutivoDoc(String consecutivoDoc) {
        this.consecutivoDoc = consecutivoDoc;
    }
    
    @Column(name="NOMBRE_XML_DOC", length=100)

    public String getNombreXmlDoc() {
        return this.nombreXmlDoc;
    }
    
    public void setNombreXmlDoc(String nombreXmlDoc) {
        this.nombreXmlDoc = nombreXmlDoc;
    }
    
    @Column(name="ARCHIVO_CARGA_OD", length=50)

    public String getArchivoCargaOd() {
        return this.archivoCargaOd;
    }
    
    public void setArchivoCargaOd(String archivoCargaOd) {
        this.archivoCargaOd = archivoCargaOd;
    }
    
    @Column(name="NUM_RESOLU_DIAN")

    public Long getNumResoluDian() {
        return this.numResoluDian;
    }
    
    public void setNumResoluDian(Long numResoluDian) {
        this.numResoluDian = numResoluDian;
    }
   








}
