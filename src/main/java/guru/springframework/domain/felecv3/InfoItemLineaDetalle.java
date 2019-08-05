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
 * InfoItemLineaDetalle entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="INFO_ITEM_LINEA_DETALLE"
    ,schema="FELECV3"
)

public class InfoItemLineaDetalle   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=1189519363053078079L;
    private InfoItemLineaDetalleId id;
     private DetalleDocumentoFe detalleDocumentoFe;
     private String marca;
     private String modelo;
     private String codigoUnidadMedida;
     private String notaItem;
     private String codigoItemOblg;
     private String codigoItemAdq;


    // Constructors

    /** default constructor */
    public InfoItemLineaDetalle() {
    }

	/** minimal constructor */
    public InfoItemLineaDetalle(InfoItemLineaDetalleId id, DetalleDocumentoFe detalleDocumentoFe) {
        this.id = id;
        this.detalleDocumentoFe = detalleDocumentoFe;
    }
    
    /** full constructor */
    public InfoItemLineaDetalle(InfoItemLineaDetalleId id, DetalleDocumentoFe detalleDocumentoFe, String marca, String modelo, String codigoUnidadMedida, String notaItem, String codigoItemOblg, String codigoItemAdq) {
        this.id = id;
        this.detalleDocumentoFe = detalleDocumentoFe;
        this.marca = marca;
        this.modelo = modelo;
        this.codigoUnidadMedida = codigoUnidadMedida;
        this.notaItem = notaItem;
        this.codigoItemOblg = codigoItemOblg;
        this.codigoItemAdq = codigoItemAdq;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="idDetalleDoc", column=@Column(name="ID_DETALLE_DOC", nullable=false) ), 
        @AttributeOverride(name="idInfoItemLineaDetalle", column=@Column(name="ID_INFO_ITEM_LINEA_DETALLE", nullable=false) ) } )

    public InfoItemLineaDetalleId getId() {
        return this.id;
    }
    
    public void setId(InfoItemLineaDetalleId id) {
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
    
    @Column(name="MARCA", length=50)

    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Column(name="MODELO", length=50)

    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Column(name="CODIGO_UNIDAD_MEDIDA", length=5)

    public String getCodigoUnidadMedida() {
        return this.codigoUnidadMedida;
    }
    
    public void setCodigoUnidadMedida(String codigoUnidadMedida) {
        this.codigoUnidadMedida = codigoUnidadMedida;
    }
    
    @Column(name="NOTA_ITEM", length=300)

    public String getNotaItem() {
        return this.notaItem;
    }
    
    public void setNotaItem(String notaItem) {
        this.notaItem = notaItem;
    }
    
    @Column(name="CODIGO_ITEM_OBLG", length=15)

    public String getCodigoItemOblg() {
        return this.codigoItemOblg;
    }
    
    public void setCodigoItemOblg(String codigoItemOblg) {
        this.codigoItemOblg = codigoItemOblg;
    }
    
    @Column(name="CODIGO_ITEM_ADQ", length=15)

    public String getCodigoItemAdq() {
        return this.codigoItemAdq;
    }
    
    public void setCodigoItemAdq(String codigoItemAdq) {
        this.codigoItemAdq = codigoItemAdq;
    }
   








}
