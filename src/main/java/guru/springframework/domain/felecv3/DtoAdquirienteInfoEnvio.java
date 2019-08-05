package guru.springframework.domain.felecv3;

import java.io.Serializable;
import java.util.Date;

/**
 * Dto encargargado para la transaccion de envio de informacion pertinente al adquiriente para el envio de correo
 * 
 * @author rvillaveces
 * @creationDate 31/05/2018
 *
 */
public class DtoAdquirienteInfoEnvio implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=-1354849309123573528L;

    private String canalEnvio;
    /**
     * columnas de la tabla AUDITORIA_DATA_DOC
     */
    private Long identificacionObligado;
    private String numeroDocumento;
    private String nombreXmlDoc;
    private Short idTipoDoc;
    private Long numResoluDian;
    private String valorPrefijo;

    /**
     * columnas de la tabla DATO_DOCUMENTO_ADQUIRIENTE
     */
    private String identificacionAdquiriente;
    private String razonSocial;
    private String direccion;
    private String ciudad;
    private String departamento;
    private String email;
    private String nombrePn;
    private String nombre2Pn;
    private String apellidoPn;

    /**
     * columnas de la tabla DOCUMENTO_FE
     */
    private String noReferencia;
    private Date fechaFactura;
    private Double valorDocumento;
    private Double totalNeto;
    private Double baseExclIva;
    private Double valorNetoDocumento;
    private String cufe;
    private Date fechaTrm;
    private Double trm;
    private Double valorNetoDocMonedaExt;
    private String descripcion;
    private Double baseGravableIva;
    private String numeroCuenta;
    private String numeroPedido;
    private String canalVenta;
    private String refePago;
    private Date fechaSuspension;
    private Date fechaVencimiento;
    private String periodoFacturacion;
    private String observaciones;
    private Double totalIva;
    private Double totalDescuento;
    private String codBarras;
    private Double totalIca;
    private Double totalImpConsumo;
    private Double totalContribuciones;
    private Double totalRteRenta;
    private Double totalRteIva;
    private Double totalRteIca;
    private Short envejecimientoMail;
    private String clave;
    private String asuntoEnvio;

    public DtoAdquirienteInfoEnvio(){
        super();
    }

    public String getCanalEnvio(){
        return canalEnvio;
    }

    public void setCanalEnvio(String canalEnvio){
        this.canalEnvio=canalEnvio;
    }

    public Long getIdentificacionObligado(){
        return identificacionObligado;
    }

    public void setIdentificacionObligado(Long identificacionObligado){
        this.identificacionObligado=identificacionObligado;
    }

    public String getNumeroDocumento(){
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento){
        this.numeroDocumento=numeroDocumento;
    }

    public String getNombreXmlDoc(){
        return nombreXmlDoc;
    }

    public void setNombreXmlDoc(String nombreXmlDoc){
        this.nombreXmlDoc=nombreXmlDoc;
    }

    public Short getIdTipoDoc(){
        return idTipoDoc;
    }

    public void setIdTipoDoc(Short idTipoDoc){
        this.idTipoDoc=idTipoDoc;
    }

    public Long getNumResoluDian(){
        return numResoluDian;
    }

    public void setNumResoluDian(Long numResoluDian){
        this.numResoluDian=numResoluDian;
    }

    public String getValorPrefijo(){
        return valorPrefijo;
    }

    public void setValorPrefijo(String valorPrefijo){
        this.valorPrefijo=valorPrefijo;
    }

    public String getIdentificacionAdquiriente(){
        return identificacionAdquiriente;
    }

    public void setIdentificacionAdquiriente(String identificacionAdquiriente){
        this.identificacionAdquiriente=identificacionAdquiriente;
    }

    public String getRazonSocial(){
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial){
        this.razonSocial=razonSocial;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public String getCiudad(){
        return ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getNombrePn(){
        return nombrePn;
    }

    public void setNombrePn(String nombrePn){
        this.nombrePn=nombrePn;
    }

    public String getNombre2Pn(){
        return nombre2Pn;
    }

    public void setNombre2Pn(String nombre2Pn){
        this.nombre2Pn=nombre2Pn;
    }

    public String getApellidoPn(){
        return apellidoPn;
    }

    public void setApellidoPn(String apellidoPn){
        this.apellidoPn=apellidoPn;
    }

    public String getNoReferencia(){
        return noReferencia;
    }

    public void setNoReferencia(String noReferencia){
        this.noReferencia=noReferencia;
    }

    public Date getFechaFactura(){
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura){
        this.fechaFactura=fechaFactura;
    }

    public Double getValorDocumento(){
        return valorDocumento;
    }

    public void setValorDocumento(Double valorDocumento){
        this.valorDocumento=valorDocumento;
    }

    public Double getTotalNeto(){
        return totalNeto;
    }

    public void setTotalNeto(Double totalNeto){
        this.totalNeto=totalNeto;
    }

    public Double getBaseExclIva(){
        return baseExclIva;
    }

    public void setBaseExclIva(Double baseExclIva){
        this.baseExclIva=baseExclIva;
    }

    public Double getValorNetoDocumento(){
        return valorNetoDocumento;
    }

    public void setValorNetoDocumento(Double valorNetoDocumento){
        this.valorNetoDocumento=valorNetoDocumento;
    }

    public String getCufe(){
        return cufe;
    }

    public void setCufe(String cufe){
        this.cufe=cufe;
    }

    public Date getFechaTrm(){
        return fechaTrm;
    }

    public void setFechaTrm(Date fechaTrm){
        this.fechaTrm=fechaTrm;
    }

    public Double getTrm(){
        return trm;
    }

    public void setTrm(Double trm){
        this.trm=trm;
    }

    public Double getValorNetoDocMonedaExt(){
        return valorNetoDocMonedaExt;
    }

    public void setValorNetoDocMonedaExt(Double valorNetoDocMonedaExt){
        this.valorNetoDocMonedaExt=valorNetoDocMonedaExt;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    public Double getBaseGravableIva(){
        return baseGravableIva;
    }

    public void setBaseGravableIva(Double baseGravableIva){
        this.baseGravableIva=baseGravableIva;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }

    public String getNumeroPedido(){
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido){
        this.numeroPedido=numeroPedido;
    }

    public String getCanalVenta(){
        return canalVenta;
    }

    public void setCanalVenta(String canalVenta){
        this.canalVenta=canalVenta;
    }

    public String getRefePago(){
        return refePago;
    }

    public void setRefePago(String refePago){
        this.refePago=refePago;
    }

    public Date getFechaSuspension(){
        return fechaSuspension;
    }

    public void setFechaSuspension(Date fechaSuspension){
        this.fechaSuspension=fechaSuspension;
    }

    public Date getFechaVencimiento(){
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento){
        this.fechaVencimiento=fechaVencimiento;
    }

    public String getPeriodoFacturacion(){
        return periodoFacturacion;
    }

    public void setPeriodoFacturacion(String periodoFacturacion){
        this.periodoFacturacion=periodoFacturacion;
    }

    public String getObservaciones(){
        return observaciones;
    }

    public void setObservaciones(String observaciones){
        this.observaciones=observaciones;
    }

    public Double getTotalIva(){
        return totalIva;
    }

    public void setTotalIva(Double totalIva){
        this.totalIva=totalIva;
    }

    public Double getTotalDescuento(){
        return totalDescuento;
    }

    public void setTotalDescuento(Double totalDescuento){
        this.totalDescuento=totalDescuento;
    }

    public String getCodBarras(){
        return codBarras;
    }

    public void setCodBarras(String codBarras){
        this.codBarras=codBarras;
    }

    public Double getTotalIca(){
        return totalIca;
    }

    public void setTotalIca(Double totalIca){
        this.totalIca=totalIca;
    }

    public Double getTotalImpConsumo(){
        return totalImpConsumo;
    }

    public void setTotalImpConsumo(Double totalImpConsumo){
        this.totalImpConsumo=totalImpConsumo;
    }

    public Double getTotalContribuciones(){
        return totalContribuciones;
    }

    public void setTotalContribuciones(Double totalContribuciones){
        this.totalContribuciones=totalContribuciones;
    }

    public Double getTotalRteRenta(){
        return totalRteRenta;
    }

    public void setTotalRteRenta(Double totalRteRenta){
        this.totalRteRenta=totalRteRenta;
    }

    public Double getTotalRteIva(){
        return totalRteIva;
    }

    public void setTotalRteIva(Double totalRteIva){
        this.totalRteIva=totalRteIva;
    }

    public Double getTotalRteIca(){
        return totalRteIca;
    }

    public void setTotalRteIca(Double totalRteIca){
        this.totalRteIca=totalRteIca;
    }

    /**
     * @return the envejecimientoMail
     */
    public Short getEnvejecimientoMail(){
        return envejecimientoMail;
    }

    /**
     * @param envejecimientoMail the envejecimientoMail to set
     */
    public void setEnvejecimientoMail(Short envejecimientoMail){
        this.envejecimientoMail=envejecimientoMail;
    }

    public String getClave(){
        return clave;
    }

    public void setClave(String clave){
        this.clave=clave;
    }

    public String getAsuntoEnvio(){
        return asuntoEnvio;
    }

    public void setAsuntoEnvio(String asuntoEnvio){
        this.asuntoEnvio=asuntoEnvio;
    }
    
    

}
