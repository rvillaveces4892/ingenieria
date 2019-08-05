package guru.springframework.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * ConfEnvioObligado entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONF_ENVIO_OBLIGADO",schema="ENVIO_SELECT")
@XmlRootElement
//@Cache(region="CONFIG_ENVIO_OBLIGADO_REGION",usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ConfEnvioObligado implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-4309350257557448139L;
    private ConfEnvioObligadoId id;
    private TipoAdjunto tipoAdjunto;
    private Enviador enviador;
    private TipoEnvio tipoEnvio;
    private String rutaPlantilla;
    
    private String rutaXml;
    private String rutaPdf;
    private String xpathNombrePdf;
    private String rutaInsertos;
    private String rutaAdjuntos;
    private String sender;
    private String mascara;
    private Short prioridadEnvio;
    private String mensajeBaseSms;
    private Short incluirLecturabilidad;
    private String urlLecturabilidad;
    private String urlAceptacionRechazo;
    private String rutaSalidaPdfXml;
    private Short estado;
//    private Set<RegistroEnvio> registroEnvios=new HashSet<RegistroEnvio>(0);

    // Constructors

    /** default constructor */
    public ConfEnvioObligado(){
    }

    /** minimal constructor */
    public ConfEnvioObligado(ConfEnvioObligadoId id){
        this.id=id;
    }

    /** full constructor */
    public ConfEnvioObligado(ConfEnvioObligadoId id,Short tipoAdjunto,Short enviador,Short tipoEnvio,String rutaPlantilla,String rutaXml,String rutaPdf,String rutaInsertos,String sender,String mascara,Short prioridadEnvio,
            String mensajeBaseSms,Short incluirLecturabilidad,String urlLecturabilidad,Set<RegistroEnvio> registroEnvios){
        this.id=id;
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
//        this.registroEnvios=registroEnvios;
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
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_ADJUNTO")
//    @Column(name="ID_TIPO_ADJUNTO",insertable=false,updatable=false)
    public TipoAdjunto getTipoAdjunto(){
        return this.tipoAdjunto;
    }

    public void setTipoAdjunto(TipoAdjunto tipoAdjunto){
        this.tipoAdjunto=tipoAdjunto;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ENVIADOR")
//    @Column(name="ID_ENVIADOR",insertable=false,updatable=false)
    public Enviador getEnviador(){
        return this.enviador;
    }

    public void setEnviador(Enviador enviador){
        this.enviador=enviador;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_ENVIO",nullable=false,insertable=false,updatable=false)
//    @Column(name="ID_TIPO_ENVIO",insertable=false,updatable=false)
    public TipoEnvio getTipoEnvio(){
        return this.tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio){
        this.tipoEnvio=tipoEnvio;
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
    
    @Column(name="XPATH_NOMBRE_PDF",length=200)
    public String getXpathNombrePdf() {
		return xpathNombrePdf;
	}

	public void setXpathNombrePdf(String xpathNombrePdf) {
		this.xpathNombrePdf = xpathNombrePdf;
	}

	@Column(name="RUTA_INSERTOS",length=300)
    public String getRutaInsertos(){
        return this.rutaInsertos;
    }

    public void setRutaInsertos(String rutaInsertos){
        this.rutaInsertos=rutaInsertos;
    }
    
    
    @Column(name="RUTA_ADJUNTOS",length=300)
    public String getRutaAdjuntos(){
        return rutaAdjuntos;
    }

    public void setRutaAdjuntos(String rutaAdjuntos){
        this.rutaAdjuntos=rutaAdjuntos;
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
    
    @Column(name="URL_ACEPTACION_RECHAZO",length=300)
    public String getUrlAceptacionRechazo(){
        return urlAceptacionRechazo;
    }

    public void setUrlAceptacionRechazo(String urlAceptacionRechazo){
        this.urlAceptacionRechazo=urlAceptacionRechazo;
    }

//    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="confEnvioObligado")
//    public Set<RegistroEnvio> getRegistroEnvios(){
//        return this.registroEnvios;
//    }
//
//    public void setRegistroEnvios(Set<RegistroEnvio> registroEnvios){
//        this.registroEnvios=registroEnvios;
//    }

    public void setRutaSalidaPdfXml(String rutaSalidaPdfXml){
        this.rutaSalidaPdfXml=rutaSalidaPdfXml;
    }

    @Column(name="RUTA_SALIDA_PDF_XML",length=120)
    public String getRutaSalidaPdfXml(){
        return this.rutaSalidaPdfXml;
    }
    @Column(name="ESTADO")
    public Short getEstado(){
        return estado;
    }

    public void setEstado(Short estado){
        this.estado=estado;
    }
    
    
    

}