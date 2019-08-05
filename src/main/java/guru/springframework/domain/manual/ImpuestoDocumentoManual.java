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

import guru.springframework.domain.felecv3.ImpuestoSelect;

/**
 * ImpuestoDocumentoManual entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="IMPUESTO_DOCUMENTO_MANUAL",schema="FELECV3")
public class ImpuestoDocumentoManual implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=8408796281119511689L;
    
    // Fields
    private ImpuestoDocumentoManualId id;
    private DocumentoManual documentoManual;
    private ImpuestoSelect impuestoSelect;
    private String codigoImpuesto;
    private Double valorImpuesto;
    private Double porcentaje;
    private Double baseImpuesto;

    // Constructors

    /** default constructor */
    public ImpuestoDocumentoManual(){
    }

    /** minimal constructor */
    public ImpuestoDocumentoManual(ImpuestoDocumentoManualId id,DocumentoManual documentoManual,ImpuestoSelect impuestoSelect,String codigoImpuesto){
        this.id=id;
        this.documentoManual=documentoManual;
        this.impuestoSelect=impuestoSelect;
        this.codigoImpuesto=codigoImpuesto;
    }

    /** full constructor */
    public ImpuestoDocumentoManual(ImpuestoDocumentoManualId id,DocumentoManual documentoManual,ImpuestoSelect impuestoSelect,String codigoImpuesto,Double valorImpuesto,Double porcentaje,Double baseImpuesto){
        this.id=id;
        this.documentoManual=documentoManual;
        this.impuestoSelect=impuestoSelect;
        this.codigoImpuesto=codigoImpuesto;
        this.valorImpuesto=valorImpuesto;
        this.porcentaje=porcentaje;
        this.baseImpuesto=baseImpuesto;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),@AttributeOverride(name="noDocumento",column=@Column(name="NO_DOCUMENTO",nullable=false,length=30)),
            @AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false)),@AttributeOverride(name="codigoImpuestoSelect",column=@Column(name="CODIGO_IMPUESTO_SELECT",nullable=false,length=10)),
            @AttributeOverride(name="idTipoDocFe",column=@Column(name="ID_TIPO_DOC_FE",nullable=false))})
    public ImpuestoDocumentoManualId getId(){
        return this.id;
    }

    public void setId(ImpuestoDocumentoManualId id){
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
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns({@JoinColumn(name="CODIGO_IMPUESTO_SELECT",referencedColumnName="CODIGO_IMPUESTO_SELECT",nullable=false,insertable=false,updatable=false),
            @JoinColumn(name="IDENTIFICACION_OBLIGADO",referencedColumnName="IDENTIFICACION_OBLIGADO",nullable=false,insertable=false,updatable=false)})
    public ImpuestoSelect getImpuestoSelect(){
        return this.impuestoSelect;
    }

    public void setImpuestoSelect(ImpuestoSelect impuestoSelect){
        this.impuestoSelect=impuestoSelect;
    }

    @Column(name="CODIGO_IMPUESTO",nullable=false,length=10)
    public String getCodigoImpuesto(){
        return this.codigoImpuesto;
    }

    public void setCodigoImpuesto(String codigoImpuesto){
        this.codigoImpuesto=codigoImpuesto;
    }

    @Column(name="VALOR_IMPUESTO",precision=53,scale=0)
    public Double getValorImpuesto(){
        return this.valorImpuesto;
    }

    public void setValorImpuesto(Double valorImpuesto){
        this.valorImpuesto=valorImpuesto;
    }

    @Column(name="PORCENTAJE",precision=53,scale=0)
    public Double getPorcentaje(){
        return this.porcentaje;
    }

    public void setPorcentaje(Double porcentaje){
        this.porcentaje=porcentaje;
    }

    @Column(name="BASE_IMPUESTO",precision=53,scale=0)
    public Double getBaseImpuesto(){
        return this.baseImpuesto;
    }

    public void setBaseImpuesto(Double baseImpuesto){
        this.baseImpuesto=baseImpuesto;
    }

}