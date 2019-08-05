//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * DocumentoSoporte entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DOCUMENTO_SOPORTE"
    ,schema="FELECV3"
)

public class DocumentoSoporte   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=3638645227061420351L;
    private Long idDocSoporte;
     private RegistroDocumentoRecepcion registroDocumentoRecepcion;
     private EstadoCargaDocFe estadoCargaDocFe;
     private String nombreSoporte;
     private String nombreArchCarga;
     private Short tiempoAlmacenamiento;


    // Constructors

    /** default constructor */
    public DocumentoSoporte() {
    }

	/** minimal constructor */
    public DocumentoSoporte(Long idDocSoporte, RegistroDocumentoRecepcion registroDocumentoRecepcion, String nombreSoporte) {
        this.idDocSoporte = idDocSoporte;
        this.registroDocumentoRecepcion = registroDocumentoRecepcion;
        this.nombreSoporte = nombreSoporte;
    }
    
    /** full constructor */
    public DocumentoSoporte(Long idDocSoporte, RegistroDocumentoRecepcion registroDocumentoRecepcion, EstadoCargaDocFe estadoCargaDocFe, String nombreSoporte, String nombreArchCarga, Short tiempoAlmacenamiento) {
        this.idDocSoporte = idDocSoporte;
        this.registroDocumentoRecepcion = registroDocumentoRecepcion;
        this.estadoCargaDocFe = estadoCargaDocFe;
        this.nombreSoporte = nombreSoporte;
        this.nombreArchCarga = nombreArchCarga;
        this.tiempoAlmacenamiento = tiempoAlmacenamiento;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_DOC_SOPORTE", unique=true, nullable=false)

    public Long getIdDocSoporte() {
        return this.idDocSoporte;
    }
    
    public void setIdDocSoporte(Long idDocSoporte) {
        this.idDocSoporte = idDocSoporte;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumns( { 
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", referencedColumnName="IDENTIFICACION_OBLIGADO", nullable=false), 
        @JoinColumn(name="NO_DOCUMENTO", referencedColumnName="NO_DOCUMENTO", nullable=false) } )

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
    
    @Column(name="NOMBRE_SOPORTE", nullable=false, length=150)

    public String getNombreSoporte() {
        return this.nombreSoporte;
    }
    
    public void setNombreSoporte(String nombreSoporte) {
        this.nombreSoporte = nombreSoporte;
    }
    
    @Column(name="NOMBRE_ARCH_CARGA", length=150)

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
