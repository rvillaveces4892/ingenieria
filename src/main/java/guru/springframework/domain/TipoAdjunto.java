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
 * TipoAdjunto entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_ADJUNTO",schema="ENVIO_SELECT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoAdjunto implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-916915475564477135L;
    private Short idTipoAdjunto;
    private String descripcion;
    
//    private Set<ConfEnvioObligado> confEnvioObligados=new HashSet<ConfEnvioObligado>(0);

    // Constructors

    /** default constructor */
    public TipoAdjunto(){
    }

    /** minimal constructor */
    public TipoAdjunto(Short idTipoAdjunto){
        this.idTipoAdjunto=idTipoAdjunto;
    }

    /** full constructor */
//    public TipoAdjunto(Short idTipoAdjunto,String descripcion,Set<ConfEnvioObligado> confEnvioObligados){
//        this.idTipoAdjunto=idTipoAdjunto;
//        this.descripcion=descripcion;
////        this.confEnvioObligados=confEnvioObligados;
//    }

    // Property accessors
    @Id
    @Column(name="ID_TIPO_ADJUNTO",unique=true,nullable=false)
    public Short getIdTipoAdjunto(){
        return this.idTipoAdjunto;
    }

    public void setIdTipoAdjunto(Short idTipoAdjunto){
        this.idTipoAdjunto=idTipoAdjunto;
    }

    @Column(name="DESCRIPCION",length=50)
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
//    @JsonBackReference(value="conf-tipoadjunto")
//    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="tipoAdjunto")
//    public Set<ConfEnvioObligado> getConfEnvioObligados(){
//        return this.confEnvioObligados;
//    }
//
//    public void setConfEnvioObligados(Set<ConfEnvioObligado> confEnvioObligados){
//        this.confEnvioObligados=confEnvioObligados;
//    }

}