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
 * CodigoFuncinalWsDian entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CODIGO_FUNCINAL_WS_DIAN"
    ,schema="FELECV3"
)

public class CodigoFuncinalWsDian   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=6250888053556328989L;
    private Long idCodigoFuncionalWsDian;
     private String descripcion;
     private Set<DetalleVerificacionDocDian> detalleVerificacionDocDians = new HashSet<DetalleVerificacionDocDian>(0);


    // Constructors

    /** default constructor */
    public CodigoFuncinalWsDian() {
    }

	/** minimal constructor */
    public CodigoFuncinalWsDian(Long idCodigoFuncionalWsDian) {
        this.idCodigoFuncionalWsDian = idCodigoFuncionalWsDian;
    }
    
    /** full constructor */
    public CodigoFuncinalWsDian(Long idCodigoFuncionalWsDian, String descripcion, Set<DetalleVerificacionDocDian> detalleVerificacionDocDians) {
        this.idCodigoFuncionalWsDian = idCodigoFuncionalWsDian;
        this.descripcion = descripcion;
        this.detalleVerificacionDocDians = detalleVerificacionDocDians;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_CODIGO_FUNCIONAL_WS_DIAN", unique=true, nullable=false)

    public Long getIdCodigoFuncionalWsDian() {
        return this.idCodigoFuncionalWsDian;
    }
    
    public void setIdCodigoFuncionalWsDian(Long idCodigoFuncionalWsDian) {
        this.idCodigoFuncionalWsDian = idCodigoFuncionalWsDian;
    }
    
    @Column(name="DESCRIPCION", length=150)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="codigoFuncinalWsDian")

    public Set<DetalleVerificacionDocDian> getDetalleVerificacionDocDians() {
        return this.detalleVerificacionDocDians;
    }
    
    public void setDetalleVerificacionDocDians(Set<DetalleVerificacionDocDian> detalleVerificacionDocDians) {
        this.detalleVerificacionDocDians = detalleVerificacionDocDians;
    }
   








}
