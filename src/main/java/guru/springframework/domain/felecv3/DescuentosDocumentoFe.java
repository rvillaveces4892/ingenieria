//marcado
package guru.springframework.domain.felecv3;

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

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * DescuentosDocumentoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DESCUENTOS_DOCUMENTO_FE"
    ,schema="FELECV3"
)

public class DescuentosDocumentoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-8731244188438642368L;
    private DescuentosDocumentoFeId id;
     private DocumentoFe documentoFe;
     private Timestamp fechaDescuento;
     private String razonDescuento;
     private Double porcentaje;
     private Double baseDescuento;
     private Double valorDescuento;


    // Constructors

    /** default constructor */
    public DescuentosDocumentoFe() {
    }

	/** minimal constructor */
    public DescuentosDocumentoFe(DescuentosDocumentoFeId id, DocumentoFe documentoFe) {
        this.id = id;
        this.documentoFe = documentoFe;
    }
    
    /** full constructor */
    public DescuentosDocumentoFe(DescuentosDocumentoFeId id, DocumentoFe documentoFe, Timestamp fechaDescuento, String razonDescuento, Double porcentaje, Double baseDescuento, Double valorDescuento) {
        this.id = id;
        this.documentoFe = documentoFe;
        this.fechaDescuento = fechaDescuento;
        this.razonDescuento = razonDescuento;
        this.porcentaje = porcentaje;
        this.baseDescuento = baseDescuento;
        this.valorDescuento = valorDescuento;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idDescuentoDoc", column=@Column(name="ID_DESCUENTO_DOC", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ) } )

    public DescuentosDocumentoFeId getId() {
        return this.id;
    }
    
    public void setId(DescuentosDocumentoFeId id) {
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
    
    @Column(name="FECHA_DESCUENTO", length=26)

    public Timestamp getFechaDescuento() {
        return this.fechaDescuento;
    }
    
    public void setFechaDescuento(Timestamp fechaDescuento) {
        this.fechaDescuento = fechaDescuento;
    }
    
    @Column(name="RAZON_DESCUENTO", length=100)

    public String getRazonDescuento() {
        return this.razonDescuento;
    }
    
    public void setRazonDescuento(String razonDescuento) {
        this.razonDescuento = razonDescuento;
    }
    
    @Column(name="PORCENTAJE", precision=53, scale=0)

    public Double getPorcentaje() {
        return this.porcentaje;
    }
    
    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Column(name="BASE_DESCUENTO", precision=53, scale=0)

    public Double getBaseDescuento() {
        return this.baseDescuento;
    }
    
    public void setBaseDescuento(Double baseDescuento) {
        this.baseDescuento = baseDescuento;
    }
    
    @Column(name="VALOR_DESCUENTO", precision=53, scale=0)

    public Double getValorDescuento() {
        return this.valorDescuento;
    }
    
    public void setValorDescuento(Double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }
   








}
