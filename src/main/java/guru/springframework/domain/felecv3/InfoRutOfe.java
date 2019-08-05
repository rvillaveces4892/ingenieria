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
 * InfoRutOfe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="INFO_RUT_OFE"
    ,schema="FELECV3"
)

public class InfoRutOfe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7112372618254116804L;
    private InfoRutOfeId id;
     private ConstantesRutDian constantesRutDian;
     private String schemeUri;
     private String listName;


    // Constructors

    /** default constructor */
    public InfoRutOfe() {
    }

	/** minimal constructor */
    public InfoRutOfe(InfoRutOfeId id, ConstantesRutDian constantesRutDian) {
        this.id = id;
        this.constantesRutDian = constantesRutDian;
    }
    
    /** full constructor */
    public InfoRutOfe(InfoRutOfeId id, ConstantesRutDian constantesRutDian, String schemeUri, String listName) {
        this.id = id;
        this.constantesRutDian = constantesRutDian;
        this.schemeUri = schemeUri;
        this.listName = listName;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="constanteDatoRut", column=@Column(name="CONSTANTE_DATO_RUT", nullable=false, length=10) ) } )

    public InfoRutOfeId getId() {
        return this.id;
    }
    
    public void setId(InfoRutOfeId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="CONSTANTE_DATO_RUT", nullable=false, insertable=false, updatable=false)

    public ConstantesRutDian getConstantesRutDian() {
        return this.constantesRutDian;
    }
    
    public void setConstantesRutDian(ConstantesRutDian constantesRutDian) {
        this.constantesRutDian = constantesRutDian;
    }
    
    @Column(name="SCHEME_URI", length=80)

    public String getSchemeUri() {
        return this.schemeUri;
    }
    
    public void setSchemeUri(String schemeUri) {
        this.schemeUri = schemeUri;
    }
    
    @Column(name="LIST_NAME", length=80)

    public String getListName() {
        return this.listName;
    }
    
    public void setListName(String listName) {
        this.listName = listName;
    }
   








}
