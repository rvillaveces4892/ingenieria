//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * AcuseRecibo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ACUSE_RECIBO"
    ,schema="FELECV3"
)

public class AcuseRecibo   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=260070498776881656L;
    private AcuseReciboId id;
     private RegistroDocumentoRecepcion registroDocumentoRecepcion;
     private EstadoCargaDocFe estadoCargaDocFe;
     private String nombreComprobante;
     private Timestamp fechaGeneracion;
     private String nombreArchCarga;
     private Short tiempoAlmacenamiento;


    // Constructors

    /** default constructor */
    public AcuseRecibo() {
    }

	/** minimal constructor */
    public AcuseRecibo(AcuseReciboId id, RegistroDocumentoRecepcion registroDocumentoRecepcion, String nombreComprobante) {
        this.id = id;
        this.registroDocumentoRecepcion = registroDocumentoRecepcion;
        this.nombreComprobante = nombreComprobante;
    }
    
    /** full constructor */
    public AcuseRecibo(AcuseReciboId id, RegistroDocumentoRecepcion registroDocumentoRecepcion, EstadoCargaDocFe estadoCargaDocFe, String nombreComprobante, Timestamp fechaGeneracion, String nombreArchCarga, Short tiempoAlmacenamiento) {
        this.id = id;
        this.registroDocumentoRecepcion = registroDocumentoRecepcion;
        this.estadoCargaDocFe = estadoCargaDocFe;
        this.nombreComprobante = nombreComprobante;
        this.fechaGeneracion = fechaGeneracion;
        this.nombreArchCarga = nombreArchCarga;
        this.tiempoAlmacenamiento = tiempoAlmacenamiento;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ) } )

    public AcuseReciboId getId() {
        return this.id;
    }
    
    public void setId(AcuseReciboId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumns( { 
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", referencedColumnName="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="NO_DOCUMENTO", referencedColumnName="NO_DOCUMENTO", nullable=false, insertable=false, updatable=false) } )

    public RegistroDocumentoRecepcion getRegistroDocumentoRecepcion() {
        return this.registroDocumentoRecepcion;
    }
    
    public void setRegistroDocumentoRecepcion(RegistroDocumentoRecepcion registroDocumentoRecepcion) {
        this.registroDocumentoRecepcion = registroDocumentoRecepcion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_CARGA")

    public EstadoCargaDocFe getEstadoCargaDocFe() {
        return this.estadoCargaDocFe;
    }
    
    public void setEstadoCargaDocFe(EstadoCargaDocFe estadoCargaDocFe) {
        this.estadoCargaDocFe = estadoCargaDocFe;
    }
    
    @Column(name="NOMBRE_COMPROBANTE", nullable=false, length=30)

    public String getNombreComprobante() {
        return this.nombreComprobante;
    }
    
    public void setNombreComprobante(String nombreComprobante) {
        this.nombreComprobante = nombreComprobante;
    }
    
    @Column(name="FECHA_GENERACION", length=26)

    public Timestamp getFechaGeneracion() {
        return this.fechaGeneracion;
    }
    
    public void setFechaGeneracion(Timestamp fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
    
    @Column(name="NOMBRE_ARCH_CARGA", length=20)

    public String getNombreArchCarga() {
        return this.nombreArchCarga;
    }
    
    public void setNombreArchCarga(String nombreArchCarga) {
        this.nombreArchCarga = nombreArchCarga;
    }
    
    @Column(name="TIEMPO_ALMACENAMIENTO")

    public Short getTiempoAlmacenamiento() {
        return this.tiempoAlmacenamiento;
    }
    
    public void setTiempoAlmacenamiento(Short tiempoAlmacenamiento) {
        this.tiempoAlmacenamiento = tiempoAlmacenamiento;
    }
   








}
