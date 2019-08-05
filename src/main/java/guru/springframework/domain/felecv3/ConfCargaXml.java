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
 * ConfCargaXml entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONF_CARGA_XML",schema="FELECV3")
public class ConfCargaXml  extends EntidadPaginacion implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-1994309631493538173L;
    private ConfCargaXmlId id;
    private String pathXml;
    private String pathProcesados;
    private String grupoAplicacionOd;
    private String aplicacionOd;
    private String serverColaCarga;
    private String pathSalida;
    private Short noArchivosSimultaneos;
    private Short almacenaXml;
    private Short almacenaPdf;
    private String grupoAplicacionOdPdf;
    private String aplicacionOdPdf;
    private String pathInconsistentes;

    // Constructors

    /** default constructor */
    public ConfCargaXml(){
    }

    /** minimal constructor */
    public ConfCargaXml(ConfCargaXmlId id){
        this.id=id;
    }

    /** full constructor */
    public ConfCargaXml(ConfCargaXmlId id,String pathXml,String pathProcesados,String grupoAplicacionOd,String aplicacionOd,String serverColaCarga,String pathSalida,Short noArchivosSimultaneos,Short almacenaXml,Short almacenaPdf,
            String grupoAplicacionOdPdf,String aplicacionOdPdf,String pathInconsistentes){
        this.id=id;
        this.pathXml=pathXml;
        this.pathProcesados=pathProcesados;
        this.grupoAplicacionOd=grupoAplicacionOd;
        this.aplicacionOd=aplicacionOd;
        this.serverColaCarga=serverColaCarga;
        this.pathSalida=pathSalida;
        this.noArchivosSimultaneos=noArchivosSimultaneos;
        this.almacenaXml=almacenaXml;
        this.almacenaPdf=almacenaPdf;
        this.grupoAplicacionOdPdf=grupoAplicacionOdPdf;
        this.aplicacionOdPdf=aplicacionOdPdf;
        this.pathInconsistentes=pathInconsistentes;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),@AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false)),
            @AttributeOverride(name="idTipoDocFe",column=@Column(name="ID_TIPO_DOC_FE",nullable=false))})
    public ConfCargaXmlId getId(){
        return this.id;
    }

    public void setId(ConfCargaXmlId id){
        this.id=id;
    }

    @Column(name="PATH_XML",length=150)
    public String getPathXml(){
        return this.pathXml;
    }

    public void setPathXml(String pathXml){
        this.pathXml=pathXml;
    }

    @Column(name="PATH_PROCESADOS",length=150)
    public String getPathProcesados(){
        return this.pathProcesados;
    }

    public void setPathProcesados(String pathProcesados){
        this.pathProcesados=pathProcesados;
    }

    @Column(name="GRUPO_APLICACION_OD",length=50)
    public String getGrupoAplicacionOd(){
        return this.grupoAplicacionOd;
    }

    public void setGrupoAplicacionOd(String grupoAplicacionOd){
        this.grupoAplicacionOd=grupoAplicacionOd;
    }

    @Column(name="APLICACION_OD",length=50)
    public String getAplicacionOd(){
        return this.aplicacionOd;
    }

    public void setAplicacionOd(String aplicacionOd){
        this.aplicacionOd=aplicacionOd;
    }

    @Column(name="SERVER_COLA_CARGA",length=50)
    public String getServerColaCarga(){
        return this.serverColaCarga;
    }

    public void setServerColaCarga(String serverColaCarga){
        this.serverColaCarga=serverColaCarga;
    }

    @Column(name="PATH_SALIDA",length=50)
    public String getPathSalida(){
        return this.pathSalida;
    }

    public void setPathSalida(String pathSalida){
        this.pathSalida=pathSalida;
    }

    @Column(name="NO_ARCHIVOS_SIMULTANEOS")
    public Short getNoArchivosSimultaneos(){
        return this.noArchivosSimultaneos;
    }

    public void setNoArchivosSimultaneos(Short noArchivosSimultaneos){
        this.noArchivosSimultaneos=noArchivosSimultaneos;
    }

    @Column(name="ALMACENA_XML")
    public Short getAlmacenaXml(){
        return this.almacenaXml;
    }

    public void setAlmacenaXml(Short almacenaXml){
        this.almacenaXml=almacenaXml;
    }

    @Column(name="ALMACENA_PDF")
    public Short getAlmacenaPdf(){
        return this.almacenaPdf;
    }

    public void setAlmacenaPdf(Short almacenaPdf){
        this.almacenaPdf=almacenaPdf;
    }

    @Column(name="GRUPO_APLICACION_OD_PDF",length=50)
    public String getGrupoAplicacionOdPdf(){
        return this.grupoAplicacionOdPdf;
    }

    public void setGrupoAplicacionOdPdf(String grupoAplicacionOdPdf){
        this.grupoAplicacionOdPdf=grupoAplicacionOdPdf;
    }

    @Column(name="APLICACION_OD_PDF",length=50)
    public String getAplicacionOdPdf(){
        return this.aplicacionOdPdf;
    }

    public void setAplicacionOdPdf(String aplicacionOdPdf){
        this.aplicacionOdPdf=aplicacionOdPdf;
    }

    @Column(name="PATH_INCONSISTENTES",length=150)
    public String getPathInconsistentes(){
        return this.pathInconsistentes;
    }

    public void setPathInconsistentes(String pathInconsistentes){
        this.pathInconsistentes=pathInconsistentes;
    }

}
