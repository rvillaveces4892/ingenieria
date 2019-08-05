package guru.springframework.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MovimientoGestionEnvio entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MOVIMIENTO_GESTION_ENVIO",schema="ENVIO_SELECT")
public class MovimientoGestionEnvio implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=-7572611210333743546L;
    private Long idMovimientoEnvio;
    private GestionEnvio gestionEnvio;
    private RegistroEnvio registroEnvio;
    private Timestamp fechaUltimaGestion;

    // Constructors

    /** default constructor */
    public MovimientoGestionEnvio(){
    }
    
    /** minimal constructor */
    public MovimientoGestionEnvio(GestionEnvio gestionEnvio,RegistroEnvio registroEnvio,Timestamp fechaUltimaGestion){
        this.gestionEnvio=gestionEnvio;
        this.registroEnvio=registroEnvio;
        this.fechaUltimaGestion=fechaUltimaGestion;
    }

    /** full constructor */
    public MovimientoGestionEnvio(Long idMovimientoEnvio,GestionEnvio gestionEnvio,RegistroEnvio registroEnvio,Timestamp fechaUltimaGestion){
        this.idMovimientoEnvio=idMovimientoEnvio;
        this.gestionEnvio=gestionEnvio;
        this.registroEnvio=registroEnvio;
        this.fechaUltimaGestion=fechaUltimaGestion;
    }

    // Property accessors
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_MOVIMIENTO_ENVIO",unique=true,nullable=false)
    public Long getIdMovimientoEnvio(){
        return this.idMovimientoEnvio;
    }
    
    public void setIdMovimientoEnvio(Long idMovimientoEnvio){
        this.idMovimientoEnvio=idMovimientoEnvio;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CODIGO_GESTION",nullable=false)
    public GestionEnvio getGestionEnvio(){
        return this.gestionEnvio;
    }

    public void setGestionEnvio(GestionEnvio gestionEnvio){
        this.gestionEnvio=gestionEnvio;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ENVIO",nullable=false)
    public RegistroEnvio getRegistroEnvio(){
        return this.registroEnvio;
    }

    public void setRegistroEnvio(RegistroEnvio registroEnvio){
        this.registroEnvio=registroEnvio;
    }

    @Column(name="FECHA_ULTIMA_GESTION",nullable=false,length=26)
    public Timestamp getFechaUltimaGestion(){
        return this.fechaUltimaGestion;
    }

    public void setFechaUltimaGestion(Timestamp fechaUltimaGestion){
        this.fechaUltimaGestion=fechaUltimaGestion;
    }

}