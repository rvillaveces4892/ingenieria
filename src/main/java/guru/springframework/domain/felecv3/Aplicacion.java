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
 * Aplicacion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="APLICACION"
    ,schema="FELECV3"
)

public class Aplicacion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=1041415895772136256L;
    private Short idAplicacion;
     private String descripcion;
     private Set<WsConfigDian> wsConfigDians = new HashSet<WsConfigDian>(0);


    // Constructors

    /** default constructor */
    public Aplicacion() {
    }

	/** minimal constructor */
    public Aplicacion(Short idAplicacion) {
        this.idAplicacion = idAplicacion;
    }
    
    /** full constructor */
    public Aplicacion(Short idAplicacion, String descripcion, Set<WsConfigDian> wsConfigDians) {
        this.idAplicacion = idAplicacion;
        this.descripcion = descripcion;
        this.wsConfigDians = wsConfigDians;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_APLICACION", unique=true, nullable=false)

    public Short getIdAplicacion() {
        return this.idAplicacion;
    }
    
    public void setIdAplicacion(Short idAplicacion) {
        this.idAplicacion = idAplicacion;
    }
    
    @Column(name="DESCRIPCION", length=100)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="aplicacion")

    public Set<WsConfigDian> getWsConfigDians() {
        return this.wsConfigDians;
    }
    
    public void setWsConfigDians(Set<WsConfigDian> wsConfigDians) {
        this.wsConfigDians = wsConfigDians;
    }
   








}
