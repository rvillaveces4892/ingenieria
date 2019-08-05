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
import guru.springframework.domain.manual.DocumentoManual;


/**
 * ObligadoFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="OBLIGADO_FE"
    ,schema="FELECV3"
)

public class ObligadoFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6831396228998673L;
    private Long identificacionObligado;
     private EstadoObligado estadoObligado;
     private PaisFe paisFe;
     private TipoResolucion tipoResolucion;
     private TipoRegimenFe tipoRegimenFe;
     private TipoDocIdentificacion tipoDocIdentificacion;
     private TipoPersona tipoPersona;
     private String razonSocial;
     private String email;
     private String plantillaInvitacion;
     private String plantillaNotificacion;
     private String direccion;
     private String ciudad;
     private String departamento;
     private String subdivision;
     private Set<EventoNotificacionOfe> eventoNotificacionOfes = new HashSet<EventoNotificacionOfe>(0);
     private Set<ImpuestoSelect> impuestoSelects = new HashSet<ImpuestoSelect>(0);
     private Set<AcuerdoMovimientoFe> acuerdoMovimientoFes = new HashSet<AcuerdoMovimientoFe>(0);
     private Set<ConfigNotificacionOfe> configNotificacionOfes = new HashSet<ConfigNotificacionOfe>(0);
     private Set<DetalleVerificacionDocDian> detalleVerificacionDocDians = new HashSet<DetalleVerificacionDocDian>(0);
     private Set<DocumentoFe> documentoFes = new HashSet<DocumentoFe>(0);
     private Set<ConfigHorarioCarga> configHorarioCargas = new HashSet<ConfigHorarioCarga>(0);
     private Set<CuentaAsociada> cuentaAsociadas = new HashSet<CuentaAsociada>(0);
     private Set<Notificacion> notificacions = new HashSet<Notificacion>(0);
     private Set<RelacionGrupoEmpresa> relacionGrupoEmpresas = new HashSet<RelacionGrupoEmpresa>(0);
     private Set<ConfigSftpInternoSelect> configSftpInternoSelects = new HashSet<ConfigSftpInternoSelect>(0);
     private Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes = new HashSet<DatoDocumentoAdquiriente>(0);
     private Set<RegistroDocumentoRecepcion> registroDocumentoRecepcions = new HashSet<RegistroDocumentoRecepcion>(0);
     private Set<DocumentoManual> documentoManuals = new HashSet<DocumentoManual>(0);
     private Set<UsuarioFelec> usuarioFelecs = new HashSet<UsuarioFelec>(0);
     private Set<NotificacionConsolidado> notificacionConsolidados = new HashSet<NotificacionConsolidado>(0);
     private Set<DatoAcuerdoFe> datoAcuerdoFes = new HashSet<DatoAcuerdoFe>(0);
     private Set<OfeAdquiriente> ofeAdquirientes = new HashSet<OfeAdquiriente>(0);
     private Set<NodoObligadoDocumento> nodoObligadoDocumentos = new HashSet<NodoObligadoDocumento>(0);


    // Constructors

    /** default constructor */
    public ObligadoFe() {
    }
    
    /** minimal constructor */
    public ObligadoFe(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }

    
	/** minimal constructor */
    public ObligadoFe(Long identificacionObligado, String razonSocial, String email) {
        this.identificacionObligado = identificacionObligado;
        this.razonSocial = razonSocial;
        this.email = email;
    }
    
    /** full constructor */
    public ObligadoFe(Long identificacionObligado, EstadoObligado estadoObligado, PaisFe paisFe, TipoResolucion tipoResolucion, TipoRegimenFe tipoRegimenFe, TipoDocIdentificacion tipoDocIdentificacion, TipoPersona tipoPersona, String razonSocial, String email, String plantillaInvitacion, String plantillaNotificacion, String direccion, String ciudad, String departamento, String subdivision, Set<EventoNotificacionOfe> eventoNotificacionOfes, Set<ImpuestoSelect> impuestoSelects, Set<AcuerdoMovimientoFe> acuerdoMovimientoFes, Set<ConfigNotificacionOfe> configNotificacionOfes, Set<DetalleVerificacionDocDian> detalleVerificacionDocDians, Set<DocumentoFe> documentoFes, Set<ConfigHorarioCarga> configHorarioCargas, Set<CuentaAsociada> cuentaAsociadas, Set<Notificacion> notificacions, Set<RelacionGrupoEmpresa> relacionGrupoEmpresas, Set<ConfigSftpInternoSelect> configSftpInternoSelects, Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes, Set<RegistroDocumentoRecepcion> registroDocumentoRecepcions, Set<DocumentoManual> documentoManuals, Set<UsuarioFelec> usuarioFelecs, Set<NotificacionConsolidado> notificacionConsolidados, Set<DatoAcuerdoFe> datoAcuerdoFes, Set<OfeAdquiriente> ofeAdquirientes, Set<NodoObligadoDocumento> nodoObligadoDocumentos) {
        this.identificacionObligado = identificacionObligado;
        this.estadoObligado = estadoObligado;
        this.paisFe = paisFe;
        this.tipoResolucion = tipoResolucion;
        this.tipoRegimenFe = tipoRegimenFe;
        this.tipoDocIdentificacion = tipoDocIdentificacion;
        this.tipoPersona = tipoPersona;
        this.razonSocial = razonSocial;
        this.email = email;
        this.plantillaInvitacion = plantillaInvitacion;
        this.plantillaNotificacion = plantillaNotificacion;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.subdivision = subdivision;
        this.eventoNotificacionOfes = eventoNotificacionOfes;
        this.impuestoSelects = impuestoSelects;
        this.acuerdoMovimientoFes = acuerdoMovimientoFes;
        this.configNotificacionOfes = configNotificacionOfes;
        this.detalleVerificacionDocDians = detalleVerificacionDocDians;
        this.documentoFes = documentoFes;
        this.configHorarioCargas = configHorarioCargas;
        this.cuentaAsociadas = cuentaAsociadas;
        this.notificacions = notificacions;
        this.relacionGrupoEmpresas = relacionGrupoEmpresas;
        this.configSftpInternoSelects = configSftpInternoSelects;
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
        this.registroDocumentoRecepcions = registroDocumentoRecepcions;
        this.documentoManuals = documentoManuals;
        this.usuarioFelecs = usuarioFelecs;
        this.notificacionConsolidados = notificacionConsolidados;
        this.datoAcuerdoFes = datoAcuerdoFes;
        this.ofeAdquirientes = ofeAdquirientes;
        this.nodoObligadoDocumentos = nodoObligadoDocumentos;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="IDENTIFICACION_OBLIGADO", unique=true, nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_OBLIGADO")

    public EstadoObligado getEstadoObligado() {
        return this.estadoObligado;
    }
    
    public void setEstadoObligado(EstadoObligado estadoObligado) {
        this.estadoObligado = estadoObligado;
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
        @JoinColumn(name="ID_TIPO_RESOLUCION")

    public TipoResolucion getTipoResolucion() {
        return this.tipoResolucion;
    }
    
    public void setTipoResolucion(TipoResolucion tipoResolucion) {
        this.tipoResolucion = tipoResolucion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_REGIMEN")

    public TipoRegimenFe getTipoRegimenFe() {
        return this.tipoRegimenFe;
    }
    
    public void setTipoRegimenFe(TipoRegimenFe tipoRegimenFe) {
        this.tipoRegimenFe = tipoRegimenFe;
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
    
    @Column(name="RAZON_SOCIAL", nullable=false, length=120)

    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    @Column(name="EMAIL", nullable=false, length=100)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="PLANTILLA_INVITACION")

    public String getPlantillaInvitacion() {
        return this.plantillaInvitacion;
    }
    
    public void setPlantillaInvitacion(String plantillaInvitacion) {
        this.plantillaInvitacion = plantillaInvitacion;
    }
    
    @Column(name="PLANTILLA_NOTIFICACION")

    public String getPlantillaNotificacion() {
        return this.plantillaNotificacion;
    }
    
    public void setPlantillaNotificacion(String plantillaNotificacion) {
        this.plantillaNotificacion = plantillaNotificacion;
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
    
    @Column(name="SUBDIVISION", length=100)

    public String getSubdivision() {
        return this.subdivision;
    }
    
    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<EventoNotificacionOfe> getEventoNotificacionOfes() {
        return this.eventoNotificacionOfes;
    }
    
    public void setEventoNotificacionOfes(Set<EventoNotificacionOfe> eventoNotificacionOfes) {
        this.eventoNotificacionOfes = eventoNotificacionOfes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<ImpuestoSelect> getImpuestoSelects() {
        return this.impuestoSelects;
    }
    
    public void setImpuestoSelects(Set<ImpuestoSelect> impuestoSelects) {
        this.impuestoSelects = impuestoSelects;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<AcuerdoMovimientoFe> getAcuerdoMovimientoFes() {
        return this.acuerdoMovimientoFes;
    }
    
    public void setAcuerdoMovimientoFes(Set<AcuerdoMovimientoFe> acuerdoMovimientoFes) {
        this.acuerdoMovimientoFes = acuerdoMovimientoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<ConfigNotificacionOfe> getConfigNotificacionOfes() {
        return this.configNotificacionOfes;
    }
    
    public void setConfigNotificacionOfes(Set<ConfigNotificacionOfe> configNotificacionOfes) {
        this.configNotificacionOfes = configNotificacionOfes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<DetalleVerificacionDocDian> getDetalleVerificacionDocDians() {
        return this.detalleVerificacionDocDians;
    }
    
    public void setDetalleVerificacionDocDians(Set<DetalleVerificacionDocDian> detalleVerificacionDocDians) {
        this.detalleVerificacionDocDians = detalleVerificacionDocDians;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<DocumentoFe> getDocumentoFes() {
        return this.documentoFes;
    }
    
    public void setDocumentoFes(Set<DocumentoFe> documentoFes) {
        this.documentoFes = documentoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<ConfigHorarioCarga> getConfigHorarioCargas() {
        return this.configHorarioCargas;
    }
    
    public void setConfigHorarioCargas(Set<ConfigHorarioCarga> configHorarioCargas) {
        this.configHorarioCargas = configHorarioCargas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<CuentaAsociada> getCuentaAsociadas() {
        return this.cuentaAsociadas;
    }
    
    public void setCuentaAsociadas(Set<CuentaAsociada> cuentaAsociadas) {
        this.cuentaAsociadas = cuentaAsociadas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<Notificacion> getNotificacions() {
        return this.notificacions;
    }
    
    public void setNotificacions(Set<Notificacion> notificacions) {
        this.notificacions = notificacions;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<RelacionGrupoEmpresa> getRelacionGrupoEmpresas() {
        return this.relacionGrupoEmpresas;
    }
    
    public void setRelacionGrupoEmpresas(Set<RelacionGrupoEmpresa> relacionGrupoEmpresas) {
        this.relacionGrupoEmpresas = relacionGrupoEmpresas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<ConfigSftpInternoSelect> getConfigSftpInternoSelects() {
        return this.configSftpInternoSelects;
    }
    
    public void setConfigSftpInternoSelects(Set<ConfigSftpInternoSelect> configSftpInternoSelects) {
        this.configSftpInternoSelects = configSftpInternoSelects;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<DatoDocumentoAdquiriente> getDatoDocumentoAdquirientes() {
        return this.datoDocumentoAdquirientes;
    }
    
    public void setDatoDocumentoAdquirientes(Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes) {
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<RegistroDocumentoRecepcion> getRegistroDocumentoRecepcions() {
        return this.registroDocumentoRecepcions;
    }
    
    public void setRegistroDocumentoRecepcions(Set<RegistroDocumentoRecepcion> registroDocumentoRecepcions) {
        this.registroDocumentoRecepcions = registroDocumentoRecepcions;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<DocumentoManual> getDocumentoManuals() {
        return this.documentoManuals;
    }
    
    public void setDocumentoManuals(Set<DocumentoManual> documentoManuals) {
        this.documentoManuals = documentoManuals;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<UsuarioFelec> getUsuarioFelecs() {
        return this.usuarioFelecs;
    }
    
    public void setUsuarioFelecs(Set<UsuarioFelec> usuarioFelecs) {
        this.usuarioFelecs = usuarioFelecs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<NotificacionConsolidado> getNotificacionConsolidados() {
        return this.notificacionConsolidados;
    }
    
    public void setNotificacionConsolidados(Set<NotificacionConsolidado> notificacionConsolidados) {
        this.notificacionConsolidados = notificacionConsolidados;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<DatoAcuerdoFe> getDatoAcuerdoFes() {
        return this.datoAcuerdoFes;
    }
    
    public void setDatoAcuerdoFes(Set<DatoAcuerdoFe> datoAcuerdoFes) {
        this.datoAcuerdoFes = datoAcuerdoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<OfeAdquiriente> getOfeAdquirientes() {
        return this.ofeAdquirientes;
    }
    
    public void setOfeAdquirientes(Set<OfeAdquiriente> ofeAdquirientes) {
        this.ofeAdquirientes = ofeAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="obligadoFe")

    public Set<NodoObligadoDocumento> getNodoObligadoDocumentos() {
        return this.nodoObligadoDocumentos;
    }
    
    public void setNodoObligadoDocumentos(Set<NodoObligadoDocumento> nodoObligadoDocumentos) {
        this.nodoObligadoDocumentos = nodoObligadoDocumentos;
    }
   








}
