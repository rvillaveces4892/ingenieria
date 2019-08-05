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
 * OrigenCarga entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ORIGEN_CARGA"
    ,schema="FELECV3"
)

public class OrigenCarga   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=328075709613844073L;
    private Short idOrigenCarga;
     private String descripcion;
     private Set<RegistroDocumentoRecepcion> registroDocumentoRecepcions = new HashSet<RegistroDocumentoRecepcion>(0);


    // Constructors

    /** default constructor */
    public OrigenCarga() {
    }

	/** minimal constructor */
    public OrigenCarga(Short idOrigenCarga) {
        this.idOrigenCarga = idOrigenCarga;
    }
    
    /** full constructor */
    public OrigenCarga(Short idOrigenCarga, String descripcion, Set<RegistroDocumentoRecepcion> registroDocumentoRecepcions) {
        this.idOrigenCarga = idOrigenCarga;
        this.descripcion = descripcion;
        this.registroDocumentoRecepcions = registroDocumentoRecepcions;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ORIGEN_CARGA", unique=true, nullable=false)

    public Short getIdOrigenCarga() {
        return this.idOrigenCarga;
    }
    
    public void setIdOrigenCarga(Short idOrigenCarga) {
        this.idOrigenCarga = idOrigenCarga;
    }
    
    @Column(name="DESCRIPCION", length=120)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="origenCarga")

    public Set<RegistroDocumentoRecepcion> getRegistroDocumentoRecepcions() {
        return this.registroDocumentoRecepcions;
    }
    
    public void setRegistroDocumentoRecepcions(Set<RegistroDocumentoRecepcion> registroDocumentoRecepcions) {
        this.registroDocumentoRecepcions = registroDocumentoRecepcions;
    }
   








}
