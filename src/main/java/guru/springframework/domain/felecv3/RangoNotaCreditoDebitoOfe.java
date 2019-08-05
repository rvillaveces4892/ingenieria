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
 * RangoNotaCreditoDebitoOfe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="RANGO_NOTA_CREDITO_DEBITO_OFE"
    ,schema="FELECV3"
)

public class RangoNotaCreditoDebitoOfe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=339535836794934228L;
    private RangoNotaCreditoDebitoOfeId id;
     private TipoDocumentoFe tipoDocumentoFe;
     private Long rangoInicial;
     private Long rangoFinal;


    // Constructors

    /** default constructor */
    public RangoNotaCreditoDebitoOfe() {
    }

	/** minimal constructor */
    public RangoNotaCreditoDebitoOfe(RangoNotaCreditoDebitoOfeId id, TipoDocumentoFe tipoDocumentoFe, Long rangoInicial) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.rangoInicial = rangoInicial;
    }
    
    /** full constructor */
    public RangoNotaCreditoDebitoOfe(RangoNotaCreditoDebitoOfeId id, TipoDocumentoFe tipoDocumentoFe, Long rangoInicial, Long rangoFinal) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.rangoInicial = rangoInicial;
        this.rangoFinal = rangoFinal;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ), 
        @AttributeOverride(name="prefijo", column=@Column(name="PREFIJO", nullable=false, length=12) ) } )

    public RangoNotaCreditoDebitoOfeId getId() {
        return this.id;
    }
    
    public void setId(RangoNotaCreditoDebitoOfeId id) {
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
    
    @Column(name="RANGO_INICIAL", nullable=false)

    public Long getRangoInicial() {
        return this.rangoInicial;
    }
    
    public void setRangoInicial(Long rangoInicial) {
        this.rangoInicial = rangoInicial;
    }
    
    @Column(name="RANGO_FINAL")

    public Long getRangoFinal() {
        return this.rangoFinal;
    }
    
    public void setRangoFinal(Long rangoFinal) {
        this.rangoFinal = rangoFinal;
    }
   








}
