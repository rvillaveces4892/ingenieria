//marcado
package guru.springframework.domain.felecv3;

import java.sql.Timestamp;
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
 * RegistroCargaDocFe entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="REGISTRO_CARGA_DOC_FE",schema="FELECV3")
public class RegistroCargaDocFe  extends EntidadPaginacion implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-5723974581823547686L;
    private RegistroCargaDocFeId id;
    private EstadoCargaDocFe estadoCargaDocFe;
    private String nombreArchivo;
    private Timestamp fechaProceso;
    private String nombreArchivoCarga;
    private Integer numPaginas;
    private Double pesoArchivo;
    private Long numResoluDian;

    // Constructors

    /** default constructor */
    public RegistroCargaDocFe(){
    }

    /** minimal constructor */
    public RegistroCargaDocFe(RegistroCargaDocFeId id){
        this.id=id;
    }

    /** full constructor */
    public RegistroCargaDocFe(RegistroCargaDocFeId id,EstadoCargaDocFe estadoCargaDocFe,String nombreArchivo,Timestamp fechaProceso,String nombreArchivoCarga,Integer numPaginas,Double pesoArchivo,Long numResoluDian){
        this.id=id;
        this.estadoCargaDocFe=estadoCargaDocFe;
        this.nombreArchivo=nombreArchivo;
        this.fechaProceso=fechaProceso;
        this.nombreArchivoCarga=nombreArchivoCarga;
        this.numPaginas=numPaginas;
        this.pesoArchivo=pesoArchivo;
        this.numResoluDian=numResoluDian;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),@AttributeOverride(name="noDocumento",column=@Column(name="NO_DOCUMENTO",nullable=false,length=30)),
            @AttributeOverride(name="idTipoDocFe",column=@Column(name="ID_TIPO_DOC_FE",nullable=false)),@AttributeOverride(name="idTipoArchivoCarga",column=@Column(name="ID_TIPO_ARCHIVO_CARGA",nullable=false))})
    public RegistroCargaDocFeId getId(){
        return this.id;
    }

    public void setId(RegistroCargaDocFeId id){
        this.id=id;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ESTADO_CARGA")
    public EstadoCargaDocFe getEstadoCargaDocFe(){
        return this.estadoCargaDocFe;
    }

    public void setEstadoCargaDocFe(EstadoCargaDocFe estadoCargaDocFe){
        this.estadoCargaDocFe=estadoCargaDocFe;
    }

    @Column(name="NOMBRE_ARCHIVO",length=150)
    public String getNombreArchivo(){
        return this.nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo){
        this.nombreArchivo=nombreArchivo;
    }

    @Column(name="FECHA_PROCESO",length=26)
    public Timestamp getFechaProceso(){
        return this.fechaProceso;
    }

    public void setFechaProceso(Timestamp fechaProceso){
        this.fechaProceso=fechaProceso;
    }

    @Column(name="NOMBRE_ARCHIVO_CARGA",length=70)
    public String getNombreArchivoCarga(){
        return this.nombreArchivoCarga;
    }

    public void setNombreArchivoCarga(String nombreArchivoCarga){
        this.nombreArchivoCarga=nombreArchivoCarga;
    }

    @Column(name="NUM_PAGINAS")
    public Integer getNumPaginas(){
        return this.numPaginas;
    }

    public void setNumPaginas(Integer numPaginas){
        this.numPaginas=numPaginas;
    }

    @Column(name="PESO_ARCHIVO",precision=53,scale=0)
    public Double getPesoArchivo(){
        return this.pesoArchivo;
    }

    public void setPesoArchivo(Double pesoArchivo){
        this.pesoArchivo=pesoArchivo;
    }

    @Column(name="NUM_RESOLU_DIAN")
    public Long getNumResoluDian(){
        return this.numResoluDian;
    }

    public void setNumResoluDian(Long numResoluDian){
        this.numResoluDian=numResoluDian;
    }

}
