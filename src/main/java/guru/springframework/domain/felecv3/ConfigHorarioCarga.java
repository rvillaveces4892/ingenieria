//marcado
package guru.springframework.domain.felecv3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.experian.computec.referencia.model.EntidadPaginacion;


/**
 * ConfigHorarioCarga entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CONFIG_HORARIO_CARGA"
    ,schema="FELECV3"
)

public class ConfigHorarioCarga   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-5762740389157292996L;
    private Long identificacionObligado;
     private ObligadoFe obligadoFe;
     private Short diaDesde;
     private Short diaHasta;
     private Short horaDesde;
     private Short horaHasta;
     private Short minutoDesde;
     private Short minutoHasta;


    // Constructors

    /** default constructor */
    public ConfigHorarioCarga() {
    }

	/** minimal constructor */
    public ConfigHorarioCarga(Long identificacionObligado, ObligadoFe obligadoFe) {
        this.identificacionObligado = identificacionObligado;
        this.obligadoFe = obligadoFe;
    }
    
    /** full constructor */
    public ConfigHorarioCarga(Long identificacionObligado, ObligadoFe obligadoFe, Short diaDesde, Short diaHasta, Short horaDesde, Short horaHasta, Short minutoDesde, Short minutoHasta) {
        this.identificacionObligado = identificacionObligado;
        this.obligadoFe = obligadoFe;
        this.diaDesde = diaDesde;
        this.diaHasta = diaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.minutoDesde = minutoDesde;
        this.minutoHasta = minutoHasta;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="IDENTIFICACION_OBLIGADO", unique=true, nullable=false)

    public Long getIdentificacionObligado() {
        return this.identificacionObligado;
    }
    
    public void setIdentificacionObligado(Long identificacionObligado) {
        this.identificacionObligado = identificacionObligado;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="IDENTIFICACION_OBLIGADO", unique=true, nullable=false, insertable=false, updatable=false)

    public ObligadoFe getObligadoFe() {
        return this.obligadoFe;
    }
    
    public void setObligadoFe(ObligadoFe obligadoFe) {
        this.obligadoFe = obligadoFe;
    }
    
    @Column(name="DIA_DESDE")

    public Short getDiaDesde() {
        return this.diaDesde;
    }
    
    public void setDiaDesde(Short diaDesde) {
        this.diaDesde = diaDesde;
    }
    
    @Column(name="DIA_HASTA")

    public Short getDiaHasta() {
        return this.diaHasta;
    }
    
    public void setDiaHasta(Short diaHasta) {
        this.diaHasta = diaHasta;
    }
    
    @Column(name="HORA_DESDE")

    public Short getHoraDesde() {
        return this.horaDesde;
    }
    
    public void setHoraDesde(Short horaDesde) {
        this.horaDesde = horaDesde;
    }
    
    @Column(name="HORA_HASTA")

    public Short getHoraHasta() {
        return this.horaHasta;
    }
    
    public void setHoraHasta(Short horaHasta) {
        this.horaHasta = horaHasta;
    }
    
    @Column(name="MINUTO_DESDE")

    public Short getMinutoDesde() {
        return this.minutoDesde;
    }
    
    public void setMinutoDesde(Short minutoDesde) {
        this.minutoDesde = minutoDesde;
    }
    
    @Column(name="MINUTO_HASTA")

    public Short getMinutoHasta() {
        return this.minutoHasta;
    }
    
    public void setMinutoHasta(Short minutoHasta) {
        this.minutoHasta = minutoHasta;
    }
   








}
