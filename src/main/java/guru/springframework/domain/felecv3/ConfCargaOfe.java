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
 * ConfCargaOfe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONF_CARGA_OFE"
    ,schema="FELECV3"
)

public class ConfCargaOfe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=6780624646028581566L;
    private Long identificacionObligado;
     private EstadoCuentaCurd estadoCuentaCurd;
     private ServidorCarga servidorCarga;
     private String curd;
     private String servidor;
     private String userTransf;
     private String passTransf;


    // Constructors

    /** default constructor */
    public ConfCargaOfe() {
    }

	/** minimal constructor */
    public ConfCargaOfe(Long identificacionObligado, String curd) {
        this.identificacionObligado = identificacionObligado;
        this.curd = curd;
    }
    
    /** full constructor */
    public ConfCargaOfe(Long identificacionObligado, EstadoCuentaCurd estadoCuentaCurd, ServidorCarga servidorCarga, String curd, String servidor, String userTransf, String passTransf) {
        this.identificacionObligado = identificacionObligado;
        this.estadoCuentaCurd = estadoCuentaCurd;
        this.servidorCarga = servidorCarga;
        this.curd = curd;
        this.servidor = servidor;
        this.userTransf = userTransf;
        this.passTransf = passTransf;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="IDENTIFICACION_OBLIGADO", unique=true, nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_ESTADO_CUENTA_CURD")

    public EstadoCuentaCurd getEstadoCuentaCurd() {
        return this.estadoCuentaCurd;
    }
    
    public void setEstadoCuentaCurd(EstadoCuentaCurd estadoCuentaCurd) {
        this.estadoCuentaCurd = estadoCuentaCurd;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_SERVIDOR_CARGA")

    public ServidorCarga getServidorCarga() {
        return this.servidorCarga;
    }
    
    public void setServidorCarga(ServidorCarga servidorCarga) {
        this.servidorCarga = servidorCarga;
    }
    
    @Column(name="CURD", nullable=false, length=30)

    public String getCurd() {
        return this.curd;
    }
    
    public void setCurd(String curd) {
        this.curd = curd;
    }
    
    @Column(name="SERVIDOR", length=30)

    public String getServidor() {
        return this.servidor;
    }
    
    public void setServidor(String servidor) {
        this.servidor = servidor;
    }
    
    @Column(name="USER_TRANSF", length=20)

    public String getUserTransf() {
        return this.userTransf;
    }
    
    public void setUserTransf(String userTransf) {
        this.userTransf = userTransf;
    }
    
    @Column(name="PASS_TRANSF", length=20)

    public String getPassTransf() {
        return this.passTransf;
    }
    
    public void setPassTransf(String passTransf) {
        this.passTransf = passTransf;
    }
   








}
