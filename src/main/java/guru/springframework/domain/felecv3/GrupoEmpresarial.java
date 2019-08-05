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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * GrupoEmpresarial entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="GRUPO_EMPRESARIAL"
    ,schema="FELECV3"
, uniqueConstraints = @UniqueConstraint(columnNames="NOMBRE_GRUPO_EMPRESARIAL")
)

public class GrupoEmpresarial   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=8091231936625521269L;
    private Long idGrupoEmpresarial;
     private String nombreGrupoEmpresarial;
     private Set<RelacionGrupoEmpresa> relacionGrupoEmpresas = new HashSet<RelacionGrupoEmpresa>(0);


    // Constructors

    /** default constructor */
    public GrupoEmpresarial() {
    }

	/** minimal constructor */
    public GrupoEmpresarial(Long idGrupoEmpresarial, String nombreGrupoEmpresarial) {
        this.idGrupoEmpresarial = idGrupoEmpresarial;
        this.nombreGrupoEmpresarial = nombreGrupoEmpresarial;
    }
    
    /** full constructor */
    public GrupoEmpresarial(Long idGrupoEmpresarial, String nombreGrupoEmpresarial, Set<RelacionGrupoEmpresa> relacionGrupoEmpresas) {
        this.idGrupoEmpresarial = idGrupoEmpresarial;
        this.nombreGrupoEmpresarial = nombreGrupoEmpresarial;
        this.relacionGrupoEmpresas = relacionGrupoEmpresas;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_GRUPO_EMPRESARIAL", unique=true, nullable=false)

    public Long getIdGrupoEmpresarial() {
        return this.idGrupoEmpresarial;
    }
    
    public void setIdGrupoEmpresarial(Long idGrupoEmpresarial) {
        this.idGrupoEmpresarial = idGrupoEmpresarial;
    }
    
    @Column(name="NOMBRE_GRUPO_EMPRESARIAL", unique=true, nullable=false, length=100)

    public String getNombreGrupoEmpresarial() {
        return this.nombreGrupoEmpresarial;
    }
    
    public void setNombreGrupoEmpresarial(String nombreGrupoEmpresarial) {
        this.nombreGrupoEmpresarial = nombreGrupoEmpresarial;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="grupoEmpresarial")

    public Set<RelacionGrupoEmpresa> getRelacionGrupoEmpresas() {
        return this.relacionGrupoEmpresas;
    }
    
    public void setRelacionGrupoEmpresas(Set<RelacionGrupoEmpresa> relacionGrupoEmpresas) {
        this.relacionGrupoEmpresas = relacionGrupoEmpresas;
    }
   








}
