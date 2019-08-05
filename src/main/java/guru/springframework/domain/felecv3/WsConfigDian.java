//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * WsConfigDian entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="WS_CONFIG_DIAN"
    ,schema="FELECV3"
)

public class WsConfigDian   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5764011794530386071L;
    private WsConfigDianId id;
     private Aplicacion aplicacion;
     private String aplicacion_1;
     private Short esProduccion;
     private String urlPruebas;
     private String urlProduccion;
     private String userPruebas;
     private String passwordPruebas;
     private String userProduccion;
     private String passwordProduccion;
     private String endPointProd;
     private String endPointPrue;
     private String apiKey;


    // Constructors

    /** default constructor */
    public WsConfigDian() {
    }

	/** minimal constructor */
    public WsConfigDian(WsConfigDianId id, Aplicacion aplicacion, String apiKey) {
        this.id = id;
        this.aplicacion = aplicacion;
        this.apiKey = apiKey;
    }
    
    /** full constructor */
    public WsConfigDian(WsConfigDianId id, Aplicacion aplicacion, String aplicacion_1, Short esProduccion, String urlPruebas, String urlProduccion, String userPruebas, String passwordPruebas, String userProduccion, String passwordProduccion, String endPointProd, String endPointPrue, String apiKey) {
        this.id = id;
        this.aplicacion = aplicacion;
        this.aplicacion_1 = aplicacion_1;
        this.esProduccion = esProduccion;
        this.urlPruebas = urlPruebas;
        this.urlProduccion = urlProduccion;
        this.userPruebas = userPruebas;
        this.passwordPruebas = passwordPruebas;
        this.userProduccion = userProduccion;
        this.passwordProduccion = passwordProduccion;
        this.endPointProd = endPointProd;
        this.endPointPrue = endPointPrue;
        this.apiKey = apiKey;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="idAplicacion", column=@Column(name="ID_APLICACION", nullable=false) ) } )

    public WsConfigDianId getId() {
        return this.id;
    }
    
    public void setId(WsConfigDianId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_APLICACION", nullable=false, insertable=false, updatable=false)

    public Aplicacion getAplicacion() {
        return this.aplicacion;
    }
    
    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }
    
    @Column(name="APLICACION", length=50)

    public String getAplicacion_1() {
        return this.aplicacion_1;
    }
    
    public void setAplicacion_1(String aplicacion_1) {
        this.aplicacion_1 = aplicacion_1;
    }
    
    @Column(name="ES_PRODUCCION")

    public Short getEsProduccion() {
        return this.esProduccion;
    }
    
    public void setEsProduccion(Short esProduccion) {
        this.esProduccion = esProduccion;
    }
    
    @Column(name="URL_PRUEBAS", length=500)

    public String getUrlPruebas() {
        return this.urlPruebas;
    }
    
    public void setUrlPruebas(String urlPruebas) {
        this.urlPruebas = urlPruebas;
    }
    
    @Column(name="URL_PRODUCCION", length=500)

    public String getUrlProduccion() {
        return this.urlProduccion;
    }
    
    public void setUrlProduccion(String urlProduccion) {
        this.urlProduccion = urlProduccion;
    }
    
    @Column(name="USER_PRUEBAS", length=50)

    public String getUserPruebas() {
        return this.userPruebas;
    }
    
    public void setUserPruebas(String userPruebas) {
        this.userPruebas = userPruebas;
    }
    
    @Column(name="PASSWORD_PRUEBAS", length=50)

    public String getPasswordPruebas() {
        return this.passwordPruebas;
    }
    
    public void setPasswordPruebas(String passwordPruebas) {
        this.passwordPruebas = passwordPruebas;
    }
    
    @Column(name="USER_PRODUCCION", length=50)

    public String getUserProduccion() {
        return this.userProduccion;
    }
    
    public void setUserProduccion(String userProduccion) {
        this.userProduccion = userProduccion;
    }
    
    @Column(name="PASSWORD_PRODUCCION", length=50)

    public String getPasswordProduccion() {
        return this.passwordProduccion;
    }
    
    public void setPasswordProduccion(String passwordProduccion) {
        this.passwordProduccion = passwordProduccion;
    }
    
    @Column(name="END_POINT_PROD", length=200)

    public String getEndPointProd() {
        return this.endPointProd;
    }
    
    public void setEndPointProd(String endPointProd) {
        this.endPointProd = endPointProd;
    }
    
    @Column(name="END_POINT_PRUE", length=200)

    public String getEndPointPrue() {
        return this.endPointPrue;
    }
    
    public void setEndPointPrue(String endPointPrue) {
        this.endPointPrue = endPointPrue;
    }
    
    @Column(name="API_KEY", nullable=false, length=60)

    public String getApiKey() {
        return this.apiKey;
    }
    
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
   








}
