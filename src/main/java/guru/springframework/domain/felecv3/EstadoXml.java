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
 * EstadoXml entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ESTADO_XML"
    ,schema="FELECV3"
)

public class EstadoXml   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5995384391648855704L;
    private Short idEstadoXml;
     private String descripcion;
     private Set<AuditoriaXmlDoc> auditoriaXmlDocs = new HashSet<AuditoriaXmlDoc>(0);


    // Constructors

    /** default constructor */
    public EstadoXml() {
    }

	/** minimal constructor */
    public EstadoXml(Short idEstadoXml) {
        this.idEstadoXml = idEstadoXml;
    }
    
    /** full constructor */
    public EstadoXml(Short idEstadoXml, String descripcion, Set<AuditoriaXmlDoc> auditoriaXmlDocs) {
        this.idEstadoXml = idEstadoXml;
        this.descripcion = descripcion;
        this.auditoriaXmlDocs = auditoriaXmlDocs;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_ESTADO_XML", unique=true, nullable=false)

    public Short getIdEstadoXml() {
        return this.idEstadoXml;
    }
    
    public void setIdEstadoXml(Short idEstadoXml) {
        this.idEstadoXml = idEstadoXml;
    }
    
    @Column(name="DESCRIPCION", length=20)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="estadoXml")

    public Set<AuditoriaXmlDoc> getAuditoriaXmlDocs() {
        return this.auditoriaXmlDocs;
    }
    
    public void setAuditoriaXmlDocs(Set<AuditoriaXmlDoc> auditoriaXmlDocs) {
        this.auditoriaXmlDocs = auditoriaXmlDocs;
    }
   








}
