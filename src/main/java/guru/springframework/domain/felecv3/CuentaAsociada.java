//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * CuentaAsociada entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CUENTA_ASOCIADA"
    ,schema="FELECV3"
)

public class CuentaAsociada   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-8584528092221989079L;
    private Integer idCuenta;
     private Rol rol;
     private AdquirienteFe adquirienteFe;
     private ObligadoFe obligadoFe;
     private String usuario;


    // Constructors

    /** default constructor */
    public CuentaAsociada() {
    }

	/** minimal constructor */
    public CuentaAsociada(Integer idCuenta, Rol rol, ObligadoFe obligadoFe, String usuario) {
        this.idCuenta = idCuenta;
        this.rol = rol;
        this.obligadoFe = obligadoFe;
        this.usuario = usuario;
    }
    
    /** full constructor */
    public CuentaAsociada(Integer idCuenta, Rol rol, AdquirienteFe adquirienteFe, ObligadoFe obligadoFe, String usuario) {
        this.idCuenta = idCuenta;
        this.rol = rol;
        this.adquirienteFe = adquirienteFe;
        this.obligadoFe = obligadoFe;
        this.usuario = usuario;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID_CUENTA", unique=true, nullable=false)

    public Integer getIdCuenta() {
        return this.idCuenta;
    }
    
    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ROL", nullable=false)

    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_ADQUIRIENTE")

    public AdquirienteFe getAdquirienteFe() {
        return this.adquirienteFe;
    }
    
    public void setAdquirienteFe(AdquirienteFe adquirienteFe) {
        this.adquirienteFe = adquirienteFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
    
    @Column(name="USUARIO", nullable=false, length=80)

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
   








}
