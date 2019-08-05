//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * AuditoriaTransaccionPayuSelect entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="AUDITORIA_TRANSACCION_PAYU_SELECT"
    ,schema="FELECV3"
)

public class AuditoriaTransaccionPayuSelect   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6295044830005980971L;
    private Long idTransaccion;
     private EstadoTransaccionPayu estadoTransaccionPayu;
     private String refPago;
     private Timestamp fechaTransaccion;
     private String ipTransaccion;
     private String medioDePago;
     private String navegadorUsado;
     private String noDocumento;
     private String sondeado;
     private String usuario;
     private Long idObligado;


    // Constructors

    /** default constructor */
    public AuditoriaTransaccionPayuSelect() {
    }

	/** minimal constructor */
    public AuditoriaTransaccionPayuSelect(Long idTransaccion, EstadoTransaccionPayu estadoTransaccionPayu, String refPago, Timestamp fechaTransaccion, String noDocumento, String sondeado, Long idObligado) {
        this.idTransaccion = idTransaccion;
        this.estadoTransaccionPayu = estadoTransaccionPayu;
        this.refPago = refPago;
        this.fechaTransaccion = fechaTransaccion;
        this.noDocumento = noDocumento;
        this.sondeado = sondeado;
        this.idObligado = idObligado;
    }
    
    /** full constructor */
    public AuditoriaTransaccionPayuSelect(Long idTransaccion, EstadoTransaccionPayu estadoTransaccionPayu, String refPago, Timestamp fechaTransaccion, String ipTransaccion, String medioDePago, String navegadorUsado, String noDocumento, String sondeado, String usuario, Long idObligado) {
        this.idTransaccion = idTransaccion;
        this.estadoTransaccionPayu = estadoTransaccionPayu;
        this.refPago = refPago;
        this.fechaTransaccion = fechaTransaccion;
        this.ipTransaccion = ipTransaccion;
        this.medioDePago = medioDePago;
        this.navegadorUsado = navegadorUsado;
        this.noDocumento = noDocumento;
        this.sondeado = sondeado;
        this.usuario = usuario;
        this.idObligado = idObligado;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TRANSACCION", unique=true, nullable=false)

    public Long getIdTransaccion() {
        return this.idTransaccion;
    }
    
    public void setIdTransaccion(Long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="MENSAJE_CODIGO_RESPUESTA", nullable=false)

    public EstadoTransaccionPayu getEstadoTransaccionPayu() {
        return this.estadoTransaccionPayu;
    }
    
    public void setEstadoTransaccionPayu(EstadoTransaccionPayu estadoTransaccionPayu) {
        this.estadoTransaccionPayu = estadoTransaccionPayu;
    }
    
    @Column(name="REF_PAGO", nullable=false, length=40)

    public String getRefPago() {
        return this.refPago;
    }
    
    public void setRefPago(String refPago) {
        this.refPago = refPago;
    }
    
    @Column(name="FECHA_TRANSACCION", nullable=false, length=26)

    public Timestamp getFechaTransaccion() {
        return this.fechaTransaccion;
    }
    
    public void setFechaTransaccion(Timestamp fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }
    
    @Column(name="IP_TRANSACCION", length=20)

    public String getIpTransaccion() {
        return this.ipTransaccion;
    }
    
    public void setIpTransaccion(String ipTransaccion) {
        this.ipTransaccion = ipTransaccion;
    }
    
    @Column(name="MEDIO_DE_PAGO", length=120)

    public String getMedioDePago() {
        return this.medioDePago;
    }
    
    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }
    
    @Column(name="NAVEGADOR_USADO", length=200)

    public String getNavegadorUsado() {
        return this.navegadorUsado;
    }
    
    public void setNavegadorUsado(String navegadorUsado) {
        this.navegadorUsado = navegadorUsado;
    }
    
    @Column(name="NO_DOCUMENTO", nullable=false, length=30)

    public String getNoDocumento() {
        return this.noDocumento;
    }
    
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }
    
    @Column(name="SONDEADO", nullable=false, length=1)

    public String getSondeado() {
        return this.sondeado;
    }
    
    public void setSondeado(String sondeado) {
        this.sondeado = sondeado;
    }
    
    @Column(name="USUARIO", length=100)

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @Column(name="ID_OBLIGADO", nullable=false)

    public Long getIdObligado() {
        return this.idObligado;
    }
    
    public void setIdObligado(Long idObligado) {
        this.idObligado = idObligado;
    }
   








}
