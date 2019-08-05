//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * AuditoriaSolicitudSms entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="AUDITORIA_SOLICITUD_SMS"
    ,schema="FELECV3"
)

public class AuditoriaSolicitudSms   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=2416218443726412244L;
    private Short idAuditoriaSolicitudSms;
     private SolicitudActivacionSms solicitudActivacionSms;
     private EstadoSolicitudSms estadoSolicitudSms;
     private Timestamp fechaSolicitud;
     private String usuario;


    // Constructors

    /** default constructor */
    public AuditoriaSolicitudSms() {
    }

	/** minimal constructor */
    public AuditoriaSolicitudSms(Short idAuditoriaSolicitudSms) {
        this.idAuditoriaSolicitudSms = idAuditoriaSolicitudSms;
    }
    
    /** full constructor */
    public AuditoriaSolicitudSms(Short idAuditoriaSolicitudSms, SolicitudActivacionSms solicitudActivacionSms, EstadoSolicitudSms estadoSolicitudSms, Timestamp fechaSolicitud, String usuario) {
        this.idAuditoriaSolicitudSms = idAuditoriaSolicitudSms;
        this.solicitudActivacionSms = solicitudActivacionSms;
        this.estadoSolicitudSms = estadoSolicitudSms;
        this.fechaSolicitud = fechaSolicitud;
        this.usuario = usuario;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_AUDITORIA_SOLICITUD_SMS", unique=true, nullable=false)
    
    public Short getIdAuditoriaSolicitudSms() {
        return this.idAuditoriaSolicitudSms;
    }
    
    public void setIdAuditoriaSolicitudSms(Short idAuditoriaSolicitudSms) {
        this.idAuditoriaSolicitudSms = idAuditoriaSolicitudSms;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_SOLICITUD")

    public SolicitudActivacionSms getSolicitudActivacionSms() {
        return this.solicitudActivacionSms;
    }
    
    public void setSolicitudActivacionSms(SolicitudActivacionSms solicitudActivacionSms) {
        this.solicitudActivacionSms = solicitudActivacionSms;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_SOLICITUD_SMS")

    public EstadoSolicitudSms getEstadoSolicitudSms() {
        return this.estadoSolicitudSms;
    }
    
    public void setEstadoSolicitudSms(EstadoSolicitudSms estadoSolicitudSms) {
        this.estadoSolicitudSms = estadoSolicitudSms;
    }
    
    @Column(name="FECHA_SOLICITUD", length=26)

    public Timestamp getFechaSolicitud() {
        return this.fechaSolicitud;
    }
    
    public void setFechaSolicitud(Timestamp fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
    
    @Column(name="USUARIO", length=80)

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
   








}
