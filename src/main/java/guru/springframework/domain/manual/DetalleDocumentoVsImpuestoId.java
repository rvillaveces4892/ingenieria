package guru.springframework.domain.manual;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetalleDocumentoVsImpuestoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class DetalleDocumentoVsImpuestoId implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=-3061235695111378111L;
    
    // Fields

    private Long identificacionObligado;
    private String noDocumento;
    private String codigoImpuestoSelect;
    private Integer noDetalle;
    private Short idTipoDocFe;
    private Long numResoluDian;

    // Constructors

    /** default constructor */
    public DetalleDocumentoVsImpuestoId(){
    }

    /** full constructor */
    public DetalleDocumentoVsImpuestoId(Long identificacionObligado,String noDocumento,String codigoImpuestoSelect,Integer noDetalle,Short idTipoDocFe,Long numResoluDian){
        this.identificacionObligado=identificacionObligado;
        this.noDocumento=noDocumento;
        this.codigoImpuestoSelect=codigoImpuestoSelect;
        this.noDetalle=noDetalle;
        this.idTipoDocFe=idTipoDocFe;
        this.numResoluDian=numResoluDian;
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

    @Column(name="CODIGO_IMPUESTO_SELECT",nullable=false,length=10)
    public String getCodigoImpuestoSelect(){
        return this.codigoImpuestoSelect;
    }

    public void setCodigoImpuestoSelect(String codigoImpuestoSelect){
        this.codigoImpuestoSelect=codigoImpuestoSelect;
    }

    @Column(name="NO_DETALLE",nullable=false)
    public Integer getNoDetalle(){
        return this.noDetalle;
    }

    public void setNoDetalle(Integer noDetalle){
        this.noDetalle=noDetalle;
    }

    @Column(name="ID_TIPO_DOC_FE",nullable=false)
    public Short getIdTipoDocFe(){
        return this.idTipoDocFe;
    }

    public void setIdTipoDocFe(Short idTipoDocFe){
        this.idTipoDocFe=idTipoDocFe;
    }

    @Column(name="NUM_RESOLU_DIAN",nullable=false)
    public Long getNumResoluDian(){
        return this.numResoluDian;
    }

    public void setNumResoluDian(Long numResoluDian){
        this.numResoluDian=numResoluDian;
    }

    public boolean equals(Object other){
        if((this==other))
            return true;
        if((other==null))
            return false;
        if(!(other instanceof DetalleDocumentoVsImpuestoId))
            return false;
        DetalleDocumentoVsImpuestoId castOther=(DetalleDocumentoVsImpuestoId)other;

        return ((this.getIdentificacionObligado()==castOther.getIdentificacionObligado())||(this.getIdentificacionObligado()!=null&&castOther.getIdentificacionObligado()!=null&&this.getIdentificacionObligado().equals(
                castOther.getIdentificacionObligado())))
                &&((this.getNoDocumento()==castOther.getNoDocumento())||(this.getNoDocumento()!=null&&castOther.getNoDocumento()!=null&&this.getNoDocumento().equals(castOther.getNoDocumento())))
                &&((this.getCodigoImpuestoSelect()==castOther.getCodigoImpuestoSelect())||(this.getCodigoImpuestoSelect()!=null&&castOther.getCodigoImpuestoSelect()!=null&&this.getCodigoImpuestoSelect().equals(castOther.getCodigoImpuestoSelect())))
                &&((this.getNoDetalle()==castOther.getNoDetalle())||(this.getNoDetalle()!=null&&castOther.getNoDetalle()!=null&&this.getNoDetalle().equals(castOther.getNoDetalle())))
                &&((this.getIdTipoDocFe()==castOther.getIdTipoDocFe())||(this.getIdTipoDocFe()!=null&&castOther.getIdTipoDocFe()!=null&&this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe())))
                &&((this.getNumResoluDian()==castOther.getNumResoluDian())||(this.getNumResoluDian()!=null&&castOther.getNumResoluDian()!=null&&this.getNumResoluDian().equals(castOther.getNumResoluDian())));
    }

    public int hashCode(){
        int result=17;

        result=37*result+(getIdentificacionObligado()==null?0:this.getIdentificacionObligado().hashCode());
        result=37*result+(getNoDocumento()==null?0:this.getNoDocumento().hashCode());
        result=37*result+(getCodigoImpuestoSelect()==null?0:this.getCodigoImpuestoSelect().hashCode());
        result=37*result+(getNoDetalle()==null?0:this.getNoDetalle().hashCode());
        result=37*result+(getIdTipoDocFe()==null?0:this.getIdTipoDocFe().hashCode());
        result=37*result+(getNumResoluDian()==null?0:this.getNumResoluDian().hashCode());
        return result;
    }

}