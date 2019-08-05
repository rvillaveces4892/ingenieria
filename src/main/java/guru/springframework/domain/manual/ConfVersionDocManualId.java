package guru.springframework.domain.manual;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ConfVersionDocManualId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ConfVersionDocManualId implements java.io.Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID=3291412010807564104L;
    
    // Fields

    private Long identificacionObligado;
    private Long numResoluDian;
    private Short versionDocManual;

    // Constructors

    /** default constructor */
    public ConfVersionDocManualId(){
    }

    /** full constructor */
    public ConfVersionDocManualId(Long identificacionObligado,Long numResoluDian,Short versionDocManual){
        this.identificacionObligado=identificacionObligado;
        this.numResoluDian=numResoluDian;
        this.versionDocManual=versionDocManual;
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

    @Column(name="VERSION_DOC_MANUAL",nullable=false)
    public Short getVersionDocManual(){
        return this.versionDocManual;
    }

    public void setVersionDocManual(Short versionDocManual){
        this.versionDocManual=versionDocManual;
    }

    public boolean equals(Object other){
        if((this==other))
            return true;
        if((other==null))
            return false;
        if(!(other instanceof ConfVersionDocManualId))
            return false;
        ConfVersionDocManualId castOther=(ConfVersionDocManualId)other;

        return ((this.getIdentificacionObligado()==castOther.getIdentificacionObligado())||(this.getIdentificacionObligado()!=null&&castOther.getIdentificacionObligado()!=null&&this.getIdentificacionObligado().equals(
                castOther.getIdentificacionObligado())))
                &&((this.getNumResoluDian()==castOther.getNumResoluDian())||(this.getNumResoluDian()!=null&&castOther.getNumResoluDian()!=null&&this.getNumResoluDian().equals(castOther.getNumResoluDian())))
                &&((this.getVersionDocManual()==castOther.getVersionDocManual())||(this.getVersionDocManual()!=null&&castOther.getVersionDocManual()!=null&&this.getVersionDocManual().equals(castOther.getVersionDocManual())));
    }

    public int hashCode(){
        int result=17;

        result=37*result+(getIdentificacionObligado()==null?0:this.getIdentificacionObligado().hashCode());
        result=37*result+(getNumResoluDian()==null?0:this.getNumResoluDian().hashCode());
        result=37*result+(getVersionDocManual()==null?0:this.getVersionDocManual().hashCode());
        return result;
    }

}