package guru.springframework.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ConfEnvioObligadoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ConfEnvioObligadoId implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=4792638703295190089L;
    private Long identificacionObligado;
    private Long numResoluDian;
    private Short idPrefijo;
    private Short idTipoDocFe;
    private Short idTipoEnvio;

    // Constructors

    /** default constructor */
    public ConfEnvioObligadoId(){
    }

    /** full constructor */
    public ConfEnvioObligadoId(Long identificacionObligado,Long numResoluDian,Short idPrefijo,Short idTipoDocFe,Short idTipoEnvio){
        this.identificacionObligado=identificacionObligado;
        this.numResoluDian=numResoluDian;
        this.idPrefijo=idPrefijo;
        this.idTipoDocFe=idTipoDocFe;
        this.idTipoEnvio=idTipoEnvio;
    }

    // Property accessors

    @Column(name="IDENTIFICACION_OBLIGADO",nullable=false)
    public Long getIdentificacionObligado(){
        return this.identificacionObligado;
    }

    public void setIdentificacionObligado(Long identificacionObligado){
        this.identificacionObligado=identificacionObligado;
    }

    @Column(name="NUM_RESOLU_DIAN",nullable=false)
    public Long getNumResoluDian(){
        return this.numResoluDian;
    }

    public void setNumResoluDian(Long numResoluDian){
        this.numResoluDian=numResoluDian;
    }

    @Column(name="ID_PREFIJO",nullable=false)
    public Short getIdPrefijo(){
        return this.idPrefijo;
    }

    public void setIdPrefijo(Short idPrefijo){
        this.idPrefijo=idPrefijo;
    }

    @Column(name="ID_TIPO_DOC_FE",nullable=false)
    public Short getIdTipoDocFe(){
        return this.idTipoDocFe;
    }

    public void setIdTipoDocFe(Short idTipoDocFe){
        this.idTipoDocFe=idTipoDocFe;
    }

    @Column(name="ID_TIPO_ENVIO",nullable=false)
    public Short getIdTipoEnvio(){
        return this.idTipoEnvio;
    }

    public void setIdTipoEnvio(Short idTipoEnvio){
        this.idTipoEnvio=idTipoEnvio;
    }

    public boolean equals(Object other){
        if((this==other))
            return true;
        if((other==null))
            return false;
        if(!(other instanceof ConfEnvioObligadoId))
            return false;
        ConfEnvioObligadoId castOther=(ConfEnvioObligadoId)other;

        return ((this.getIdentificacionObligado()==castOther.getIdentificacionObligado())||(this.getIdentificacionObligado()!=null&&castOther.getIdentificacionObligado()!=null&&this.getIdentificacionObligado().equals(
                castOther.getIdentificacionObligado())))
                &&((this.getNumResoluDian()==castOther.getNumResoluDian())||(this.getNumResoluDian()!=null&&castOther.getNumResoluDian()!=null&&this.getNumResoluDian().equals(castOther.getNumResoluDian())))
                &&((this.getIdPrefijo()==castOther.getIdPrefijo())||(this.getIdPrefijo()!=null&&castOther.getIdPrefijo()!=null&&this.getIdPrefijo().equals(castOther.getIdPrefijo())))
                &&((this.getIdTipoDocFe()==castOther.getIdTipoDocFe())||(this.getIdTipoDocFe()!=null&&castOther.getIdTipoDocFe()!=null&&this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe())))
                &&((this.getIdTipoEnvio()==castOther.getIdTipoEnvio())||(this.getIdTipoEnvio()!=null&&castOther.getIdTipoEnvio()!=null&&this.getIdTipoEnvio().equals(castOther.getIdTipoEnvio())));
    }

    public int hashCode(){
        int result=17;

        result=37*result+(getIdentificacionObligado()==null?0:this.getIdentificacionObligado().hashCode());
        result=37*result+(getNumResoluDian()==null?0:this.getNumResoluDian().hashCode());
        result=37*result+(getIdPrefijo()==null?0:this.getIdPrefijo().hashCode());
        result=37*result+(getIdTipoDocFe()==null?0:this.getIdTipoDocFe().hashCode());
        result=37*result+(getIdTipoEnvio()==null?0:this.getIdTipoEnvio().hashCode());
        return result;
    }

    @Override
    public String toString(){
        return "ConfEnvioObligadoId [identificacionObligado="+identificacionObligado+", numResoluDian="+numResoluDian+", idPrefijo="+idPrefijo+", idTipoDocFe="+idTipoDocFe+", idTipoEnvio="+idTipoEnvio+"]";
    }
    
    

}