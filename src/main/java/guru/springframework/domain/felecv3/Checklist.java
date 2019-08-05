//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * Checklist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHECKLIST"
    ,schema="FELECV3"
)

public class Checklist   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=1701836246679896274L;
    private Short idItemChecklist;
     private TipoDocumentoFe tipoDocumentoFe;
     private String descripcion;
     private Short obligatorio;
     private Set<ChecklistAdqOfe> checklistAdqOfes = new HashSet<ChecklistAdqOfe>(0);


    // Constructors

    /** default constructor */
    public Checklist() {
    }

	/** minimal constructor */
    public Checklist(Short idItemChecklist) {
        this.idItemChecklist = idItemChecklist;
    }
    
    /** full constructor */
    public Checklist(Short idItemChecklist, TipoDocumentoFe tipoDocumentoFe, String descripcion, Short obligatorio, Set<ChecklistAdqOfe> checklistAdqOfes) {
        this.idItemChecklist = idItemChecklist;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.descripcion = descripcion;
        this.obligatorio = obligatorio;
        this.checklistAdqOfes = checklistAdqOfes;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_ITEM_CHECKLIST", unique=true, nullable=false)
    
    public Short getIdItemChecklist() {
        return this.idItemChecklist;
    }
    
    public void setIdItemChecklist(Short idItemChecklist) {
        this.idItemChecklist = idItemChecklist;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_DOC_FE")

    public TipoDocumentoFe getTipoDocumentoFe() {
        return this.tipoDocumentoFe;
    }
    
    public void setTipoDocumentoFe(TipoDocumentoFe tipoDocumentoFe) {
        this.tipoDocumentoFe = tipoDocumentoFe;
    }
    
    @Column(name="DESCRIPCION", length=120)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="OBLIGATORIO")

    public Short getObligatorio() {
        return this.obligatorio;
    }
    
    public void setObligatorio(Short obligatorio) {
        this.obligatorio = obligatorio;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="checklist")

    public Set<ChecklistAdqOfe> getChecklistAdqOfes() {
        return this.checklistAdqOfes;
    }
    
    public void setChecklistAdqOfes(Set<ChecklistAdqOfe> checklistAdqOfes) {
        this.checklistAdqOfes = checklistAdqOfes;
    }
   








}
