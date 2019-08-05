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
 * TipoCodigoBarras entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_CODIGO_BARRAS"
    ,schema="FELECV3"
)

public class TipoCodigoBarras   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=8354171532479186565L;
    private Short idTipoCodigoBarras;
     private String descripcion;
     private Set<DocumentoFe> documentoFes = new HashSet<DocumentoFe>(0);


    // Constructors

    /** default constructor */
    public TipoCodigoBarras() {
    }

	/** minimal constructor */
    public TipoCodigoBarras(Short idTipoCodigoBarras) {
        this.idTipoCodigoBarras = idTipoCodigoBarras;
    }
    
    /** full constructor */
    public TipoCodigoBarras(Short idTipoCodigoBarras, String descripcion, Set<DocumentoFe> documentoFes) {
        this.idTipoCodigoBarras = idTipoCodigoBarras;
        this.descripcion = descripcion;
        this.documentoFes = documentoFes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TIPO_CODIGO_BARRAS", unique=true, nullable=false)

    public Short getIdTipoCodigoBarras() {
        return this.idTipoCodigoBarras;
    }
    
    public void setIdTipoCodigoBarras(Short idTipoCodigoBarras) {
        this.idTipoCodigoBarras = idTipoCodigoBarras;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoCodigoBarras")

    public Set<DocumentoFe> getDocumentoFes() {
        return this.documentoFes;
    }
    
    public void setDocumentoFes(Set<DocumentoFe> documentoFes) {
        this.documentoFes = documentoFes;
    }
   








}
