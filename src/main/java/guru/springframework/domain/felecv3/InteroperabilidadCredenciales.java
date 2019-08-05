//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * InteroperabilidadCredenciales entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="INTEROPERABILIDAD_CREDENCIALES"
    ,schema="FELECV3"
)

public class InteroperabilidadCredenciales   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-1137414985278013386L;
    private InteroperabilidadCredencialesId id;


    // Constructors

    /** default constructor */
    public InteroperabilidadCredenciales() {
    }

    
    /** full constructor */
    public InteroperabilidadCredenciales(InteroperabilidadCredencialesId id) {
        this.id = id;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionProveedor", column=@Column(name="IDENTIFICACION_PROVEEDOR", nullable=false) ), 
        @AttributeOverride(name="razonSocial", column=@Column(name="RAZON_SOCIAL", length=120) ), 
        @AttributeOverride(name="fechaCaducidad", column=@Column(name="FECHA_CADUCIDAD", length=10) ), 
        @AttributeOverride(name="fechaCreada", column=@Column(name="FECHA_CREADA", length=10) ), 
        @AttributeOverride(name="credencial", column=@Column(name="CREDENCIAL", length=120) ), 
        @AttributeOverride(name="estadoCredencial", column=@Column(name="ESTADO_CREDENCIAL") ), 
        @AttributeOverride(name="credencialSftp", column=@Column(name="CREDENCIAL_SFTP", length=100) ), 
        @AttributeOverride(name="credencialWs", column=@Column(name="CREDENCIAL_WS", length=100) ) } )

    public InteroperabilidadCredencialesId getId() {
        return this.id;
    }
    
    public void setId(InteroperabilidadCredencialesId id) {
        this.id = id;
    }
   








}
