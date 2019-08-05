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
 * ConstantesRutDian entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONSTANTES_RUT_DIAN"
    ,schema="FELECV3"
)

public class ConstantesRutDian   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5693952992449640083L;
    private String constanteDatoRut;
     private String descripcion;
     private Set<InfoRutOfe> infoRutOfes = new HashSet<InfoRutOfe>(0);


    // Constructors

    /** default constructor */
    public ConstantesRutDian() {
    }

	/** minimal constructor */
    public ConstantesRutDian(String constanteDatoRut) {
        this.constanteDatoRut = constanteDatoRut;
    }
    
    /** full constructor */
    public ConstantesRutDian(String constanteDatoRut, String descripcion, Set<InfoRutOfe> infoRutOfes) {
        this.constanteDatoRut = constanteDatoRut;
        this.descripcion = descripcion;
        this.infoRutOfes = infoRutOfes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="CONSTANTE_DATO_RUT", unique=true, nullable=false, length=10)

    public String getConstanteDatoRut() {
        return this.constanteDatoRut;
    }
    
    public void setConstanteDatoRut(String constanteDatoRut) {
        this.constanteDatoRut = constanteDatoRut;
    }
    
    @Column(name="DESCRIPCION", length=120)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="constantesRutDian")

    public Set<InfoRutOfe> getInfoRutOfes() {
        return this.infoRutOfes;
    }
    
    public void setInfoRutOfes(Set<InfoRutOfe> infoRutOfes) {
        this.infoRutOfes = infoRutOfes;
    }
   








}
