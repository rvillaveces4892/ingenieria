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
 * EstadoDocumentoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_DOCUMENTO_FE"
    ,schema="FELECV3"
)

public class EstadoDocumentoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=3181966652524545918L;
    private Short idEstado;
     private String descripcion;
     private Set<DocumentoFe> documentoFes = new HashSet<DocumentoFe>(0);


    // Constructors

    /** default constructor */
    public EstadoDocumentoFe() {
    }

	/** minimal constructor */
    public EstadoDocumentoFe(Short idEstado) {
        this.idEstado = idEstado;
    }
    
    /** full constructor */
    public EstadoDocumentoFe(Short idEstado, String descripcion, Set<DocumentoFe> documentoFes) {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
        this.documentoFes = documentoFes;
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
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoDocumentoFe")

    public Set<DocumentoFe> getDocumentoFes() {
        return this.documentoFes;
    }
    
    public void setDocumentoFes(Set<DocumentoFe> documentoFes) {
        this.documentoFes = documentoFes;
    }
   








}
