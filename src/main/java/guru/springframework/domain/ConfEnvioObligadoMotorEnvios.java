package guru.springframework.domain;

import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * ConfEnvioObligado entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONF_ENVIO_OBLIGADO",schema="ENVIO_SELECT")
public class ConfEnvioObligadoMotorEnvios implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-4309350257557447845L;
    private ConfEnvioObligadoId id;
    private Short idTipoAdjunto;
    private Short idEnviador;
    private String rutaPlantilla;
    private String rutaXml;
    private String rutaPdf;
    private String rutaInsertos;
    private String sender;
    private String mascara;
    private Short prioridadEnvio;
    private String mensajeBaseSms;
    private Short incluirLecturabilidad;
    private String urlLecturabilidad;

    // Constructors

    /** default constructor */
    public ConfEnvioObligadoMotorEnvios(){
    }

    /** full constructor */
    public ConfEnvioObligadoMotorEnvios(ConfEnvioObligadoId id,Short tipoAdjunto,Short enviador,Short tipoEnvio,String rutaPlantilla,String rutaXml,String rutaPdf,String rutaInsertos,String sender,String mascara,Short prioridadEnvio,
            String mensajeBaseSms,Short incluirLecturabilidad,String urlLecturabilidad,Set<RegistroEnvio> registroEnvios){
        this.id=id;
        this.idTipoAdjunto=tipoAdjunto;
        this.idEnviador=enviador;
        this.rutaPlantilla=rutaPlantilla;
        this.rutaXml=rutaXml;
        this.rutaPdf=rutaPdf;
        this.rutaInsertos=rutaInsertos;
        this.sender=sender;
        this.mascara=mascara;
        this.prioridadEnvio=prioridadEnvio;
        this.mensajeBaseSms=mensajeBaseSms;
        this.incluirLecturabilidad=incluirLecturabilidad;
        this.urlLecturabilidad=urlLecturabilidad;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),@AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false)),
            @AttributeOverride(name="idPrefijo",column=@Column(name="ID_PREFIJO",nullable=false)),@AttributeOverride(name="idTipoDocFe",column=@Column(name="ID_TIPO_DOC_FE",nullable=false)),
            @AttributeOverride(name="idTipoEnvio",column=@Column(name="ID_TIPO_ENVIO",nullable=false))})
    public ConfEnvioObligadoId getId(){
        return this.id;
    }

    public void setId(ConfEnvioObligadoId id){
        this.id=id;
    }
    @Column(name="ID_TIPO_ADJUNTO")
    public Short getIdTipoAdjunto(){
        return this.idTipoAdjunto;
    }

    public void setIdTipoAdjunto(Short tipoAdjunto){
        this.idTipoAdjunto=tipoAdjunto;
    }
    @Column(name="ID_ENVIADOR")
    public Short getIdEnviador(){
        return this.idEnviador;
    }

    public void setIdEnviador(Short idEnviador){
        this.idEnviador=idEnviador;
    }

    @Column(name="RUTA_PLANTILLA",length=200)
    public String getRutaPlantilla(){
        return this.rutaPlantilla;
    }

    public void setRutaPlantilla(String rutaPlantilla){
        this.rutaPlantilla=rutaPlantilla;
    }

    @Column(name="RUTA_XML",length=200)
    public String getRutaXml(){
        return this.rutaXml;
    }

    public void setRutaXml(String rutaXml){
        this.rutaXml=rutaXml;
    }

    @Column(name="RUTA_PDF",length=200)
    public String getRutaPdf(){
        return this.rutaPdf;
    }

    public void setRutaPdf(String rutaPdf){
        this.rutaPdf=rutaPdf;
    }

    @Column(name="RUTA_INSERTOS",length=300)
    public String getRutaInsertos(){
        return this.rutaInsertos;
    }

    public void setRutaInsertos(String rutaInsertos){
        this.rutaInsertos=rutaInsertos;
    }

    @Column(name="SENDER",length=100)
    public String getSender(){
        return this.sender;
    }

    public void setSender(String sender){
        this.sender=sender;
    }

    @Column(name="MASCARA",length=100)
    public String getMascara(){
        return this.mascara;
    }

    public void setMascara(String mascara){
        this.mascara=mascara;
    }

    @Column(name="PRIORIDAD_ENVIO")
    public Short getPrioridadEnvio(){
        return this.prioridadEnvio;
    }

    public void setPrioridadEnvio(Short prioridadEnvio){
        this.prioridadEnvio=prioridadEnvio;
    }

    @Column(name="MENSAJE_BASE_SMS",length=160)
    public String getMensajeBaseSms(){
        return this.mensajeBaseSms;
    }

    public void setMensajeBaseSms(String mensajeBaseSms){
        this.mensajeBaseSms=mensajeBaseSms;
    }

    @Column(name="INCLUIR_LECTURABILIDAD")
    public Short getIncluirLecturabilidad(){
        return this.incluirLecturabilidad;
    }

    public void setIncluirLecturabilidad(Short incluirLecturabilidad){
        this.incluirLecturabilidad=incluirLecturabilidad;
    }

    @Column(name="URL_LECTURABILIDAD",length=200)
    public String getUrlLecturabilidad(){
        return this.urlLecturabilidad;
    }

    public void setUrlLecturabilidad(String urlLecturabilidad){
        this.urlLecturabilidad=urlLecturabilidad;
    }

    @Override
    public String toString(){
        return "ConfEnvioObligadoMotorEnvios [id="+id+", idTipoAdjunto="+idTipoAdjunto+", idEnviador="+idEnviador+", rutaPlantilla="+rutaPlantilla+", rutaXml="+rutaXml+", rutaPdf="+rutaPdf+", rutaInsertos="+rutaInsertos+", sender="+sender
                +", mascara="+mascara+", prioridadEnvio="+prioridadEnvio+", mensajeBaseSms="+mensajeBaseSms+", incluirLecturabilidad="+incluirLecturabilidad+", urlLecturabilidad="+urlLecturabilidad+"]";
    }
    

}