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
 * TipoEnvio entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_ENVIO",schema="ENVIO_SELECT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoEnvio implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=7990532305774418066L;
    private Short idTipoEnvio;
    private String descripcion;
//    private Set<RegistroEnvio> registroEnvios=new HashSet<RegistroEnvio>(0);
//    private Set<ConfEnviadorTipoEnvio> confEnviadorTipoEnvios=new HashSet<ConfEnviadorTipoEnvio>(0);
//    
//    private Set<ConfEnvioObligado> confEnvioObligados=new HashSet<ConfEnvioObligado>(0);

    // Constructors

    /** default constructor */
    public TipoEnvio(){
    }

    /** minimal constructor */
    public TipoEnvio(Short idTipoEnvio){
        this.idTipoEnvio=idTipoEnvio;
    }

    /** full constructor */
//    public TipoEnvio(Short idTipoEnvio,String descripcion,Set<RegistroEnvio> registroEnvios,Set<ConfEnviadorTipoEnvio> confEnviadorTipoEnvios,Set<ConfEnvioObligado> confEnvioObligados){
//        this.idTipoEnvio=idTipoEnvio;
//        this.descripcion=descripcion;
//        this.registroEnvios=registroEnvios;
//        this.confEnviadorTipoEnvios=confEnviadorTipoEnvios;
//        this.confEnvioObligados=confEnvioObligados;
//    }

    // Property accessors
    @Id
    @Column(name="ID_TIPO_ENVIO",unique=true,nullable=false)
    public Short getIdTipoEnvio(){
        return this.idTipoEnvio;
    }

    public void setIdTipoEnvio(Short idTipoEnvio){
        this.idTipoEnvio=idTipoEnvio;
    }

    @Column(name="DESCRIPCION",length=50)
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
//    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="tipoEnvio")
//    public Set<RegistroEnvio> getRegistroEnvios(){
//        return this.registroEnvios;
//    }
//
//    public void setRegistroEnvios(Set<RegistroEnvio> registroEnvios){
//        this.registroEnvios=registroEnvios;
//    }
//    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="tipoEnvio")
//    public Set<ConfEnviadorTipoEnvio> getConfEnviadorTipoEnvios(){
//        return this.confEnviadorTipoEnvios;
//    }
//
//    public void setConfEnviadorTipoEnvios(Set<ConfEnviadorTipoEnvio> confEnviadorTipoEnvios){
//        this.confEnviadorTipoEnvios=confEnviadorTipoEnvios;
//    }
//    @JsonBackReference(value="conf-tipoenvio")
//    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="tipoEnvio")
//    public Set<ConfEnvioObligado> getConfEnvioObligados(){
//        return this.confEnvioObligados;
//    }
//
//    public void setConfEnvioObligados(Set<ConfEnvioObligado> confEnvioObligados){
//        this.confEnvioObligados=confEnvioObligados;
//    }

}