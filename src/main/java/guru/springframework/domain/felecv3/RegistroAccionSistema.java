//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * RegistroAccionSistema entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="REGISTRO_ACCION_SISTEMA"
    ,schema="FELECV3"
)

public class RegistroAccionSistema   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7646653357893677944L;
    private Long idRegistroAccionSistema;
     private AccionSistema accionSistema;
     private String usuario;
     private Timestamp fechaAccion;
     private Set<ParametroAccionSistema> parametroAccionSistemas = new HashSet<ParametroAccionSistema>(0);


    // Constructors

    /** default constructor */
    public RegistroAccionSistema() {
    }

	/** minimal constructor */
    public RegistroAccionSistema(Long idRegistroAccionSistema) {
        this.idRegistroAccionSistema = idRegistroAccionSistema;
    }
    
    /** full constructor */
    public RegistroAccionSistema(Long idRegistroAccionSistema, AccionSistema accionSistema, String usuario, Timestamp fechaAccion, Set<ParametroAccionSistema> parametroAccionSistemas) {
        this.idRegistroAccionSistema = idRegistroAccionSistema;
        this.accionSistema = accionSistema;
        this.usuario = usuario;
        this.fechaAccion = fechaAccion;
        this.parametroAccionSistemas = parametroAccionSistemas;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_REGISTRO_ACCION_SISTEMA", unique=true, nullable=false)

    public Long getIdRegistroAccionSistema() {
        return this.idRegistroAccionSistema;
    }
    
    public void setIdRegistroAccionSistema(Long idRegistroAccionSistema) {
        this.idRegistroAccionSistema = idRegistroAccionSistema;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ACCION_SISTEMA")

    public AccionSistema getAccionSistema() {
        return this.accionSistema;
    }
    
    public void setAccionSistema(AccionSistema accionSistema) {
        this.accionSistema = accionSistema;
    }
    
    @Column(name="USUARIO", length=80)

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @Column(name="FECHA_ACCION", length=26)

    public Timestamp getFechaAccion() {
        return this.fechaAccion;
    }
    
    public void setFechaAccion(Timestamp fechaAccion) {
        this.fechaAccion = fechaAccion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="registroAccionSistema")

    public Set<ParametroAccionSistema> getParametroAccionSistemas() {
        return this.parametroAccionSistemas;
    }
    
    public void setParametroAccionSistemas(Set<ParametroAccionSistema> parametroAccionSistemas) {
        this.parametroAccionSistemas = parametroAccionSistemas;
    }
   








}
