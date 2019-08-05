package guru.springframework.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ConfEnviadorTipoEnvio entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONF_ENVIADOR_TIPO_ENVIO",schema="ENVIO_SELECT")
public class ConfEnviadorTipoEnvio implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-1478982622435191525L;
    private Integer idConfTipoEnvio;
    private Enviador enviador;
    private TipoEnvio tipoEnvio;
    private String endPointServicioEmail;
    private String endPointServicioTracking;
    private String contratoServicioEmail;
    private String contratoServicioSms;
    private String descripcion;

    // Constructors

    /** default constructor */
    public ConfEnviadorTipoEnvio(){
    }

    /** minimal constructor */
    public ConfEnviadorTipoEnvio(Integer idConfTipoEnvio,Enviador enviador,TipoEnvio tipoEnvio){
        this.idConfTipoEnvio=idConfTipoEnvio;
        this.enviador=enviador;
        this.tipoEnvio=tipoEnvio;
    }

    /** full constructor */
    public ConfEnviadorTipoEnvio(Integer idConfTipoEnvio,Enviador enviador,TipoEnvio tipoEnvio,String endPointServicioEmail,String endPointServicioTracking,String contratoServicioEmail,String contratoServicioSms,String descripcion){
        this.idConfTipoEnvio=idConfTipoEnvio;
        this.enviador=enviador;
        this.tipoEnvio=tipoEnvio;
        this.endPointServicioEmail=endPointServicioEmail;
        this.endPointServicioTracking=endPointServicioTracking;
        this.contratoServicioEmail=contratoServicioEmail;
        this.contratoServicioSms=contratoServicioSms;
        this.descripcion=descripcion;
    }

    // Property accessors
    @Id
    @Column(name="ID_CONF_TIPO_ENVIO",unique=true,nullable=false)
    public Integer getIdConfTipoEnvio(){
        return this.idConfTipoEnvio;
    }

    public void setIdConfTipoEnvio(Integer idConfTipoEnvio){
        this.idConfTipoEnvio=idConfTipoEnvio;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ENVIADOR",nullable=false)
    public Enviador getEnviador(){
        return this.enviador;
    }

    public void setEnviador(Enviador enviador){
        this.enviador=enviador;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_ENVIO",nullable=false)
    public TipoEnvio getTipoEnvio(){
        return this.tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio){
        this.tipoEnvio=tipoEnvio;
    }

    @Column(name="END_POINT_SERVICIO_EMAIL",length=200)
    public String getEndPointServicioEmail(){
        return this.endPointServicioEmail;
    }

    public void setEndPointServicioEmail(String endPointServicioEmail){
        this.endPointServicioEmail=endPointServicioEmail;
    }

    @Column(name="END_POINT_SERVICIO_TRACKING",length=200)
    public String getEndPointServicioTracking(){
        return this.endPointServicioTracking;
    }

    public void setEndPointServicioTracking(String endPointServicioTracking){
        this.endPointServicioTracking=endPointServicioTracking;
    }

    @Column(name="CONTRATO_SERVICIO_EMAIL",length=200)
    public String getContratoServicioEmail(){
        return this.contratoServicioEmail;
    }

    public void setContratoServicioEmail(String contratoServicioEmail){
        this.contratoServicioEmail=contratoServicioEmail;
    }

    @Column(name="CONTRATO_SERVICIO_SMS",length=200)
    public String getContratoServicioSms(){
        return this.contratoServicioSms;
    }

    public void setContratoServicioSms(String contratoServicioSms){
        this.contratoServicioSms=contratoServicioSms;
    }

    @Column(name="DESCRIPCION",length=50)
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

}