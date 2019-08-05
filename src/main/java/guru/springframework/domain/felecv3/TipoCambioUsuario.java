package guru.springframework.domain.felecv3;

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
 * TipoCambioUsuario entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_CAMBIO_USUARIO",schema="FELECV3")

public class TipoCambioUsuario implements java.io.Serializable{

    // Fields

    private Short idTipoCambio;
    private String descripcionCambio;
    private Set<AuditoriaControlCambioUsuarios> auditoriaControlCambioUsuarioses=new HashSet<AuditoriaControlCambioUsuarios>(0);

    // Constructors

    /** default constructor */
    public TipoCambioUsuario(){
    }

    /** minimal constructor */
    public TipoCambioUsuario(Short idTipoCambio){
        this.idTipoCambio=idTipoCambio;
    }

    /** full constructor */
    public TipoCambioUsuario(Short idTipoCambio,String descripcionCambio,Set<AuditoriaControlCambioUsuarios> auditoriaControlCambioUsuarioses){
        this.idTipoCambio=idTipoCambio;
        this.descripcionCambio=descripcionCambio;
        this.auditoriaControlCambioUsuarioses=auditoriaControlCambioUsuarioses;
    }

    // Property accessors
    @Id

    @Column(name="ID_TIPO_CAMBIO",unique=true,nullable=false)

    public Short getIdTipoCambio(){
        return this.idTipoCambio;
    }

    public void setIdTipoCambio(Short idTipoCambio){
        this.idTipoCambio=idTipoCambio;
    }

    @Column(name="DESCRIPCION_CAMBIO",length=160)

    public String getDescripcionCambio(){
        return this.descripcionCambio;
    }

    public void setDescripcionCambio(String descripcionCambio){
        this.descripcionCambio=descripcionCambio;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="tipoCambioUsuario")

    public Set<AuditoriaControlCambioUsuarios> getAuditoriaControlCambioUsuarioses(){
        return this.auditoriaControlCambioUsuarioses;
    }

    public void setAuditoriaControlCambioUsuarioses(Set<AuditoriaControlCambioUsuarios> auditoriaControlCambioUsuarioses){
        this.auditoriaControlCambioUsuarioses=auditoriaControlCambioUsuarioses;
    }

}