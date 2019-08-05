//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ChecklistAdqOfe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHECKLIST_ADQ_OFE"
    ,schema="FELECV3"
)

public class ChecklistAdqOfe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5247433749087281274L;
    private ChecklistAdqOfeId id;
     private Checklist checklist;


    // Constructors

    /** default constructor */
    public ChecklistAdqOfe() {
    }

    
    /** full constructor */
    public ChecklistAdqOfe(ChecklistAdqOfeId id, Checklist checklist) {
        this.id = id;
        this.checklist = checklist;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="identificacionAdquiriente", column=@Column(name="IDENTIFICACION_ADQUIRIENTE", nullable=false) ), 
        @AttributeOverride(name="idItemChecklist", column=@Column(name="ID_ITEM_CHECKLIST", nullable=false) ) } )

    public ChecklistAdqOfeId getId() {
        return this.id;
    }
    
    public void setId(ChecklistAdqOfeId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ITEM_CHECKLIST", nullable=false, insertable=false, updatable=false)

    public Checklist getChecklist() {
        return this.checklist;
    }
    
    public void setChecklist(Checklist checklist) {
        this.checklist = checklist;
    }
   








}
