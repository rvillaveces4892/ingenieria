//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ImpuestoSelect entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="IMPUESTO_SELECT"
    ,schema="FELECV3"
)

public class ImpuestoSelect   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2397892287784955580L;
    private ImpuestoSelectId id;
     private ImpuestoDian impuestoDian;
     private ObligadoFe obligadoFe;
     private String descripcion;
     private Double porcentaje;
     private Short retenido;


    // Constructors

    /** default constructor */
    public ImpuestoSelect() {
    }

	/** minimal constructor */
    public ImpuestoSelect(ImpuestoSelectId id, ImpuestoDian impuestoDian, ObligadoFe obligadoFe) {
        this.id = id;
        this.impuestoDian = impuestoDian;
        this.obligadoFe = obligadoFe;
    }
    
    /** full constructor */
    public ImpuestoSelect(ImpuestoSelectId id, ImpuestoDian impuestoDian, ObligadoFe obligadoFe, String descripcion, Double porcentaje, Short retenido) {
        this.id = id;
        this.impuestoDian = impuestoDian;
        this.obligadoFe = obligadoFe;
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
        this.retenido = retenido;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="codigoImpuestoSelect", column=@Column(name="CODIGO_IMPUESTO_SELECT", nullable=false, length=10) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ) } )

    public ImpuestoSelectId getId() {
        return this.id;
    }
    
    public void setId(ImpuestoSelectId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="CODIGO_IMPUESTO_DIAN", nullable=false)

    public ImpuestoDian getImpuestoDian() {
        return this.impuestoDian;
    }
    
    public void setImpuestoDian(ImpuestoDian impuestoDian) {
        this.impuestoDian = impuestoDian;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
    
    @Column(name="DESCRIPCION", length=70)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="PORCENTAJE", precision=53, scale=0)

    public Double getPorcentaje() {
        return this.porcentaje;
    }
    
    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Column(name="RETENIDO")

    public Short getRetenido() {
        return this.retenido;
    }
    
    public void setRetenido(Short retenido) {
        this.retenido = retenido;
    }
   








}
