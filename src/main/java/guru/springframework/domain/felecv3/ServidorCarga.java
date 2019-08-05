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
 * ServidorCarga entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="SERVIDOR_CARGA"
    ,schema="FELECV3"
)

public class ServidorCarga   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7618027168541676417L;
    private Short idServidorCarga;
     private String ipServidor;
     private String descripcion;
     private Set<ConfCargaOfe> confCargaOfes = new HashSet<ConfCargaOfe>(0);


    // Constructors

    /** default constructor */
    public ServidorCarga() {
    }

	/** minimal constructor */
    public ServidorCarga(Short idServidorCarga) {
        this.idServidorCarga = idServidorCarga;
    }
    
    /** full constructor */
    public ServidorCarga(Short idServidorCarga, String ipServidor, String descripcion, Set<ConfCargaOfe> confCargaOfes) {
        this.idServidorCarga = idServidorCarga;
        this.ipServidor = ipServidor;
        this.descripcion = descripcion;
        this.confCargaOfes = confCargaOfes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_SERVIDOR_CARGA", unique=true, nullable=false)

    public Short getIdServidorCarga() {
        return this.idServidorCarga;
    }
    
    public void setIdServidorCarga(Short idServidorCarga) {
        this.idServidorCarga = idServidorCarga;
    }
    
    @Column(name="IP_SERVIDOR", length=30)

    public String getIpServidor() {
        return this.ipServidor;
    }
    
    public void setIpServidor(String ipServidor) {
        this.ipServidor = ipServidor;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="servidorCarga")

    public Set<ConfCargaOfe> getConfCargaOfes() {
        return this.confCargaOfes;
    }
    
    public void setConfCargaOfes(Set<ConfCargaOfe> confCargaOfes) {
        this.confCargaOfes = confCargaOfes;
    }
   








}
