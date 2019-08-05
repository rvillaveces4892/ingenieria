//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * XpathDatoAdicionalDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="XPATH_DATO_ADICIONAL_DOC"
    ,schema="FELECV3"
)

public class XpathDatoAdicionalDoc   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=8074213602835331983L;
    private Short idXpathDatoAdicionalDoc;
     private String xpathXml;


    // Constructors

    /** default constructor */
    public XpathDatoAdicionalDoc() {
    }

	/** minimal constructor */
    public XpathDatoAdicionalDoc(Short idXpathDatoAdicionalDoc) {
        this.idXpathDatoAdicionalDoc = idXpathDatoAdicionalDoc;
    }
    
    /** full constructor */
    public XpathDatoAdicionalDoc(Short idXpathDatoAdicionalDoc, String xpathXml) {
        this.idXpathDatoAdicionalDoc = idXpathDatoAdicionalDoc;
        this.xpathXml = xpathXml;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_XPATH_DATO_ADICIONAL_DOC", unique=true, nullable=false)

    public Short getIdXpathDatoAdicionalDoc() {
        return this.idXpathDatoAdicionalDoc;
    }
    
    public void setIdXpathDatoAdicionalDoc(Short idXpathDatoAdicionalDoc) {
        this.idXpathDatoAdicionalDoc = idXpathDatoAdicionalDoc;
    }
    
    @Column(name="XPATH_XML", length=120)

    public String getXpathXml() {
        return this.xpathXml;
    }
    
    public void setXpathXml(String xpathXml) {
        this.xpathXml = xpathXml;
    }
   








}
