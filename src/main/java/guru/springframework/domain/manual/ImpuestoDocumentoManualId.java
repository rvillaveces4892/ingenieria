package guru.springframework.domain.manual;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ImpuestoDocumentoManualId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ImpuestoDocumentoManualId implements java.io.Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID=-8507323320122844090L;
    
    // Fields

    private Long identificacionObligado;
    private String noDocumento;
    private Long numResoluDian;
    private String codigoImpuestoSelect;
    private Short idTipoDocFe;

    // Constructors

    /** default constructor */
    public ImpuestoDocumentoManualId(){
    }

    /** full constructor */
    public ImpuestoDocumentoManualId(Long identificacionObligado,String noDocumento,Long numResoluDian,String codigoImpuestoSelect,Short idTipoDocFe){
        this.identificacionObligado=identificacionObligado;
        this.noDocumento=noDocumento;
        this.numResoluDian=numResoluDian;
        this.codigoImpuestoSelect=codigoImpuestoSelect;
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

    @Column(name="NO_DOCUMENTO",nullable=false,length=30)
    public String getNoDocumento(){
        return this.noDocumento;
    }

    public void setNoDocumento(String noDocumento){
        this.noDocumento=noDocumento;
    }

    @Column(name="NUM_RESOLU_DIAN",nullable=false)
    public Long getNumResoluDian(){
        return this.numResoluDian;
    }

    public void setNumResoluDian(Long numResoluDian){
        this.numResoluDian=numResoluDian;
    }

    @Column(name="CODIGO_IMPUESTO_SELECT",nullable=false,length=10)
    public String getCodigoImpuestoSelect(){
        return this.codigoImpuestoSelect;
    }

    public void setCodigoImpuestoSelect(String codigoImpuestoSelect){
        this.codigoImpuestoSelect=codigoImpuestoSelect;
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
        if(!(other instanceof ImpuestoDocumentoManualId))
            return false;
        ImpuestoDocumentoManualId castOther=(ImpuestoDocumentoManualId)other;

        return ((this.getIdentificacionObligado()==castOther.getIdentificacionObligado())||(this.getIdentificacionObligado()!=null&&castOther.getIdentificacionObligado()!=null&&this.getIdentificacionObligado().equals(
                castOther.getIdentificacionObligado())))
                &&((this.getNoDocumento()==castOther.getNoDocumento())||(this.getNoDocumento()!=null&&castOther.getNoDocumento()!=null&&this.getNoDocumento().equals(castOther.getNoDocumento())))
                &&((this.getNumResoluDian()==castOther.getNumResoluDian())||(this.getNumResoluDian()!=null&&castOther.getNumResoluDian()!=null&&this.getNumResoluDian().equals(castOther.getNumResoluDian())))
                &&((this.getCodigoImpuestoSelect()==castOther.getCodigoImpuestoSelect())||(this.getCodigoImpuestoSelect()!=null&&castOther.getCodigoImpuestoSelect()!=null&&this.getCodigoImpuestoSelect().equals(castOther.getCodigoImpuestoSelect())))
                &&((this.getIdTipoDocFe()==castOther.getIdTipoDocFe())||(this.getIdTipoDocFe()!=null&&castOther.getIdTipoDocFe()!=null&&this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe())));
    }

    public int hashCode(){
        int result=17;

        result=37*result+(getIdentificacionObligado()==null?0:this.getIdentificacionObligado().hashCode());
        result=37*result+(getNoDocumento()==null?0:this.getNoDocumento().hashCode());
        result=37*result+(getNumResoluDian()==null?0:this.getNumResoluDian().hashCode());
        result=37*result+(getCodigoImpuestoSelect()==null?0:this.getCodigoImpuestoSelect().hashCode());
        result=37*result+(getIdTipoDocFe()==null?0:this.getIdTipoDocFe().hashCode());
        return result;
    }

}