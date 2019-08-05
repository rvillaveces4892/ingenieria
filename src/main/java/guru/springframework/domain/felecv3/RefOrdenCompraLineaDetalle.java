//marcado
package guru.springframework.domain.felecv3;

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * RefOrdenCompraLineaDetalle entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="REF_ORDEN_COMPRA_LINEA_DETALLE"
    ,schema="FELECV3"
)

public class RefOrdenCompraLineaDetalle   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=8333206781891066188L;
    private RefOrdenCompraLineaDetalleId id;
     private DetalleDocumentoFe detalleDocumentoFe;
     private String numeroOrdenCompraObl;
     private String numeroOrdenCompraAdq;
     private Date fechaOrdenCompra;


    // Constructors

    /** default constructor */
    public RefOrdenCompraLineaDetalle() {
    }

	/** minimal constructor */
    public RefOrdenCompraLineaDetalle(RefOrdenCompraLineaDetalleId id, DetalleDocumentoFe detalleDocumentoFe, String numeroOrdenCompraObl) {
        this.id = id;
        this.detalleDocumentoFe = detalleDocumentoFe;
        this.numeroOrdenCompraObl = numeroOrdenCompraObl;
    }
    
    /** full constructor */
    public RefOrdenCompraLineaDetalle(RefOrdenCompraLineaDetalleId id, DetalleDocumentoFe detalleDocumentoFe, String numeroOrdenCompraObl, String numeroOrdenCompraAdq, Date fechaOrdenCompra) {
        this.id = id;
        this.detalleDocumentoFe = detalleDocumentoFe;
        this.numeroOrdenCompraObl = numeroOrdenCompraObl;
        this.numeroOrdenCompraAdq = numeroOrdenCompraAdq;
        this.fechaOrdenCompra = fechaOrdenCompra;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="idDetalleDoc", column=@Column(name="ID_DETALLE_DOC", nullable=false) ), 
        @AttributeOverride(name="idRefOrdenCompraLineaDetalle", column=@Column(name="ID_REF_ORDEN_COMPRA_LINEA_DETALLE", nullable=false) ) } )

    public RefOrdenCompraLineaDetalleId getId() {
        return this.id;
    }
    
    public void setId(RefOrdenCompraLineaDetalleId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumns( { 
        @JoinColumn(name="ID_DETALLE_DOC", referencedColumnName="ID_DETALLE_DOC", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", referencedColumnName="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="NO_DOCUMENTO", referencedColumnName="NO_DOCUMENTO", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="NUM_RESOLU_DIAN", referencedColumnName="NUM_RESOLU_DIAN", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="ID_TIPO_DOC_FE", referencedColumnName="ID_TIPO_DOC_FE", nullable=false, insertable=false, updatable=false) } )

    public DetalleDocumentoFe getDetalleDocumentoFe() {
        return this.detalleDocumentoFe;
    }
    
    public void setDetalleDocumentoFe(DetalleDocumentoFe detalleDocumentoFe) {
        this.detalleDocumentoFe = detalleDocumentoFe;
    }
    
    @Column(name="NUMERO_ORDEN_COMPRA_OBL", nullable=false, length=35)

    public String getNumeroOrdenCompraObl() {
        return this.numeroOrdenCompraObl;
    }
    
    public void setNumeroOrdenCompraObl(String numeroOrdenCompraObl) {
        this.numeroOrdenCompraObl = numeroOrdenCompraObl;
    }
    
    @Column(name="NUMERO_ORDEN_COMPRA_ADQ", length=35)

    public String getNumeroOrdenCompraAdq() {
        return this.numeroOrdenCompraAdq;
    }
    
    public void setNumeroOrdenCompraAdq(String numeroOrdenCompraAdq) {
        this.numeroOrdenCompraAdq = numeroOrdenCompraAdq;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_ORDEN_COMPRA", length=10)

    public Date getFechaOrdenCompra() {
        return this.fechaOrdenCompra;
    }
    
    public void setFechaOrdenCompra(Date fechaOrdenCompra) {
        this.fechaOrdenCompra = fechaOrdenCompra;
    }
   








}
