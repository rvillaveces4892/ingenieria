package guru.springframework.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DetalleLecturaEnvio entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DETALLE_LECTURA_ENVIO",schema="ENVIO_SELECT")
public class DetalleLecturaEnvio implements java.io.Serializable{

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID=7844050753961805857L;
    private Long idDetalleLecturaEnvio;
    private RegistroEnvio registroEnvio;
    private Timestamp fechaLectura;
    private String dispositivo;
    private String so;
    private String ip;

    // Constructors

    /** default constructor */
    public DetalleLecturaEnvio(){
    }

    /** minimal constructor */
    public DetalleLecturaEnvio(Long idDetalleLecturaEnvio,RegistroEnvio registroEnvio,Timestamp fechaLectura){
        this.idDetalleLecturaEnvio=idDetalleLecturaEnvio;
        this.registroEnvio=registroEnvio;
        this.fechaLectura=fechaLectura;
    }

    /** full constructor */
    public DetalleLecturaEnvio(Long idDetalleLecturaEnvio,RegistroEnvio registroEnvio,Timestamp fechaLectura,String dispositivo,String so,String ip){
        this.idDetalleLecturaEnvio=idDetalleLecturaEnvio;
        this.registroEnvio=registroEnvio;
        this.fechaLectura=fechaLectura;
        this.dispositivo=dispositivo;
        this.so=so;
        this.ip=ip;
    }

    // Property accessors
    @Id
    @Column(name="ID_DETALLE_LECTURA_ENVIO",unique=true,nullable=false)
    public Long getIdDetalleLecturaEnvio(){
        return this.idDetalleLecturaEnvio;
    }

    public void setIdDetalleLecturaEnvio(Long idDetalleLecturaEnvio){
        this.idDetalleLecturaEnvio=idDetalleLecturaEnvio;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ENVIO",nullable=false)
    public RegistroEnvio getRegistroEnvio(){
        return this.registroEnvio;
    }

    public void setRegistroEnvio(RegistroEnvio registroEnvio){
        this.registroEnvio=registroEnvio;
    }

    @Column(name="FECHA_LECTURA",nullable=false,length=26)
    public Timestamp getFechaLectura(){
        return this.fechaLectura;
    }

    public void setFechaLectura(Timestamp fechaLectura){
        this.fechaLectura=fechaLectura;
    }

    @Column(name="DISPOSITIVO",length=50)
    public String getDispositivo(){
        return this.dispositivo;
    }

    public void setDispositivo(String dispositivo){
        this.dispositivo=dispositivo;
    }

    @Column(name="SO",length=200)
    public String getSo(){
        return this.so;
    }

    public void setSo(String so){
        this.so=so;
    }

    @Column(name="IP",length=200)
    public String getIp(){
        return this.ip;
    }

    public void setIp(String ip){
        this.ip=ip;
    }

}