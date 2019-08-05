//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * EmpresaAsociada entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="EMPRESA_ASOCIADA"
    ,schema="FELECV3"
)

public class EmpresaAsociada   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-3026485360908575801L;
    private EmpresaAsociadaId id;
     private RelacionGrupoEmpresa relacionGrupoEmpresa;


    // Constructors

    /** default constructor */
    public EmpresaAsociada() {
    }

    
    /** full constructor */
    public EmpresaAsociada(EmpresaAsociadaId id, RelacionGrupoEmpresa relacionGrupoEmpresa) {
        this.id = id;
        this.relacionGrupoEmpresa = relacionGrupoEmpresa;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="usuario", column=@Column(name="USUARIO", nullable=false, length=80) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ) } )

    public EmpresaAsociadaId getId() {
        return this.id;
    }
    
    public void setId(EmpresaAsociadaId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumns( { 
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", referencedColumnName="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="ID_GRUPO_EMPRESARIAL", referencedColumnName="ID_GRUPO_EMPRESARIAL", nullable=false, insertable=false, updatable=false) } )

    public RelacionGrupoEmpresa getRelacionGrupoEmpresa() {
        return this.relacionGrupoEmpresa;
    }
    
    public void setRelacionGrupoEmpresa(RelacionGrupoEmpresa relacionGrupoEmpresa) {
        this.relacionGrupoEmpresa = relacionGrupoEmpresa;
    }
   








}
