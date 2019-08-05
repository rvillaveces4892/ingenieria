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
 * UltimoDocumentoValidado entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ULTIMO_DOCUMENTO_VALIDADO"
    ,schema="FELECV3"
)

public class UltimoDocumentoValidado   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-8169646044705733500L;
    private UltimoDocumentoValidadoId id;
     private TipoDocumentoFe tipoDocumentoFe;
     private TipoValidacion tipoValidacion;
     private String ultimoDocValidado;
     private Long numResoluDian;


    // Constructors

    /** default constructor */
    public UltimoDocumentoValidado() {
    }

	/** minimal constructor */
    public UltimoDocumentoValidado(UltimoDocumentoValidadoId id, TipoDocumentoFe tipoDocumentoFe, TipoValidacion tipoValidacion) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.tipoValidacion = tipoValidacion;
    }
    
    /** full constructor */
    public UltimoDocumentoValidado(UltimoDocumentoValidadoId id, TipoDocumentoFe tipoDocumentoFe, TipoValidacion tipoValidacion, String ultimoDocValidado, Long numResoluDian) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.tipoValidacion = tipoValidacion;
        this.ultimoDocValidado = ultimoDocValidado;
        this.numResoluDian = numResoluDian;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ), 
        @AttributeOverride(name="prefijo", column=@Column(name="PREFIJO", nullable=false, length=5) ), 
        @AttributeOverride(name="idTipoValidacion", column=@Column(name="ID_TIPO_VALIDACION", nullable=false) ) } )

    public UltimoDocumentoValidadoId getId() {
        return this.id;
    }
    
    public void setId(UltimoDocumentoValidadoId id) {
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
        @JoinColumn(name="ID_TIPO_VALIDACION", nullable=false, insertable=false, updatable=false)

    public TipoValidacion getTipoValidacion() {
        return this.tipoValidacion;
    }
    
    public void setTipoValidacion(TipoValidacion tipoValidacion) {
        this.tipoValidacion = tipoValidacion;
    }
    
    @Column(name="ULTIMO_DOC_VALIDADO", length=30)

    public String getUltimoDocValidado() {
        return this.ultimoDocValidado;
    }
    
    public void setUltimoDocValidado(String ultimoDocValidado) {
        this.ultimoDocValidado = ultimoDocValidado;
    }
    
    @Column(name="NUM_RESOLU_DIAN")

    public Long getNumResoluDian() {
        return this.numResoluDian;
    }
    
    public void setNumResoluDian(Long numResoluDian) {
        this.numResoluDian = numResoluDian;
    }
   








}
