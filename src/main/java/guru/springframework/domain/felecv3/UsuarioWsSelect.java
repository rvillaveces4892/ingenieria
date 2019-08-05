package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UsuarioWsSelect entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="USUARIO_WS_SELECT",schema="SERVICIOS_SELECT")
public class UsuarioWsSelect implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-8766685845230047872L;
    private String username;
    private Long identificacionObligado;
    private String password;
    private Integer tiempoMinutosTokenActivo;
    // Constructors

    /** default constructor */
    public UsuarioWsSelect(){
    }

    /** full constructor */
    public UsuarioWsSelect(String username,Long identificacionObligado,String password, Integer tiempoMinutosTokenActivo){
        this.username=username;
        this.identificacionObligado=identificacionObligado;
        this.password=password;
        this.tiempoMinutosTokenActivo = tiempoMinutosTokenActivo;
    }

    // Property accessors
    @Id
    @Column(name="USERNAME",unique=true,nullable=false,length=30)
    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    @Column(name="IDENTIFICACION_OBLIGADO",nullable=false)
    public Long getIdentificacionObligado(){
        return this.identificacionObligado;
    }

    public void setIdentificacionObligado(Long identificacionObligado){
        this.identificacionObligado=identificacionObligado;
    }

    @Column(name="PASSWORD",nullable=false,length=65)
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password=password;
    }
    
      
    @Column(name = "TIEMPO_MINUTOS_TOKEN_ACTIVO", nullable=false)
    public Integer getTiempoMinutosTokenActivo(){
        return tiempoMinutosTokenActivo;
    }

    public void setTiempoMinutosTokenActivo(Integer tiempoMinutosTokenActivo){
        this.tiempoMinutosTokenActivo=tiempoMinutosTokenActivo;
    }
    
    
}