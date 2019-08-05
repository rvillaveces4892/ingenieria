package guru.springframework.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoEnvio entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CANAL_NOTIFICACION",schema="NOTIFICACION_SELECT")
public class CanalNotificacion implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=7990532305774418066L;
    private Short idCanalNotificacion;
    private String descripcion;
    private Set<ConfNotificacionObligado> confNotificacionObligado=new HashSet<ConfNotificacionObligado>(0);

    /**
     * 
     */
    public CanalNotificacion(){
        super();
    }

    /**
     * @param idCanalNotificacion
     * @param descripcion
     */
    public CanalNotificacion(Short idCanalNotificacion,String descripcion){
        super();
        this.idCanalNotificacion=idCanalNotificacion;
        this.descripcion=descripcion;
    }

    /**
     * @param idCanalNotificacion
     * @param descripcion
     * @param confNotificacionObligado
     */
    public CanalNotificacion(Short idCanalNotificacion,String descripcion,Set<ConfNotificacionObligado> confNotificacionObligado){
        super();
        this.idCanalNotificacion=idCanalNotificacion;
        this.descripcion=descripcion;
        this.confNotificacionObligado=confNotificacionObligado;
    }

    @Id
    @Column(name="ID_CANAL_NOTIFICACION",unique=true,nullable=false)
    public Short getidCanalNotificacion(){
        return idCanalNotificacion;
    }

    public void setidCanalNotificacion(Short idCanalNotificacion){
        this.idCanalNotificacion=idCanalNotificacion;
    }

    @Column(name="DESCRIPCION",length=100)
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="canalNotificacion")
    public Set<ConfNotificacionObligado> getConfNotificacionObligado(){
        return confNotificacionObligado;
    }

    public void setConfNotificacionObligado(Set<ConfNotificacionObligado> confNotificacionObligado){
        this.confNotificacionObligado=confNotificacionObligado;
    }

}