//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * OfeAdquirienteId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class OfeAdquirienteId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-8140011599626313743L;
    private Long identificacionObligado;
     private String identificacionAdquiriente;


    // Constructors

    /** default constructor */
    public OfeAdquirienteId() {
    }

    
    /** full constructor */
    public OfeAdquirienteId(Long identificacionObligado, String identificacionAdquiriente) {
        this.identificacionObligado = identificacionObligado;
        this.identificacionAdquiriente = identificacionAdquiriente;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="IDENTIFICACION_ADQUIRIENTE", nullable=false, length=30)

    public String getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(String identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OfeAdquirienteId) ) return false;
		 OfeAdquirienteId castOther = ( OfeAdquirienteId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getIdentificacionAdquiriente()==castOther.getIdentificacionAdquiriente()) || ( this.getIdentificacionAdquiriente()!=null && castOther.getIdentificacionAdquiriente()!=null && this.getIdentificacionAdquiriente().equals(castOther.getIdentificacionAdquiriente()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getIdentificacionAdquiriente() == null ? 0 : this.getIdentificacionAdquiriente().hashCode() );
         return result;
   }   





}
