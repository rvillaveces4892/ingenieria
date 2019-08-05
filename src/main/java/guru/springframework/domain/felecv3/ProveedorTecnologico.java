//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ProveedorTecnologico entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="PROVEEDOR_TECNOLOGICO"
    ,schema="FELECV3"
)

public class ProveedorTecnologico   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-385392819653358284L;
    private Long idProveedorTecnologico;
     private PaisFe paisFe;
     private TipoDocIdentificacion tipoDocIdentificacion;
     private TipoPersona tipoPersona;
     private String razonSocial;
     private String telefono;
     private String email;
     private String direccion;
     private String ciudad;
     private String departamento;
     private Set<NotificacionConsolidado> notificacionConsolidados = new HashSet<NotificacionConsolidado>(0);
     private Set<EventoNotificacionPt> eventoNotificacionPts = new HashSet<EventoNotificacionPt>(0);
     private Set<Notificacion> notificacions = new HashSet<Notificacion>(0);


    // Constructors

    /** default constructor */
    public ProveedorTecnologico() {
    }

	/** minimal constructor */
    public ProveedorTecnologico(Long idProveedorTecnologico) {
        this.idProveedorTecnologico = idProveedorTecnologico;
    }
    
    /** full constructor */
    public ProveedorTecnologico(Long idProveedorTecnologico, PaisFe paisFe, TipoDocIdentificacion tipoDocIdentificacion, TipoPersona tipoPersona, String razonSocial, String telefono, String email, String direccion, String ciudad, String departamento, Set<NotificacionConsolidado> notificacionConsolidados, Set<EventoNotificacionPt> eventoNotificacionPts, Set<Notificacion> notificacions) {
        this.idProveedorTecnologico = idProveedorTecnologico;
        this.paisFe = paisFe;
        this.tipoDocIdentificacion = tipoDocIdentificacion;
        this.tipoPersona = tipoPersona;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.notificacionConsolidados = notificacionConsolidados;
        this.eventoNotificacionPts = eventoNotificacionPts;
        this.notificacions = notificacions;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_PROVEEDOR_TECNOLOGICO", unique=true, nullable=false)

    public Long getIdProveedorTecnologico() {
        return this.idProveedorTecnologico;
    }
    
    public void setIdProveedorTecnologico(Long idProveedorTecnologico) {
        this.idProveedorTecnologico = idProveedorTecnologico;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="CODIGO_PAIS")

    public PaisFe getPaisFe() {
        return this.paisFe;
    }
    
    public void setPaisFe(PaisFe paisFe) {
        this.paisFe = paisFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_DOC_IDENTIFICACION")

    public TipoDocIdentificacion getTipoDocIdentificacion() {
        return this.tipoDocIdentificacion;
    }
    
    public void setTipoDocIdentificacion(TipoDocIdentificacion tipoDocIdentificacion) {
        this.tipoDocIdentificacion = tipoDocIdentificacion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_PERSONA")

    public TipoPersona getTipoPersona() {
        return this.tipoPersona;
    }
    
    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
    
    @Column(name="RAZON_SOCIAL", length=120)

    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    @Column(name="TELEFONO", length=15)

    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Column(name="EMAIL", length=100)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="DIRECCION", length=300)

    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="CIUDAD", length=100)

    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Column(name="DEPARTAMENTO", length=100)

    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="proveedorTecnologico")

    public Set<NotificacionConsolidado> getNotificacionConsolidados() {
        return this.notificacionConsolidados;
    }
    
    public void setNotificacionConsolidados(Set<NotificacionConsolidado> notificacionConsolidados) {
        this.notificacionConsolidados = notificacionConsolidados;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="proveedorTecnologico")

    public Set<EventoNotificacionPt> getEventoNotificacionPts() {
        return this.eventoNotificacionPts;
    }
    
    public void setEventoNotificacionPts(Set<EventoNotificacionPt> eventoNotificacionPts) {
        this.eventoNotificacionPts = eventoNotificacionPts;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="proveedorTecnologico")

    public Set<Notificacion> getNotificacions() {
        return this.notificacions;
    }
    
    public void setNotificacions(Set<Notificacion> notificacions) {
        this.notificacions = notificacions;
    }
   








}
