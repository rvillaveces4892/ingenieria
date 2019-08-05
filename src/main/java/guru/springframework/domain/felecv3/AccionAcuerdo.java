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
 * AccionAcuerdo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ACCION_ACUERDO"
    ,schema="FELECV3"
)

public class AccionAcuerdo   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-1130116574007898686L;
    private Short idAccionAcuerdo;
     private String descripcion;
     private Set<DatoAcuerdoFe> datoAcuerdoFes = new HashSet<DatoAcuerdoFe>(0);
     private Set<AcuerdoMovimientoFe> acuerdoMovimientoFes = new HashSet<AcuerdoMovimientoFe>(0);


    // Constructors

    /** default constructor */
    public AccionAcuerdo() {
    }

	/** minimal constructor */
    public AccionAcuerdo(Short idAccionAcuerdo) {
        this.idAccionAcuerdo = idAccionAcuerdo;
    }
    
    /** full constructor */
    public AccionAcuerdo(Short idAccionAcuerdo, String descripcion, Set<DatoAcuerdoFe> datoAcuerdoFes, Set<AcuerdoMovimientoFe> acuerdoMovimientoFes) {
        this.idAccionAcuerdo = idAccionAcuerdo;
        this.descripcion = descripcion;
        this.datoAcuerdoFes = datoAcuerdoFes;
        this.acuerdoMovimientoFes = acuerdoMovimientoFes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ACCION_ACUERDO", unique=true, nullable=false)

    public Short getIdAccionAcuerdo() {
        return this.idAccionAcuerdo;
    }
    
    public void setIdAccionAcuerdo(Short idAccionAcuerdo) {
        this.idAccionAcuerdo = idAccionAcuerdo;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="accionAcuerdo")

    public Set<DatoAcuerdoFe> getDatoAcuerdoFes() {
        return this.datoAcuerdoFes;
    }
    
    public void setDatoAcuerdoFes(Set<DatoAcuerdoFe> datoAcuerdoFes) {
        this.datoAcuerdoFes = datoAcuerdoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="accionAcuerdo")

    public Set<AcuerdoMovimientoFe> getAcuerdoMovimientoFes() {
        return this.acuerdoMovimientoFes;
    }
    
    public void setAcuerdoMovimientoFes(Set<AcuerdoMovimientoFe> acuerdoMovimientoFes) {
        this.acuerdoMovimientoFes = acuerdoMovimientoFes;
    }
   








}
