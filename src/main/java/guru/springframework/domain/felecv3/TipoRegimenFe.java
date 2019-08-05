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
 * TipoRegimenFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_REGIMEN_FE"
    ,schema="FELECV3"
)

public class TipoRegimenFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2576850809702951083L;
    private Short idTipoRegimen;
     private String descripcion;
     private Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes = new HashSet<DatoDocumentoAdquiriente>(0);
     private Set<OfeAdquiriente> ofeAdquirientes = new HashSet<OfeAdquiriente>(0);
     private Set<ObligadoFe> obligadoFes = new HashSet<ObligadoFe>(0);


    // Constructors

    /** default constructor */
    public TipoRegimenFe() {
    }

	/** minimal constructor */
    public TipoRegimenFe(Short idTipoRegimen) {
        this.idTipoRegimen = idTipoRegimen;
    }
    
    /** full constructor */
    public TipoRegimenFe(Short idTipoRegimen, String descripcion, Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes, Set<OfeAdquiriente> ofeAdquirientes, Set<ObligadoFe> obligadoFes) {
        this.idTipoRegimen = idTipoRegimen;
        this.descripcion = descripcion;
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
        this.ofeAdquirientes = ofeAdquirientes;
        this.obligadoFes = obligadoFes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TIPO_REGIMEN", unique=true, nullable=false)

    public Short getIdTipoRegimen() {
        return this.idTipoRegimen;
    }
    
    public void setIdTipoRegimen(Short idTipoRegimen) {
        this.idTipoRegimen = idTipoRegimen;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoRegimenFe")

    public Set<DatoDocumentoAdquiriente> getDatoDocumentoAdquirientes() {
        return this.datoDocumentoAdquirientes;
    }
    
    public void setDatoDocumentoAdquirientes(Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes) {
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoRegimenFe")

    public Set<OfeAdquiriente> getOfeAdquirientes() {
        return this.ofeAdquirientes;
    }
    
    public void setOfeAdquirientes(Set<OfeAdquiriente> ofeAdquirientes) {
        this.ofeAdquirientes = ofeAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoRegimenFe")

    public Set<ObligadoFe> getObligadoFes() {
        return this.obligadoFes;
    }
    
    public void setObligadoFes(Set<ObligadoFe> obligadoFes) {
        this.obligadoFes = obligadoFes;
    }
   








}
