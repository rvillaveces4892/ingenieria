package guru.springframework.domain.manual;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ConsecutivoFacturaManualId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ConsecutivoFacturaManualId implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=-8216873921566694463L;
    
    // Fields

    private Long numResoluDian;
    private Long identificacionObligado;
    private Short idPrefijo;

    // Constructors

    /** default constructor */
    public ConsecutivoFacturaManualId(){
    }

    /** full constructor */
    public ConsecutivoFacturaManualId(Long numResoluDian,Long identificacionObligado,Short idPrefijo){
        this.numResoluDian=numResoluDian;
        this.identificacionObligado=identificacionObligado;
        this.idPrefijo=idPrefijo;
    }

    // Property accessors

    @Column(name="NUM_RESOLU_DIAN",nullable=false)
    public Long getNumResoluDian(){
        return this.numResoluDian;
    }

    public void setNumResoluDian(Long numResoluDian){
        this.numResoluDian=numResoluDian;
    }

    @Column(name="IDENTIFICACION_OBLIGADO",nullable=false)
    public Long getIdentificacionObligado(){
        return this.identificacionObligado;
    }

    public void setIdentificacionObligado(Long identificacionObligado){
        this.identificacionObligado=identificacionObligado;
    }

    @Column(name="ID_PREFIJO",nullable=false)
    public Short getIdPrefijo(){
        return this.idPrefijo;
    }

    public void setIdPrefijo(Short idPrefijo){
        this.idPrefijo=idPrefijo;
    }

    public boolean equals(Object other){
        if((this==other))
            return true;
        if((other==null))
            return false;
        if(!(other instanceof ConsecutivoFacturaManualId))
            return false;
        ConsecutivoFacturaManualId castOther=(ConsecutivoFacturaManualId)other;

        return ((this.getNumResoluDian()==castOther.getNumResoluDian())||(this.getNumResoluDian()!=null&&castOther.getNumResoluDian()!=null&&this.getNumResoluDian().equals(castOther.getNumResoluDian())))
                &&((this.getIdentificacionObligado()==castOther.getIdentificacionObligado())||(this.getIdentificacionObligado()!=null&&castOther.getIdentificacionObligado()!=null&&this.getIdentificacionObligado().equals(
                        castOther.getIdentificacionObligado())))&&((this.getIdPrefijo()==castOther.getIdPrefijo())||(this.getIdPrefijo()!=null&&castOther.getIdPrefijo()!=null&&this.getIdPrefijo().equals(castOther.getIdPrefijo())));
    }

    public int hashCode(){
        int result=17;

        result=37*result+(getNumResoluDian()==null?0:this.getNumResoluDian().hashCode());
        result=37*result+(getIdentificacionObligado()==null?0:this.getIdentificacionObligado().hashCode());
        result=37*result+(getIdPrefijo()==null?0:this.getIdPrefijo().hashCode());
        return result;
    }

}