//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * MotivoRechazoAdqOfeId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class MotivoRechazoAdqOfeId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=2366392966252477319L;
    private Long identificacionObligado;
     private Long identificacionAdquiriente;
     private Short idMotivoRechazo;


    // Constructors

    /** default constructor */
    public MotivoRechazoAdqOfeId() {
    }

    
    /** full constructor */
    public MotivoRechazoAdqOfeId(Long identificacionObligado, Long identificacionAdquiriente, Short idMotivoRechazo) {
        this.identificacionObligado = identificacionObligado;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.idMotivoRechazo = idMotivoRechazo;
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

    @Column(name="ID_MOTIVO_RECHAZO", nullable=false)

    public Short getIdMotivoRechazo() {
        return this.idMotivoRechazo;
    }
    
    public void setIdMotivoRechazo(Short idMotivoRechazo) {
        this.idMotivoRechazo = idMotivoRechazo;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MotivoRechazoAdqOfeId) ) return false;
		 MotivoRechazoAdqOfeId castOther = ( MotivoRechazoAdqOfeId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getIdentificacionAdquiriente()==castOther.getIdentificacionAdquiriente()) || ( this.getIdentificacionAdquiriente()!=null && castOther.getIdentificacionAdquiriente()!=null && this.getIdentificacionAdquiriente().equals(castOther.getIdentificacionAdquiriente()) ) )
 && ( (this.getIdMotivoRechazo()==castOther.getIdMotivoRechazo()) || ( this.getIdMotivoRechazo()!=null && castOther.getIdMotivoRechazo()!=null && this.getIdMotivoRechazo().equals(castOther.getIdMotivoRechazo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getIdentificacionAdquiriente() == null ? 0 : this.getIdentificacionAdquiriente().hashCode() );
         result = 37 * result + ( getIdMotivoRechazo() == null ? 0 : this.getIdMotivoRechazo().hashCode() );
         return result;
   }   





}
