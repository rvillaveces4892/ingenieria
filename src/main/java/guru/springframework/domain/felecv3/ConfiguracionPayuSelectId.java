//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ConfiguracionPayuSelectId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class ConfiguracionPayuSelectId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=6070628216124699406L;
    private Long identificacionObligado;
     private Long numeroResolucion;


    // Constructors

    /** default constructor */
    public ConfiguracionPayuSelectId() {
    }

    
    /** full constructor */
    public ConfiguracionPayuSelectId(Long identificacionObligado, Long numeroResolucion) {
        this.identificacionObligado = identificacionObligado;
        this.numeroResolucion = numeroResolucion;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="NUMERO_RESOLUCION", nullable=false)

    public Long getNumeroResolucion() {
        return this.numeroResolucion;
    }
    
    public void setNumeroResolucion(Long numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ConfiguracionPayuSelectId) ) return false;
		 ConfiguracionPayuSelectId castOther = ( ConfiguracionPayuSelectId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getNumeroResolucion()==castOther.getNumeroResolucion()) || ( this.getNumeroResolucion()!=null && castOther.getNumeroResolucion()!=null && this.getNumeroResolucion().equals(castOther.getNumeroResolucion()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getNumeroResolucion() == null ? 0 : this.getNumeroResolucion().hashCode() );
         return result;
   }   





}
