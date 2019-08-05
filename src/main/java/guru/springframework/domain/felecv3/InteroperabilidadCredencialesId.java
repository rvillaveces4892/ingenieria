//marcado
package guru.springframework.domain.felecv3;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * InteroperabilidadCredencialesId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class InteroperabilidadCredencialesId   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=7333121261105349807L;
    private Long identificacionProveedor;
     private String razonSocial;
     private Date fechaCaducidad;
     private Date fechaCreada;
     private String credencial;
     private Short estadoCredencial;
     private String credencialSftp;
     private String credencialWs;


    // Constructors

    /** default constructor */
    public InteroperabilidadCredencialesId() {
    }

	/** minimal constructor */
    public InteroperabilidadCredencialesId(Long identificacionProveedor) {
        this.identificacionProveedor = identificacionProveedor;
    }
    
    /** full constructor */
    public InteroperabilidadCredencialesId(Long identificacionProveedor, String razonSocial, Date fechaCaducidad, Date fechaCreada, String credencial, Short estadoCredencial, String credencialSftp, String credencialWs) {
        this.identificacionProveedor = identificacionProveedor;
        this.razonSocial = razonSocial;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaCreada = fechaCreada;
        this.credencial = credencial;
        this.estadoCredencial = estadoCredencial;
        this.credencialSftp = credencialSftp;
        this.credencialWs = credencialWs;
    }

   
    // Property accessors

    @Column(name="IDENTIFICACION_PROVEEDOR", nullable=false)

    public Long getIdentificacionProveedor() {
        return this.identificacionProveedor;
    }
    
    public void setIdentificacionProveedor(Long identificacionProveedor) {
        this.identificacionProveedor = identificacionProveedor;
    }

    @Column(name="RAZON_SOCIAL", length=120)

    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
@Temporal(TemporalType.DATE)
    @Column(name="FECHA_CADUCIDAD", length=10)

    public Date getFechaCaducidad() {
        return this.fechaCaducidad;
    }
    
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
@Temporal(TemporalType.DATE)
    @Column(name="FECHA_CREADA", length=10)

    public Date getFechaCreada() {
        return this.fechaCreada;
    }
    
    public void setFechaCreada(Date fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    @Column(name="CREDENCIAL", length=120)

    public String getCredencial() {
        return this.credencial;
    }
    
    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    @Column(name="ESTADO_CREDENCIAL")

    public Short getEstadoCredencial() {
        return this.estadoCredencial;
    }
    
    public void setEstadoCredencial(Short estadoCredencial) {
        this.estadoCredencial = estadoCredencial;
    }

    @Column(name="CREDENCIAL_SFTP", length=100)

    public String getCredencialSftp() {
        return this.credencialSftp;
    }
    
    public void setCredencialSftp(String credencialSftp) {
        this.credencialSftp = credencialSftp;
    }

    @Column(name="CREDENCIAL_WS", length=100)

    public String getCredencialWs() {
        return this.credencialWs;
    }
    
    public void setCredencialWs(String credencialWs) {
        this.credencialWs = credencialWs;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InteroperabilidadCredencialesId) ) return false;
		 InteroperabilidadCredencialesId castOther = ( InteroperabilidadCredencialesId ) other; 
         
		 return ( (this.getIdentificacionProveedor()==castOther.getIdentificacionProveedor()) || ( this.getIdentificacionProveedor()!=null && castOther.getIdentificacionProveedor()!=null && this.getIdentificacionProveedor().equals(castOther.getIdentificacionProveedor()) ) )
 && ( (this.getRazonSocial()==castOther.getRazonSocial()) || ( this.getRazonSocial()!=null && castOther.getRazonSocial()!=null && this.getRazonSocial().equals(castOther.getRazonSocial()) ) )
 && ( (this.getFechaCaducidad()==castOther.getFechaCaducidad()) || ( this.getFechaCaducidad()!=null && castOther.getFechaCaducidad()!=null && this.getFechaCaducidad().equals(castOther.getFechaCaducidad()) ) )
 && ( (this.getFechaCreada()==castOther.getFechaCreada()) || ( this.getFechaCreada()!=null && castOther.getFechaCreada()!=null && this.getFechaCreada().equals(castOther.getFechaCreada()) ) )
 && ( (this.getCredencial()==castOther.getCredencial()) || ( this.getCredencial()!=null && castOther.getCredencial()!=null && this.getCredencial().equals(castOther.getCredencial()) ) )
 && ( (this.getEstadoCredencial()==castOther.getEstadoCredencial()) || ( this.getEstadoCredencial()!=null && castOther.getEstadoCredencial()!=null && this.getEstadoCredencial().equals(castOther.getEstadoCredencial()) ) )
 && ( (this.getCredencialSftp()==castOther.getCredencialSftp()) || ( this.getCredencialSftp()!=null && castOther.getCredencialSftp()!=null && this.getCredencialSftp().equals(castOther.getCredencialSftp()) ) )
 && ( (this.getCredencialWs()==castOther.getCredencialWs()) || ( this.getCredencialWs()!=null && castOther.getCredencialWs()!=null && this.getCredencialWs().equals(castOther.getCredencialWs()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacionProveedor() == null ? 0 : this.getIdentificacionProveedor().hashCode() );
         result = 37 * result + ( getRazonSocial() == null ? 0 : this.getRazonSocial().hashCode() );
         result = 37 * result + ( getFechaCaducidad() == null ? 0 : this.getFechaCaducidad().hashCode() );
         result = 37 * result + ( getFechaCreada() == null ? 0 : this.getFechaCreada().hashCode() );
         result = 37 * result + ( getCredencial() == null ? 0 : this.getCredencial().hashCode() );
         result = 37 * result + ( getEstadoCredencial() == null ? 0 : this.getEstadoCredencial().hashCode() );
         result = 37 * result + ( getCredencialSftp() == null ? 0 : this.getCredencialSftp().hashCode() );
         result = 37 * result + ( getCredencialWs() == null ? 0 : this.getCredencialWs().hashCode() );
         return result;
   }   





}
