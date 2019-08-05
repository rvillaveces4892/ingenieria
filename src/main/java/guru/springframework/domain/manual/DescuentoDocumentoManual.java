package guru.springframework.domain.manual;

import java.sql.Timestamp;
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
 * DescuentoDocumentoManual entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DESCUENTO_DOCUMENTO_MANUAL",schema="FELECV3")
public class DescuentoDocumentoManual implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=1624192231416968533L;
    
    // Fields

    private DescuentoDocumentoManualId id;
    private DocumentoManual documentoManual;
    private Timestamp fechaDescuento;
    private String razonDescuento;
    private Double porcentaje;
    private Double baseDescuento;
    private Double valorDescuento;

    // Constructors

    /** default constructor */
    public DescuentoDocumentoManual(){
    }

    /** minimal constructor */
    public DescuentoDocumentoManual(DescuentoDocumentoManualId id,DocumentoManual documentoManual){
        this.id=id;
        this.documentoManual=documentoManual;
    }

    /** full constructor */
    public DescuentoDocumentoManual(DescuentoDocumentoManualId id,DocumentoManual documentoManual,Timestamp fechaDescuento,String razonDescuento,Double porcentaje,Double baseDescuento,Double valorDescuento){
        this.id=id;
        this.documentoManual=documentoManual;
        this.fechaDescuento=fechaDescuento;
        this.razonDescuento=razonDescuento;
        this.porcentaje=porcentaje;
        this.baseDescuento=baseDescuento;
        this.valorDescuento=valorDescuento;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="noLineaDescuento",column=@Column(name="NO_LINEA_DESCUENTO",nullable=false)),@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),
            @AttributeOverride(name="noDocumento",column=@Column(name="NO_DOCUMENTO",nullable=false,length=30)),@AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false)),
            @AttributeOverride(name="idTipoDocFe",column=@Column(name="ID_TIPO_DOC_FE",nullable=false))})
    public DescuentoDocumentoManualId getId(){
        return this.id;
    }

    public void setId(DescuentoDocumentoManualId id){
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

    @Column(name="FECHA_DESCUENTO",length=26)
    public Timestamp getFechaDescuento(){
        return this.fechaDescuento;
    }

    public void setFechaDescuento(Timestamp fechaDescuento){
        this.fechaDescuento=fechaDescuento;
    }

    @Column(name="RAZON_DESCUENTO",length=100)
    public String getRazonDescuento(){
        return this.razonDescuento;
    }

    public void setRazonDescuento(String razonDescuento){
        this.razonDescuento=razonDescuento;
    }

    @Column(name="PORCENTAJE",precision=53,scale=0)
    public Double getPorcentaje(){
        return this.porcentaje;
    }

    public void setPorcentaje(Double porcentaje){
        this.porcentaje=porcentaje;
    }

    @Column(name="BASE_DESCUENTO",precision=53,scale=0)
    public Double getBaseDescuento(){
        return this.baseDescuento;
    }

    public void setBaseDescuento(Double baseDescuento){
        this.baseDescuento=baseDescuento;
    }

    @Column(name="VALOR_DESCUENTO",precision=53,scale=0)
    public Double getValorDescuento(){
        return this.valorDescuento;
    }

    public void setValorDescuento(Double valorDescuento){
        this.valorDescuento=valorDescuento;
    }

}