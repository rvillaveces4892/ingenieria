//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import co.experian.computec.referencia.model.EntidadPaginacion;

/**
 * MotivoRechazoAdqOfeId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class MotivoRechazoOfeId extends EntidadPaginacion implements java.io.Serializable{

    // Fields

    /**
    * 
    */
    private static final long serialVersionUID=2366392966252477319L;
    private Long identificacionObligado;
    private Short idMotivoRechazo;

    // Constructors

    /** default constructor */
    public MotivoRechazoOfeId(){
    }

    /** full constructor */
    public MotivoRechazoOfeId(Long identificacionObligado,Short idMotivoRechazo){
        this.identificacionObligado=identificacionObligado;
        this.idMotivoRechazo=idMotivoRechazo;
    }

    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO",nullable=false)

    public Long getIdentificacionObligado(){
        return this.identificacionObligado;
    }

    public void setIdentificacionObligado(Long identificacionObligado){
        this.identificacionObligado=identificacionObligado;
    }

    @Column(name="ID_MOTIVO_RECHAZO",nullable=false)

    public Short getIdMotivoRechazo(){
        return this.idMotivoRechazo;
    }

    public void setIdMotivoRechazo(Short idMotivoRechazo){
        this.idMotivoRechazo=idMotivoRechazo;
    }

    

}
