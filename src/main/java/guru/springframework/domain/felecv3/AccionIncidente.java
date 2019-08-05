//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * AccionIncidente entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ACCION_INCIDENTE"
    ,schema="FELECV3"
)

public class AccionIncidente   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=3806217796317371646L;
    private Short idAccionIncidente;
     private String descripcion;


    // Constructors

    /** default constructor */
    public AccionIncidente() {
    }

	/** minimal constructor */
    public AccionIncidente(Short idAccionIncidente) {
        this.idAccionIncidente = idAccionIncidente;
    }
    
    /** full constructor */
    public AccionIncidente(Short idAccionIncidente, String descripcion) {
        this.idAccionIncidente = idAccionIncidente;
        this.descripcion = descripcion;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ACCION_INCIDENTE", unique=true, nullable=false)

    public Short getIdAccionIncidente() {
        return this.idAccionIncidente;
    }
    
    public void setIdAccionIncidente(Short idAccionIncidente) {
        this.idAccionIncidente = idAccionIncidente;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   








}
