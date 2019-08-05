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
 * DetalleDocumentoVsImpuesto entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DETALLE_DOCUMENTO_VS_IMPUESTO",schema="FELECV3")
public class DetalleDocumentoVsImpuesto implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=4015336479174917711L;
    
    // Fields

    private DetalleDocumentoVsImpuestoId id;
    private ImpuestoSelect impuestoSelect;
    private Double valorImpuesto;

    // Constructors

    /** default constructor */
    public DetalleDocumentoVsImpuesto(){
    }

    /** minimal constructor */
    public DetalleDocumentoVsImpuesto(DetalleDocumentoVsImpuestoId id,ImpuestoSelect impuestoSelect){
        this.id=id;
        this.impuestoSelect=impuestoSelect;
    }

    /** full constructor */
    public DetalleDocumentoVsImpuesto(DetalleDocumentoVsImpuestoId id,ImpuestoSelect impuestoSelect,Double valorImpuesto){
        this.id=id;
        this.impuestoSelect=impuestoSelect;
        this.valorImpuesto=valorImpuesto;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),@AttributeOverride(name="noDocumento",column=@Column(name="NO_DOCUMENTO",nullable=false,length=30)),
            @AttributeOverride(name="codigoImpuestoSelect",column=@Column(name="CODIGO_IMPUESTO_SELECT",nullable=false,length=10)),@AttributeOverride(name="noDetalle",column=@Column(name="NO_DETALLE",nullable=false)),
            @AttributeOverride(name="idTipoDocFe",column=@Column(name="ID_TIPO_DOC_FE",nullable=false)),@AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false))})
    public DetalleDocumentoVsImpuestoId getId(){
        return this.id;
    }

    public void setId(DetalleDocumentoVsImpuestoId id){
        this.id=id;
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

    @Column(name="VALOR_IMPUESTO",precision=53,scale=0)
    public Double getValorImpuesto(){
        return this.valorImpuesto;
    }

    public void setValorImpuesto(Double valorImpuesto){
        this.valorImpuesto=valorImpuesto;
    }

}