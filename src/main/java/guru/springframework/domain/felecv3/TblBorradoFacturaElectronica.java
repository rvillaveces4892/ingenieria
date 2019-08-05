//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * TblBorradoFacturaElectronica entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TBL_BORRADO_FACTURA_ELECTRONICA"
    ,schema="FELECV3"
)

public class TblBorradoFacturaElectronica   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-4158522329464755260L;
    private TblBorradoFacturaElectronicaId id;


    // Constructors

    /** default constructor */
    public TblBorradoFacturaElectronica() {
    }

    
    /** full constructor */
    public TblBorradoFacturaElectronica(TblBorradoFacturaElectronicaId id) {
        this.id = id;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="numResolucion", column=@Column(name="NUM_RESOLUCION", nullable=false) ), 
        @AttributeOverride(name="idTipoDoc", column=@Column(name="ID_TIPO_DOC", nullable=false) ) } )

    public TblBorradoFacturaElectronicaId getId() {
        return this.id;
    }
    
    public void setId(TblBorradoFacturaElectronicaId id) {
        this.id = id;
    }
   








}
