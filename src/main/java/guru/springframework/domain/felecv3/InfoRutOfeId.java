//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * InfoRutOfeId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class InfoRutOfeId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2352350937240915641L;
    private Long identificacionObligado;
     private String constanteDatoRut;


    // Constructors

    /** default constructor */
    public InfoRutOfeId() {
    }

    
    /** full constructor */
    public InfoRutOfeId(Long identificacionObligado, String constanteDatoRut) {
        this.identificacionObligado = identificacionObligado;
        this.constanteDatoRut = constanteDatoRut;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="CONSTANTE_DATO_RUT", nullable=false, length=10)

    public String getConstanteDatoRut() {
        return this.constanteDatoRut;
    }
    
    public void setConstanteDatoRut(String constanteDatoRut) {
        this.constanteDatoRut = constanteDatoRut;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InfoRutOfeId) ) return false;
		 InfoRutOfeId castOther = ( InfoRutOfeId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getConstanteDatoRut()==castOther.getConstanteDatoRut()) || ( this.getConstanteDatoRut()!=null && castOther.getConstanteDatoRut()!=null && this.getConstanteDatoRut().equals(castOther.getConstanteDatoRut()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getConstanteDatoRut() == null ? 0 : this.getConstanteDatoRut().hashCode() );
         return result;
   }   





}
