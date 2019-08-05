//marcado
package guru.springframework.domain.felecv3;

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
 * ConsecutivoNomXml entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONSECUTIVO_NOM_XML"
    ,schema="FELECV3"
)

public class ConsecutivoNomXml   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5793490634334400283L;
    private ConsecutivoNomXmlId id;
     private TipoDocumentoFe tipoDocumentoFe;
     private String consecutivoXml;
     private String consecutivoPaquete;
     private Long consecutivoDocumentoDecimal;


    // Constructors

    /** default constructor */
    public ConsecutivoNomXml() {
    }

	/** minimal constructor */
    public ConsecutivoNomXml(ConsecutivoNomXmlId id, TipoDocumentoFe tipoDocumentoFe) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
    }
    
    /** full constructor */
    public ConsecutivoNomXml(ConsecutivoNomXmlId id, TipoDocumentoFe tipoDocumentoFe, String consecutivoXml, String consecutivoPaquete, Long consecutivoDocumentoDecimal) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.consecutivoXml = consecutivoXml;
        this.consecutivoPaquete = consecutivoPaquete;
        this.consecutivoDocumentoDecimal = consecutivoDocumentoDecimal;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ) } )

    public ConsecutivoNomXmlId getId() {
        return this.id;
    }
    
    public void setId(ConsecutivoNomXmlId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_DOC_FE", nullable=false, insertable=false, updatable=false)

    public TipoDocumentoFe getTipoDocumentoFe() {
        return this.tipoDocumentoFe;
    }
    
    public void setTipoDocumentoFe(TipoDocumentoFe tipoDocumentoFe) {
        this.tipoDocumentoFe = tipoDocumentoFe;
    }
    
    @Column(name="CONSECUTIVO_XML", length=100)

    public String getConsecutivoXml() {
        return this.consecutivoXml;
    }
    
    public void setConsecutivoXml(String consecutivoXml) {
        this.consecutivoXml = consecutivoXml;
    }
    
    @Column(name="CONSECUTIVO_PAQUETE", length=100)

    public String getConsecutivoPaquete() {
        return this.consecutivoPaquete;
    }
    
    public void setConsecutivoPaquete(String consecutivoPaquete) {
        this.consecutivoPaquete = consecutivoPaquete;
    }
    
    @Column(name="CONSECUTIVO_DOCUMENTO_DECIMAL")

    public Long getConsecutivoDocumentoDecimal() {
        return this.consecutivoDocumentoDecimal;
    }
    
    public void setConsecutivoDocumentoDecimal(Long consecutivoDocumentoDecimal) {
        this.consecutivoDocumentoDecimal = consecutivoDocumentoDecimal;
    }
   








}
