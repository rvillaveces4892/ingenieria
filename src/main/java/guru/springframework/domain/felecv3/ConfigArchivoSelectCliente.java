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
 * ConfigArchivoSelectCliente entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONFIG_ARCHIVO_SELECT_CLIENTE"
    ,schema="FELECV3"
)

public class ConfigArchivoSelectCliente   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-3817525802497361180L;
    private ConfigArchivoSelectClienteId id;
     private String posicionCampoLineaSelectOrigen;
     private String obligatorio;
     private String valorPorDefecto;
     private String descripcion;


    // Constructors

    /** default constructor */
    public ConfigArchivoSelectCliente() {
    }

	/** minimal constructor */
    public ConfigArchivoSelectCliente(ConfigArchivoSelectClienteId id, String posicionCampoLineaSelectOrigen, String obligatorio, String valorPorDefecto) {
        this.id = id;
        this.posicionCampoLineaSelectOrigen = posicionCampoLineaSelectOrigen;
        this.obligatorio = obligatorio;
        this.valorPorDefecto = valorPorDefecto;
    }
    
    /** full constructor */
    public ConfigArchivoSelectCliente(ConfigArchivoSelectClienteId id, String posicionCampoLineaSelectOrigen, String obligatorio, String valorPorDefecto, String descripcion) {
        this.id = id;
        this.posicionCampoLineaSelectOrigen = posicionCampoLineaSelectOrigen;
        this.obligatorio = obligatorio;
        this.valorPorDefecto = valorPorDefecto;
        this.descripcion = descripcion;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="numResoluDian", column=@Column(name="NUM_RESOLU_DIAN", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ), 
        @AttributeOverride(name="tipoEtiqueta", column=@Column(name="TIPO_ETIQUETA", nullable=false, length=25) ), 
        @AttributeOverride(name="posicionCampoLineaSelectDestino", column=@Column(name="POSICION_CAMPO_LINEA_SELECT_DESTINO", nullable=false) ) } )

    public ConfigArchivoSelectClienteId getId() {
        return this.id;
    }
    
    public void setId(ConfigArchivoSelectClienteId id) {
        this.id = id;
    }
    
    @Column(name="POSICION_CAMPO_LINEA_SELECT_ORIGEN", nullable=false, length=5)

    public String getPosicionCampoLineaSelectOrigen() {
        return this.posicionCampoLineaSelectOrigen;
    }
    
    public void setPosicionCampoLineaSelectOrigen(String posicionCampoLineaSelectOrigen) {
        this.posicionCampoLineaSelectOrigen = posicionCampoLineaSelectOrigen;
    }
    
    @Column(name="OBLIGATORIO", nullable=false, length=2)

    public String getObligatorio() {
        return this.obligatorio;
    }
    
    public void setObligatorio(String obligatorio) {
        this.obligatorio = obligatorio;
    }
    
    @Column(name="VALOR_POR_DEFECTO", nullable=false, length=25)

    public String getValorPorDefecto() {
        return this.valorPorDefecto;
    }
    
    public void setValorPorDefecto(String valorPorDefecto) {
        this.valorPorDefecto = valorPorDefecto;
    }
    
    @Column(name="DESCRIPCION", length=150)

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   








}
