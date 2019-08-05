//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ConfigArchivoSelectClienteId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class ConfigArchivoSelectClienteId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-8211393442132648346L;
    private Long identificacionObligado;
     private Long numResoluDian;
     private Short idTipoDocFe;
     private String tipoEtiqueta;
     private Short posicionCampoLineaSelectDestino;


    // Constructors

    /** default constructor */
    public ConfigArchivoSelectClienteId() {
    }

    
    /** full constructor */
    public ConfigArchivoSelectClienteId(Long identificacionObligado, Long numResoluDian, Short idTipoDocFe, String tipoEtiqueta, Short posicionCampoLineaSelectDestino) {
        this.identificacionObligado = identificacionObligado;
        this.numResoluDian = numResoluDian;
        this.idTipoDocFe = idTipoDocFe;
        this.tipoEtiqueta = tipoEtiqueta;
        this.posicionCampoLineaSelectDestino = posicionCampoLineaSelectDestino;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    @Column(name="NUM_RESOLU_DIAN", nullable=false)

    public Long getNumResoluDian() {
        return this.numResoluDian;
    }
    
    public void setNumResoluDian(Long numResoluDian) {
        this.numResoluDian = numResoluDian;
    }

    @Column(name="ID_TIPO_DOC_FE", nullable=false)

    public Short getIdTipoDocFe() {
        return this.idTipoDocFe;
    }
    
    public void setIdTipoDocFe(Short idTipoDocFe) {
        this.idTipoDocFe = idTipoDocFe;
    }

    @Column(name="TIPO_ETIQUETA", nullable=false, length=25)

    public String getTipoEtiqueta() {
        return this.tipoEtiqueta;
    }
    
    public void setTipoEtiqueta(String tipoEtiqueta) {
        this.tipoEtiqueta = tipoEtiqueta;
    }

    @Column(name="POSICION_CAMPO_LINEA_SELECT_DESTINO", nullable=false)

    public Short getPosicionCampoLineaSelectDestino() {
        return this.posicionCampoLineaSelectDestino;
    }
    
    public void setPosicionCampoLineaSelectDestino(Short posicionCampoLineaSelectDestino) {
        this.posicionCampoLineaSelectDestino = posicionCampoLineaSelectDestino;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ConfigArchivoSelectClienteId) ) return false;
		 ConfigArchivoSelectClienteId castOther = ( ConfigArchivoSelectClienteId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getNumResoluDian()==castOther.getNumResoluDian()) || ( this.getNumResoluDian()!=null && castOther.getNumResoluDian()!=null && this.getNumResoluDian().equals(castOther.getNumResoluDian()) ) )
 && ( (this.getIdTipoDocFe()==castOther.getIdTipoDocFe()) || ( this.getIdTipoDocFe()!=null && castOther.getIdTipoDocFe()!=null && this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe()) ) )
 && ( (this.getTipoEtiqueta()==castOther.getTipoEtiqueta()) || ( this.getTipoEtiqueta()!=null && castOther.getTipoEtiqueta()!=null && this.getTipoEtiqueta().equals(castOther.getTipoEtiqueta()) ) )
 && ( (this.getPosicionCampoLineaSelectDestino()==castOther.getPosicionCampoLineaSelectDestino()) || ( this.getPosicionCampoLineaSelectDestino()!=null && castOther.getPosicionCampoLineaSelectDestino()!=null && this.getPosicionCampoLineaSelectDestino().equals(castOther.getPosicionCampoLineaSelectDestino()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getNumResoluDian() == null ? 0 : this.getNumResoluDian().hashCode() );
         result = 37 * result + ( getIdTipoDocFe() == null ? 0 : this.getIdTipoDocFe().hashCode() );
         result = 37 * result + ( getTipoEtiqueta() == null ? 0 : this.getTipoEtiqueta().hashCode() );
         result = 37 * result + ( getPosicionCampoLineaSelectDestino() == null ? 0 : this.getPosicionCampoLineaSelectDestino().hashCode() );
         return result;
   }   





}
