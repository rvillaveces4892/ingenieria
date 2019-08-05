package guru.springframework.domain.manual;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetalleDocumentoManualId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class DetalleDocumentoManualId implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=2468709834114787738L;
    
    // Fields

    private String noDocumento;
    private Long identificacionObligado;
    private Long numResoluDian;
    private Short idTipoDocFe;
    private Integer noDetalle;

    // Constructors

    /** default constructor */
    public DetalleDocumentoManualId(){
    }

    /** full constructor */
    public DetalleDocumentoManualId(String noDocumento,Long identificacionObligado,Long numResoluDian,Short idTipoDocFe,Integer noDetalle){
        this.noDocumento=noDocumento;
        this.identificacionObligado=identificacionObligado;
        this.numResoluDian=numResoluDian;
        this.idTipoDocFe=idTipoDocFe;
        this.noDetalle=noDetalle;
    }

    // Property accessors

    @Column(name="NO_DOCUMENTO",nullable=false,length=30)
    public String getNoDocumento(){
        return this.noDocumento;
    }

    public void setNoDocumento(String noDocumento){
        this.noDocumento=noDocumento;
    }

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

    @Column(name="NO_DETALLE",nullable=false)
    public Integer getNoDetalle(){
        return this.noDetalle;
    }

    public void setNoDetalle(Integer noDetalle){
        this.noDetalle=noDetalle;
    }

    public boolean equals(Object other){
        if((this==other))
            return true;
        if((other==null))
            return false;
        if(!(other instanceof DetalleDocumentoManualId))
            return false;
        DetalleDocumentoManualId castOther=(DetalleDocumentoManualId)other;

        return ((this.getNoDocumento()==castOther.getNoDocumento())||(this.getNoDocumento()!=null&&castOther.getNoDocumento()!=null&&this.getNoDocumento().equals(castOther.getNoDocumento())))
                &&((this.getIdentificacionObligado()==castOther.getIdentificacionObligado())||(this.getIdentificacionObligado()!=null&&castOther.getIdentificacionObligado()!=null&&this.getIdentificacionObligado().equals(
                        castOther.getIdentificacionObligado())))
                &&((this.getNumResoluDian()==castOther.getNumResoluDian())||(this.getNumResoluDian()!=null&&castOther.getNumResoluDian()!=null&&this.getNumResoluDian().equals(castOther.getNumResoluDian())))
                &&((this.getIdTipoDocFe()==castOther.getIdTipoDocFe())||(this.getIdTipoDocFe()!=null&&castOther.getIdTipoDocFe()!=null&&this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe())))
                &&((this.getNoDetalle()==castOther.getNoDetalle())||(this.getNoDetalle()!=null&&castOther.getNoDetalle()!=null&&this.getNoDetalle().equals(castOther.getNoDetalle())));
    }

    public int hashCode(){
        int result=17;

        result=37*result+(getNoDocumento()==null?0:this.getNoDocumento().hashCode());
        result=37*result+(getIdentificacionObligado()==null?0:this.getIdentificacionObligado().hashCode());
        result=37*result+(getNumResoluDian()==null?0:this.getNumResoluDian().hashCode());
        result=37*result+(getIdTipoDocFe()==null?0:this.getIdTipoDocFe().hashCode());
        result=37*result+(getNoDetalle()==null?0:this.getNoDetalle().hashCode());
        return result;
    }

}