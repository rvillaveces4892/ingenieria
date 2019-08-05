package guru.springframework.domain.manual;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OpcionalDocumentoManualId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class OpcionalDocumentoManualId implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=-396372297327902713L;
    
    // Fields

    private Long identificacionObligado;
    private String noDocumento;
    private Long numResoluDian;
    private Short numeroOpcional;
    private Short idTipoDocFe;

    // Constructors

    /** default constructor */
    public OpcionalDocumentoManualId(){
    }

    /** full constructor */
    public OpcionalDocumentoManualId(Long identificacionObligado,String noDocumento,Long numResoluDian,Short numeroOpcional,Short idTipoDocFe){
        this.identificacionObligado=identificacionObligado;
        this.noDocumento=noDocumento;
        this.numResoluDian=numResoluDian;
        this.numeroOpcional=numeroOpcional;
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

    @Column(name="NUMERO_OPCIONAL",nullable=false)
    public Short getNumeroOpcional(){
        return this.numeroOpcional;
    }

    public void setNumeroOpcional(Short numeroOpcional){
        this.numeroOpcional=numeroOpcional;
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
        if(!(other instanceof OpcionalDocumentoManualId))
            return false;
        OpcionalDocumentoManualId castOther=(OpcionalDocumentoManualId)other;

        return ((this.getIdentificacionObligado()==castOther.getIdentificacionObligado())||(this.getIdentificacionObligado()!=null&&castOther.getIdentificacionObligado()!=null&&this.getIdentificacionObligado().equals(
                castOther.getIdentificacionObligado())))
                &&((this.getNoDocumento()==castOther.getNoDocumento())||(this.getNoDocumento()!=null&&castOther.getNoDocumento()!=null&&this.getNoDocumento().equals(castOther.getNoDocumento())))
                &&((this.getNumResoluDian()==castOther.getNumResoluDian())||(this.getNumResoluDian()!=null&&castOther.getNumResoluDian()!=null&&this.getNumResoluDian().equals(castOther.getNumResoluDian())))
                &&((this.getNumeroOpcional()==castOther.getNumeroOpcional())||(this.getNumeroOpcional()!=null&&castOther.getNumeroOpcional()!=null&&this.getNumeroOpcional().equals(castOther.getNumeroOpcional())))
                &&((this.getIdTipoDocFe()==castOther.getIdTipoDocFe())||(this.getIdTipoDocFe()!=null&&castOther.getIdTipoDocFe()!=null&&this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe())));
    }

    public int hashCode(){
        int result=17;

        result=37*result+(getIdentificacionObligado()==null?0:this.getIdentificacionObligado().hashCode());
        result=37*result+(getNoDocumento()==null?0:this.getNoDocumento().hashCode());
        result=37*result+(getNumResoluDian()==null?0:this.getNumResoluDian().hashCode());
        result=37*result+(getNumeroOpcional()==null?0:this.getNumeroOpcional().hashCode());
        result=37*result+(getIdTipoDocFe()==null?0:this.getIdTipoDocFe().hashCode());
        return result;
    }

}