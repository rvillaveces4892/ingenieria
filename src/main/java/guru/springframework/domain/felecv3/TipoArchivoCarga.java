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
 * TipoArchivoCarga entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_ARCHIVO_CARGA"
    ,schema="FELECV3"
)

public class TipoArchivoCarga   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=734043541724621883L;
    private Short idTipoArchivoCarga;
     private String descripcion;
//     private Set<RegistroCargaDocFe> registroCargaDocFes = new HashSet<RegistroCargaDocFe>(0);


    // Constructors

    /** default constructor */
    public TipoArchivoCarga() {
    }

	/** minimal constructor */
    public TipoArchivoCarga(Short idTipoArchivoCarga) {
        this.idTipoArchivoCarga = idTipoArchivoCarga;
    }
    
    /** full constructor */
    public TipoArchivoCarga(Short idTipoArchivoCarga, String descripcion/*, Set<RegistroCargaDocFe> registroCargaDocFes*/) {
        this.idTipoArchivoCarga = idTipoArchivoCarga;
        this.descripcion = descripcion;
//        this.registroCargaDocFes = registroCargaDocFes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_TIPO_ARCHIVO_CARGA", unique=true, nullable=false)

    public Short getIdTipoArchivoCarga() {
        return this.idTipoArchivoCarga;
    }
    
    public void setIdTipoArchivoCarga(Short idTipoArchivoCarga) {
        this.idTipoArchivoCarga = idTipoArchivoCarga;
    }
    
    @Column(name="DESCRIPCION", length=50)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
//@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoArchivoCarga")
//
//    public Set<RegistroCargaDocFe> getRegistroCargaDocFes() {
//        return this.registroCargaDocFes;
//    }
//    
//    public void setRegistroCargaDocFes(Set<RegistroCargaDocFe> registroCargaDocFes) {
//        this.registroCargaDocFes = registroCargaDocFes;
//    }
   

}
