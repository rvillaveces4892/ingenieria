package guru.springframework.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ConfEnvioObligado entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONF_NOTIFICACION_OBLIGADO",schema="NOTIFICACION_SELECT")
//@Cache(region="CONFIG_ENVIO_OBLIGADO_REGION",usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ConfNotificacionObligado implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-4309350257557448139L;

    private ConfNotificacionObligadoId id;
    private CanalNotificacion canalNotificacion;
    private TipoNotificacion tipoNotificacion;
    private String sender;
    private String destino;
    private String asunto;
    private String rutaPlantilla;
    private Long calular;
    private String mensajeSms;
    private Short estado;

    /**
     * 
     */
    public ConfNotificacionObligado(){
        super();
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name="nitObligado",column=@Column(name="NIT_OBLIGADO",nullable=false)),
            @AttributeOverride(name="idTipoNotificacion",column=@Column(name="ID_TIPO_NOTIFICACION",nullable=false)),
            @AttributeOverride(name="idCanalNotificacion",column=@Column(name="ID_CANAL_NOTIFICACION",nullable=false))})
    public ConfNotificacionObligadoId getId(){
        return this.id;
    }

    public void setId(ConfNotificacionObligadoId id){
        this.id=id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CANAL_NOTIFICACION",nullable=false,insertable=false,updatable=false)
    public CanalNotificacion getCanalNotificacion(){
        return this.canalNotificacion;
    }

    public void setCanalNotificacion(CanalNotificacion canalNotificacion){
        this.canalNotificacion=canalNotificacion;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_NOTIFICACION",nullable=false,insertable=false,updatable=false)
    public TipoNotificacion getTipoNotificacion(){
        return this.tipoNotificacion;
    }

    public void setTipoNotificacion(TipoNotificacion tipoNotificacion){
        this.tipoNotificacion=tipoNotificacion;
    }

    @Column(name="SENDER",length=100)
    public String getSender(){
        return sender;
    }

    public void setSender(String sender){
        this.sender=sender;
    }

    @Column(name="DESTINO",length=200)
    public String getDestino(){
        return destino;
    }

    public void setDestino(String destino){
        this.destino=destino;
    }

    @Column(name="ASUNTO",length=100)
    public String getAsunto(){
        return asunto;
    }

    public void setAsunto(String asunto){
        this.asunto=asunto;
    }

    @Column(name="RUTA_PLANTILLA",length=300)
    public String getRutaPlantilla(){
        return rutaPlantilla;
    }

    public void setRutaPlantilla(String rutaPlantilla){
        this.rutaPlantilla=rutaPlantilla;
    }

    @Column(name="CELULAR")
    public Long getCalular(){
        return calular;
    }

    public void setCalular(Long calular){
        this.calular=calular;
    }

    @Column(name="MENSAJE_SMS",length=160)
    public String getMensajeSms(){
        return mensajeSms;
    }

    public void setMensajeSms(String mensajeSms){
        this.mensajeSms=mensajeSms;
    }

    public Short getEstado(){
        return estado;
    }

    @Column(name="ESTADO")
    public void setEstado(Short estado){
        this.estado=estado;
    }
    
    

}