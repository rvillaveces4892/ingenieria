//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ImpuestoDocumento entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="IMPUESTO_DOCUMENTO"
    ,schema="FELECV3"
)

public class ImpuestoDocumento   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5085414126028064741L;
    private ImpuestoDocumentoId id;
     private DocumentoFe documentoFe;
     private String codigoImpuesto;
     private Double valorImpuesto;
     private Double porcentaje;
     private String codigoImpuestoSelect;
     private Double baseImpuesto;


    // Constructors

    /** default constructor */
    public ImpuestoDocumento() {
    }

	/** minimal constructor */
    public ImpuestoDocumento(ImpuestoDocumentoId id, DocumentoFe documentoFe, String codigoImpuestoSelect) {
        this.id = id;
        this.documentoFe = documentoFe;
        this.codigoImpuestoSelect = codigoImpuestoSelect;
    }
    
    /** full constructor */
    public ImpuestoDocumento(ImpuestoDocumentoId id, DocumentoFe documentoFe, String codigoImpuesto, Double valorImpuesto, Double porcentaje, String codigoImpuestoSelect, Double baseImpuesto) {
        this.id = id;
        this.documentoFe = documentoFe;
        this.codigoImpuesto = codigoImpuesto;
        this.valorImpuesto = valorImpuesto;
        this.porcentaje = porcentaje;
        this.codigoImpuestoSelect = codigoImpuestoSelect;
        this.baseImpuesto = baseImpuesto;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idImpuestoDoc", column=@Column(name="ID_IMPUESTO_DOC", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ) } )

    public ImpuestoDocumentoId getId() {
        return this.id;
    }
    
    public void setId(ImpuestoDocumentoId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumns( { 
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", referencedColumnName="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="NO_DOCUMENTO", referencedColumnName="NO_DOCUMENTO", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="NUM_RESOLU_DIAN", referencedColumnName="NUM_RESOLU_DIAN", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="ID_TIPO_DOC_FE", referencedColumnName="ID_TIPO_DOC_FE", nullable=false, insertable=false, updatable=false) } )

    public DocumentoFe getDocumentoFe() {
        return this.documentoFe;
    }
    
    public void setDocumentoFe(DocumentoFe documentoFe) {
        this.documentoFe = documentoFe;
    }
    
    @Column(name="CODIGO_IMPUESTO", length=10)

    public String getCodigoImpuesto() {
        return this.codigoImpuesto;
    }
    
    public void setCodigoImpuesto(String codigoImpuesto) {
        this.codigoImpuesto = codigoImpuesto;
    }
    
    @Column(name="VALOR_IMPUESTO", precision=53, scale=0)

    public Double getValorImpuesto() {
        return this.valorImpuesto;
    }
    
    public void setValorImpuesto(Double valorImpuesto) {
        this.valorImpuesto = valorImpuesto;
    }
    
    @Column(name="PORCENTAJE", precision=53, scale=0)

    public Double getPorcentaje() {
        return this.porcentaje;
    }
    
    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Column(name="CODIGO_IMPUESTO_SELECT", nullable=false, length=10)

    public String getCodigoImpuestoSelect() {
        return this.codigoImpuestoSelect;
    }
    
    public void setCodigoImpuestoSelect(String codigoImpuestoSelect) {
        this.codigoImpuestoSelect = codigoImpuestoSelect;
    }
    
    @Column(name="BASE_IMPUESTO", precision=53, scale=0)

    public Double getBaseImpuesto() {
        return this.baseImpuesto;
    }
    
    public void setBaseImpuesto(Double baseImpuesto) {
        this.baseImpuesto = baseImpuesto;
    }
   








}
