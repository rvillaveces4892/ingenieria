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
 * CargosDocumentoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CARGOS_DOCUMENTO_FE"
    ,schema="FELECV3"
)

public class CargosDocumentoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=1065945930211076291L;
    private CargosDocumentoFeId id;
     private DocumentoFe documentoFe;
     private Timestamp fechaCargo;
     private String razonCargo;
     private Double porcentaje;
     private Double baseCargo;
     private Double valorCargo;


    // Constructors

    /** default constructor */
    public CargosDocumentoFe() {
    }

	/** minimal constructor */
    public CargosDocumentoFe(CargosDocumentoFeId id, DocumentoFe documentoFe) {
        this.id = id;
        this.documentoFe = documentoFe;
    }
    
    /** full constructor */
    public CargosDocumentoFe(CargosDocumentoFeId id, DocumentoFe documentoFe, Timestamp fechaCargo, String razonCargo, Double porcentaje, Double baseCargo, Double valorCargo) {
        this.id = id;
        this.documentoFe = documentoFe;
        this.fechaCargo = fechaCargo;
        this.razonCargo = razonCargo;
        this.porcentaje = porcentaje;
        this.baseCargo = baseCargo;
        this.valorCargo = valorCargo;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idCargoDoc", column=@Column(name="ID_CARGO_DOC", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ) } )

    public CargosDocumentoFeId getId() {
        return this.id;
    }
    
    public void setId(CargosDocumentoFeId id) {
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
    
    @Column(name="FECHA_CARGO", length=26)

    public Timestamp getFechaCargo() {
        return this.fechaCargo;
    }
    
    public void setFechaCargo(Timestamp fechaCargo) {
        this.fechaCargo = fechaCargo;
    }
    
    @Column(name="RAZON_CARGO", length=100)

    public String getRazonCargo() {
        return this.razonCargo;
    }
    
    public void setRazonCargo(String razonCargo) {
        this.razonCargo = razonCargo;
    }
    
    @Column(name="PORCENTAJE", precision=53, scale=0)

    public Double getPorcentaje() {
        return this.porcentaje;
    }
    
    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Column(name="BASE_CARGO", precision=53, scale=0)

    public Double getBaseCargo() {
        return this.baseCargo;
    }
    
    public void setBaseCargo(Double baseCargo) {
        this.baseCargo = baseCargo;
    }
    
    @Column(name="VALOR_CARGO", precision=53, scale=0)

    public Double getValorCargo() {
        return this.valorCargo;
    }
    
    public void setValorCargo(Double valorCargo) {
        this.valorCargo = valorCargo;
    }
   








}
