//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;
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
import javax.persistence.UniqueConstraint;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * UsuarioFelec entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="USUARIO_FELEC"
    ,schema="FELECV3"
, uniqueConstraints = @UniqueConstraint(columnNames="USUARIO")
)

public class UsuarioFelec   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2495021940857508397L;
    private Long idUsuario;
     private Rol rol;
     private AdquirienteFe adquirienteFe;
     private ObligadoFe obligadoFe;
     private EstadoUsuario estadoUsuario;
     private Long identificacion;
     private String nombre;
     private String usuario;
     private String email;
     private Timestamp fechaCreacion;
     private Short diasConsulta=30;
     private String ipusuarioregistrado;
     private Short aceptoPoliticaComputec=0;
     private Set<AcuerdoMovimientoFe> acuerdoMovimientoFes = new HashSet<AcuerdoMovimientoFe>(0);


    // Constructors

    /** default constructor */
    public UsuarioFelec() {
    }

	/** minimal constructor */
    public UsuarioFelec(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    /** full constructor */
    public UsuarioFelec(Long idUsuario, Rol rol, AdquirienteFe adquirienteFe, ObligadoFe obligadoFe, EstadoUsuario estadoUsuario, Long identificacion, String nombre, String usuario, String email, Timestamp fechaCreacion, Short diasConsulta, String ipusuarioregistrado, Short aceptoPoliticaComputec, Set<AcuerdoMovimientoFe> acuerdoMovimientoFes) {
        this.idUsuario = idUsuario;
        this.rol = rol;
        this.adquirienteFe = adquirienteFe;
        this.obligadoFe = obligadoFe;
        this.estadoUsuario = estadoUsuario;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
        this.diasConsulta = diasConsulta;
        this.ipusuarioregistrado = ipusuarioregistrado;
        this.aceptoPoliticaComputec = aceptoPoliticaComputec;
        this.acuerdoMovimientoFes = acuerdoMovimientoFes;
    }

   
    // Property accessors
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_USUARIO", unique=true, nullable=false)

    public Long getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
	@ManyToOne(fetch=FetchType.EAGER)
        @JoinColumn(name="ID_ROL")

    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
	@ManyToOne(fetch=FetchType.EAGER)
        @JoinColumn(name="IDENTIFICACION_ADQUIRIENTE")

    public AdquirienteFe getAdquirienteFe() {
        return this.adquirienteFe;
    }
    
    public void setAdquirienteFe(AdquirienteFe adquirienteFe) {
        this.adquirienteFe = adquirienteFe;
    }
	@ManyToOne(fetch=FetchType.EAGER)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO")

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
	@ManyToOne(fetch=FetchType.EAGER)
        @JoinColumn(name="ID_ESTADO_USUARIO")

    public EstadoUsuario getEstadoUsuario() {
        return this.estadoUsuario;
    }
    
    public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
    
    @Column(name="IDENTIFICACION")

    public Long getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }
    
    @Column(name="NOMBRE", length=100)

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="USUARIO", unique=true, length=80)

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @Column(name="EMAIL", length=100)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="FECHA_CREACION", length=26)

    public Timestamp getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    @Column(name="DIAS_CONSULTA")

    public Short getDiasConsulta() {
        return this.diasConsulta;
    }
    
    public void setDiasConsulta(Short diasConsulta) {
        this.diasConsulta = diasConsulta;
    }
    
    @Column(name="IPUSUARIOREGISTRADO")

    public String getIpusuarioregistrado() {
        return this.ipusuarioregistrado;
    }
    
    public void setIpusuarioregistrado(String ipusuarioregistrado) {
        this.ipusuarioregistrado = ipusuarioregistrado;
    }
    
    @Column(name="ACEPTO_POLITICA_COMPUTEC")

    public Short getAceptoPoliticaComputec() {
        return this.aceptoPoliticaComputec;
    }
    
    public void setAceptoPoliticaComputec(Short aceptoPoliticaComputec) {
        this.aceptoPoliticaComputec = aceptoPoliticaComputec;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usuarioFelec")

    public Set<AcuerdoMovimientoFe> getAcuerdoMovimientoFes() {
        return this.acuerdoMovimientoFes;
    }
    
    public void setAcuerdoMovimientoFes(Set<AcuerdoMovimientoFe> acuerdoMovimientoFes) {
        this.acuerdoMovimientoFes = acuerdoMovimientoFes;
    }
   








}
