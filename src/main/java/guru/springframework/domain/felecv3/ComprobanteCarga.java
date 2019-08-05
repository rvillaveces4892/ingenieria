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
 * ComprobanteCarga entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="COMPROBANTE_CARGA"
    ,schema="FELECV3"
)

public class ComprobanteCarga   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=2715576009297111084L;
    private ComprobanteCargaId id;
     private RegistroDocumentoRecepcion registroDocumentoRecepcion;
     private EstadoCargaDocFe estadoCargaDocFe;
     private String nombreComprobante;
     private Timestamp fechaCarga;
     private String nombreArchCarga;
     private Short tiempoAlmacenamiento;


    // Constructors

    /** default constructor */
    public ComprobanteCarga() {
    }

	/** minimal constructor */
    public ComprobanteCarga(ComprobanteCargaId id, RegistroDocumentoRecepcion registroDocumentoRecepcion, String nombreComprobante) {
        this.id = id;
        this.registroDocumentoRecepcion = registroDocumentoRecepcion;
        this.nombreComprobante = nombreComprobante;
    }
    
    /** full constructor */
    public ComprobanteCarga(ComprobanteCargaId id, RegistroDocumentoRecepcion registroDocumentoRecepcion, EstadoCargaDocFe estadoCargaDocFe, String nombreComprobante, Timestamp fechaCarga, String nombreArchCarga, Short tiempoAlmacenamiento) {
        this.id = id;
        this.registroDocumentoRecepcion = registroDocumentoRecepcion;
        this.estadoCargaDocFe = estadoCargaDocFe;
        this.nombreComprobante = nombreComprobante;
        this.fechaCarga = fechaCarga;
        this.nombreArchCarga = nombreArchCarga;
        this.tiempoAlmacenamiento = tiempoAlmacenamiento;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ) } )

    public ComprobanteCargaId getId() {
        return this.id;
    }
    
    public void setId(ComprobanteCargaId id) {
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
    
    @Column(name="FECHA_CARGA", length=26)

    public Timestamp getFechaCarga() {
        return this.fechaCarga;
    }
    
    public void setFechaCarga(Timestamp fechaCarga) {
        this.fechaCarga = fechaCarga;
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
