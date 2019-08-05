//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;
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

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * RegistroDocumentoRecepcion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="REGISTRO_DOCUMENTO_RECEPCION"
    ,schema="FELECV3"
)

public class RegistroDocumentoRecepcion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6902088388622845613L;
    private RegistroDocumentoRecepcionId id;
     private TipoDocumentoFe tipoDocumentoFe;
     private EstadoCargaDocFe estadoCargaDocFe;
     private EstadoDocRecepcion estadoDocRecepcion;
     private AdquirienteFe adquirienteFe;
     private ObligadoFe obligadoFe;
     private OrigenCarga origenCarga;
     private String noReferencia;
     private Timestamp fechaExpedicion;
     private Timestamp fechaAceptacion;
     private String prefijo;
     private Double valor;
     private Double iva;
     private String descripcion;
     private Timestamp fechaCarga;
     private String nombreArchCarga;
     private Long idAcuse;
     private Short requiereRevisor;
     private String idSecuenciaCarga;
     private Double rtefuente;
     private Set<RevisorDocumentoRadicado> revisorDocumentoRadicados = new HashSet<RevisorDocumentoRadicado>(0);
     private Set<MotivoRechazoDoc> motivoRechazoDocs = new HashSet<MotivoRechazoDoc>(0);
     private Set<DocumentoSoporte> documentoSoportes = new HashSet<DocumentoSoporte>(0);
     private Set<AcuseRecibo> acuseRecibos = new HashSet<AcuseRecibo>(0);
     private Set<ComprobanteCarga> comprobanteCargas = new HashSet<ComprobanteCarga>(0);


    // Constructors

    /** default constructor */
    public RegistroDocumentoRecepcion() {
    }
    
    public RegistroDocumentoRecepcion(RegistroDocumentoRecepcionId id){
        this.id = id;
    }

	/** minimal constructor */
    public RegistroDocumentoRecepcion(RegistroDocumentoRecepcionId id, TipoDocumentoFe tipoDocumentoFe, AdquirienteFe adquirienteFe, ObligadoFe obligadoFe, OrigenCarga origenCarga, String nombreArchCarga, Short requiereRevisor) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.adquirienteFe = adquirienteFe;
        this.obligadoFe = obligadoFe;
        this.origenCarga = origenCarga;
        this.nombreArchCarga = nombreArchCarga;
        this.requiereRevisor = requiereRevisor;
    }
    
    /** full constructor */
    public RegistroDocumentoRecepcion(RegistroDocumentoRecepcionId id, TipoDocumentoFe tipoDocumentoFe, EstadoCargaDocFe estadoCargaDocFe, EstadoDocRecepcion estadoDocRecepcion, AdquirienteFe adquirienteFe, ObligadoFe obligadoFe, OrigenCarga origenCarga, String noReferencia, Timestamp fechaExpedicion, Timestamp fechaAceptacion, String prefijo, Double valor, Double iva, String descripcion, Timestamp fechaCarga, String nombreArchCarga, Long idAcuse, Short requiereRevisor, String idSecuenciaCarga, Double rtefuente, Set<RevisorDocumentoRadicado> revisorDocumentoRadicados, Set<MotivoRechazoDoc> motivoRechazoDocs, Set<DocumentoSoporte> documentoSoportes, Set<AcuseRecibo> acuseRecibos, Set<ComprobanteCarga> comprobanteCargas) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.estadoCargaDocFe = estadoCargaDocFe;
        this.estadoDocRecepcion = estadoDocRecepcion;
        this.adquirienteFe = adquirienteFe;
        this.obligadoFe = obligadoFe;
        this.origenCarga = origenCarga;
        this.noReferencia = noReferencia;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaAceptacion = fechaAceptacion;
        this.prefijo = prefijo;
        this.valor = valor;
        this.iva = iva;
        this.descripcion = descripcion;
        this.fechaCarga = fechaCarga;
        this.nombreArchCarga = nombreArchCarga;
        this.idAcuse = idAcuse;
        this.requiereRevisor = requiereRevisor;
        this.idSecuenciaCarga = idSecuenciaCarga;
        this.rtefuente = rtefuente;
        this.revisorDocumentoRadicados = revisorDocumentoRadicados;
        this.motivoRechazoDocs = motivoRechazoDocs;
        this.documentoSoportes = documentoSoportes;
        this.acuseRecibos = acuseRecibos;
        this.comprobanteCargas = comprobanteCargas;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ) } )

    public RegistroDocumentoRecepcionId getId() {
        return this.id;
    }
    
    public void setId(RegistroDocumentoRecepcionId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_DOC_FE", nullable=false)

    public TipoDocumentoFe getTipoDocumentoFe() {
        return this.tipoDocumentoFe;
    }
    
    public void setTipoDocumentoFe(TipoDocumentoFe tipoDocumentoFe) {
        this.tipoDocumentoFe = tipoDocumentoFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_CARGA")

    public EstadoCargaDocFe getEstadoCargaDocFe() {
        return this.estadoCargaDocFe;
    }
    
    public void setEstadoCargaDocFe(EstadoCargaDocFe estadoCargaDocFe) {
        this.estadoCargaDocFe = estadoCargaDocFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_DOC_RECEPCION")

    public EstadoDocRecepcion getEstadoDocRecepcion() {
        return this.estadoDocRecepcion;
    }
    
    public void setEstadoDocRecepcion(EstadoDocRecepcion estadoDocRecepcion) {
        this.estadoDocRecepcion = estadoDocRecepcion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_ADQUIRIENTE", nullable=false)

    public AdquirienteFe getAdquirienteFe() {
        return this.adquirienteFe;
    }
    
    public void setAdquirienteFe(AdquirienteFe adquirienteFe) {
        this.adquirienteFe = adquirienteFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ORIGEN_CARGA", nullable=false)

    public OrigenCarga getOrigenCarga() {
        return this.origenCarga;
    }
    
    public void setOrigenCarga(OrigenCarga origenCarga) {
        this.origenCarga = origenCarga;
    }
    
    @Column(name="NO_REFERENCIA", length=30)

    public String getNoReferencia() {
        return this.noReferencia;
    }
    
    public void setNoReferencia(String noReferencia) {
        this.noReferencia = noReferencia;
    }
    
    @Column(name="FECHA_EXPEDICION", length=26)

    public Timestamp getFechaExpedicion() {
        return this.fechaExpedicion;
    }
    
    public void setFechaExpedicion(Timestamp fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }
    
    @Column(name="FECHA_ACEPTACION", length=26)

    public Timestamp getFechaAceptacion() {
        return this.fechaAceptacion;
    }
    
    public void setFechaAceptacion(Timestamp fechaAceptacion) {
        this.fechaAceptacion = fechaAceptacion;
    }
    
    @Column(name="PREFIJO", length=5)

    public String getPrefijo() {
        return this.prefijo;
    }
    
    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
    
    @Column(name="VALOR", precision=53, scale=0)

    public Double getValor() {
        return this.valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    @Column(name="IVA", precision=53, scale=0)

    public Double getIva() {
        return this.iva;
    }
    
    public void setIva(Double iva) {
        this.iva = iva;
    }
    
    @Column(name="DESCRIPCION", length=300)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="FECHA_CARGA", length=26)

    public Timestamp getFechaCarga() {
        return this.fechaCarga;
    }
    
    public void setFechaCarga(Timestamp fechaCarga) {
        this.fechaCarga = fechaCarga;
    }
    
    @Column(name="NOMBRE_ARCH_CARGA", nullable=false, length=150)

    public String getNombreArchCarga() {
        return this.nombreArchCarga;
    }
    
    public void setNombreArchCarga(String nombreArchCarga) {
        this.nombreArchCarga = nombreArchCarga;
    }
    
    @Column(name="ID_ACUSE")

    public Long getIdAcuse() {
        return this.idAcuse;
    }
    
    public void setIdAcuse(Long idAcuse) {
        this.idAcuse = idAcuse;
    }
    
    @Column(name="REQUIERE_REVISOR", nullable=false)

    public Short getRequiereRevisor() {
        return this.requiereRevisor;
    }
    
    public void setRequiereRevisor(Short requiereRevisor) {
        this.requiereRevisor = requiereRevisor;
    }
    
    @Column(name="ID_SECUENCIA_CARGA", length=100)

    public String getIdSecuenciaCarga() {
        return this.idSecuenciaCarga;
    }
    
    public void setIdSecuenciaCarga(String idSecuenciaCarga) {
        this.idSecuenciaCarga = idSecuenciaCarga;
    }
    
    @Column(name="RTEFUENTE", precision=53, scale=0)

    public Double getRtefuente() {
        return this.rtefuente;
    }
    
    public void setRtefuente(Double rtefuente) {
        this.rtefuente = rtefuente;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="registroDocumentoRecepcion")

    public Set<RevisorDocumentoRadicado> getRevisorDocumentoRadicados() {
        return this.revisorDocumentoRadicados;
    }
    
    public void setRevisorDocumentoRadicados(Set<RevisorDocumentoRadicado> revisorDocumentoRadicados) {
        this.revisorDocumentoRadicados = revisorDocumentoRadicados;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="registroDocumentoRecepcion")

    public Set<MotivoRechazoDoc> getMotivoRechazoDocs() {
        return this.motivoRechazoDocs;
    }
    
    public void setMotivoRechazoDocs(Set<MotivoRechazoDoc> motivoRechazoDocs) {
        this.motivoRechazoDocs = motivoRechazoDocs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="registroDocumentoRecepcion")

    public Set<DocumentoSoporte> getDocumentoSoportes() {
        return this.documentoSoportes;
    }
    
    public void setDocumentoSoportes(Set<DocumentoSoporte> documentoSoportes) {
        this.documentoSoportes = documentoSoportes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="registroDocumentoRecepcion")

    public Set<AcuseRecibo> getAcuseRecibos() {
        return this.acuseRecibos;
    }
    
    public void setAcuseRecibos(Set<AcuseRecibo> acuseRecibos) {
        this.acuseRecibos = acuseRecibos;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="registroDocumentoRecepcion")

    public Set<ComprobanteCarga> getComprobanteCargas() {
        return this.comprobanteCargas;
    }
    
    public void setComprobanteCargas(Set<ComprobanteCarga> comprobanteCargas) {
        this.comprobanteCargas = comprobanteCargas;
    }
   








}
