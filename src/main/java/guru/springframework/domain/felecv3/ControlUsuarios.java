//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ControlUsuarios entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONTROL_USUARIOS"
    ,schema="FELECV3"
)

public class ControlUsuarios   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-4203997668731511137L;
    private Long idControlUsuarios;
     private Long noUsuarioExterno;
     private Long idObligado;
     private Integer noUsuarioInterno;
     private Integer limiteUsuariosInterno;


    // Constructors

    /** default constructor */
    public ControlUsuarios() {
    }

	/** minimal constructor */
    public ControlUsuarios(Long idControlUsuarios) {
        this.idControlUsuarios = idControlUsuarios;
    }
    
    /** full constructor */
    public ControlUsuarios(Long idControlUsuarios, Long noUsuarioExterno, Long idObligado, Integer noUsuarioInterno, Integer limiteUsuariosInterno) {
        this.idControlUsuarios = idControlUsuarios;
        this.noUsuarioExterno = noUsuarioExterno;
        this.idObligado = idObligado;
        this.noUsuarioInterno = noUsuarioInterno;
        this.limiteUsuariosInterno = limiteUsuariosInterno;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_CONTROL_USUARIOS", unique=true, nullable=false)

    public Long getIdControlUsuarios() {
        return this.idControlUsuarios;
    }
    
    public void setIdControlUsuarios(Long idControlUsuarios) {
        this.idControlUsuarios = idControlUsuarios;
    }
    
    @Column(name="NO_USUARIO_EXTERNO")

    public Long getNoUsuarioExterno() {
        return this.noUsuarioExterno;
    }
    
    public void setNoUsuarioExterno(Long noUsuarioExterno) {
        this.noUsuarioExterno = noUsuarioExterno;
    }
    
    @Column(name="ID_OBLIGADO")

    public Long getIdObligado() {
        return this.idObligado;
    }
    
    public void setIdObligado(Long idObligado) {
        this.idObligado = idObligado;
    }
    
    @Column(name="NO_USUARIO_INTERNO")

    public Integer getNoUsuarioInterno() {
        return this.noUsuarioInterno;
    }
    
    public void setNoUsuarioInterno(Integer noUsuarioInterno) {
        this.noUsuarioInterno = noUsuarioInterno;
    }
    
    @Column(name="LIMITE_USUARIOS_INTERNO")

    public Integer getLimiteUsuariosInterno() {
        return this.limiteUsuariosInterno;
    }
    
    public void setLimiteUsuariosInterno(Integer limiteUsuariosInterno) {
        this.limiteUsuariosInterno = limiteUsuariosInterno;
    }
   








}
