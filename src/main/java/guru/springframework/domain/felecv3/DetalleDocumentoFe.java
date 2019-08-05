//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;
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

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * DetalleDocumentoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DETALLE_DOCUMENTO_FE"
    ,schema="FELECV3"
)

public class DetalleDocumentoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7593075727502249462L;
    private DetalleDocumentoFeId id;
     private DocumentoFe documentoFe;
     private Integer noDetalle;
     private Integer cantidad;
     private String descripcion;
     private Double iva;
     private Double precioUnidad;
     private Double valor;
     private Timestamp fechaIniPerFact;
     private Timestamp fechaFinPerFact;
     private Double descuento;
     private Set<InfoItemLineaDetalle> infoItemLineaDetalles = new HashSet<InfoItemLineaDetalle>(0);
     private Set<RefOrdenCompraLineaDetalle> refOrdenCompraLineaDetalles = new HashSet<RefOrdenCompraLineaDetalle>(0);


    // Constructors

    /** default constructor */
    public DetalleDocumentoFe() {
    }

	/** minimal constructor */
    public DetalleDocumentoFe(DetalleDocumentoFeId id, DocumentoFe documentoFe) {
        this.id = id;
        this.documentoFe = documentoFe;
    }
    
    /** full constructor */
    public DetalleDocumentoFe(DetalleDocumentoFeId id, DocumentoFe documentoFe, Integer noDetalle, Integer cantidad, String descripcion, Double iva, Double precioUnidad, Double valor, Timestamp fechaIniPerFact, Timestamp fechaFinPerFact, Double descuento, Set<InfoItemLineaDetalle> infoItemLineaDetalles, Set<RefOrdenCompraLineaDetalle> refOrdenCompraLineaDetalles) {
        this.id = id;
        this.documentoFe = documentoFe;
        this.noDetalle = noDetalle;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.iva = iva;
        this.precioUnidad = precioUnidad;
        this.valor = valor;
        this.fechaIniPerFact = fechaIniPerFact;
        this.fechaFinPerFact = fechaFinPerFact;
        this.descuento = descuento;
        this.infoItemLineaDetalles = infoItemLineaDetalles;
        this.refOrdenCompraLineaDetalles = refOrdenCompraLineaDetalles;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idDetalleDoc", column=@Column(name="ID_DETALLE_DOC", nullable=false) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ) } )

    public DetalleDocumentoFeId getId() {
        return this.id;
    }
    
    public void setId(DetalleDocumentoFeId id) {
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
    
    @Column(name="NO_DETALLE")

    public Integer getNoDetalle() {
        return this.noDetalle;
    }
    
    public void setNoDetalle(Integer noDetalle) {
        this.noDetalle = noDetalle;
    }
    
    @Column(name="CANTIDAD")

    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    @Column(name="DESCRIPCION", length=100)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="IVA", precision=53, scale=0)

    public Double getIva() {
        return this.iva;
    }
    
    public void setIva(Double iva) {
        this.iva = iva;
    }
    
    @Column(name="PRECIO_UNIDAD", precision=53, scale=0)

    public Double getPrecioUnidad() {
        return this.precioUnidad;
    }
    
    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    
    @Column(name="VALOR", precision=53, scale=0)

    public Double getValor() {
        return this.valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    @Column(name="FECHA_INI_PER_FACT", length=26)

    public Timestamp getFechaIniPerFact() {
        return this.fechaIniPerFact;
    }
    
    public void setFechaIniPerFact(Timestamp fechaIniPerFact) {
        this.fechaIniPerFact = fechaIniPerFact;
    }
    
    @Column(name="FECHA_FIN_PER_FACT", length=26)

    public Timestamp getFechaFinPerFact() {
        return this.fechaFinPerFact;
    }
    
    public void setFechaFinPerFact(Timestamp fechaFinPerFact) {
        this.fechaFinPerFact = fechaFinPerFact;
    }
    
    @Column(name="DESCUENTO", precision=53, scale=0)

    public Double getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="detalleDocumentoFe")

    public Set<InfoItemLineaDetalle> getInfoItemLineaDetalles() {
        return this.infoItemLineaDetalles;
    }
    
    public void setInfoItemLineaDetalles(Set<InfoItemLineaDetalle> infoItemLineaDetalles) {
        this.infoItemLineaDetalles = infoItemLineaDetalles;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="detalleDocumentoFe")

    public Set<RefOrdenCompraLineaDetalle> getRefOrdenCompraLineaDetalles() {
        return this.refOrdenCompraLineaDetalles;
    }
    
    public void setRefOrdenCompraLineaDetalles(Set<RefOrdenCompraLineaDetalle> refOrdenCompraLineaDetalles) {
        this.refOrdenCompraLineaDetalles = refOrdenCompraLineaDetalles;
    }
   








}
