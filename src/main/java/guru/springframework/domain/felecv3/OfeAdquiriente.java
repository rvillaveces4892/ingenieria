//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * OfeAdquiriente entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="OFE_ADQUIRIENTE"
    ,schema="FELECV3"
)

public class OfeAdquiriente   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=4886746118185092872L;
    private OfeAdquirienteId id;
     private AdquirienteFe adquirienteFe;
     private PaisFe paisFe;
     private TipoRegimenFe tipoRegimenFe;
     private ObligadoFe obligadoFe;
     private TipoDocIdentificacion tipoDocIdentificacion;
     private TipoPersona tipoPersona;
     private String razonSocial;
     private String direccion;
     private String ciudad;
     private String departamento;
     private String subdivision;
     private String email;
     private String nombrePn;
     private String nombre2Pn;
     private String apellidoPn;


    // Constructors

    /** default constructor */
    public OfeAdquiriente() {
    }

	/** minimal constructor */
    public OfeAdquiriente(OfeAdquirienteId id, AdquirienteFe adquirienteFe, ObligadoFe obligadoFe) {
        this.id = id;
        this.adquirienteFe = adquirienteFe;
        this.obligadoFe = obligadoFe;
    }
    
    /** full constructor */
    public OfeAdquiriente(OfeAdquirienteId id, AdquirienteFe adquirienteFe, PaisFe paisFe, TipoRegimenFe tipoRegimenFe, ObligadoFe obligadoFe, TipoDocIdentificacion tipoDocIdentificacion, TipoPersona tipoPersona, String razonSocial, String direccion, String ciudad, String departamento, String subdivision, String email, String nombrePn, String nombre2Pn, String apellidoPn) {
        this.id = id;
        this.adquirienteFe = adquirienteFe;
        this.paisFe = paisFe;
        this.tipoRegimenFe = tipoRegimenFe;
        this.obligadoFe = obligadoFe;
        this.tipoDocIdentificacion = tipoDocIdentificacion;
        this.tipoPersona = tipoPersona;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.subdivision = subdivision;
        this.email = email;
        this.nombrePn = nombrePn;
        this.nombre2Pn = nombre2Pn;
        this.apellidoPn = apellidoPn;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="identificacionAdquiriente", column=@Column(name="IDENTIFICACION_ADQUIRIENTE", nullable=false, length=30) ) } )

    public OfeAdquirienteId getId() {
        return this.id;
    }
    
    public void setId(OfeAdquirienteId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_ADQUIRIENTE", nullable=false, insertable=false, updatable=false)

    public AdquirienteFe getAdquirienteFe() {
        return this.adquirienteFe;
    }
    
    public void setAdquirienteFe(AdquirienteFe adquirienteFe) {
        this.adquirienteFe = adquirienteFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="CODIGO_PAIS")

    public PaisFe getPaisFe() {
        return this.paisFe;
    }
    
    public void setPaisFe(PaisFe paisFe) {
        this.paisFe = paisFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_REGIMEN")

    public TipoRegimenFe getTipoRegimenFe() {
        return this.tipoRegimenFe;
    }
    
    public void setTipoRegimenFe(TipoRegimenFe tipoRegimenFe) {
        this.tipoRegimenFe = tipoRegimenFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", nullable=false, insertable=false, updatable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_DOC_IDENTIFICACION")

    public TipoDocIdentificacion getTipoDocIdentificacion() {
        return this.tipoDocIdentificacion;
    }
    
    public void setTipoDocIdentificacion(TipoDocIdentificacion tipoDocIdentificacion) {
        this.tipoDocIdentificacion = tipoDocIdentificacion;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_PERSONA")

    public TipoPersona getTipoPersona() {
        return this.tipoPersona;
    }
    
    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
    
    @Column(name="RAZON_SOCIAL", length=120)

    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    @Column(name="DIRECCION", length=300)

    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="CIUDAD", length=100)

    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Column(name="DEPARTAMENTO", length=100)

    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Column(name="SUBDIVISION", length=100)

    public String getSubdivision() {
        return this.subdivision;
    }
    
    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }
    
    @Column(name="EMAIL", length=100)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="NOMBRE_PN", length=100)

    public String getNombrePn() {
        return this.nombrePn;
    }
    
    public void setNombrePn(String nombrePn) {
        this.nombrePn = nombrePn;
    }
    
    @Column(name="NOMBRE2_PN", length=30)

    public String getNombre2Pn() {
        return this.nombre2Pn;
    }
    
    public void setNombre2Pn(String nombre2Pn) {
        this.nombre2Pn = nombre2Pn;
    }
    
    @Column(name="APELLIDO_PN", length=30)

    public String getApellidoPn() {
        return this.apellidoPn;
    }
    
    public void setApellidoPn(String apellidoPn) {
        this.apellidoPn = apellidoPn;
    }
   








}
