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
 * CampoOpcionalDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CAMPO_OPCIONAL_DOC"
    ,schema="FELECV3"
)

public class CampoOpcionalDoc   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5287883879475192523L;
    private Short idCampoOpcionalDoc;
     private String descripcion;
     private Set<ConfDatoAdicionalDoc> confDatoAdicionalDocs = new HashSet<ConfDatoAdicionalDoc>(0);
     private Set<OpcionalDocumentoFe> opcionalDocumentoFes = new HashSet<OpcionalDocumentoFe>(0);


    // Constructors

    /** default constructor */
    public CampoOpcionalDoc() {
    }

	/** minimal constructor */
    public CampoOpcionalDoc(Short idCampoOpcionalDoc) {
        this.idCampoOpcionalDoc = idCampoOpcionalDoc;
    }
    
    /** full constructor */
    public CampoOpcionalDoc(Short idCampoOpcionalDoc, String descripcion, Set<ConfDatoAdicionalDoc> confDatoAdicionalDocs, Set<OpcionalDocumentoFe> opcionalDocumentoFes) {
        this.idCampoOpcionalDoc = idCampoOpcionalDoc;
        this.descripcion = descripcion;
        this.confDatoAdicionalDocs = confDatoAdicionalDocs;
        this.opcionalDocumentoFes = opcionalDocumentoFes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_CAMPO_OPCIONAL_DOC", unique=true, nullable=false)

    public Short getIdCampoOpcionalDoc() {
        return this.idCampoOpcionalDoc;
    }
    
    public void setIdCampoOpcionalDoc(Short idCampoOpcionalDoc) {
        this.idCampoOpcionalDoc = idCampoOpcionalDoc;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="campoOpcionalDoc")

    public Set<ConfDatoAdicionalDoc> getConfDatoAdicionalDocs() {
        return this.confDatoAdicionalDocs;
    }
    
    public void setConfDatoAdicionalDocs(Set<ConfDatoAdicionalDoc> confDatoAdicionalDocs) {
        this.confDatoAdicionalDocs = confDatoAdicionalDocs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="campoOpcionalDoc")

    public Set<OpcionalDocumentoFe> getOpcionalDocumentoFes() {
        return this.opcionalDocumentoFes;
    }
    
    public void setOpcionalDocumentoFes(Set<OpcionalDocumentoFe> opcionalDocumentoFes) {
        this.opcionalDocumentoFes = opcionalDocumentoFes;
    }
   








}
