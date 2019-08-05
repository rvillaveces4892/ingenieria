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
 * TipoValidacion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_VALIDACION"
    ,schema="FELECV3"
)

public class TipoValidacion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2373103106828142583L;
    private Short idTipoValidacion;
     private String descripcion;
     private Set<UltimoDocumentoValidado> ultimoDocumentoValidados = new HashSet<UltimoDocumentoValidado>(0);
     private Set<ValidacionSecuenciaRota> validacionSecuenciaRotas = new HashSet<ValidacionSecuenciaRota>(0);


    // Constructors

    /** default constructor */
    public TipoValidacion() {
    }

	/** minimal constructor */
    public TipoValidacion(Short idTipoValidacion) {
        this.idTipoValidacion = idTipoValidacion;
    }
    
    /** full constructor */
    public TipoValidacion(Short idTipoValidacion, String descripcion, Set<UltimoDocumentoValidado> ultimoDocumentoValidados, Set<ValidacionSecuenciaRota> validacionSecuenciaRotas) {
        this.idTipoValidacion = idTipoValidacion;
        this.descripcion = descripcion;
        this.ultimoDocumentoValidados = ultimoDocumentoValidados;
        this.validacionSecuenciaRotas = validacionSecuenciaRotas;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TIPO_VALIDACION", unique=true, nullable=false)

    public Short getIdTipoValidacion() {
        return this.idTipoValidacion;
    }
    
    public void setIdTipoValidacion(Short idTipoValidacion) {
        this.idTipoValidacion = idTipoValidacion;
    }
    
    @Column(name="DESCRIPCION", length=30)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoValidacion")

    public Set<UltimoDocumentoValidado> getUltimoDocumentoValidados() {
        return this.ultimoDocumentoValidados;
    }
    
    public void setUltimoDocumentoValidados(Set<UltimoDocumentoValidado> ultimoDocumentoValidados) {
        this.ultimoDocumentoValidados = ultimoDocumentoValidados;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoValidacion")

    public Set<ValidacionSecuenciaRota> getValidacionSecuenciaRotas() {
        return this.validacionSecuenciaRotas;
    }
    
    public void setValidacionSecuenciaRotas(Set<ValidacionSecuenciaRota> validacionSecuenciaRotas) {
        this.validacionSecuenciaRotas = validacionSecuenciaRotas;
    }
   








}
