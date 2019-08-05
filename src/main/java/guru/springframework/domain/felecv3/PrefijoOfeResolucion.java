//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * PrefijoOfeResolucion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="PREFIJO_OFE_RESOLUCION"
    ,schema="FELECV3"
)

public class PrefijoOfeResolucion   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6578676920728820367L;
    private Integer idPrefijo;
     private PrefijoOfeResolucion prefijoOfeResolucion;
     private Long identificacionObligado;
     private Long numResoluDian;
     private String valorPrefijo;
     private Set<PrefijoOfeResolucion> prefijoOfeResolucions = new HashSet<PrefijoOfeResolucion>(0);


    // Constructors

    /** default constructor */
    public PrefijoOfeResolucion() {
    }

	/** minimal constructor */
    public PrefijoOfeResolucion(Integer idPrefijo, PrefijoOfeResolucion prefijoOfeResolucion, Long identificacionObligado, Long numResoluDian) {
        this.idPrefijo = idPrefijo;
        this.prefijoOfeResolucion = prefijoOfeResolucion;
        this.identificacionObligado = identificacionObligado;
        this.numResoluDian = numResoluDian;
    }
    
    /** full constructor */
    public PrefijoOfeResolucion(Integer idPrefijo, PrefijoOfeResolucion prefijoOfeResolucion, Long identificacionObligado, Long numResoluDian, String valorPrefijo, Set<PrefijoOfeResolucion> prefijoOfeResolucions) {
        this.idPrefijo = idPrefijo;
        this.prefijoOfeResolucion = prefijoOfeResolucion;
        this.identificacionObligado = identificacionObligado;
        this.numResoluDian = numResoluDian;
        this.valorPrefijo = valorPrefijo;
        this.prefijoOfeResolucions = prefijoOfeResolucions;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_PREFIJO", unique=true, nullable=false)

    public Integer getIdPrefijo() {
        return this.idPrefijo;
    }
    
    public void setIdPrefijo(Integer idPrefijo) {
        this.idPrefijo = idPrefijo;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_PREFIJO", unique=true, nullable=false, insertable=false, updatable=false)

    public PrefijoOfeResolucion getPrefijoOfeResolucion() {
        return this.prefijoOfeResolucion;
    }
    
    public void setPrefijoOfeResolucion(PrefijoOfeResolucion prefijoOfeResolucion) {
        this.prefijoOfeResolucion = prefijoOfeResolucion;
    }
    
    @Column(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
    
    @Column(name="NUM_RESOLU_DIAN", nullable=false)

    public Long getNumResoluDian() {
        return this.numResoluDian;
    }
    
    public void setNumResoluDian(Long numResoluDian) {
        this.numResoluDian = numResoluDian;
    }
    
    @Column(name="VALOR_PREFIJO", length=12)

    public String getValorPrefijo() {
        return this.valorPrefijo;
    }
    
    public void setValorPrefijo(String valorPrefijo) {
        this.valorPrefijo = valorPrefijo;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="prefijoOfeResolucion")

    public Set<PrefijoOfeResolucion> getPrefijoOfeResolucions() {
        return this.prefijoOfeResolucions;
    }
    
    public void setPrefijoOfeResolucions(Set<PrefijoOfeResolucion> prefijoOfeResolucions) {
        this.prefijoOfeResolucions = prefijoOfeResolucions;
    }
   








}
