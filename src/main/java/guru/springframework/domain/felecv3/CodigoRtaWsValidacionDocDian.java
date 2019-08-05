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
 * CodigoRtaWsValidacionDocDian entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CODIGO_RTA_WS_VALIDACION_DOC_DIAN"
    ,schema="FELECV3"
)

public class CodigoRtaWsValidacionDocDian   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=8287895080424432621L;
    private Long codigoRtaWsDian;
     private String descripcion;
     private Set<DetalleVerificacionDocDian> detalleVerificacionDocDians = new HashSet<DetalleVerificacionDocDian>(0);


    // Constructors

    /** default constructor */
    public CodigoRtaWsValidacionDocDian() {
    }

	/** minimal constructor */
    public CodigoRtaWsValidacionDocDian(Long codigoRtaWsDian) {
        this.codigoRtaWsDian = codigoRtaWsDian;
    }
    
    /** full constructor */
    public CodigoRtaWsValidacionDocDian(Long codigoRtaWsDian, String descripcion, Set<DetalleVerificacionDocDian> detalleVerificacionDocDians) {
        this.codigoRtaWsDian = codigoRtaWsDian;
        this.descripcion = descripcion;
        this.detalleVerificacionDocDians = detalleVerificacionDocDians;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="CODIGO_RTA_WS_DIAN", unique=true, nullable=false)

    public Long getCodigoRtaWsDian() {
        return this.codigoRtaWsDian;
    }
    
    public void setCodigoRtaWsDian(Long codigoRtaWsDian) {
        this.codigoRtaWsDian = codigoRtaWsDian;
    }
    
    @Column(name="DESCRIPCION", length=70)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="codigoRtaWsValidacionDocDian")

    public Set<DetalleVerificacionDocDian> getDetalleVerificacionDocDians() {
        return this.detalleVerificacionDocDians;
    }
    
    public void setDetalleVerificacionDocDians(Set<DetalleVerificacionDocDian> detalleVerificacionDocDians) {
        this.detalleVerificacionDocDians = detalleVerificacionDocDians;
    }
   








}
