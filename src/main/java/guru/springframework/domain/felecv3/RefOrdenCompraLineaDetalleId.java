//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * RefOrdenCompraLineaDetalleId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class RefOrdenCompraLineaDetalleId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-117125220087192075L;
    private Long identificacionObligado;
     private Long numResoluDian;
     private Short idTipoDocFe;
     private String noDocumento;
     private Integer idDetalleDoc;
     private Short idRefOrdenCompraLineaDetalle;


    // Constructors

    /** default constructor */
    public RefOrdenCompraLineaDetalleId() {
    }

    
    /** full constructor */
    public RefOrdenCompraLineaDetalleId(Long identificacionObligado, Long numResoluDian, Short idTipoDocFe, String noDocumento, Integer idDetalleDoc, Short idRefOrdenCompraLineaDetalle) {
        this.identificacionObligado = identificacionObligado;
        this.numResoluDian = numResoluDian;
        this.idTipoDocFe = idTipoDocFe;
        this.noDocumento = noDocumento;
        this.idDetalleDoc = idDetalleDoc;
        this.idRefOrdenCompraLineaDetalle = idRefOrdenCompraLineaDetalle;
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

    @Column(name="NO_DOCUMENTO", nullable=false, length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    @Column(name="ID_DETALLE_DOC", nullable=false)

    public Integer getIdDetalleDoc() {
        return this.idDetalleDoc;
    }
    
    public void setIdDetalleDoc(Integer idDetalleDoc) {
        this.idDetalleDoc = idDetalleDoc;
    }

    @Column(name="ID_REF_ORDEN_COMPRA_LINEA_DETALLE", nullable=false)

    public Short getIdRefOrdenCompraLineaDetalle() {
        return this.idRefOrdenCompraLineaDetalle;
    }
    
    public void setIdRefOrdenCompraLineaDetalle(Short idRefOrdenCompraLineaDetalle) {
        this.idRefOrdenCompraLineaDetalle = idRefOrdenCompraLineaDetalle;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RefOrdenCompraLineaDetalleId) ) return false;
		 RefOrdenCompraLineaDetalleId castOther = ( RefOrdenCompraLineaDetalleId ) other; 
         
		 return ( (this.getIdentificacionObligado()==castOther.getIdentificacionObligado()) || ( this.getIdentificacionObligado()!=null && castOther.getIdentificacionObligado()!=null && this.getIdentificacionObligado().equals(castOther.getIdentificacionObligado()) ) )
 && ( (this.getNumResoluDian()==castOther.getNumResoluDian()) || ( this.getNumResoluDian()!=null && castOther.getNumResoluDian()!=null && this.getNumResoluDian().equals(castOther.getNumResoluDian()) ) )
 && ( (this.getIdTipoDocFe()==castOther.getIdTipoDocFe()) || ( this.getIdTipoDocFe()!=null && castOther.getIdTipoDocFe()!=null && this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe()) ) )
 && ( (this.getNoDocumento()==castOther.getNoDocumento()) || ( this.getNoDocumento()!=null && castOther.getNoDocumento()!=null && this.getNoDocumento().equals(castOther.getNoDocumento()) ) )
 && ( (this.getIdDetalleDoc()==castOther.getIdDetalleDoc()) || ( this.getIdDetalleDoc()!=null && castOther.getIdDetalleDoc()!=null && this.getIdDetalleDoc().equals(castOther.getIdDetalleDoc()) ) )
 && ( (this.getIdRefOrdenCompraLineaDetalle()==castOther.getIdRefOrdenCompraLineaDetalle()) || ( this.getIdRefOrdenCompraLineaDetalle()!=null && castOther.getIdRefOrdenCompraLineaDetalle()!=null && this.getIdRefOrdenCompraLineaDetalle().equals(castOther.getIdRefOrdenCompraLineaDetalle()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionObligado() == null ? 0 : this.getIdentificacionObligado().hashCode() );
         result = 37 * result + ( getNumResoluDian() == null ? 0 : this.getNumResoluDian().hashCode() );
         result = 37 * result + ( getIdTipoDocFe() == null ? 0 : this.getIdTipoDocFe().hashCode() );
         result = 37 * result + ( getNoDocumento() == null ? 0 : this.getNoDocumento().hashCode() );
         result = 37 * result + ( getIdDetalleDoc() == null ? 0 : this.getIdDetalleDoc().hashCode() );
         result = 37 * result + ( getIdRefOrdenCompraLineaDetalle() == null ? 0 : this.getIdRefOrdenCompraLineaDetalle().hashCode() );
         return result;
   }   





}
