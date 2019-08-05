//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * AccionSistema entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ACCION_SISTEMA"
    ,schema="FELECV3"
)

public class AccionSistema   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-1815607380876867123L;
    private Short idAccionSistema;
     private String descripcion;
     private Set<RegistroAccionSistema> registroAccionSistemas = new HashSet<RegistroAccionSistema>(0);


    // Constructors

    /** default constructor */
    public AccionSistema() {
    }

	/** minimal constructor */
    public AccionSistema(Short idAccionSistema) {
        this.idAccionSistema = idAccionSistema;
    }
    
    /** full constructor */
    public AccionSistema(Short idAccionSistema, String descripcion, Set<RegistroAccionSistema> registroAccionSistemas) {
        this.idAccionSistema = idAccionSistema;
        this.descripcion = descripcion;
        this.registroAccionSistemas = registroAccionSistemas;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ACCION_SISTEMA", unique=true, nullable=false)

    public Short getIdAccionSistema() {
        return this.idAccionSistema;
    }
    
    public void setIdAccionSistema(Short idAccionSistema) {
        this.idAccionSistema = idAccionSistema;
    }
    
    @Column(name="DESCRIPCION", length=30)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="accionSistema")

    public Set<RegistroAccionSistema> getRegistroAccionSistemas() {
        return this.registroAccionSistemas;
    }
    
    public void setRegistroAccionSistemas(Set<RegistroAccionSistema> registroAccionSistemas) {
        this.registroAccionSistemas = registroAccionSistemas;
    }
   








}
