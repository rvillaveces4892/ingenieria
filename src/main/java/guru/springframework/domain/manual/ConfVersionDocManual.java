package guru.springframework.domain.manual;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ConfVersionDocManual entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONF_VERSION_DOC_MANUAL",schema="FELECV3")
public class ConfVersionDocManual implements java.io.Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID=2877375560747670988L;
    
    // Fields

    private ConfVersionDocManualId id;
    private Short idPrefijo;
    private String rutaXtls;

    // Constructors

    /** default constructor */
    public ConfVersionDocManual(){
    }

    /** minimal constructor */
    public ConfVersionDocManual(ConfVersionDocManualId id,Short idPrefijo){
        this.id=id;
        this.idPrefijo=idPrefijo;
    }

    /** full constructor */
    public ConfVersionDocManual(ConfVersionDocManualId id,Short idPrefijo,String rutaXtls){
        this.id=id;
        this.idPrefijo=idPrefijo;
        this.rutaXtls=rutaXtls;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),@AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false)),
            @AttributeOverride(name="versionDocManual",column=@Column(name="VERSION_DOC_MANUAL",nullable=false))})
    public ConfVersionDocManualId getId(){
        return this.id;
    }

    public void setId(ConfVersionDocManualId id){
        this.id=id;
    }

    @Column(name="ID_PREFIJO",nullable=false)
    public Short getIdPrefijo(){
        return this.idPrefijo;
    }

    public void setIdPrefijo(Short idPrefijo){
        this.idPrefijo=idPrefijo;
    }

    @Column(name="RUTA_XTLS",length=100)
    public String getRutaXtls(){
        return this.rutaXtls;
    }

    public void setRutaXtls(String rutaXtls){
        this.rutaXtls=rutaXtls;
    }

}