//marcado
package guru.springframework.domain.felecv3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * RelacionGrupoEmpresa entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="RELACION_GRUPO_EMPRESA"
    ,schema="FELECV3"
)

public class RelacionGrupoEmpresa   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6042356709575577675L;
    private RelacionGrupoEmpresaId id;
     private GrupoEmpresarial grupoEmpresarial;
     private ObligadoFe obligadoFe;
     private Set<EmpresaAsociada> empresaAsociadas = new HashSet<EmpresaAsociada>(0);


    // Constructors

    /** default constructor */
    public RelacionGrupoEmpresa() {
    }

	/** minimal constructor */
    public RelacionGrupoEmpresa(RelacionGrupoEmpresaId id, GrupoEmpresarial grupoEmpresarial, ObligadoFe obligadoFe) {
        this.id = id;
        this.grupoEmpresarial = grupoEmpresarial;
        this.obligadoFe = obligadoFe;
    }
    
    /** full constructor */
    public RelacionGrupoEmpresa(RelacionGrupoEmpresaId id, GrupoEmpresarial grupoEmpresarial, ObligadoFe obligadoFe, Set<EmpresaAsociada> empresaAsociadas) {
        this.id = id;
        this.grupoEmpresarial = grupoEmpresarial;
        this.obligadoFe = obligadoFe;
        this.empresaAsociadas = empresaAsociadas;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="idGrupoEmpresarial", column=@Column(name="ID_GRUPO_EMPRESARIAL", nullable=false) ) } )

    public RelacionGrupoEmpresaId getId() {
        return this.id;
    }
    
    public void setId(RelacionGrupoEmpresaId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_GRUPO_EMPRESARIAL", nullable=false, insertable=false, updatable=false)

    public GrupoEmpresarial getGrupoEmpresarial() {
        return this.grupoEmpresarial;
    }
    
    public void setGrupoEmpresarial(GrupoEmpresarial grupoEmpresarial) {
        this.grupoEmpresarial = grupoEmpresarial;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="relacionGrupoEmpresa")

    public Set<EmpresaAsociada> getEmpresaAsociadas() {
        return this.empresaAsociadas;
    }
    
    public void setEmpresaAsociadas(Set<EmpresaAsociada> empresaAsociadas) {
        this.empresaAsociadas = empresaAsociadas;
    }
   








}
