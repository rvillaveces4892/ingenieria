//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ConfDatoAdicionalDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONF_DATO_ADICIONAL_DOC"
    ,schema="FELECV3"
)

public class ConfDatoAdicionalDoc   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2340372988717730359L;
    private ConfDatoAdicionalDocId id;
     private TipoDocumentoFe tipoDocumentoFe;
     private CampoOpcionalDoc campoOpcionalDoc;
     private Short idXpathDatoAdicionalDoc;


    // Constructors

    /** default constructor */
    public ConfDatoAdicionalDoc() {
    }

    
    /** full constructor */
    public ConfDatoAdicionalDoc(ConfDatoAdicionalDocId id, TipoDocumentoFe tipoDocumentoFe, CampoOpcionalDoc campoOpcionalDoc, Short idXpathDatoAdicionalDoc) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.campoOpcionalDoc = campoOpcionalDoc;
        this.idXpathDatoAdicionalDoc = idXpathDatoAdicionalDoc;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ), 
        @AttributeOverride(name="idCampoOpcionalDoc", column=@Column(name="ID_CAMPO_OPCIONAL_DOC", nullable=false) ) } )

    public ConfDatoAdicionalDocId getId() {
        return this.id;
    }
    
    public void setId(ConfDatoAdicionalDocId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_DOC_FE", nullable=false, insertable=false, updatable=false)

    public TipoDocumentoFe getTipoDocumentoFe() {
        return this.tipoDocumentoFe;
    }
    
    public void setTipoDocumentoFe(TipoDocumentoFe tipoDocumentoFe) {
        this.tipoDocumentoFe = tipoDocumentoFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_CAMPO_OPCIONAL_DOC", nullable=false, insertable=false, updatable=false)

    public CampoOpcionalDoc getCampoOpcionalDoc() {
        return this.campoOpcionalDoc;
    }
    
    public void setCampoOpcionalDoc(CampoOpcionalDoc campoOpcionalDoc) {
        this.campoOpcionalDoc = campoOpcionalDoc;
    }
    
    @Column(name="ID_XPATH_DATO_ADICIONAL_DOC", nullable=false)

    public Short getIdXpathDatoAdicionalDoc() {
        return this.idXpathDatoAdicionalDoc;
    }
    
    public void setIdXpathDatoAdicionalDoc(Short idXpathDatoAdicionalDoc) {
        this.idXpathDatoAdicionalDoc = idXpathDatoAdicionalDoc;
    }
   








}
