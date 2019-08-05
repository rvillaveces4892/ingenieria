package guru.springframework.domain.manual;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * EstadoDocumentoManual entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_DOCUMENTO_MANUAL"
    ,schema="FELECV3"
)

public class EstadoDocumentoManual  implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID=3138157735075993152L;
    
    // Fields    

     private Short idEstado;
     private String descripcion;
     private Set<DocumentoManual> documentoManuals = new HashSet<DocumentoManual>(0);


    // Constructors

    /** default constructor */
    public EstadoDocumentoManual() {
    }

	/** minimal constructor */
    public EstadoDocumentoManual(Short idEstado) {
        this.idEstado = idEstado;
    }
    
    /** full constructor */
    public EstadoDocumentoManual(Short idEstado, String descripcion, Set<DocumentoManual> documentoManuals) {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
        this.documentoManuals = documentoManuals;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoDocumentoManual")

    public Set<DocumentoManual> getDocumentoManuals() {
        return this.documentoManuals;
    }
    
    public void setDocumentoManuals(Set<DocumentoManual> documentoManuals) {
        this.documentoManuals = documentoManuals;
    }
   








}