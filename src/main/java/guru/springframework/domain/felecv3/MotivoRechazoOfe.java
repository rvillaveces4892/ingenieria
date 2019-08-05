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
 * MotivoRechazoDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MOTIVO_RECHAZO_OFE",schema="FELECV3")

public class MotivoRechazoOfe extends EntidadPaginacion implements java.io.Serializable{

    // Fields

    /**
    * 
    */
    private static final long serialVersionUID=-5286461131821106353L;
    private MotivoRechazoOfeId id;
    private Short emision;
    private MotivoRechazo motivoRechazo;

    // Constructors

    /** default constructor */
    public MotivoRechazoOfe(){
    }

    /**
     * @param identificacionObligado
     * @param emision
     * @param motivoRechazo
     */
    public MotivoRechazoOfe(Short emision,MotivoRechazo motivoRechazo){
        super();
        this.emision=emision;
        this.motivoRechazo=motivoRechazo;
    }
    
 // Property accessors
    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="idMotivoRechazo", column=@Column(name="ID_MOTIVO_RECHAZO", nullable=false) ) } )

    public MotivoRechazoOfeId getId() {
        return this.id;
    }
    
    public void setId(MotivoRechazoOfeId id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_MOTIVO_RECHAZO",insertable=false,updatable=false,nullable=false)
    public MotivoRechazo getMotivoRechazo(){
        return this.motivoRechazo;
    }

    public void setMotivoRechazo(MotivoRechazo motivoRechazo){
        this.motivoRechazo=motivoRechazo;
    }

    @Column(name="EMISION")
    public Short getEmision(){
        return emision;
    }

    public void setEmision(Short emision){
        this.emision=emision;
    }


}
