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
 * ReporteDocumento entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="REPORTE_DOCUMENTO"
    ,schema="FELECV3"
)

public class ReporteDocumento   extends EntidadPaginacion implements java.io.Serializable {


    // Fields    

     /**
     * 
     */
    private static final long serialVersionUID=-6893578675882236873L;
    private ReporteDocumentoId id;
     private TipoDocumentoFe tipoDocumentoFe;
     private String identificacionAdquiriente;
     private String reporte;
     private Timestamp fechaReporteIni;
     private Timestamp fechaReporteFin;
     private String email;


    // Constructors

    /** default constructor */
    public ReporteDocumento() {
    }

	/** minimal constructor */
    public ReporteDocumento(ReporteDocumentoId id, TipoDocumentoFe tipoDocumentoFe, String identificacionAdquiriente) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
    
    /** full constructor */
    public ReporteDocumento(ReporteDocumentoId id, TipoDocumentoFe tipoDocumentoFe, String identificacionAdquiriente, String reporte, Timestamp fechaReporteIni, Timestamp fechaReporteFin, String email) {
        this.id = id;
        this.tipoDocumentoFe = tipoDocumentoFe;
        this.identificacionAdquiriente = identificacionAdquiriente;
        this.reporte = reporte;
        this.fechaReporteIni = fechaReporteIni;
        this.fechaReporteFin = fechaReporteFin;
        this.email = email;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="noDocumento", column=@Column(name="NO_DOCUMENTO", nullable=false, length=30) ), 
        @AttributeOverride(name="identificacionObligado", column=@Column(name="IDENTIFICACION_OBLIGADO", nullable=false) ), 
        @AttributeOverride(name="idTipoDocFe", column=@Column(name="ID_TIPO_DOC_FE", nullable=false) ) } )

    public ReporteDocumentoId getId() {
        return this.id;
    }
    
    public void setId(ReporteDocumentoId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ID_TIPO_DOC_FE", nullable=false, insertable=false, updatable=false)

    public TipoDocumentoFe getTipoDocumentoFe() {
        return this.tipoDocumentoFe;
    }
    
    public void setTipoDocumentoFe(TipoDocumentoFe tipoDocumentoFe) {
        this.tipoDocumentoFe = tipoDocumentoFe;
    }
    
    @Column(name="IDENTIFICACION_ADQUIRIENTE", nullable=false, length=30)

    public String getIdentificacionAdquiriente() {
        return this.identificacionAdquiriente;
    }
    
    public void setIdentificacionAdquiriente(String identificacionAdquiriente) {
        this.identificacionAdquiriente = identificacionAdquiriente;
    }
    
    @Column(name="REPORTE", length=200)

    public String getReporte() {
        return this.reporte;
    }
    
    public void setReporte(String reporte) {
        this.reporte = reporte;
    }
    
    @Column(name="FECHA_REPORTE_INI", length=26)

    public Timestamp getFechaReporteIni() {
        return this.fechaReporteIni;
    }
    
    public void setFechaReporteIni(Timestamp fechaReporteIni) {
        this.fechaReporteIni = fechaReporteIni;
    }
    
    @Column(name="FECHA_REPORTE_FIN", length=26)

    public Timestamp getFechaReporteFin() {
        return this.fechaReporteFin;
    }
    
    public void setFechaReporteFin(Timestamp fechaReporteFin) {
        this.fechaReporteFin = fechaReporteFin;
    }
    
    @Column(name="EMAIL", length=60)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
   








}
