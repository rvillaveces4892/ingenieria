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
 * MotivoRechazoAdqOfe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MOTIVO_RECHAZO_ADQ_OFE"
    ,schema="FELECV3"
)

public class MotivoRechazoAdqOfe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-3549157225753180575L;
    private MotivoRechazoAdqOfeId id;
     private MotivoRechazo motivoRechazo;


    // Constructors

    /** default constructor */
    public MotivoRechazoAdqOfe() {
    }

    
    /** full constructor */
    public MotivoRechazoAdqOfe(MotivoRechazoAdqOfeId id, MotivoRechazo motivoRechazo) {
        this.id = id;
        this.motivoRechazo = motivoRechazo;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="identificacionAdquiriente", column=@Column(name="IDENTIFICACION_ADQUIRIENTE", nullable=false) ), 
        @AttributeOverride(name="idMotivoRechazo", column=@Column(name="ID_MOTIVO_RECHAZO", nullable=false) ) } )

    public MotivoRechazoAdqOfeId getId() {
        return this.id;
    }
    
    public void setId(MotivoRechazoAdqOfeId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_MOTIVO_RECHAZO", nullable=false, insertable=false, updatable=false)

    public MotivoRechazo getMotivoRechazo() {
        return this.motivoRechazo;
    }
    
    public void setMotivoRechazo(MotivoRechazo motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }
   








}
