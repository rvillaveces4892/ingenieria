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
 * TipoPersona entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_PERSONA"
    ,schema="FELECV3"
)

public class TipoPersona   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6450899132662123273L;
    private Short idTipoPersona;
     private String descripcion;
     private Set<OfeAdquiriente> ofeAdquirientes = new HashSet<OfeAdquiriente>(0);
     private Set<ObligadoFe> obligadoFes = new HashSet<ObligadoFe>(0);
     private Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes = new HashSet<DatoDocumentoAdquiriente>(0);
     private Set<ProveedorTecnologico> proveedorTecnologicos = new HashSet<ProveedorTecnologico>(0);


    // Constructors

    /** default constructor */
    public TipoPersona() {
    }

	/** minimal constructor */
    public TipoPersona(Short idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
    
    /** full constructor */
    public TipoPersona(Short idTipoPersona, String descripcion, Set<OfeAdquiriente> ofeAdquirientes, Set<ObligadoFe> obligadoFes, Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes, Set<ProveedorTecnologico> proveedorTecnologicos) {
        this.idTipoPersona = idTipoPersona;
        this.descripcion = descripcion;
        this.ofeAdquirientes = ofeAdquirientes;
        this.obligadoFes = obligadoFes;
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
        this.proveedorTecnologicos = proveedorTecnologicos;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TIPO_PERSONA", unique=true, nullable=false)

    public Short getIdTipoPersona() {
        return this.idTipoPersona;
    }
    
    public void setIdTipoPersona(Short idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
    
    @Column(name="DESCRIPCION", length=20)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoPersona")

    public Set<OfeAdquiriente> getOfeAdquirientes() {
        return this.ofeAdquirientes;
    }
    
    public void setOfeAdquirientes(Set<OfeAdquiriente> ofeAdquirientes) {
        this.ofeAdquirientes = ofeAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoPersona")

    public Set<ObligadoFe> getObligadoFes() {
        return this.obligadoFes;
    }
    
    public void setObligadoFes(Set<ObligadoFe> obligadoFes) {
        this.obligadoFes = obligadoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoPersona")

    public Set<DatoDocumentoAdquiriente> getDatoDocumentoAdquirientes() {
        return this.datoDocumentoAdquirientes;
    }
    
    public void setDatoDocumentoAdquirientes(Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes) {
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoPersona")

    public Set<ProveedorTecnologico> getProveedorTecnologicos() {
        return this.proveedorTecnologicos;
    }
    
    public void setProveedorTecnologicos(Set<ProveedorTecnologico> proveedorTecnologicos) {
        this.proveedorTecnologicos = proveedorTecnologicos;
    }
   








}
