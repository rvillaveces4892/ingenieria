package guru.springframework.domain.manual;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ConsecutivoFacturaManual entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONSECUTIVO_FACTURA_MANUAL",schema="FELECV3")
public class ConsecutivoFacturaManual implements java.io.Serializable{   
    
    /**
     * 
     */
    private static final long serialVersionUID=-7288627512752767713L;
    
    // Fields

    private ConsecutivoFacturaManualId id;
    private Long rangoFinNumDian;
    private Long rangoIniNumDian;
    private Integer conseActualFactManual;
    private Integer numIniNcManual;
    private Integer numFinNcManual;
    private Integer numIniNdManual;
    private Integer numFinNdManual;
    private Integer conseActNdManual;
    private Integer conseActNcManual;
    private String prefijoNcManual;
    private String prefijoNdManual;

    // Constructors

    /** default constructor */
    public ConsecutivoFacturaManual(){
    }

    /** minimal constructor */
    public ConsecutivoFacturaManual(ConsecutivoFacturaManualId id){
        this.id=id;
    }

    /** full constructor */
    public ConsecutivoFacturaManual(ConsecutivoFacturaManualId id,Long rangoFinNumDian,Long rangoIniNumDian,Integer conseActualFactManual,Integer numIniNcManual,Integer numFinNcManual,Integer numIniNdManual,Integer numFinNdManual,
            Integer conseActNdManual,Integer conseActNcManual,String prefijoNcManual,String prefijoNdManual){
        this.id=id;
        this.rangoFinNumDian=rangoFinNumDian;
        this.rangoIniNumDian=rangoIniNumDian;
        this.conseActualFactManual=conseActualFactManual;
        this.numIniNcManual=numIniNcManual;
        this.numFinNcManual=numFinNcManual;
        this.numIniNdManual=numIniNdManual;
        this.numFinNdManual=numFinNdManual;
        this.conseActNdManual=conseActNdManual;
        this.conseActNcManual=conseActNcManual;
        this.prefijoNcManual=prefijoNcManual;
        this.prefijoNdManual=prefijoNdManual;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name="numResoluDian",column=@Column(name="NUM_RESOLU_DIAN",nullable=false)),@AttributeOverride(name="identificacionObligado",column=@Column(name="IDENTIFICACION_OBLIGADO",nullable=false)),
            @AttributeOverride(name="idPrefijo",column=@Column(name="ID_PREFIJO",nullable=false))})
    public ConsecutivoFacturaManualId getId(){
        return this.id;
    }

    public void setId(ConsecutivoFacturaManualId id){
        this.id=id;
    }

    @Column(name="RANGO_FIN_NUM_DIAN")
    public Long getRangoFinNumDian(){
        return this.rangoFinNumDian;
    }

    public void setRangoFinNumDian(Long rangoFinNumDian){
        this.rangoFinNumDian=rangoFinNumDian;
    }

    @Column(name="RANGO_INI_NUM_DIAN")
    public Long getRangoIniNumDian(){
        return this.rangoIniNumDian;
    }

    public void setRangoIniNumDian(Long rangoIniNumDian){
        this.rangoIniNumDian=rangoIniNumDian;
    }

    @Column(name="CONSE_ACTUAL_FACT_MANUAL")
    public Integer getConseActualFactManual(){
        return this.conseActualFactManual;
    }

    public void setConseActualFactManual(Integer conseActualFactManual){
        this.conseActualFactManual=conseActualFactManual;
    }

    @Column(name="NUM_INI_NC_MANUAL")
    public Integer getNumIniNcManual(){
        return this.numIniNcManual;
    }

    public void setNumIniNcManual(Integer numIniNcManual){
        this.numIniNcManual=numIniNcManual;
    }

    @Column(name="NUM_FIN_NC_MANUAL")
    public Integer getNumFinNcManual(){
        return this.numFinNcManual;
    }

    public void setNumFinNcManual(Integer numFinNcManual){
        this.numFinNcManual=numFinNcManual;
    }

    @Column(name="NUM_INI_ND_MANUAL")
    public Integer getNumIniNdManual(){
        return this.numIniNdManual;
    }

    public void setNumIniNdManual(Integer numIniNdManual){
        this.numIniNdManual=numIniNdManual;
    }

    @Column(name="NUM_FIN_ND_MANUAL")
    public Integer getNumFinNdManual(){
        return this.numFinNdManual;
    }

    public void setNumFinNdManual(Integer numFinNdManual){
        this.numFinNdManual=numFinNdManual;
    }

    @Column(name="CONSE_ACT_ND_MANUAL")
    public Integer getConseActNdManual(){
        return this.conseActNdManual;
    }

    public void setConseActNdManual(Integer conseActNdManual){
        this.conseActNdManual=conseActNdManual;
    }

    @Column(name="CONSE_ACT_NC_MANUAL")
    public Integer getConseActNcManual(){
        return this.conseActNcManual;
    }

    public void setConseActNcManual(Integer conseActNcManual){
        this.conseActNcManual=conseActNcManual;
    }

    @Column(name="PREFIJO_NC_MANUAL",length=5)
    public String getPrefijoNcManual(){
        return this.prefijoNcManual;
    }

    public void setPrefijoNcManual(String prefijoNcManual){
        this.prefijoNcManual=prefijoNcManual;
    }

    @Column(name="PREFIJO_ND_MANUAL",length=5)
    public String getPrefijoNdManual(){
        return this.prefijoNdManual;
    }

    public void setPrefijoNdManual(String prefijoNdManual){
        this.prefijoNdManual=prefijoNdManual;
    }

}