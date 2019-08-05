//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EstadoCargaDocFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_CARGA_DOC_FE"
    ,schema="FELECV3"
)

public class EstadoCargaDocFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=4676274761497128971L;
    private Short idEstado;
     private String descripcion;


    // Constructors

    /** default constructor */
    public EstadoCargaDocFe() {
    }

	/** minimal constructor */
    public EstadoCargaDocFe(Short idEstado) {
        this.idEstado = idEstado;
    }
    

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ESTADO", unique=true, nullable=false)

    public Short getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(Short idEstado) {
        this.idEstado = idEstado;
    }
    
    @Column(name="DESCRIPCION", length=20)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;

    }






}
