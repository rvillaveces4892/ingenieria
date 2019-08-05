package guru.springframework.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RegistroEnvio entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="REGISTRO_ENVIO",schema="ENVIO_SELECT")
public class RegistroEnvio implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=576549558495429635L;
    private Long idEnvio;
    private TipoEnvio tipoEnvio;
    private GestionEnvio gestionEnvio;
    private ConfEnvioObligado confEnvioObligado;
    private EstadoEnvio estadoEnvio;
    private String noDocumento;
    private Timestamp fechaEnvio;
    private Timestamp fechaUltimaGestion;
    private String destino;
    private String sender;
    private String mascara;
    private String mensajeSms;
    private String urlCorta;
    private String hashUrlCorta;
    private Short idEnviadorSms;
    private Set<MovimientoGestionEnvio> movimientoGestionEnvios=new HashSet<MovimientoGestionEnvio>(0);
    private Set<DetalleLecturaEnvio> detalleLecturaEnvios=new HashSet<DetalleLecturaEnvio>(0);

    // Constructors

    /** default constructor */
    public RegistroEnvio(){
    }
    
    public RegistroEnvio(TipoEnvio tipoEnvio,GestionEnvio gestionEnvio,ConfEnvioObligado confEnvioObligado,EstadoEnvio estadoEnvio,String noDocumento){
        this.tipoEnvio=tipoEnvio;
        this.gestionEnvio=gestionEnvio;
        this.confEnvioObligado=confEnvioObligado;
        this.estadoEnvio=estadoEnvio;
        this.noDocumento=noDocumento;
    }

    /** minimal constructor */
    public RegistroEnvio(Long idEnvio,TipoEnvio tipoEnvio,GestionEnvio gestionEnvio,ConfEnvioObligado confEnvioObligado,EstadoEnvio estadoEnvio,String noDocumento){
        this.idEnvio=idEnvio;
        this.tipoEnvio=tipoEnvio;
        this.gestionEnvio=gestionEnvio;
        this.confEnvioObligado=confEnvioObligado;
        this.estadoEnvio=estadoEnvio;
        this.noDocumento=noDocumento;
    }

    /** full constructor */
    public RegistroEnvio(Long idEnvio,TipoEnvio tipoEnvio,GestionEnvio gestionEnvio,ConfEnvioObligado confEnvioObligado,EstadoEnvio estadoEnvio,String noDocumento,Timestamp fechaEnvio,Timestamp fechaUltimaGestion,String destino,String sender,
            String mascara,String mensajeSms,String urlCorta,String hashUrlCorta,Short idEnviadorSms,Set<MovimientoGestionEnvio> movimientoGestionEnvios,Set<DetalleLecturaEnvio> detalleLecturaEnvios){
        this.idEnvio=idEnvio;
        this.tipoEnvio=tipoEnvio;
        this.gestionEnvio=gestionEnvio;
        this.confEnvioObligado=confEnvioObligado;
        this.estadoEnvio=estadoEnvio;
        this.noDocumento=noDocumento;
        this.fechaEnvio=fechaEnvio;
        this.fechaUltimaGestion=fechaUltimaGestion;
        this.destino=destino;
        this.sender=sender;
        this.mascara=mascara;
        this.mensajeSms=mensajeSms;
        this.urlCorta=urlCorta;
        this.hashUrlCorta=hashUrlCorta;
        this.idEnviadorSms=idEnviadorSms;
        this.movimientoGestionEnvios=movimientoGestionEnvios;
        this.detalleLecturaEnvios=detalleLecturaEnvios;
    }

    // Property accessors
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_ENVIO",unique=true,nullable=false)
    public Long getIdEnvio(){
        return this.idEnvio;
    }

    public void setIdEnvio(Long idEnvio){
        this.idEnvio=idEnvio;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_ENVIO",nullable=false)
    public TipoEnvio getTipoEnvio(){
        return this.tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio){
        this.tipoEnvio=tipoEnvio;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CODIGO_GESTION",nullable=false)
    public GestionEnvio getGestionEnvio(){
        return this.gestionEnvio;
    }

    public void setGestionEnvio(GestionEnvio gestionEnvio){
        this.gestionEnvio=gestionEnvio;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns({@JoinColumn(name="IDENTIFICACION_OBLIGADO",referencedColumnName="IDENTIFICACION_OBLIGADO",nullable=false,insertable=false,updatable=false),
            @JoinColumn(name="NUM_RESOLU_DIAN",referencedColumnName="NUM_RESOLU_DIAN",nullable=false,insertable=false,updatable=false),@JoinColumn(name="ID_PREFIJO",referencedColumnName="ID_PREFIJO",nullable=false,insertable=false,updatable=false),
            @JoinColumn(name="ID_TIPO_DOC_FE",referencedColumnName="ID_TIPO_DOC_FE",nullable=false,insertable=false,updatable=false),
            @JoinColumn(name="ID_TIPO_ENVIO",referencedColumnName="ID_TIPO_ENVIO",nullable=false,insertable=false,updatable=false)})
    public ConfEnvioObligado getConfEnvioObligado(){
        return this.confEnvioObligado;
    }

    public void setConfEnvioObligado(ConfEnvioObligado confEnvioObligado){
        this.confEnvioObligado=confEnvioObligado;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ESTADO_ENVIO",nullable=false)
    public EstadoEnvio getEstadoEnvio(){
        return this.estadoEnvio;
    }

    public void setEstadoEnvio(EstadoEnvio estadoEnvio){
        this.estadoEnvio=estadoEnvio;
    }

    @Column(name="NO_DOCUMENTO",nullable=false,length=30)
    public String getNoDocumento(){
        return this.noDocumento;
    }

    public void setNoDocumento(String noDocumento){
        this.noDocumento=noDocumento;
    }

    @Column(name="FECHA_ENVIO",length=26)
    public Timestamp getFechaEnvio(){
        return this.fechaEnvio;
    }

    public void setFechaEnvio(Timestamp fechaEnvio){
        this.fechaEnvio=fechaEnvio;
    }

    @Column(name="FECHA_ULTIMA_GESTION",length=26)
    public Timestamp getFechaUltimaGestion(){
        return this.fechaUltimaGestion;
    }

    public void setFechaUltimaGestion(Timestamp fechaUltimaGestion){
        this.fechaUltimaGestion=fechaUltimaGestion;
    }

    @Column(name="DESTINO",length=200)
    public String getDestino(){
        return this.destino;
    }

    public void setDestino(String destino){
        this.destino=destino;
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

    @Column(name="MENSAJE_SMS",length=160)
    public String getMensajeSms(){
        return this.mensajeSms;
    }

    public void setMensajeSms(String mensajeSms){
        this.mensajeSms=mensajeSms;
    }

    @Column(name="URL_CORTA",length=30)
    public String getUrlCorta(){
        return this.urlCorta;
    }

    public void setUrlCorta(String urlCorta){
        this.urlCorta=urlCorta;
    }

    @Column(name="HASH_URL_CORTA",length=30)
    public String getHashUrlCorta(){
        return this.hashUrlCorta;
    }

    public void setHashUrlCorta(String hashUrlCorta){
        this.hashUrlCorta=hashUrlCorta;
    }

    @Column(name="ID_ENVIADOR_SMS")
    public Short getIdEnviadorSms(){
        return this.idEnviadorSms;
    }

    public void setIdEnviadorSms(Short idEnviadorSms){
        this.idEnviadorSms=idEnviadorSms;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="registroEnvio")
    public Set<MovimientoGestionEnvio> getMovimientoGestionEnvios(){
        return this.movimientoGestionEnvios;
    }

    public void setMovimientoGestionEnvios(Set<MovimientoGestionEnvio> movimientoGestionEnvios){
        this.movimientoGestionEnvios=movimientoGestionEnvios;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="registroEnvio")
    public Set<DetalleLecturaEnvio> getDetalleLecturaEnvios(){
        return this.detalleLecturaEnvios;
    }

    public void setDetalleLecturaEnvios(Set<DetalleLecturaEnvio> detalleLecturaEnvios){
        this.detalleLecturaEnvios=detalleLecturaEnvios;
    }


    
    

}