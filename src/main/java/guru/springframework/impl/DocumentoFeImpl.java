package guru.springframework.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import guru.springframework.domain.felecv3.DocumentoFe;
import guru.springframework.domain.felecv3.DocumentoFeId;
import guru.springframework.repositories.DocumentoFeRepository;
import guru.springframework.services.DocumentoFeServices;

@Component("documentoFeService")
@Transactional
public class DocumentoFeImpl implements DocumentoFeServices{

    @Autowired
    private EntityManager em;

    @Autowired
    private DocumentoFeRepository documentoFeRepository;

    @Override
    public DocumentoFe findById(DocumentoFeId id){
        return documentoFeRepository.findOne(id);
    }
    
    public String fechaFactura(Long identificacionObligado, String noDocumento,Long numResoluDian,Short idTipoDocFe) {
        Query query = em.createNativeQuery("SELECT FECHA_FACTURA FROM FELECV3.DOCUMENTO_FE WHERE NO_DOCUMENTO=:NODOC AND NUM_RESOLU_DIAN = :NUMRESOLU AND IDENTIFICACION_OBLIGADO = :IDOBLI AND ID_TIPO_DOC_FE = :IDTIPO")
                .setParameter("NODOC",identificacionObligado)
                .setParameter("NUMRESOLU",noDocumento)
                .setParameter("IDOBLI",numResoluDian)
                .setParameter("IDTIPO",idTipoDocFe);
      Object fecha = query.getSingleResult();
      return (String)fecha;
    }

    @Override
    public List<DocumentoFe> getDocumentoFe(){
        return documentoFeRepository.findAll();
    }

    @Override
    public DocumentoFe create(DocumentoFe c){
        return documentoFeRepository.save(c);
    }

    @Override
    public void delete(DocumentoFeId id){
        documentoFeRepository.delete(id);
    }
    
//    @SuppressWarnings("unchecked")
//    public List<DtoAdquirienteInfoEnvio> consultarAdqSinEnvio(){
//        String consultBasica=MessageReader.getString("consultasFelec","consultarAdqSinEnvioCorreoV5",Thread.currentThread().getContextClassLoader());
//        SQLQuery query=em.createSQLQuery(consultBasica);
//        query.addScalar("canalEnvio");
//        query.addScalar("identificacionObligado",Hibernate.LONG);
//        query.addScalar("numeroDocumento");
//        query.addScalar("nombreXmlDoc");
//        query.addScalar("idTipoDoc");
//        query.addScalar("numResoluDian",Hibernate.LONG);
//        query.addScalar("valorPrefijo");
//        query.addScalar("identificacionAdquiriente");
//        query.addScalar("razonSocial");
//        query.addScalar("direccion");
//        query.addScalar("ciudad");
//        query.addScalar("departamento");
//        query.addScalar("email");
//        query.addScalar("nombrePn");
//        query.addScalar("nombre2Pn");
//        query.addScalar("apellidoPn");
//        query.addScalar("noReferencia");
//        query.addScalar("fechaFactura",Hibernate.DATE);
//        query.addScalar("valorDocumento");
//        query.addScalar("totalNeto");
//        query.addScalar("baseExclIva");
//        query.addScalar("valorNetoDocumento");
//        query.addScalar("cufe");
//        query.addScalar("fechaTrm",Hibernate.DATE);
//        query.addScalar("trm");
//        query.addScalar("valorNetoDocMonedaExt");
//        query.addScalar("descripcion");
//        query.addScalar("baseGravableIva");
//        query.addScalar("numeroCuenta");
//        query.addScalar("numeroPedido");
//        query.addScalar("canalVenta");
//        query.addScalar("refePago");
//        query.addScalar("fechaSuspension",Hibernate.DATE);
//        query.addScalar("fechaVencimiento",Hibernate.DATE);
//        query.addScalar("periodoFacturacion");
//        query.addScalar("observaciones");
//        query.addScalar("totalIva");
//        query.addScalar("totalDescuento");
//        query.addScalar("codBarras");
//        query.addScalar("totalIca");
//        query.addScalar("totalImpConsumo");
//        query.addScalar("totalContribuciones");
//        query.addScalar("totalRteRenta");
//        query.addScalar("totalRteIva");
//        query.addScalar("totalRteIca");
//        query.addScalar("envejecimientoMail");
//        query.addScalar("clave");
//        query.addScalar("asuntoEnvio");
//        
//
//        return (List<DtoAdquirienteInfoEnvio>)query.setResultTransformer(Transformers.aliasToBean(DtoAdquirienteInfoEnvio.class)).list();
//
//    }

//    @Override
//    public String getRazonSocial(Long idObli){
//        Query query = em.createNativeQuery("SELECT RAZON_SOCIAL FROM FELECV3.OBLIGADO_FE WHERE IDENTIFICACION_OBLIGADO = :id").setParameter("id",idObli);
//        Object nombre = query.getSingleResult();
//        return (String)nombre;
//    }

//    @Override
//    public List<ConfEnvioObligado> findByChriterias(String l,String e){
//        return confEnvioObligadoRepository.findByLongitudAndEstado(l,e);
//    }

}
