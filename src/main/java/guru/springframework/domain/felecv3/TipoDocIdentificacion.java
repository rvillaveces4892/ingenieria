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


/**
 * TipoDocIdentificacion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_DOC_IDENTIFICACION"
    ,schema="FELECV3"
)

public class TipoDocIdentificacion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5993393480377938262L;
    private Short idDocIdentificacion;
     private String descripcion;
     private Set<ObligadoFe> obligadoFes = new HashSet<ObligadoFe>(0);
     private Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes = new HashSet<DatoDocumentoAdquiriente>(0);
     private Set<OfeAdquiriente> ofeAdquirientes = new HashSet<OfeAdquiriente>(0);
     private Set<ProveedorTecnologico> proveedorTecnologicos = new HashSet<ProveedorTecnologico>(0);


    // Constructors

    /** default constructor */
    public TipoDocIdentificacion() {
    }

	/** minimal constructor */
    public TipoDocIdentificacion(Short idDocIdentificacion) {
        this.idDocIdentificacion = idDocIdentificacion;
    }
    
    /** full constructor */
    public TipoDocIdentificacion(Short idDocIdentificacion, String descripcion, Set<ObligadoFe> obligadoFes, Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes, Set<OfeAdquiriente> ofeAdquirientes, Set<ProveedorTecnologico> proveedorTecnologicos) {
        this.idDocIdentificacion = idDocIdentificacion;
        this.descripcion = descripcion;
        this.obligadoFes = obligadoFes;
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
        this.ofeAdquirientes = ofeAdquirientes;
        this.proveedorTecnologicos = proveedorTecnologicos;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_DOC_IDENTIFICACION", unique=true, nullable=false)

    public Short getIdDocIdentificacion() {
        return this.idDocIdentificacion;
    }
    
    public void setIdDocIdentificacion(Short idDocIdentificacion) {
        this.idDocIdentificacion = idDocIdentificacion;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoDocIdentificacion")

    public Set<ObligadoFe> getObligadoFes() {
        return this.obligadoFes;
    }
    
    public void setObligadoFes(Set<ObligadoFe> obligadoFes) {
        this.obligadoFes = obligadoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoDocIdentificacion")

    public Set<DatoDocumentoAdquiriente> getDatoDocumentoAdquirientes() {
        return this.datoDocumentoAdquirientes;
    }
    
    public void setDatoDocumentoAdquirientes(Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes) {
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoDocIdentificacion")

    public Set<OfeAdquiriente> getOfeAdquirientes() {
        return this.ofeAdquirientes;
    }
    
    public void setOfeAdquirientes(Set<OfeAdquiriente> ofeAdquirientes) {
        this.ofeAdquirientes = ofeAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoDocIdentificacion")

    public Set<ProveedorTecnologico> getProveedorTecnologicos() {
        return this.proveedorTecnologicos;
    }
    
    public void setProveedorTecnologicos(Set<ProveedorTecnologico> proveedorTecnologicos) {
        this.proveedorTecnologicos = proveedorTecnologicos;
    }
   








}
