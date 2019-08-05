package guru.springframework.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TipoGestion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TIPO_GESTION",schema="ENVIO_SELECT")
public class TipoGestion implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=7981811527266271634L;
    private Short codigoTipoGestion;
    private String nombreTipoGestion;
    private String estado;
    private Short codigoCanal;

    // Constructors

    /** default constructor */
    public TipoGestion(){
    }

    /** minimal constructor */
    public TipoGestion(Short codigoTipoGestion){
        this.codigoTipoGestion=codigoTipoGestion;
    }

    /** full constructor */
    public TipoGestion(Short codigoTipoGestion,String nombreTipoGestion,String estado,Short codigoCanal){
        this.codigoTipoGestion=codigoTipoGestion;
        this.nombreTipoGestion=nombreTipoGestion;
        this.estado=estado;
        this.codigoCanal=codigoCanal;
    }

    // Property accessors
    @Id
    @Column(name="CODIGO_TIPO_GESTION",unique=true,nullable=false)
    public Short getCodigoTipoGestion(){
        return this.codigoTipoGestion;
    }

    public void setCodigoTipoGestion(Short codigoTipoGestion){
        this.codigoTipoGestion=codigoTipoGestion;
    }

    @Column(name="NOMBRE_TIPO_GESTION",length=70)
    public String getNombreTipoGestion(){
        return this.nombreTipoGestion;
    }

    public void setNombreTipoGestion(String nombreTipoGestion){
        this.nombreTipoGestion=nombreTipoGestion;
    }

    @Column(name="ESTADO",length=1)
    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

    @Column(name="CODIGO_CANAL")
    public Short getCodigoCanal(){
        return this.codigoCanal;
    }

    public void setCodigoCanal(Short codigoCanal){
        this.codigoCanal=codigoCanal;
    }

}