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
 * DetalleDocumentoManual entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DETALLE_DOCUMENTO_MANUAL",schema="FELECV3")
public class DetalleDocumentoManual implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=1970661737576514438L;
    
    // Fields

    private DetalleDocumentoManualId id;
    private DocumentoManual documentoManual;
    private Integer cantidad;
    private String descripcion;
    private Double iva;
    private Double precioUnidad;
    private Double valor;
    private Timestamp fechaIniPerFact;
    private Timestamp fechaFinPerFact;
    private Double descuento;
    private String codigoImpuestoSelect;
    private Double baseGrava;
    private String referencia;
    private Double subTotal;
    private Double total;
    private String codigo;

    // Constructors

    /** default constructor */
    public DetalleDocumentoManual(){
    }

    /** minimal constructor */
    public DetalleDocumentoManual(DetalleDocumentoManualId id,DocumentoManual documentoManual){
        this.id=id;
        this.documentoManual=documentoManual;
    }

    /** full constructor */
    public DetalleDocumentoManual(DetalleDocumentoManualId id,DocumentoManual documentoManual,Integer cantidad,String descripcion,Double iva,Double precioUnidad,Double valor,Timestamp fechaIniPerFact,Timestamp fechaFinPerFact,Double descuento,
            String codigoImpuestoSelect,Double baseGrava,String referencia,Double subTotal,Double total,String codigo){
        this.id=id;
        this.documentoManual=documentoManual;
        this.cantidad=cantidad;
        this.descripcion=descripcion;
        this.iva=iva;
        this.precioUnidad=precioUnidad;
        this.valor=valor;
        this.fechaIniPerFact=fechaIniPerFact;
        this.fechaFinPerFact=fechaFinPerFact;
        this.descuento=descuento;
        this.codigoImpuestoSelect=codigoImpuestoSelect;
        this.baseGrava=baseGrava;
        this.referencia=referencia;
        this.subTotal=subTotal;
        this.total=total;
        this.codigo=codigo;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="noDocumento",column=@Column(name="NO_DOCUMENTO",nullable=false,length=30)),@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),
            @AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false)),@AttributeOverride(name="idTipoDocFe",column=@Column(name="ID_TIPO_DOC_FE",nullable=false)),
            @AttributeOverride(name="noDetalle",column=@Column(name="NO_DETALLE",nullable=false))})
    public DetalleDocumentoManualId getId(){
        return this.id;
    }

    public void setId(DetalleDocumentoManualId id){
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

    @Column(name="CANTIDAD")
    public Integer getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad){
        this.cantidad=cantidad;
    }

    @Column(name="DESCRIPCION",length=100)
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    @Column(name="IVA",precision=53,scale=0)
    public Double getIva(){
        return this.iva;
    }

    public void setIva(Double iva){
        this.iva=iva;
    }

    @Column(name="PRECIO_UNIDAD",precision=53,scale=0)
    public Double getPrecioUnidad(){
        return this.precioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad){
        this.precioUnidad=precioUnidad;
    }

    @Column(name="VALOR",precision=53,scale=0)
    public Double getValor(){
        return this.valor;
    }

    public void setValor(Double valor){
        this.valor=valor;
    }

    @Column(name="FECHA_INI_PER_FACT",length=26)
    public Timestamp getFechaIniPerFact(){
        return this.fechaIniPerFact;
    }

    public void setFechaIniPerFact(Timestamp fechaIniPerFact){
        this.fechaIniPerFact=fechaIniPerFact;
    }

    @Column(name="FECHA_FIN_PER_FACT",length=26)
    public Timestamp getFechaFinPerFact(){
        return this.fechaFinPerFact;
    }

    public void setFechaFinPerFact(Timestamp fechaFinPerFact){
        this.fechaFinPerFact=fechaFinPerFact;
    }

    @Column(name="DESCUENTO",precision=53,scale=0)
    public Double getDescuento(){
        return this.descuento;
    }

    public void setDescuento(Double descuento){
        this.descuento=descuento;
    }

    @Column(name="CODIGO_IMPUESTO_SELECT",length=10)
    public String getCodigoImpuestoSelect(){
        return this.codigoImpuestoSelect;
    }

    public void setCodigoImpuestoSelect(String codigoImpuestoSelect){
        this.codigoImpuestoSelect=codigoImpuestoSelect;
    }

    @Column(name="BASE_GRAVA",precision=53,scale=0)
    public Double getBaseGrava(){
        return this.baseGrava;
    }

    public void setBaseGrava(Double baseGrava){
        this.baseGrava=baseGrava;
    }

    @Column(name="REFERENCIA",length=100)
    public String getReferencia(){
        return this.referencia;
    }

    public void setReferencia(String referencia){
        this.referencia=referencia;
    }

    @Column(name="SUB_TOTAL",precision=53,scale=0)
    public Double getSubTotal(){
        return this.subTotal;
    }

    public void setSubTotal(Double subTotal){
        this.subTotal=subTotal;
    }

    @Column(name="TOTAL",precision=53,scale=0)
    public Double getTotal(){
        return this.total;
    }

    public void setTotal(Double total){
        this.total=total;
    }

    @Column(name="CODIGO",length=10)
    public String getCodigo(){
        return this.codigo;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

}