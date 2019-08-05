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
 * ParametroAccionSistema entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="PARAMETRO_ACCION_SISTEMA"
    ,schema="FELECV3"
)

public class ParametroAccionSistema   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5986923620337017870L;
    private Long idParaAccion;
     private RegistroAccionSistema registroAccionSistema;
     private String parametro;
     private String valor;


    // Constructors

    /** default constructor */
    public ParametroAccionSistema() {
    }

	/** minimal constructor */
    public ParametroAccionSistema(Long idParaAccion, RegistroAccionSistema registroAccionSistema, String parametro) {
        this.idParaAccion = idParaAccion;
        this.registroAccionSistema = registroAccionSistema;
        this.parametro = parametro;
    }
    
    /** full constructor */
    public ParametroAccionSistema(Long idParaAccion, RegistroAccionSistema registroAccionSistema, String parametro, String valor) {
        this.idParaAccion = idParaAccion;
        this.registroAccionSistema = registroAccionSistema;
        this.parametro = parametro;
        this.valor = valor;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_PARA_ACCION", unique=true, nullable=false)

    public Long getIdParaAccion() {
        return this.idParaAccion;
    }
    
    public void setIdParaAccion(Long idParaAccion) {
        this.idParaAccion = idParaAccion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_REGISTRO_ACCION_SISTEMA", nullable=false)

    public RegistroAccionSistema getRegistroAccionSistema() {
        return this.registroAccionSistema;
    }
    
    public void setRegistroAccionSistema(RegistroAccionSistema registroAccionSistema) {
        this.registroAccionSistema = registroAccionSistema;
    }
    
    @Column(name="PARAMETRO", nullable=false, length=30)

    public String getParametro() {
        return this.parametro;
    }
    
    public void setParametro(String parametro) {
        this.parametro = parametro;
    }
    
    @Column(name="VALOR", length=80)

    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
   








}
