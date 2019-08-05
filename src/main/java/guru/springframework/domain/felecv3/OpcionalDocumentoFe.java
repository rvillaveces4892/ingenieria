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
 * OpcionalDocumentoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="OPCIONAL_DOCUMENTO_FE"
    ,schema="FELECV3"
)

public class OpcionalDocumentoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-7735387288987915749L;
    private OpcionalDocumentoFeId id;
     private DocumentoFe documentoFe;
     private CampoOpcionalDoc campoOpcionalDoc;
     private String valor;
     private String descripcion;


    // Constructors

    /** default constructor */
    public OpcionalDocumentoFe() {
    }

	/** minimal constructor */
    public OpcionalDocumentoFe(OpcionalDocumentoFeId id, DocumentoFe documentoFe, CampoOpcionalDoc campoOpcionalDoc) {
        this.id = id;
        this.documentoFe = documentoFe;
        this.campoOpcionalDoc = campoOpcionalDoc;
    }
    
    /** full constructor */
    public OpcionalDocumentoFe(OpcionalDocumentoFeId id, DocumentoFe documentoFe, CampoOpcionalDoc campoOpcionalDoc, String valor, String descripcion) {
        this.id = id;
        this.documentoFe = documentoFe;
        this.campoOpcionalDoc = campoOpcionalDoc;
        this.valor = valor;
        this.descripcion = descripcion;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idCampoOpcionalDoc", column=@Column(name="ID_CAMPO_OPCIONAL_DOC", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ) } )

    public OpcionalDocumentoFeId getId() {
        return this.id;
    }
    
    public void setId(OpcionalDocumentoFeId id) {
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_CAMPO_OPCIONAL_DOC", nullable=false, insertable=false, updatable=false)

    public CampoOpcionalDoc getCampoOpcionalDoc() {
        return this.campoOpcionalDoc;
    }
    
    public void setCampoOpcionalDoc(CampoOpcionalDoc campoOpcionalDoc) {
        this.campoOpcionalDoc = campoOpcionalDoc;
    }
    
    @Column(name="VALOR", length=200)

    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    @Column(name="DESCRIPCION", length=150)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   








}
