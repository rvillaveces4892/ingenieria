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
 * MotivoRechazoDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MOTIVO_RECHAZO_DOC"
    ,schema="FELECV3"
)

public class MotivoRechazoDoc   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5286461131821106353L;
    private Long idMotivoRechazoDoc;
     private RegistroDocumentoRecepcion registroDocumentoRecepcion;
     private MotivoRechazo motivoRechazo;


    // Constructors

    /** default constructor */
    public MotivoRechazoDoc() {
    }

    
    /** full constructor */
    public MotivoRechazoDoc(Long idMotivoRechazoDoc, RegistroDocumentoRecepcion registroDocumentoRecepcion, MotivoRechazo motivoRechazo) {
        this.idMotivoRechazoDoc = idMotivoRechazoDoc;
        this.registroDocumentoRecepcion = registroDocumentoRecepcion;
        this.motivoRechazo = motivoRechazo;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_MOTIVO_RECHAZO_DOC", unique=true, nullable=false)

    public Long getIdMotivoRechazoDoc() {
        return this.idMotivoRechazoDoc;
    }
    
    public void setIdMotivoRechazoDoc(Long idMotivoRechazoDoc) {
        this.idMotivoRechazoDoc = idMotivoRechazoDoc;
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
        @JoinColumn(name="ID_MOTIVO_RECHAZO", nullable=false)

    public MotivoRechazo getMotivoRechazo() {
        return this.motivoRechazo;
    }
    
    public void setMotivoRechazo(MotivoRechazo motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }
   








}
