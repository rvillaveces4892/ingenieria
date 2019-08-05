package guru.springframework.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ConfNotificacionObligadoId entity. @author RVILLAVECES
 */
@Embeddable
public class ConfNotificacionObligadoId implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=4792638703295190089L;
    private Long nitObligado;
    private Short idTipoNotificacion;
    private Short idCanalNotificacion;

    // Constructors

    /** default constructor */
    public ConfNotificacionObligadoId(){
    }

    /** full constructor */
    /**
     * @param nitObligado
     * @param idTipoNotificacion
     * @param idCanalEnvio
     */
    public ConfNotificacionObligadoId(Long nitObligado,Short idTipoNotificacion,Short idCanalNotificacion){
        super();
        this.nitObligado=nitObligado;
        this.idTipoNotificacion=idTipoNotificacion;
        this.idCanalNotificacion=idCanalNotificacion;
    }

    @Column(name="NIT_OBLIGADO",nullable=false)
    public Long getNitObligado(){
        return nitObligado;
    }

    public void setNitObligado(Long nitObligado){
        this.nitObligado=nitObligado;
    }

    @Column(name="ID_TIPO_NOTIFICACION",nullable=false)
    public Short getIdTipoNotificacion(){
        return idTipoNotificacion;
    }

    public void setIdTipoNotificacion(Short idTipoNotificacion){
        this.idTipoNotificacion=idTipoNotificacion;
    }

    @Column(name="ID_CANAL_NOTIFICACION",nullable=false)
    public Short getIdCanalNotificacion(){
        return idCanalNotificacion;
    }

    public void setIdCanalNotificacion(Short idCanalNotificacion){
        this.idCanalNotificacion=idCanalNotificacion;
    }

}