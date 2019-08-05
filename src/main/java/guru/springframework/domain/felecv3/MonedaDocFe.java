//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;
import guru.springframework.domain.manual.DocumentoManual;


/**
 * MonedaDocFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MONEDA_DOC_FE"
    ,schema="FELECV3"
)

public class MonedaDocFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2249608473506187228L;
    private String codigoMoneda;
     private String descripcion;
     private Set<DocumentoFe> documentoFesForCodigoMonedaLocal = new HashSet<DocumentoFe>(0);
     private Set<DocumentoManual> documentoManualsForCodigoMonedaLocal = new HashSet<DocumentoManual>(0);
     private Set<DocumentoFe> documentoFesForCodigoMonedaExt = new HashSet<DocumentoFe>(0);
     private Set<DocumentoManual> documentoManualsForCodigoMonedaExt = new HashSet<DocumentoManual>(0);


    // Constructors

    /** default constructor */
    public MonedaDocFe() {
    }

	/** minimal constructor */
    public MonedaDocFe(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }
    
    /** full constructor */
    public MonedaDocFe(String codigoMoneda, String descripcion, Set<DocumentoFe> documentoFesForCodigoMonedaLocal, Set<DocumentoManual> documentoManualsForCodigoMonedaLocal, Set<DocumentoFe> documentoFesForCodigoMonedaExt, Set<DocumentoManual> documentoManualsForCodigoMonedaExt) {
        this.codigoMoneda = codigoMoneda;
        this.descripcion = descripcion;
        this.documentoFesForCodigoMonedaLocal = documentoFesForCodigoMonedaLocal;
        this.documentoManualsForCodigoMonedaLocal = documentoManualsForCodigoMonedaLocal;
        this.documentoFesForCodigoMonedaExt = documentoFesForCodigoMonedaExt;
        this.documentoManualsForCodigoMonedaExt = documentoManualsForCodigoMonedaExt;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="CODIGO_MONEDA", unique=true, nullable=false, length=10)

    public String getCodigoMoneda() {
        return this.codigoMoneda;
    }
    
    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }
    
    @Column(name="DESCRIPCION", length=100)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="monedaDocFeByCodigoMonedaLocal")

    public Set<DocumentoFe> getDocumentoFesForCodigoMonedaLocal() {
        return this.documentoFesForCodigoMonedaLocal;
    }
    
    public void setDocumentoFesForCodigoMonedaLocal(Set<DocumentoFe> documentoFesForCodigoMonedaLocal) {
        this.documentoFesForCodigoMonedaLocal = documentoFesForCodigoMonedaLocal;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="monedaDocFeByCodigoMonedaLocal")

    public Set<DocumentoManual> getDocumentoManualsForCodigoMonedaLocal() {
        return this.documentoManualsForCodigoMonedaLocal;
    }
    
    public void setDocumentoManualsForCodigoMonedaLocal(Set<DocumentoManual> documentoManualsForCodigoMonedaLocal) {
        this.documentoManualsForCodigoMonedaLocal = documentoManualsForCodigoMonedaLocal;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="monedaDocFeByCodigoMonedaExt")

    public Set<DocumentoFe> getDocumentoFesForCodigoMonedaExt() {
        return this.documentoFesForCodigoMonedaExt;
    }
    
    public void setDocumentoFesForCodigoMonedaExt(Set<DocumentoFe> documentoFesForCodigoMonedaExt) {
        this.documentoFesForCodigoMonedaExt = documentoFesForCodigoMonedaExt;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="monedaDocFeByCodigoMonedaExt")

    public Set<DocumentoManual> getDocumentoManualsForCodigoMonedaExt() {
        return this.documentoManualsForCodigoMonedaExt;
    }
    
    public void setDocumentoManualsForCodigoMonedaExt(Set<DocumentoManual> documentoManualsForCodigoMonedaExt) {
        this.documentoManualsForCodigoMonedaExt = documentoManualsForCodigoMonedaExt;
    }
   








}
