//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ConfiguracionPayuSelect entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONFIGURACION_PAYU_SELECT"
    ,schema="FELECV3"
)

public class ConfiguracionPayuSelect   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=2465795345713542342L;
    private ConfiguracionPayuSelectId id;
     private String merchantId;
     private String accountId;
     private String apiKey;
     private String apiLogin;
     private String gatewayPayu;
     private String claveEncriptacion;


    // Constructors

    /** default constructor */
    public ConfiguracionPayuSelect() {
    }

	/** minimal constructor */
    public ConfiguracionPayuSelect(ConfiguracionPayuSelectId id) {
        this.id = id;
    }
    
    /** full constructor */
    public ConfiguracionPayuSelect(ConfiguracionPayuSelectId id, String merchantId, String accountId, String apiKey, String apiLogin, String gatewayPayu, String claveEncriptacion) {
        this.id = id;
        this.merchantId = merchantId;
        this.accountId = accountId;
        this.apiKey = apiKey;
        this.apiLogin = apiLogin;
        this.gatewayPayu = gatewayPayu;
        this.claveEncriptacion = claveEncriptacion;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="numeroResolucion", column=@Column(name="NUMERO_RESOLUCION", nullable=false) ) } )

    public ConfiguracionPayuSelectId getId() {
        return this.id;
    }
    
    public void setId(ConfiguracionPayuSelectId id) {
        this.id = id;
    }
    
    @Column(name="MERCHANT_ID", length=20)

    public String getMerchantId() {
        return this.merchantId;
    }
    
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
    
    @Column(name="ACCOUNT_ID", length=20)

    public String getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    @Column(name="API_KEY", length=100)

    public String getApiKey() {
        return this.apiKey;
    }
    
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
    
    @Column(name="API_LOGIN", length=100)

    public String getApiLogin() {
        return this.apiLogin;
    }
    
    public void setApiLogin(String apiLogin) {
        this.apiLogin = apiLogin;
    }
    
    @Column(name="GATEWAY_PAYU", length=150)

    public String getGatewayPayu() {
        return this.gatewayPayu;
    }
    
    public void setGatewayPayu(String gatewayPayu) {
        this.gatewayPayu = gatewayPayu;
    }
    
    @Column(name="CLAVE_ENCRIPTACION", length=40)

    public String getClaveEncriptacion() {
        return this.claveEncriptacion;
    }
    
    public void setClaveEncriptacion(String claveEncriptacion) {
        this.claveEncriptacion = claveEncriptacion;
    }
   








}
