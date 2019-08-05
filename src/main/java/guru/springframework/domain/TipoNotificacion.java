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
@Table(name="TIPO_NOTIFICACION",schema="NOTIFICACION_SELECT")
public class TipoNotificacion implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=7990532305774418066L;
    private Short idTipoNotificacion;
    private String descripcion;
    private Set<ConfNotificacionObligado> confNotificacionObligado=new HashSet<ConfNotificacionObligado>(0);

    /**
     * 
     */
    public TipoNotificacion(){
        super();
    }

    /**
     * @param idTipoNotificacion
     * @param descripcion
     */
    public TipoNotificacion(Short idTipoNotificacion,String descripcion){
        super();
        this.idTipoNotificacion=idTipoNotificacion;
        this.descripcion=descripcion;
    }

    /**
     * @param idTipoNotificacion
     * @param descripcion
     * @param confNotificacionObligado
     */
    public TipoNotificacion(Short idTipoNotificacion,String descripcion,Set<ConfNotificacionObligado> confNotificacionObligado){
        super();
        this.idTipoNotificacion=idTipoNotificacion;
        this.descripcion=descripcion;
        this.confNotificacionObligado=confNotificacionObligado;
    }

    @Id
    @Column(name="ID_TIPO_NOTIFICACION",unique=true,nullable=false)
    public Short getIdTipoNotificacion(){
        return idTipoNotificacion;
    }

    public void setIdTipoNotificacion(Short idTipoNotificacion){
        this.idTipoNotificacion=idTipoNotificacion;
    }

    @Column(name="DESCRIPCION",length=100)
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="tipoNotificacion")
    public Set<ConfNotificacionObligado> getConfNotificacionObligado(){
        return confNotificacionObligado;
    }

    public void setConfNotificacionObligado(Set<ConfNotificacionObligado> confNotificacionObligado){
        this.confNotificacionObligado=confNotificacionObligado;
    }

}