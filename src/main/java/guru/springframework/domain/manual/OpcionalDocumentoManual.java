package guru.springframework.domain.manual;

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

/**
 * OpcionalDocumentoManual entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="OPCIONAL_DOCUMENTO_MANUAL",schema="FELECV3")
public class OpcionalDocumentoManual implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=6125327447468399912L;
    
    // Fields

    private OpcionalDocumentoManualId id;
    private DocumentoManual documentoManual;
    private String valor;
    private String descripcion;

    // Constructors

    /** default constructor */
    public OpcionalDocumentoManual(){
    }

    /** minimal constructor */
    public OpcionalDocumentoManual(OpcionalDocumentoManualId id,DocumentoManual documentoManual){
        this.id=id;
        this.documentoManual=documentoManual;
    }

    /** full constructor */
    public OpcionalDocumentoManual(OpcionalDocumentoManualId id,DocumentoManual documentoManual,String valor,String descripcion){
        this.id=id;
        this.documentoManual=documentoManual;
        this.valor=valor;
        this.descripcion=descripcion;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),@AttributeOverride(name="noDocumento",column=@Column(name="NO_DOCUMENTO",nullable=false,length=30)),
            @AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false)),@AttributeOverride(name="numeroOpcional",column=@Column(name="NUMERO_OPCIONAL",nullable=false)),
            @AttributeOverride(name="idTipoDocFe",column=@Column(name="ID_TIPO_DOC_FE",nullable=false))})
    public OpcionalDocumentoManualId getId(){
        return this.id;
    }

    public void setId(OpcionalDocumentoManualId id){
        this.id=id;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns({@JoinColumn(name="IDENTIFICACION_OBLIGADO",referencedColumnName="IDENTIFICACION_OBLIGADO",nullable=false,insertable=false,updatable=false),
            @JoinColumn(name="NO_DOCUMENTO",referencedColumnName="NO_DOCUMENTO",nullable=false,insertable=false,updatable=false),
            @JoinColumn(name="NUM_RESOLU_DIAN",referencedColumnName="NUM_RESOLU_DIAN",nullable=false,insertable=false,updatable=false),
            @JoinColumn(name="ID_TIPO_DOC_FE",referencedColumnName="ID_TIPO_DOC_FE",nullable=false,insertable=false,updatable=false)})
    public DocumentoManual getDocumentoManual(){
        return this.documentoManual;
    }

    public void setDocumentoManual(DocumentoManual documentoManual){
        this.documentoManual=documentoManual;
    }

    @Column(name="VALOR",length=200)
    public String getValor(){
        return this.valor;
    }

    public void setValor(String valor){
        this.valor=valor;
    }

    @Column(name="DESCRIPCION",length=150)
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

}