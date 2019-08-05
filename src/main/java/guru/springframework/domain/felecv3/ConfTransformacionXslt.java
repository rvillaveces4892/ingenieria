//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ConfTransformacionXslt entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONF_TRANSFORMACION_XSLT"
    ,schema="FELECV3"
)

public class ConfTransformacionXslt   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=8876864508914767310L;
    private ConfTransformacionXsltId id;
     private String rutaXslt;
     private String rutaRecursos;
     private String rutaXml;
     private String rutaSalida;
     private String nombrePdfXpath;
     private String cifraPdfXpath;


    // Constructors

    /** default constructor */
    public ConfTransformacionXslt() {
    }

	/** minimal constructor */
    public ConfTransformacionXslt(ConfTransformacionXsltId id, String rutaXslt, String rutaRecursos, String rutaXml) {
        this.id = id;
        this.rutaXslt = rutaXslt;
        this.rutaRecursos = rutaRecursos;
        this.rutaXml = rutaXml;
    }
    
    /** full constructor */
    public ConfTransformacionXslt(ConfTransformacionXsltId id, String rutaXslt, String rutaRecursos, String rutaXml, String rutaSalida, String nombrePdfXpath, String cifraPdfXpath) {
        this.id = id;
        this.rutaXslt = rutaXslt;
        this.rutaRecursos = rutaRecursos;
        this.rutaXml = rutaXml;
        this.rutaSalida = rutaSalida;
        this.nombrePdfXpath = nombrePdfXpath;
        this.cifraPdfXpath = cifraPdfXpath;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="idTipoDocumento", column=@Column(name="ID_TIPO_DOCUMENTO", nullable=false) ), 
        @AttributeOverride(name="versionDoc", column=@Column(name="VERSION_DOC", nullable=false) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ) } )

    public ConfTransformacionXsltId getId() {
        return this.id;
    }
    
    public void setId(ConfTransformacionXsltId id) {
        this.id = id;
    }
    
    @Column(name="RUTA_XSLT", nullable=false, length=120)

    public String getRutaXslt() {
        return this.rutaXslt;
    }
    
    public void setRutaXslt(String rutaXslt) {
        this.rutaXslt = rutaXslt;
    }
    
    @Column(name="RUTA_RECURSOS", nullable=false, length=120)

    public String getRutaRecursos() {
        return this.rutaRecursos;
    }
    
    public void setRutaRecursos(String rutaRecursos) {
        this.rutaRecursos = rutaRecursos;
    }
    
    @Column(name="RUTA_XML", nullable=false, length=120)

    public String getRutaXml() {
        return this.rutaXml;
    }
    
    public void setRutaXml(String rutaXml) {
        this.rutaXml = rutaXml;
    }
    
    @Column(name="RUTA_SALIDA", length=120)

    public String getRutaSalida() {
        return this.rutaSalida;
    }
    
    public void setRutaSalida(String rutaSalida) {
        this.rutaSalida = rutaSalida;
    }
    
    @Column(name="NOMBRE_PDF_XPATH", length=300)

    public String getNombrePdfXpath() {
        return this.nombrePdfXpath;
    }
    
    public void setNombrePdfXpath(String nombrePdfXpath) {
        this.nombrePdfXpath = nombrePdfXpath;
    }
    
    @Column(name="CIFRA_PDF_XPATH", length=300)

    public String getCifraPdfXpath() {
        return this.cifraPdfXpath;
    }
    
    public void setCifraPdfXpath(String cifraPdfXpath) {
        this.cifraPdfXpath = cifraPdfXpath;
    }
   








}
