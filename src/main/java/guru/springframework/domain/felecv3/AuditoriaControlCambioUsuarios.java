package guru.springframework.domain.felecv3;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AuditoriaControlCambioUsuarios entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="AUDITORIA_CONTROL_CAMBIO_USUARIOS",schema="FELECV3")

public class AuditoriaControlCambioUsuarios implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=3298144834396048452L;
    
    private Long idControlCambio;
    private TipoCambioUsuario tipoCambioUsuario;
    private String usuarioAccion;
    private String usuarioModificado;
    private Timestamp fechaCambio;
    private String camposAnteriores;
    private String camposNuevos;
    private String ipOrigenCambio;

    // Constructors

    /** default constructor */
    public AuditoriaControlCambioUsuarios(){
    }

    /** minimal constructor */
    public AuditoriaControlCambioUsuarios(Long idControlCambio,TipoCambioUsuario tipoCambioUsuario,String usuarioAccion,String usuarioModificado,Timestamp fechaCambio,String camposAnteriores,String camposNuevos){
        this.idControlCambio=idControlCambio;
        this.tipoCambioUsuario=tipoCambioUsuario;
        this.usuarioAccion=usuarioAccion;
        this.usuarioModificado=usuarioModificado;
        this.fechaCambio=fechaCambio;
        this.camposAnteriores=camposAnteriores;
        this.camposNuevos=camposNuevos;
    }

    /** full constructor */
    public AuditoriaControlCambioUsuarios(Long idControlCambio,TipoCambioUsuario tipoCambioUsuario,String usuarioAccion,String usuarioModificado,Timestamp fechaCambio,String camposAnteriores,String camposNuevos,String ipOrigenCambio){
        this.idControlCambio=idControlCambio;
        this.tipoCambioUsuario=tipoCambioUsuario;
        this.usuarioAccion=usuarioAccion;
        this.usuarioModificado=usuarioModificado;
        this.fechaCambio=fechaCambio;
        this.camposAnteriores=camposAnteriores;
        this.camposNuevos=camposNuevos;
        this.ipOrigenCambio=ipOrigenCambio;
    }

    // Property accessors
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_CONTROL_CAMBIO",unique=true,nullable=false)

    public Long getIdControlCambio(){
        return this.idControlCambio;
    }

    public void setIdControlCambio(Long idControlCambio){
        this.idControlCambio=idControlCambio;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_CAMBIO",nullable=false)

    public TipoCambioUsuario getTipoCambioUsuario(){
        return this.tipoCambioUsuario;
    }

    public void setTipoCambioUsuario(TipoCambioUsuario tipoCambioUsuario){
        this.tipoCambioUsuario=tipoCambioUsuario;
    }

    @Column(name="USUARIO_ACCION",nullable=false,length=80)

    public String getUsuarioAccion(){
        return this.usuarioAccion;
    }

    public void setUsuarioAccion(String usuarioAccion){
        this.usuarioAccion=usuarioAccion;
    }

    @Column(name="USUARIO_MODIFICADO",nullable=false,length=80)

    public String getUsuarioModificado(){
        return this.usuarioModificado;
    }

    public void setUsuarioModificado(String usuarioModificado){
        this.usuarioModificado=usuarioModificado;
    }

    @Column(name="FECHA_CAMBIO",nullable=false,length=26)

    public Timestamp getFechaCambio(){
        return this.fechaCambio;
    }

    public void setFechaCambio(Timestamp fechaCambio){
        this.fechaCambio=fechaCambio;
    }

    @Column(name="CAMPOS_ANTERIORES",nullable=false,length=200)

    public String getCamposAnteriores(){
        return this.camposAnteriores;
    }

    public void setCamposAnteriores(String camposAnteriores){
        this.camposAnteriores=camposAnteriores;
    }

    @Column(name="CAMPOS_NUEVOS",nullable=false,length=200)

    public String getCamposNuevos(){
        return this.camposNuevos;
    }

    public void setCamposNuevos(String camposNuevos){
        this.camposNuevos=camposNuevos;
    }

    @Column(name="IP_ORIGEN_CAMBIO",length=17)

    public String getIpOrigenCambio(){
        return this.ipOrigenCambio;
    }

    public void setIpOrigenCambio(String ipOrigenCambio){
        this.ipOrigenCambio=ipOrigenCambio;
    }

}