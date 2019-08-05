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
 * PaisFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="PAIS_FE"
    ,schema="FELECV3"
)

public class PaisFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5386851821952928169L;
    private String codigoPais;
     private String descripcion;
     private Set<ProveedorTecnologico> proveedorTecnologicos = new HashSet<ProveedorTecnologico>(0);
     private Set<OfeAdquiriente> ofeAdquirientes = new HashSet<OfeAdquiriente>(0);
     private Set<ObligadoFe> obligadoFes = new HashSet<ObligadoFe>(0);
     private Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes = new HashSet<DatoDocumentoAdquiriente>(0);


    // Constructors

    /** default constructor */
    public PaisFe() {
    }

	/** minimal constructor */
    public PaisFe(String codigoPais) {
        this.codigoPais = codigoPais;
    }
    
    /** full constructor */
    public PaisFe(String codigoPais, String descripcion, Set<ProveedorTecnologico> proveedorTecnologicos, Set<OfeAdquiriente> ofeAdquirientes, Set<ObligadoFe> obligadoFes, Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes) {
        this.codigoPais = codigoPais;
        this.descripcion = descripcion;
        this.proveedorTecnologicos = proveedorTecnologicos;
        this.ofeAdquirientes = ofeAdquirientes;
        this.obligadoFes = obligadoFes;
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="CODIGO_PAIS", unique=true, nullable=false, length=10)

    public String getCodigoPais() {
        return this.codigoPais;
    }
    
    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }
    
    @Column(name="DESCRIPCION", length=100)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="paisFe")

    public Set<ProveedorTecnologico> getProveedorTecnologicos() {
        return this.proveedorTecnologicos;
    }
    
    public void setProveedorTecnologicos(Set<ProveedorTecnologico> proveedorTecnologicos) {
        this.proveedorTecnologicos = proveedorTecnologicos;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="paisFe")

    public Set<OfeAdquiriente> getOfeAdquirientes() {
        return this.ofeAdquirientes;
    }
    
    public void setOfeAdquirientes(Set<OfeAdquiriente> ofeAdquirientes) {
        this.ofeAdquirientes = ofeAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="paisFe")

    public Set<ObligadoFe> getObligadoFes() {
        return this.obligadoFes;
    }
    
    public void setObligadoFes(Set<ObligadoFe> obligadoFes) {
        this.obligadoFes = obligadoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="paisFe")

    public Set<DatoDocumentoAdquiriente> getDatoDocumentoAdquirientes() {
        return this.datoDocumentoAdquirientes;
    }
    
    public void setDatoDocumentoAdquirientes(Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes) {
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
    }
   








}
