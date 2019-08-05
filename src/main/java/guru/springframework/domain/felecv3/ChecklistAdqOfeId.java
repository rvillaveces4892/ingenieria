//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ChecklistAdqOfeId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class ChecklistAdqOfeId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2479418048061867550L;
    private Long identificacionObligado;
     private Long identificacionAdquiriente;
     private Short idItemChecklist;


    // Constructors

    /** default constructor */
    public ChecklistAdqOfeId() {
    }

    
    /** full constructor */
    public ChecklistAdqOfeId(Long identificacionObligado, Long identificacionAdquiriente, Short idItemChecklist) {
        this.identificacionObligado = identificacionObligado;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.idItemChecklist = idItemChecklist;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="IDENTIFICACION_ADQUIRIENTE", nullable=false)

    public Long getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(Long identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }

    @Column(name="ID_ITEM_CHECKLIST", nullable=false)

    public Short getIdItemChecklist() {
        return this.idItemChecklist;
    }
    
    public void setIdItemChecklist(Short idItemChecklist) {
        this.idItemChecklist = idItemChecklist;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ChecklistAdqOfeId) ) return false;
		 ChecklistAdqOfeId castOther = ( ChecklistAdqOfeId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getIdentificacionAdquiriente()==castOther.getIdentificacionAdquiriente()) || ( this.getIdentificacionAdquiriente()!=null && castOther.getIdentificacionAdquiriente()!=null && this.getIdentificacionAdquiriente().equals(castOther.getIdentificacionAdquiriente()) ) )
 && ( (this.getIdItemChecklist()==castOther.getIdItemChecklist()) || ( this.getIdItemChecklist()!=null && castOther.getIdItemChecklist()!=null && this.getIdItemChecklist().equals(castOther.getIdItemChecklist()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getIdentificacionAdquiriente() == null ? 0 : this.getIdentificacionAdquiriente().hashCode() );
         result = 37 * result + ( getIdItemChecklist() == null ? 0 : this.getIdItemChecklist().hashCode() );
         return result;
   }   





}
