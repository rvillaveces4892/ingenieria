//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import co.experian.computec.referencia.model.EntidadPaginacion;

/**
 * ConfCargaXmlId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ConfCargaXmlId  extends EntidadPaginacion implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=2974346798989750808L;
    private Long identificacionObligado;
    private Long numResoluDian;
    private Short idTipoDocFe;

    // Constructors

    /** default constructor */
    public ConfCargaXmlId(){
    }

    /** full constructor */
    public ConfCargaXmlId(Long identificacionObligado,Long numResoluDian,Short idTipoDocFe){
        this.identificacionObligado=identificacionObligado;
        this.numResoluDian=numResoluDian;
        this.idTipoDocFe=idTipoDocFe;
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

    @Column(name="ID_TIPO_DOC_FE",nullable=false)
    public Short getIdTipoDocFe(){
        return this.idTipoDocFe;
    }

    public void setIdTipoDocFe(Short idTipoDocFe){
        this.idTipoDocFe=idTipoDocFe;
    }

    public boolean equals(Object other){
        if((this==other))
            return true;
        if((other==null))
            return false;
        if(!(other instanceof ConfCargaXmlId))
            return false;
        ConfCargaXmlId castOther=(ConfCargaXmlId)other;

        return ((this.getIdentificacionObligado()==castOther.getIdentificacionObligado())||(this.getIdentificacionObligado()!=null&&castOther.getIdentificacionObligado()!=null&&this.getIdentificacionObligado().equals(
                castOther.getIdentificacionObligado())))
                &&((this.getNumResoluDian()==castOther.getNumResoluDian())||(this.getNumResoluDian()!=null&&castOther.getNumResoluDian()!=null&&this.getNumResoluDian().equals(castOther.getNumResoluDian())))
                &&((this.getIdTipoDocFe()==castOther.getIdTipoDocFe())||(this.getIdTipoDocFe()!=null&&castOther.getIdTipoDocFe()!=null&&this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe())));
    }

    public int hashCode(){
        int result=17;

        result=37*result+(getIdentificacionObligado()==null?0:this.getIdentificacionObligado().hashCode());
        result=37*result+(getNumResoluDian()==null?0:this.getNumResoluDian().hashCode());
        result=37*result+(getIdTipoDocFe()==null?0:this.getIdTipoDocFe().hashCode());
        return result;
    }

}
