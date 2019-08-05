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
 * PagosRealizados entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="PAGOS_REALIZADOS"
    ,schema="FELECV3"
)

public class PagosRealizados   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=2640704271800877510L;
    private PagosRealizadosId id;
     private DocumentoFe documentoFe;
     private Timestamp fechaPago;
     private String descripcion;
     private Double valor;


    // Constructors

    /** default constructor */
    public PagosRealizados() {
    }

	/** minimal constructor */
    public PagosRealizados(PagosRealizadosId id, DocumentoFe documentoFe) {
        this.id = id;
        this.documentoFe = documentoFe;
    }
    
    /** full constructor */
    public PagosRealizados(PagosRealizadosId id, DocumentoFe documentoFe, Timestamp fechaPago, String descripcion, Double valor) {
        this.id = id;
        this.documentoFe = documentoFe;
        this.fechaPago = fechaPago;
        this.descripcion = descripcion;
        this.valor = valor;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idPago", column=@Column(name="ID_PAGO", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ) } )

    public PagosRealizadosId getId() {
        return this.id;
    }
    
    public void setId(PagosRealizadosId id) {
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
    
    @Column(name="FECHA_PAGO", length=26)

    public Timestamp getFechaPago() {
        return this.fechaPago;
    }
    
    public void setFechaPago(Timestamp fechaPago) {
        this.fechaPago = fechaPago;
    }
    
    @Column(name="DESCRIPCION", length=100)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="VALOR", precision=53, scale=0)

    public Double getValor() {
        return this.valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
   








}
