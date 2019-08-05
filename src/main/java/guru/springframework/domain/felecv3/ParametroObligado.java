//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ParametroObligado entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="PARAMETRO_OBLIGADO"
    ,schema="FELECV3"
)

public class ParametroObligado   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6237053989830978834L;
    private Long idParametroObligado;
     private Parametros parametros;
     private Long identificacionObligado;
     private Short activo;


    // Constructors

    /** default constructor */
    public ParametroObligado() {
    }

	/** minimal constructor */
    public ParametroObligado(Long idParametroObligado, Long identificacionObligado) {
        this.idParametroObligado = idParametroObligado;
        this.identificacionObligado = identificacionObligado;
    }
    
    /** full constructor */
    public ParametroObligado(Long idParametroObligado, Parametros parametros, Long identificacionObligado, Short activo) {
        this.idParametroObligado = idParametroObligado;
        this.parametros = parametros;
        this.identificacionObligado = identificacionObligado;
        this.activo = activo;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_PARAMETRO_OBLIGADO", unique=true, nullable=false)

    public Long getIdParametroObligado() {
        return this.idParametroObligado;
    }
    
    public void setIdParametroObligado(Long idParametroObligado) {
        this.idParametroObligado = idParametroObligado;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_PARAMETRO")

    public Parametros getParametros() {
        return this.parametros;
    }
    
    public void setParametros(Parametros parametros) {
        this.parametros = parametros;
    }
    
    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
    
    @Column(name="ACTIVO")

    public Short getActivo() {
        return this.activo;
    }
    
    public void setActivo(Short activo) {
        this.activo = activo;
    }
   








}
