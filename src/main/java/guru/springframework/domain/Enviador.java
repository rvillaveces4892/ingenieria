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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Enviador entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ENVIADOR",schema="ENVIO_SELECT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Enviador implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=7826422319434122960L;
    private Short idEnviador;
    private String descripcion;
//    private Set<ConfEnviadorTipoEnvio> confEnviadorTipoEnvios=new HashSet<ConfEnviadorTipoEnvio>(0);
    
//    private Set<ConfEnvioObligado> confEnvioObligados=new HashSet<ConfEnvioObligado>(0);

    // Constructors

    /** default constructor */
    public Enviador(){
    }

    /** minimal constructor */
    public Enviador(Short idEnviador){
        this.idEnviador=idEnviador;
    }

    /** full constructor */
//    public Enviador(Short idEnviador,String descripcion,Set<ConfEnviadorTipoEnvio> confEnviadorTipoEnvios,Set<ConfEnvioObligado> confEnvioObligados){
//        this.idEnviador=idEnviador;
//        this.descripcion=descripcion;
//        this.confEnviadorTipoEnvios=confEnviadorTipoEnvios;
//        this.confEnvioObligados=confEnvioObligados;
//    }

    // Property accessors
    @Id
    @Column(name="ID_ENVIADOR",unique=true,nullable=false)
    public Short getIdEnviador(){
        return this.idEnviador;
    }

    public void setIdEnviador(Short idEnviador){
        this.idEnviador=idEnviador;
    }

    @Column(name="DESCRIPCION",length=50)
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
//    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="enviador")
//    public Set<ConfEnviadorTipoEnvio> getConfEnviadorTipoEnvios(){
//        return this.confEnviadorTipoEnvios;
//    }
//
//    public void setConfEnviadorTipoEnvios(Set<ConfEnviadorTipoEnvio> confEnviadorTipoEnvios){
//        this.confEnviadorTipoEnvios=confEnviadorTipoEnvios;
//    }
//    @JsonBackReference(value="conf-enviador")
//    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="enviador")
//    public Set<ConfEnvioObligado> getConfEnvioObligados(){
//        return this.confEnvioObligados;
//    }
//
//    public void setConfEnvioObligados(Set<ConfEnvioObligado> confEnvioObligados){
//        this.confEnvioObligados=confEnvioObligados;
//    }

}