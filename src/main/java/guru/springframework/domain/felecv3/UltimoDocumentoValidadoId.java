//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * UltimoDocumentoValidadoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class UltimoDocumentoValidadoId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=4136795775923255229L;
    private Long identificacionObligado;
     private Short idTipoDocFe;
     private String prefijo;
     private Short idTipoValidacion;


    // Constructors

    /** default constructor */
    public UltimoDocumentoValidadoId() {
    }

    
    /** full constructor */
    public UltimoDocumentoValidadoId(Long identificacionObligado, Short idTipoDocFe, String prefijo, Short idTipoValidacion) {
        this.identificacionObligado = identificacionObligado;
        this.idTipoDocFe = idTipoDocFe;
        this.prefijo = prefijo;
        this.idTipoValidacion = idTipoValidacion;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="ID_TIPO_DOC_FE", nullable=false)

    public Short getIdTipoDocFe() {
        return this.idTipoDocFe;
    }
    
    public void setIdTipoDocFe(Short idTipoDocFe) {
        this.idTipoDocFe = idTipoDocFe;
    }

    @Column(name="PREFIJO", nullable=false, length=5)

    public String getPrefijo() {
        return this.prefijo;
    }
    
    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    @Column(name="ID_TIPO_VALIDACION", nullable=false)

    public Short getIdTipoValidacion() {
        return this.idTipoValidacion;
    }
    
    public void setIdTipoValidacion(Short idTipoValidacion) {
        this.idTipoValidacion = idTipoValidacion;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UltimoDocumentoValidadoId) ) return false;
		 UltimoDocumentoValidadoId castOther = ( UltimoDocumentoValidadoId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getIdTipoDocFe()==castOther.getIdTipoDocFe()) || ( this.getIdTipoDocFe()!=null && castOther.getIdTipoDocFe()!=null && this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe()) ) )
 && ( (this.getPrefijo()==castOther.getPrefijo()) || ( this.getPrefijo()!=null && castOther.getPrefijo()!=null && this.getPrefijo().equals(castOther.getPrefijo()) ) )
 && ( (this.getIdTipoValidacion()==castOther.getIdTipoValidacion()) || ( this.getIdTipoValidacion()!=null && castOther.getIdTipoValidacion()!=null && this.getIdTipoValidacion().equals(castOther.getIdTipoValidacion()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getIdTipoDocFe() == null ? 0 : this.getIdTipoDocFe().hashCode() );
         result = 37 * result + ( getPrefijo() == null ? 0 : this.getPrefijo().hashCode() );
         result = 37 * result + ( getIdTipoValidacion() == null ? 0 : this.getIdTipoValidacion().hashCode() );
         return result;
   }   





}
