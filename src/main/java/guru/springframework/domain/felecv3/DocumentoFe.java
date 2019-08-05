//marcado
package guru.springframework.domain.felecv3;

import java.sql.Time;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * DocumentoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DOCUMENTO_FE"
    ,schema="FELECV3"
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DocumentoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=6293622175270887827L;
    private DocumentoFeId id;
     private TipoDocumentoFe tipoDocumentoFe;
     private TipoCodigoBarras tipoCodigoBarras;
     private MonedaDocFe monedaDocFeByCodigoMonedaLocal;
     private AdquirienteFe adquirienteFe;
     private ObligadoFe obligadoFe;
     private MonedaDocFe monedaDocFeByCodigoMonedaExt;
     private TipoConceptoNotaFe tipoConceptoNotaFe;
     private EstadoDocumentoFe estadoDocumentoFe;
     private String noReferencia;
     private Date fechaFactura;
     private Time horaFactura;
     private Double valorDocumento;
     private Double totalNeto;
     private Double baseExclIva;
     private Double valorNetoDocumento;
     private String cufe;
     private Short contingencia;
     private Date fechaTrm;
     private Double trm;
     private Double valorNetoDocMonedaExt;
     private String descripcion;
     private Short retenido;
     private Double baseGravableIva;
     private String numeroCuenta;
     private String numeroPedido;
     private String canalVenta;
     private String refePago;
     private Date fechaSuspension;
     private Date fechaVencimiento;
     private String periodoFacturacion;
     private String observaciones;
     private Double totalIva;
     private Double totalDescuento;
     private String codBarras;
     private Double totalIca;
     private Double totalImpConsumo;
     private Double totalContribuciones;
     private Double totalRteRenta;
     private Double totalRteIva;
     private Double totalRteIca;
     private Short idMotivoRechazo;
     private Set<ImpuestoDocumento> impuestoDocumentos = new HashSet<ImpuestoDocumento>(0);
     private Set<DetalleDocumentoFe> detalleDocumentoFes = new HashSet<DetalleDocumentoFe>(0);
     private Set<OpcionalDocumentoFe> opcionalDocumentoFes = new HashSet<OpcionalDocumentoFe>(0);
     private Set<CargosDocumentoFe> cargosDocumentoFes = new HashSet<CargosDocumentoFe>(0);
     private Set<PagosRealizados> pagosRealizadoses = new HashSet<PagosRealizados>(0);
     private Set<DescuentosDocumentoFe> descuentosDocumentoFes = new HashSet<DescuentosDocumentoFe>(0);


    // Constructors

    /** default constructor */
    public DocumentoFe() {
    }

	/** minimal constructor */
    public DocumentoFe(DocumentoFeId id, TipoDocumentoFe tipoDocumentoFe, ObligadoFe obligadoFe) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.obligadoFe = obligadoFe;
    }
    
    /** full constructor */
    public DocumentoFe(DocumentoFeId id, TipoDocumentoFe tipoDocumentoFe, TipoCodigoBarras tipoCodigoBarras, MonedaDocFe monedaDocFeByCodigoMonedaLocal, AdquirienteFe adquirienteFe, ObligadoFe obligadoFe, MonedaDocFe monedaDocFeByCodigoMonedaExt, TipoConceptoNotaFe tipoConceptoNotaFe, EstadoDocumentoFe estadoDocumentoFe, String noReferencia, Date fechaFactura, Time horaFactura, Double valorDocumento, Double totalNeto, Double baseExclIva, Double valorNetoDocumento, String cufe, Short contingencia, Date fechaTrm, Double trm, Double valorNetoDocMonedaExt, String descripcion, Short retenido, Double baseGravableIva, String numeroCuenta, String numeroPedido, String canalVenta, String refePago, Date fechaSuspension, Date fechaVencimiento, String periodoFacturacion, String observaciones, Double totalIva, Double totalDescuento, String codBarras, Double totalIca, Double totalImpConsumo, Double totalContribuciones, Double totalRteRenta, Double totalRteIva, Double totalRteIca, Set<ImpuestoDocumento> impuestoDocumentos, Set<DetalleDocumentoFe> detalleDocumentoFes, Set<OpcionalDocumentoFe> opcionalDocumentoFes, Set<CargosDocumentoFe> cargosDocumentoFes, Set<PagosRealizados> pagosRealizadoses, Set<DescuentosDocumentoFe> descuentosDocumentoFes) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.tipoCodigoBarras = tipoCodigoBarras;
        this.monedaDocFeByCodigoMonedaLocal = monedaDocFeByCodigoMonedaLocal;
        this.adquirienteFe = adquirienteFe;
        this.obligadoFe = obligadoFe;
        this.monedaDocFeByCodigoMonedaExt = monedaDocFeByCodigoMonedaExt;
        this.tipoConceptoNotaFe = tipoConceptoNotaFe;
        this.estadoDocumentoFe = estadoDocumentoFe;
        this.noReferencia = noReferencia;
        this.fechaFactura = fechaFactura;
        this.horaFactura = horaFactura;
        this.valorDocumento = valorDocumento;
        this.totalNeto = totalNeto;
        this.baseExclIva = baseExclIva;
        this.valorNetoDocumento = valorNetoDocumento;
        this.cufe = cufe;
        this.contingencia = contingencia;
        this.fechaTrm = fechaTrm;
        this.trm = trm;
        this.valorNetoDocMonedaExt = valorNetoDocMonedaExt;
        this.descripcion = descripcion;
        this.retenido = retenido;
        this.baseGravableIva = baseGravableIva;
        this.numeroCuenta = numeroCuenta;
        this.numeroPedido = numeroPedido;
        this.canalVenta = canalVenta;
        this.refePago = refePago;
        this.fechaSuspension = fechaSuspension;
        this.fechaVencimiento = fechaVencimiento;
        this.periodoFacturacion = periodoFacturacion;
        this.observaciones = observaciones;
        this.totalIva = totalIva;
        this.totalDescuento = totalDescuento;
        this.codBarras = codBarras;
        this.totalIca = totalIca;
        this.totalImpConsumo = totalImpConsumo;
        this.totalContribuciones = totalContribuciones;
        this.totalRteRenta = totalRteRenta;
        this.totalRteIva = totalRteIva;
        this.totalRteIca = totalRteIca;
        this.impuestoDocumentos = impuestoDocumentos;
        this.detalleDocumentoFes = detalleDocumentoFes;
        this.opcionalDocumentoFes = opcionalDocumentoFes;
        this.cargosDocumentoFes = cargosDocumentoFes;
        this.pagosRealizadoses = pagosRealizadoses;
        this.descuentosDocumentoFes = descuentosDocumentoFes;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ) } )

    public DocumentoFeId getId() {
        return this.id;
    }
    
    public void setId(DocumentoFeId id) {
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_CODIGO_BARRAS")

    public TipoCodigoBarras getTipoCodigoBarras() {
        return this.tipoCodigoBarras;
    }
    
    public void setTipoCodigoBarras(TipoCodigoBarras tipoCodigoBarras) {
        this.tipoCodigoBarras = tipoCodigoBarras;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="CODIGO_MONEDA_LOCAL")

    public MonedaDocFe getMonedaDocFeByCodigoMonedaLocal() {
        return this.monedaDocFeByCodigoMonedaLocal;
    }
    
    public void setMonedaDocFeByCodigoMonedaLocal(MonedaDocFe monedaDocFeByCodigoMonedaLocal) {
        this.monedaDocFeByCodigoMonedaLocal = monedaDocFeByCodigoMonedaLocal;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_ADQUIRIENTE")

    public AdquirienteFe getAdquirienteFe() {
        return this.adquirienteFe;
    }
    
    public void setAdquirienteFe(AdquirienteFe adquirienteFe) {
        this.adquirienteFe = adquirienteFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="CODIGO_MONEDA_EXT")

    public MonedaDocFe getMonedaDocFeByCodigoMonedaExt() {
        return this.monedaDocFeByCodigoMonedaExt;
    }
    
    public void setMonedaDocFeByCodigoMonedaExt(MonedaDocFe monedaDocFeByCodigoMonedaExt) {
        this.monedaDocFeByCodigoMonedaExt = monedaDocFeByCodigoMonedaExt;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumns( { 
        @JoinColumn(name="ID_TIPO_CONCEPTO_NOTA", referencedColumnName="ID_TIPO_CONCEPTO_NOTA"), 
        @JoinColumn(name="CODIGO_CONCEPTO", referencedColumnName="CODIGO_CONCEPTO") } )

    public TipoConceptoNotaFe getTipoConceptoNotaFe() {
        return this.tipoConceptoNotaFe;
    }
    
    public void setTipoConceptoNotaFe(TipoConceptoNotaFe tipoConceptoNotaFe) {
        this.tipoConceptoNotaFe = tipoConceptoNotaFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO")

    public EstadoDocumentoFe getEstadoDocumentoFe() {
        return this.estadoDocumentoFe;
    }
    
    public void setEstadoDocumentoFe(EstadoDocumentoFe estadoDocumentoFe) {
        this.estadoDocumentoFe = estadoDocumentoFe;
    }
    
    @Column(name="NO_REFERENCIA", length=30)

    public String getNoReferencia() {
        return this.noReferencia;
    }
    
    public void setNoReferencia(String noReferencia) {
        this.noReferencia = noReferencia;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_FACTURA", length=10)

    public Date getFechaFactura() {
        return this.fechaFactura;
    }
    
    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
    
    @Column(name="HORA_FACTURA", length=8)

    public Time getHoraFactura() {
        return this.horaFactura;
    }
    
    public void setHoraFactura(Time horaFactura) {
        this.horaFactura = horaFactura;
    }
    
    @Column(name="VALOR_DOCUMENTO", precision=53, scale=0)

    public Double getValorDocumento() {
        return this.valorDocumento;
    }
    
    public void setValorDocumento(Double valorDocumento) {
        this.valorDocumento = valorDocumento;
    }
    
    @Column(name="TOTAL_NETO", precision=53, scale=0)

    public Double getTotalNeto() {
        return this.totalNeto;
    }
    
    public void setTotalNeto(Double totalNeto) {
        this.totalNeto = totalNeto;
    }
    
    @Column(name="BASE_EXCL_IVA", precision=53, scale=0)

    public Double getBaseExclIva() {
        return this.baseExclIva;
    }
    
    public void setBaseExclIva(Double baseExclIva) {
        this.baseExclIva = baseExclIva;
    }
    
    @Column(name="VALOR_NETO_DOCUMENTO", precision=53, scale=0)

    public Double getValorNetoDocumento() {
        return this.valorNetoDocumento;
    }
    
    public void setValorNetoDocumento(Double valorNetoDocumento) {
        this.valorNetoDocumento = valorNetoDocumento;
    }
    
    @Column(name="CUFE", length=200)

    public String getCufe() {
        return this.cufe;
    }
    
    public void setCufe(String cufe) {
        this.cufe = cufe;
    }
    
    @Column(name="CONTINGENCIA")

    public Short getContingencia() {
        return this.contingencia;
    }
    
    public void setContingencia(Short contingencia) {
        this.contingencia = contingencia;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_TRM", length=10)

    public Date getFechaTrm() {
        return this.fechaTrm;
    }
    
    public void setFechaTrm(Date fechaTrm) {
        this.fechaTrm = fechaTrm;
    }
    
    @Column(name="TRM", precision=53, scale=0)

    public Double getTrm() {
        return this.trm;
    }
    
    public void setTrm(Double trm) {
        this.trm = trm;
    }
    
    @Column(name="VALOR_NETO_DOC_MONEDA_EXT", precision=53, scale=0)

    public Double getValorNetoDocMonedaExt() {
        return this.valorNetoDocMonedaExt;
    }
    
    public void setValorNetoDocMonedaExt(Double valorNetoDocMonedaExt) {
        this.valorNetoDocMonedaExt = valorNetoDocMonedaExt;
    }
    
    @Column(name="DESCRIPCION", length=300)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="RETENIDO")

    public Short getRetenido() {
        return this.retenido;
    }
    
    public void setRetenido(Short retenido) {
        this.retenido = retenido;
    }
    
    @Column(name="BASE_GRAVABLE_IVA", precision=53, scale=0)

    public Double getBaseGravableIva() {
        return this.baseGravableIva;
    }
    
    public void setBaseGravableIva(Double baseGravableIva) {
        this.baseGravableIva = baseGravableIva;
    }
    
    @Column(name="NUMERO_CUENTA", length=150)

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    @Column(name="NUMERO_PEDIDO", length=150)

    public String getNumeroPedido() {
        return this.numeroPedido;
    }
    
    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
    @Column(name="CANAL_VENTA", length=40)

    public String getCanalVenta() {
        return this.canalVenta;
    }
    
    public void setCanalVenta(String canalVenta) {
        this.canalVenta = canalVenta;
    }
    
    @Column(name="REFE_PAGO", length=150)

    public String getRefePago() {
        return this.refePago;
    }
    
    public void setRefePago(String refePago) {
        this.refePago = refePago;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_SUSPENSION", length=10)

    public Date getFechaSuspension() {
        return this.fechaSuspension;
    }
    
    public void setFechaSuspension(Date fechaSuspension) {
        this.fechaSuspension = fechaSuspension;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_VENCIMIENTO", length=10)

    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    @Column(name="PERIODO_FACTURACION", length=40)

    public String getPeriodoFacturacion() {
        return this.periodoFacturacion;
    }
    
    public void setPeriodoFacturacion(String periodoFacturacion) {
        this.periodoFacturacion = periodoFacturacion;
    }
    
    @Column(name="OBSERVACIONES", length=300)

    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    @Column(name="TOTAL_IVA", precision=53, scale=0)

    public Double getTotalIva() {
        return this.totalIva;
    }
    
    public void setTotalIva(Double totalIva) {
        this.totalIva = totalIva;
    }
    
    @Column(name="TOTAL_DESCUENTO", precision=53, scale=0)

    public Double getTotalDescuento() {
        return this.totalDescuento;
    }
    
    public void setTotalDescuento(Double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }
    
    @Column(name="COD_BARRAS", length=500)

    public String getCodBarras() {
        return this.codBarras;
    }
    
    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }
    
    @Column(name="TOTAL_ICA", precision=53, scale=0)

    public Double getTotalIca() {
        return this.totalIca;
    }
    
    public void setTotalIca(Double totalIca) {
        this.totalIca = totalIca;
    }
    
    @Column(name="TOTAL_IMP_CONSUMO", precision=53, scale=0)

    public Double getTotalImpConsumo() {
        return this.totalImpConsumo;
    }
    
    public void setTotalImpConsumo(Double totalImpConsumo) {
        this.totalImpConsumo = totalImpConsumo;
    }
    
    @Column(name="TOTAL_CONTRIBUCIONES", precision=53, scale=0)

    public Double getTotalContribuciones() {
        return this.totalContribuciones;
    }
    
    public void setTotalContribuciones(Double totalContribuciones) {
        this.totalContribuciones = totalContribuciones;
    }
    
    @Column(name="TOTAL_RTE_RENTA", precision=53, scale=0)

    public Double getTotalRteRenta() {
        return this.totalRteRenta;
    }
    
    public void setTotalRteRenta(Double totalRteRenta) {
        this.totalRteRenta = totalRteRenta;
    }
    
    @Column(name="TOTAL_RTE_IVA", precision=53, scale=0)

    public Double getTotalRteIva() {
        return this.totalRteIva;
    }
    
    public void setTotalRteIva(Double totalRteIva) {
        this.totalRteIva = totalRteIva;
    }
    
    @Column(name="TOTAL_RTE_ICA", precision=53, scale=0)

    public Double getTotalRteIca() {
        return this.totalRteIca;
    }
    
    public void setTotalRteIca(Double totalRteIca) {
        this.totalRteIca = totalRteIca;
    }
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="documentoFe")
//    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="documentoFe")
    public Set<ImpuestoDocumento> getImpuestoDocumentos() {
        return this.impuestoDocumentos;
    }
    
    public void setImpuestoDocumentos(Set<ImpuestoDocumento> impuestoDocumentos) {
        this.impuestoDocumentos = impuestoDocumentos;
    }
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="documentoFe")
//    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="documentoFe")
    public Set<DetalleDocumentoFe> getDetalleDocumentoFes() {
        return this.detalleDocumentoFes;
    }
    
    public void setDetalleDocumentoFes(Set<DetalleDocumentoFe> detalleDocumentoFes) {
        this.detalleDocumentoFes = detalleDocumentoFes;
    }
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="documentoFe")

    public Set<OpcionalDocumentoFe> getOpcionalDocumentoFes() {
        return this.opcionalDocumentoFes;
    }
    
    public void setOpcionalDocumentoFes(Set<OpcionalDocumentoFe> opcionalDocumentoFes) {
        this.opcionalDocumentoFes = opcionalDocumentoFes;
    }
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="documentoFe")
//    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="documentoFe")
    public Set<CargosDocumentoFe> getCargosDocumentoFes() {
        return this.cargosDocumentoFes;
    }
    
    public void setCargosDocumentoFes(Set<CargosDocumentoFe> cargosDocumentoFes) {
        this.cargosDocumentoFes = cargosDocumentoFes;
    }
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="documentoFe")
//    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="documentoFe")
    public Set<PagosRealizados> getPagosRealizadoses() {
        return this.pagosRealizadoses;
    }
    
    public void setPagosRealizadoses(Set<PagosRealizados> pagosRealizadoses) {
        this.pagosRealizadoses = pagosRealizadoses;
    }
  @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="documentoFe")
//    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="documentoFe")
    public Set<DescuentosDocumentoFe> getDescuentosDocumentoFes() {
        return this.descuentosDocumentoFes;
    }
    
    public void setDescuentosDocumentoFes(Set<DescuentosDocumentoFe> descuentosDocumentoFes) {
        this.descuentosDocumentoFes = descuentosDocumentoFes;
    }
    @Column(name="ID_MOTIVO_RECHAZO")
    public Short getIdMotivoRechazo(){
        return idMotivoRechazo;
    }

    public void setIdMotivoRechazo(Short idMotivoRechazo){
        this.idMotivoRechazo=idMotivoRechazo;
    }
   






}
