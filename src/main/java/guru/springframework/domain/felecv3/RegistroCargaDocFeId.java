//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import co.experian.computec.referencia.model.EntidadPaginacion;

/**
 * RegistroCargaDocFeId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class RegistroCargaDocFeId  extends EntidadPaginacion implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-5182344062791231285L;
    private Long identificacionObligado;
    private String noDocumento;
    private Short idTipoDocFe;
    private Short idTipoArchivoCarga;

    // Constructors

    /** default constructor */
    public RegistroCargaDocFeId(){
    }

    /** full constructor */
    public RegistroCargaDocFeId(Long identificacionObligado,String noDocumento,Short idTipoDocFe,Short idTipoArchivoCarga){
        this.identificacionObligado=identificacionObligado;
        this.noDocumento=noDocumento;
        this.idTipoDocFe=idTipoDocFe;
        this.idTipoArchivoCarga=idTipoArchivoCarga;
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

    @Column(name="ID_TIPO_DOC_FE",nullable=false)
    public Short getIdTipoDocFe(){
        return this.idTipoDocFe;
    }

    public void setIdTipoDocFe(Short idTipoDocFe){
        this.idTipoDocFe=idTipoDocFe;
    }

    @Column(name="ID_TIPO_ARCHIVO_CARGA",nullable=false)
    public Short getIdTipoArchivoCarga(){
        return this.idTipoArchivoCarga;
    }

    public void setIdTipoArchivoCarga(Short idTipoArchivoCarga){
        this.idTipoArchivoCarga=idTipoArchivoCarga;
    }

    public boolean equals(Object other){
        if((this==other))
            return true;
        if((other==null))
            return false;
        if(!(other instanceof RegistroCargaDocFeId))
            return false;
        RegistroCargaDocFeId castOther=(RegistroCargaDocFeId)other;

        return ((this.getIdentificacionObligado()==castOther.getIdentificacionObligado())||(this.getIdentificacionObligado()!=null&&castOther.getIdentificacionObligado()!=null&&this.getIdentificacionObligado().equals(
                castOther.getIdentificacionObligado())))
                &&((this.getNoDocumento()==castOther.getNoDocumento())||(this.getNoDocumento()!=null&&castOther.getNoDocumento()!=null&&this.getNoDocumento().equals(castOther.getNoDocumento())))
                &&((this.getIdTipoDocFe()==castOther.getIdTipoDocFe())||(this.getIdTipoDocFe()!=null&&castOther.getIdTipoDocFe()!=null&&this.getIdTipoDocFe().equals(castOther.getIdTipoDocFe())))
                &&((this.getIdTipoArchivoCarga()==castOther.getIdTipoArchivoCarga())||(this.getIdTipoArchivoCarga()!=null&&castOther.getIdTipoArchivoCarga()!=null&&this.getIdTipoArchivoCarga().equals(castOther.getIdTipoArchivoCarga())));
    }

    public int hashCode(){
        int result=17;

        result=37*result+(getIdentificacionObligado()==null?0:this.getIdentificacionObligado().hashCode());
        result=37*result+(getNoDocumento()==null?0:this.getNoDocumento().hashCode());
        result=37*result+(getIdTipoDocFe()==null?0:this.getIdTipoDocFe().hashCode());
        result=37*result+(getIdTipoArchivoCarga()==null?0:this.getIdTipoArchivoCarga().hashCode());
        return result;
    }

}
