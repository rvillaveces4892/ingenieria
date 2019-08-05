package guru.springframework.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import guru.springframework.domain.felecv3.MotivoRechazoOfe;
import guru.springframework.domain.felecv3.MotivoRechazoOfeId;
import guru.springframework.repositories.MotivoRechazoOfeRepository;
import guru.springframework.services.MotivoRechazoOfeServices;

@Component("motivoRechazoOfeService")
@Transactional
public class MotivoRechazoOfeImpl implements MotivoRechazoOfeServices{

    @Autowired
    private EntityManager em;

    @Autowired
    private MotivoRechazoOfeRepository motivoRechazoOfeRepository;

    @Override
    public MotivoRechazoOfe findById(MotivoRechazoOfeId id){
        return motivoRechazoOfeRepository.findOne(id);
    }
    
//    public String fechaFactura(Long identificacionObligado, String noDocumento,Long numResoluDian,Short idTipoDocFe) {
//        Query query = em.createNativeQuery("SELECT FECHA_FACTURA FROM FELECV3.DOCUMENTO_FE WHERE NO_DOCUMENTO=:NODOC AND NUM_RESOLU_DIAN = :NUMRESOLU AND IDENTIFICACION_OBLIGADO = :IDOBLI AND ID_TIPO_DOC_FE = :IDTIPO")
//                .setParameter("NODOC",identificacionObligado)
//                .setParameter("NUMRESOLU",noDocumento)
//                .setParameter("IDOBLI",numResoluDian)
//                .setParameter("IDTIPO",idTipoDocFe);
//      Object fecha = query.getSingleResult();
//      return (String)fecha;
//    }

    @Override
    public List<MotivoRechazoOfe> getMotivoRechazoOfe(){
        return motivoRechazoOfeRepository.findAll();
    }

    @Override
    public MotivoRechazoOfe create(MotivoRechazoOfe c){
        return motivoRechazoOfeRepository.save(c);
    }

    @Override
    public void delete(MotivoRechazoOfeId id){
        motivoRechazoOfeRepository.delete(id);
    }
    

}
