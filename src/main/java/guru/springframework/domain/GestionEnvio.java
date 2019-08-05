package guru.springframework.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * GestionEnvio entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="GESTION_ENVIO",schema="ENVIO_SELECT")
public class GestionEnvio implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=1382000222483926195L;
    private Short codigoGestion;
    private String nombreGestion;
    private Short codigoTipoGestion;
    private String abreviatura;
    private Set<MovimientoGestionEnvio> movimientoGestionEnvios=new HashSet<MovimientoGestionEnvio>(0);
    private Set<RegistroEnvio> registroEnvios=new HashSet<RegistroEnvio>(0);

    // Constructors

    /** default constructor */
    public GestionEnvio(){
    }

    /** minimal constructor */
    public GestionEnvio(Short codigoGestion){
        this.codigoGestion=codigoGestion;
    }

    /** full constructor */
    public GestionEnvio(Short codigoGestion,String nombreGestion,Short codigoTipoGestion,String abreviatura,Set<MovimientoGestionEnvio> movimientoGestionEnvios,Set<RegistroEnvio> registroEnvios){
        this.codigoGestion=codigoGestion;
        this.nombreGestion=nombreGestion;
        this.codigoTipoGestion=codigoTipoGestion;
        this.abreviatura=abreviatura;
        this.movimientoGestionEnvios=movimientoGestionEnvios;
        this.registroEnvios=registroEnvios;
    }

    // Property accessors
    @Id
    @Column(name="CODIGO_GESTION",unique=true,nullable=false)
    public Short getCodigoGestion(){
        return this.codigoGestion;
    }

    public void setCodigoGestion(Short codigoGestion){
        this.codigoGestion=codigoGestion;
    }

    @Column(name="NOMBRE_GESTION",length=70)
    public String getNombreGestion(){
        return this.nombreGestion;
    }

    public void setNombreGestion(String nombreGestion){
        this.nombreGestion=nombreGestion;
    }

    @Column(name="CODIGO_TIPO_GESTION")
    public Short getCodigoTipoGestion(){
        return this.codigoTipoGestion;
    }

    public void setCodigoTipoGestion(Short codigoTipoGestion){
        this.codigoTipoGestion=codigoTipoGestion;
    }

    @Column(name="ABREVIATURA",length=1)
    public String getAbreviatura(){
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura){
        this.abreviatura=abreviatura;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="gestionEnvio")
    public Set<MovimientoGestionEnvio> getMovimientoGestionEnvios(){
        return this.movimientoGestionEnvios;
    }

    public void setMovimientoGestionEnvios(Set<MovimientoGestionEnvio> movimientoGestionEnvios){
        this.movimientoGestionEnvios=movimientoGestionEnvios;
    }
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="gestionEnvio")
    public Set<RegistroEnvio> getRegistroEnvios(){
        return this.registroEnvios;
    }

    public void setRegistroEnvios(Set<RegistroEnvio> registroEnvios){
        this.registroEnvios=registroEnvios;
    }

}