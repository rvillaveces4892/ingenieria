//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;
import guru.springframework.domain.manual.DocumentoManual;


/**
 * TipoConceptoNotaFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_CONCEPTO_NOTA_FE"
    ,schema="FELECV3"
)

public class TipoConceptoNotaFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=6803755152482204878L;
    private TipoConceptoNotaFeId id;
     private String descripcion;
     private Set<DocumentoManual> documentoManuals = new HashSet<DocumentoManual>(0);
     private Set<DocumentoFe> documentoFes = new HashSet<DocumentoFe>(0);


    // Constructors

    /** default constructor */
    public TipoConceptoNotaFe() {
    }

	/** minimal constructor */
    public TipoConceptoNotaFe(TipoConceptoNotaFeId id) {
        this.id = id;
    }
    
    /** full constructor */
    public TipoConceptoNotaFe(TipoConceptoNotaFeId id, String descripcion, Set<DocumentoManual> documentoManuals, Set<DocumentoFe> documentoFes) {
        this.id = id;
        this.descripcion = descripcion;
        this.documentoManuals = documentoManuals;
        this.documentoFes = documentoFes;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idTipoConceptoNota", column=@Column(name="ID_TIPO_CONCEPTO_NOTA", nullable=false) ), 
        @AttributeOverride(name="codigoConcepto", column=@Column(name="CODIGO_CONCEPTO", nullable=false) ) } )

    public TipoConceptoNotaFeId getId() {
        return this.id;
    }
    
    public void setId(TipoConceptoNotaFeId id) {
        this.id = id;
    }
    
    @Column(name="DESCRIPCION", length=100)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoConceptoNotaFe")

    public Set<DocumentoManual> getDocumentoManuals() {
        return this.documentoManuals;
    }
    
    public void setDocumentoManuals(Set<DocumentoManual> documentoManuals) {
        this.documentoManuals = documentoManuals;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoConceptoNotaFe")

    public Set<DocumentoFe> getDocumentoFes() {
        return this.documentoFes;
    }
    
    public void setDocumentoFes(Set<DocumentoFe> documentoFes) {
        this.documentoFes = documentoFes;
    }
   








}
