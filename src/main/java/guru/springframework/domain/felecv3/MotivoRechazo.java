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
 * MotivoRechazo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MOTIVO_RECHAZO"
    ,schema="FELECV3"
)

public class MotivoRechazo   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=5536563237167183315L;
    private Short idMotivoRechazo;
     private String descripcion;
     private Set<MotivoRechazoAdqOfe> motivoRechazoAdqOfes = new HashSet<MotivoRechazoAdqOfe>(0);
     private Set<MotivoRechazoDoc> motivoRechazoDocs = new HashSet<MotivoRechazoDoc>(0);


    // Constructors

    /** default constructor */
    public MotivoRechazo() {
    }

	/** minimal constructor */
    public MotivoRechazo(Short idMotivoRechazo) {
        this.idMotivoRechazo = idMotivoRechazo;
    }
    
    /** full constructor */
    public MotivoRechazo(Short idMotivoRechazo, String descripcion, Set<MotivoRechazoAdqOfe> motivoRechazoAdqOfes, Set<MotivoRechazoDoc> motivoRechazoDocs) {
        this.idMotivoRechazo = idMotivoRechazo;
        this.descripcion = descripcion;
        this.motivoRechazoAdqOfes = motivoRechazoAdqOfes;
        this.motivoRechazoDocs = motivoRechazoDocs;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_MOTIVO_RECHAZO", unique=true, nullable=false)

    public Short getIdMotivoRechazo() {
        return this.idMotivoRechazo;
    }
    
    public void setIdMotivoRechazo(Short idMotivoRechazo) {
        this.idMotivoRechazo = idMotivoRechazo;
    }
    
    @Column(name="DESCRIPCION", length=120)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="motivoRechazo")

    public Set<MotivoRechazoAdqOfe> getMotivoRechazoAdqOfes() {
        return this.motivoRechazoAdqOfes;
    }
    
    public void setMotivoRechazoAdqOfes(Set<MotivoRechazoAdqOfe> motivoRechazoAdqOfes) {
        this.motivoRechazoAdqOfes = motivoRechazoAdqOfes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="motivoRechazo")

    public Set<MotivoRechazoDoc> getMotivoRechazoDocs() {
        return this.motivoRechazoDocs;
    }
    
    public void setMotivoRechazoDocs(Set<MotivoRechazoDoc> motivoRechazoDocs) {
        this.motivoRechazoDocs = motivoRechazoDocs;
    }
   








}
