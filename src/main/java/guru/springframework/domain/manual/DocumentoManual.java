package guru.springframework.domain.manual;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import guru.springframework.domain.felecv3.AdquirienteFe;
import guru.springframework.domain.felecv3.MonedaDocFe;
import guru.springframework.domain.felecv3.NodoObligadoDocumento;
import guru.springframework.domain.felecv3.ObligadoFe;
import guru.springframework.domain.felecv3.TipoConceptoNotaFe;
import guru.springframework.domain.felecv3.TipoDocumentoFe;

/**
 * DocumentoManual entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DOCUMENTO_MANUAL",schema="FELECV3")
public class DocumentoManual implements java.io.Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID=8656878352666782044L;
    
    // Fields

    private DocumentoManualId id;
    private TipoDocumentoFe tipoDocumentoFe;
    private MonedaDocFe monedaDocFeByCodigoMonedaLocal;
    private NodoObligadoDocumento nodoObligadoDocumento;
    private AdquirienteFe adquirienteFe;
    private ObligadoFe obligadoFe;
    private MonedaDocFe monedaDocFeByCodigoMonedaExt;
    private TipoConceptoNotaFe tipoConceptoNotaFe;
    private EstadoDocumentoManual estadoDocumentoManual;
    private Timestamp fechaDoc;
    private Date fechaVencimiento;
    private String fechaPago;
    private String observaciones;
    private Double valorTotal;
    private Double totalIva;
    private Double baseGrabableIva;
    private String prefijoFacturacion;
    private String cufe;
    private String numeroReferencia;
    private Short version;
    private String numeroCuenta;
    private String numeroPedido;
    private Double totalDescuento;
    private String periodoFacturacion;
    private String refePago;
    private Double trm;
    private Double valorNetoDocMonedaExt;
    private Date fechaTrm;
    private Short aprobado;
    private Timestamp fechaModicacion;
    private Short versionDocManual;
    private String notas;
    private Short generado;
    private Double totalIca;
    private Double totalConsumo;
    private Set<ImpuestoDocumentoManual> impuestoDocumentoManuals=new HashSet<ImpuestoDocumentoManual>(0);
    private Set<DescuentoDocumentoManual> descuentoDocumentoManuals=new HashSet<DescuentoDocumentoManual>(0);
    private Set<DetalleDocumentoManual> detalleDocumentoManuals=new HashSet<DetalleDocumentoManual>(0);
    private Set<OpcionalDocumentoManual> opcionalDocumentoManuals=new HashSet<OpcionalDocumentoManual>(0);

    // Constructors

    /** default constructor */
    public DocumentoManual(){
    }

    /** minimal constructor */
    public DocumentoManual(DocumentoManualId id,TipoDocumentoFe tipoDocumentoFe,NodoObligadoDocumento nodoObligadoDocumento,ObligadoFe obligadoFe,EstadoDocumentoManual estadoDocumentoManual){
        this.id=id;
        this.tipoDocumentoFe=tipoDocumentoFe;
        this.nodoObligadoDocumento=nodoObligadoDocumento;
        this.obligadoFe=obligadoFe;
        this.estadoDocumentoManual=estadoDocumentoManual;
    }

    /** full constructor */
    public DocumentoManual(DocumentoManualId id,TipoDocumentoFe tipoDocumentoFe,MonedaDocFe monedaDocFeByCodigoMonedaLocal,NodoObligadoDocumento nodoObligadoDocumento,AdquirienteFe adquirienteFe,ObligadoFe obligadoFe,
            MonedaDocFe monedaDocFeByCodigoMonedaExt,TipoConceptoNotaFe tipoConceptoNotaFe,EstadoDocumentoManual estadoDocumentoManual,Timestamp fechaDoc,Date fechaVencimiento,String fechaPago,String observaciones,Double valorTotal,Double totalIva,
            Double baseGrabableIva,String prefijoFacturacion,String cufe,String numeroReferencia,Short version,String numeroCuenta,String numeroPedido,Double totalDescuento,String periodoFacturacion,String refePago,Double trm,
            Double valorNetoDocMonedaExt,Date fechaTrm,Short aprobado,Timestamp fechaModicacion,Short versionDocManual,String notas,Short generado,Double totalIca,Double totalConsumo,Set<ImpuestoDocumentoManual> impuestoDocumentoManuals,
            Set<DescuentoDocumentoManual> descuentoDocumentoManuals,Set<DetalleDocumentoManual> detalleDocumentoManuals,Set<OpcionalDocumentoManual> opcionalDocumentoManuals){
        this.id=id;
        this.tipoDocumentoFe=tipoDocumentoFe;
        this.monedaDocFeByCodigoMonedaLocal=monedaDocFeByCodigoMonedaLocal;
        this.nodoObligadoDocumento=nodoObligadoDocumento;
        this.adquirienteFe=adquirienteFe;
        this.obligadoFe=obligadoFe;
        this.monedaDocFeByCodigoMonedaExt=monedaDocFeByCodigoMonedaExt;
        this.tipoConceptoNotaFe=tipoConceptoNotaFe;
        this.estadoDocumentoManual=estadoDocumentoManual;
        this.fechaDoc=fechaDoc;
        this.fechaVencimiento=fechaVencimiento;
        this.fechaPago=fechaPago;
        this.observaciones=observaciones;
        this.valorTotal=valorTotal;
        this.totalIva=totalIva;
        this.baseGrabableIva=baseGrabableIva;
        this.prefijoFacturacion=prefijoFacturacion;
        this.cufe=cufe;
        this.numeroReferencia=numeroReferencia;
        this.version=version;
        this.numeroCuenta=numeroCuenta;
        this.numeroPedido=numeroPedido;
        this.totalDescuento=totalDescuento;
        this.periodoFacturacion=periodoFacturacion;
        this.refePago=refePago;
        this.trm=trm;
        this.valorNetoDocMonedaExt=valorNetoDocMonedaExt;
        this.fechaTrm=fechaTrm;
        this.aprobado=aprobado;
        this.fechaModicacion=fechaModicacion;
        this.versionDocManual=versionDocManual;
        this.notas=notas;
        this.generado=generado;
        this.totalIca=totalIca;
        this.totalConsumo=totalConsumo;
        this.impuestoDocumentoManuals=impuestoDocumentoManuals;
        this.descuentoDocumentoManuals=descuentoDocumentoManuals;
        this.detalleDocumentoManuals=detalleDocumentoManuals;
        this.opcionalDocumentoManuals=opcionalDocumentoManuals;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),@AttributeOverride(name="noDocumento",column=@Column(name="NO_DOCUMENTO",nullable=false,length=30)),
            @AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false)),@AttributeOverride(name="idTipoDocFe",column=@Column(name="ID_TIPO_DOC_FE",nullable=false))})
    public DocumentoManualId getId(){
        return this.id;
    }

    public void setId(DocumentoManualId id){
        this.id=id;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_DOC_FE",nullable=false,insertable=false,updatable=false)
    public TipoDocumentoFe getTipoDocumentoFe(){
        return this.tipoDocumentoFe;
    }

    public void setTipoDocumentoFe(TipoDocumentoFe tipoDocumentoFe){
        this.tipoDocumentoFe=tipoDocumentoFe;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CODIGO_MONEDA_LOCAL")
    public MonedaDocFe getMonedaDocFeByCodigoMonedaLocal(){
        return this.monedaDocFeByCodigoMonedaLocal;
    }

    public void setMonedaDocFeByCodigoMonedaLocal(MonedaDocFe monedaDocFeByCodigoMonedaLocal){
        this.monedaDocFeByCodigoMonedaLocal=monedaDocFeByCodigoMonedaLocal;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns({@JoinColumn(name="NUM_RESOLU_DIAN",referencedColumnName="NUM_RESOLU_DIAN",nullable=false,insertable=false,updatable=false),
            @JoinColumn(name="IDENTIFICACION_OBLIGADO",referencedColumnName="IDENTIFICACION_OBLIGADO",nullable=false,insertable=false,updatable=false),
            @JoinColumn(name="ID_PREFIJO",referencedColumnName="ID_PREFIJO",nullable=false,insertable=false,updatable=false)})
    public NodoObligadoDocumento getNodoObligadoDocumento(){
        return this.nodoObligadoDocumento;
    }

    public void setNodoObligadoDocumento(NodoObligadoDocumento nodoObligadoDocumento){
        this.nodoObligadoDocumento=nodoObligadoDocumento;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDENTIFICACION_ADQUIRIENTE")
    public AdquirienteFe getAdquirienteFe(){
        return this.adquirienteFe;
    }

    public void setAdquirienteFe(AdquirienteFe adquirienteFe){
        this.adquirienteFe=adquirienteFe;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDENTIFICACION_OBLIGADO",nullable=false,insertable=false,updatable=false)
    public ObligadoFe getObligadoFe(){
        return this.obligadoFe;
    }

    public void setObligadoFe(ObligadoFe obligadoFe){
        this.obligadoFe=obligadoFe;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CODIGO_MONEDA_EXT")
    public MonedaDocFe getMonedaDocFeByCodigoMonedaExt(){
        return this.monedaDocFeByCodigoMonedaExt;
    }

    public void setMonedaDocFeByCodigoMonedaExt(MonedaDocFe monedaDocFeByCodigoMonedaExt){
        this.monedaDocFeByCodigoMonedaExt=monedaDocFeByCodigoMonedaExt;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns({@JoinColumn(name="ID_TIPO_CONCEPTO_NOTA",referencedColumnName="ID_TIPO_CONCEPTO_NOTA"),@JoinColumn(name="CODIGO_CONCEPTO",referencedColumnName="CODIGO_CONCEPTO")})
    public TipoConceptoNotaFe getTipoConceptoNotaFe(){
        return this.tipoConceptoNotaFe;
    }

    public void setTipoConceptoNotaFe(TipoConceptoNotaFe tipoConceptoNotaFe){
        this.tipoConceptoNotaFe=tipoConceptoNotaFe;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ESTADO",nullable=false)
    public EstadoDocumentoManual getEstadoDocumentoManual(){
        return this.estadoDocumentoManual;
    }

    public void setEstadoDocumentoManual(EstadoDocumentoManual estadoDocumentoManual){
        this.estadoDocumentoManual=estadoDocumentoManual;
    }

    @Column(name="FECHA_DOC",length=26)
    public Timestamp getFechaDoc(){
        return this.fechaDoc;
    }

    public void setFechaDoc(Timestamp fechaDoc){
        this.fechaDoc=fechaDoc;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_VENCIMIENTO",length=10)
    public Date getFechaVencimiento(){
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento){
        this.fechaVencimiento=fechaVencimiento;
    }

    @Column(name="FECHA_PAGO",length=40)
    public String getFechaPago(){
        return this.fechaPago;
    }

    public void setFechaPago(String fechaPago){
        this.fechaPago=fechaPago;
    }

    @Column(name="OBSERVACIONES",length=600)
    public String getObservaciones(){
        return this.observaciones;
    }

    public void setObservaciones(String observaciones){
        this.observaciones=observaciones;
    }

    @Column(name="VALOR_TOTAL",precision=53,scale=0)
    public Double getValorTotal(){
        return this.valorTotal;
    }

    public void setValorTotal(Double valorTotal){
        this.valorTotal=valorTotal;
    }

    @Column(name="TOTAL_IVA",precision=53,scale=0)
    public Double getTotalIva(){
        return this.totalIva;
    }

    public void setTotalIva(Double totalIva){
        this.totalIva=totalIva;
    }

    @Column(name="BASE_GRABABLE_IVA",precision=53,scale=0)
    public Double getBaseGrabableIva(){
        return this.baseGrabableIva;
    }

    public void setBaseGrabableIva(Double baseGrabableIva){
        this.baseGrabableIva=baseGrabableIva;
    }

    @Column(name="PREFIJO_FACTURACION",length=10)
    public String getPrefijoFacturacion(){
        return this.prefijoFacturacion;
    }

    public void setPrefijoFacturacion(String prefijoFacturacion){
        this.prefijoFacturacion=prefijoFacturacion;
    }

    @Column(name="CUFE",length=200)
    public String getCufe(){
        return this.cufe;
    }

    public void setCufe(String cufe){
        this.cufe=cufe;
    }

    @Column(name="NUMERO_REFERENCIA",length=30)
    public String getNumeroReferencia(){
        return this.numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia){
        this.numeroReferencia=numeroReferencia;
    }

    @Column(name="VERSION")
    public Short getVersion(){
        return this.version;
    }

    public void setVersion(Short version){
        this.version=version;
    }

    @Column(name="NUMERO_CUENTA",length=150)
    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }

    @Column(name="NUMERO_PEDIDO",length=150)
    public String getNumeroPedido(){
        return this.numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido){
        this.numeroPedido=numeroPedido;
    }

    @Column(name="TOTAL_DESCUENTO",precision=53,scale=0)
    public Double getTotalDescuento(){
        return this.totalDescuento;
    }

    public void setTotalDescuento(Double totalDescuento){
        this.totalDescuento=totalDescuento;
    }

    @Column(name="PERIODO_FACTURACION",length=40)
    public String getPeriodoFacturacion(){
        return this.periodoFacturacion;
    }

    public void setPeriodoFacturacion(String periodoFacturacion){
        this.periodoFacturacion=periodoFacturacion;
    }

    @Column(name="REFE_PAGO",length=150)
    public String getRefePago(){
        return this.refePago;
    }

    public void setRefePago(String refePago){
        this.refePago=refePago;
    }

    @Column(name="TRM",precision=53,scale=0)
    public Double getTrm(){
        return this.trm;
    }

    public void setTrm(Double trm){
        this.trm=trm;
    }

    @Column(name="VALOR_NETO_DOC_MONEDA_EXT",precision=53,scale=0)
    public Double getValorNetoDocMonedaExt(){
        return this.valorNetoDocMonedaExt;
    }

    public void setValorNetoDocMonedaExt(Double valorNetoDocMonedaExt){
        this.valorNetoDocMonedaExt=valorNetoDocMonedaExt;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_TRM",length=10)
    public Date getFechaTrm(){
        return this.fechaTrm;
    }

    public void setFechaTrm(Date fechaTrm){
        this.fechaTrm=fechaTrm;
    }

    @Column(name="APROBADO")
    public Short getAprobado(){
        return this.aprobado;
    }

    public void setAprobado(Short aprobado){
        this.aprobado=aprobado;
    }

    @Column(name="FECHA_MODICACION",length=26)
    public Timestamp getFechaModicacion(){
        return this.fechaModicacion;
    }

    public void setFechaModicacion(Timestamp fechaModicacion){
        this.fechaModicacion=fechaModicacion;
    }

    @Column(name="VERSION_DOC_MANUAL")
    public Short getVersionDocManual(){
        return this.versionDocManual;
    }

    public void setVersionDocManual(Short versionDocManual){
        this.versionDocManual=versionDocManual;
    }

    @Column(name="NOTAS",length=300)
    public String getNotas(){
        return this.notas;
    }

    public void setNotas(String notas){
        this.notas=notas;
    }

    @Column(name="GENERADO")
    public Short getGenerado(){
        return this.generado;
    }

    public void setGenerado(Short generado){
        this.generado=generado;
    }

    @Column(name="TOTAL_ICA",precision=53,scale=0)
    public Double getTotalIca(){
        return this.totalIca;
    }

    public void setTotalIca(Double totalIca){
        this.totalIca=totalIca;
    }

    @Column(name="TOTAL_CONSUMO",precision=53,scale=0)
    public Double getTotalConsumo(){
        return this.totalConsumo;
    }

    public void setTotalConsumo(Double totalConsumo){
        this.totalConsumo=totalConsumo;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="documentoManual")
    public Set<ImpuestoDocumentoManual> getImpuestoDocumentoManuals(){
        return this.impuestoDocumentoManuals;
    }

    public void setImpuestoDocumentoManuals(Set<ImpuestoDocumentoManual> impuestoDocumentoManuals){
        this.impuestoDocumentoManuals=impuestoDocumentoManuals;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="documentoManual")
    public Set<DescuentoDocumentoManual> getDescuentoDocumentoManuals(){
        return this.descuentoDocumentoManuals;
    }

    public void setDescuentoDocumentoManuals(Set<DescuentoDocumentoManual> descuentoDocumentoManuals){
        this.descuentoDocumentoManuals=descuentoDocumentoManuals;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="documentoManual")
    public Set<DetalleDocumentoManual> getDetalleDocumentoManuals(){
        return this.detalleDocumentoManuals;
    }

    public void setDetalleDocumentoManuals(Set<DetalleDocumentoManual> detalleDocumentoManuals){
        this.detalleDocumentoManuals=detalleDocumentoManuals;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="documentoManual")
    public Set<OpcionalDocumentoManual> getOpcionalDocumentoManuals(){
        return this.opcionalDocumentoManuals;
    }

    public void setOpcionalDocumentoManuals(Set<OpcionalDocumentoManual> opcionalDocumentoManuals){
        this.opcionalDocumentoManuals=opcionalDocumentoManuals;
    }

}