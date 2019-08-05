//marcado
package guru.springframework.domain.felecv3;

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
 * RevisorDocumentoRadicado entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="REVISOR_DOCUMENTO_RADICADO"
    ,schema="FELECV3"
)

public class RevisorDocumentoRadicado   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7285159202503942788L;
    private RevisorDocumentoRadicadoId id;
     private RegistroDocumentoRecepcion registroDocumentoRecepcion;


    // Constructors

    /** default constructor */
    public RevisorDocumentoRadicado() {
    }

    
    /** full constructor */
    public RevisorDocumentoRadicado(RevisorDocumentoRadicadoId id, RegistroDocumentoRecepcion registroDocumentoRecepcion) {
        this.id = id;
        this.registroDocumentoRecepcion = registroDocumentoRecepcion;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="usuario", column=@Column(name="USUARIO", nullable=false, length=80) ), 
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ) } )

    public RevisorDocumentoRadicadoId getId() {
        return this.id;
    }
    
    public void setId(RevisorDocumentoRadicadoId id) {
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
   








}
