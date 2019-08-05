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
 * EstadoEnvio entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_ENVIO",schema="ENVIO_SELECT")
public class EstadoEnvio implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-980383074176637023L;
    private Short idEstadoEnvio;
    private String descripcion;
    private Set<RegistroEnvio> registroEnvios=new HashSet<RegistroEnvio>(0);

    // Constructors

    /** default constructor */
    public EstadoEnvio(){
    }

    /** minimal constructor */
    public EstadoEnvio(Short idEstadoEnvio){
        this.idEstadoEnvio=idEstadoEnvio;
    }

    /** full constructor */
    public EstadoEnvio(Short idEstadoEnvio,String descripcion,Set<RegistroEnvio> registroEnvios){
        this.idEstadoEnvio=idEstadoEnvio;
        this.descripcion=descripcion;
        this.registroEnvios=registroEnvios;
    }

    // Property accessors
    @Id
    @Column(name="ID_ESTADO_ENVIO",unique=true,nullable=false)
    public Short getIdEstadoEnvio(){
        return this.idEstadoEnvio;
    }

    public void setIdEstadoEnvio(Short idEstadoEnvio){
        this.idEstadoEnvio=idEstadoEnvio;
    }

    @Column(name="DESCRIPCION",length=50)
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="estadoEnvio")
    public Set<RegistroEnvio> getRegistroEnvios(){
        return this.registroEnvios;
    }

    public void setRegistroEnvios(Set<RegistroEnvio> registroEnvios){
        this.registroEnvios=registroEnvios;
    }

}