//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * TipoDocumentoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_DOCUMENTO_FE"
    ,schema="FELECV3"
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoDocumentoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2634203016177601588L;
    private Short idTipoDocFe;
     private String descripcion;


    // Constructors

    /** default constructor */
    public TipoDocumentoFe() {
    }

	/** minimal constructor */
    public TipoDocumentoFe(Short idTipoDocFe) {
        this.idTipoDocFe = idTipoDocFe;
    }
    // Property accessors
    @Id 
    
    @Column(name="ID_TIPO_DOC_FE", unique=true, nullable=false)

    public Short getIdTipoDocFe() {
        return this.idTipoDocFe;
    }
    
    public void setIdTipoDocFe(Short idTipoDocFe) {
        this.idTipoDocFe = idTipoDocFe;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
