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
import guru.springframework.domain.manual.DocumentoManual;


/**
 * AdquirienteFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ADQUIRIENTE_FE"
    ,schema="FELECV3"
)

public class AdquirienteFe   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-2549522430592293330L;
    private String identificacionAdquiriente;
     private Set<UsuarioFelec> usuarioFelecs = new HashSet<UsuarioFelec>(0);
     private Set<DatoAcuerdoFe> datoAcuerdoFes = new HashSet<DatoAcuerdoFe>(0);
     private Set<OfeAdquiriente> ofeAdquirientes = new HashSet<OfeAdquiriente>(0);
     private Set<DocumentoFe> documentoFes = new HashSet<DocumentoFe>(0);
     private Set<CuentaAsociada> cuentaAsociadas = new HashSet<CuentaAsociada>(0);
     private Set<DocumentoManual> documentoManuals = new HashSet<DocumentoManual>(0);
     private Set<RegistroDocumentoRecepcion> registroDocumentoRecepcions = new HashSet<RegistroDocumentoRecepcion>(0);
     private Set<AcuerdoMovimientoFe> acuerdoMovimientoFes = new HashSet<AcuerdoMovimientoFe>(0);
     private Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes = new HashSet<DatoDocumentoAdquiriente>(0);


    // Constructors

    /** default constructor */
    public AdquirienteFe() {
    }

	/** minimal constructor */
    public AdquirienteFe(String identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
    
    /** full constructor */
    public AdquirienteFe(String identificacionAdquiriente, Set<UsuarioFelec> usuarioFelecs, Set<DatoAcuerdoFe> datoAcuerdoFes, Set<OfeAdquiriente> ofeAdquirientes, Set<DocumentoFe> documentoFes, Set<CuentaAsociada> cuentaAsociadas, Set<DocumentoManual> documentoManuals, Set<RegistroDocumentoRecepcion> registroDocumentoRecepcions, Set<AcuerdoMovimientoFe> acuerdoMovimientoFes, Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes) {
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.usuarioFelecs = usuarioFelecs;
        this.datoAcuerdoFes = datoAcuerdoFes;
        this.ofeAdquirientes = ofeAdquirientes;
        this.documentoFes = documentoFes;
        this.cuentaAsociadas = cuentaAsociadas;
        this.documentoManuals = documentoManuals;
        this.registroDocumentoRecepcions = registroDocumentoRecepcions;
        this.acuerdoMovimientoFes = acuerdoMovimientoFes;
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE", unique=true, nullable=false, length=30)

    public String getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(String identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adquirienteFe")

    public Set<UsuarioFelec> getUsuarioFelecs() {
        return this.usuarioFelecs;
    }
    
    public void setUsuarioFelecs(Set<UsuarioFelec> usuarioFelecs) {
        this.usuarioFelecs = usuarioFelecs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adquirienteFe")

    public Set<DatoAcuerdoFe> getDatoAcuerdoFes() {
        return this.datoAcuerdoFes;
    }
    
    public void setDatoAcuerdoFes(Set<DatoAcuerdoFe> datoAcuerdoFes) {
        this.datoAcuerdoFes = datoAcuerdoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adquirienteFe")

    public Set<OfeAdquiriente> getOfeAdquirientes() {
        return this.ofeAdquirientes;
    }
    
    public void setOfeAdquirientes(Set<OfeAdquiriente> ofeAdquirientes) {
        this.ofeAdquirientes = ofeAdquirientes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adquirienteFe")

    public Set<DocumentoFe> getDocumentoFes() {
        return this.documentoFes;
    }
    
    public void setDocumentoFes(Set<DocumentoFe> documentoFes) {
        this.documentoFes = documentoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adquirienteFe")

    public Set<CuentaAsociada> getCuentaAsociadas() {
        return this.cuentaAsociadas;
    }
    
    public void setCuentaAsociadas(Set<CuentaAsociada> cuentaAsociadas) {
        this.cuentaAsociadas = cuentaAsociadas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adquirienteFe")

    public Set<DocumentoManual> getDocumentoManuals() {
        return this.documentoManuals;
    }
    
    public void setDocumentoManuals(Set<DocumentoManual> documentoManuals) {
        this.documentoManuals = documentoManuals;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adquirienteFe")

    public Set<RegistroDocumentoRecepcion> getRegistroDocumentoRecepcions() {
        return this.registroDocumentoRecepcions;
    }
    
    public void setRegistroDocumentoRecepcions(Set<RegistroDocumentoRecepcion> registroDocumentoRecepcions) {
        this.registroDocumentoRecepcions = registroDocumentoRecepcions;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adquirienteFe")

    public Set<AcuerdoMovimientoFe> getAcuerdoMovimientoFes() {
        return this.acuerdoMovimientoFes;
    }
    
    public void setAcuerdoMovimientoFes(Set<AcuerdoMovimientoFe> acuerdoMovimientoFes) {
        this.acuerdoMovimientoFes = acuerdoMovimientoFes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="adquirienteFe")

    public Set<DatoDocumentoAdquiriente> getDatoDocumentoAdquirientes() {
        return this.datoDocumentoAdquirientes;
    }
    
    public void setDatoDocumentoAdquirientes(Set<DatoDocumentoAdquiriente> datoDocumentoAdquirientes) {
        this.datoDocumentoAdquirientes = datoDocumentoAdquirientes;
    }
   








}
