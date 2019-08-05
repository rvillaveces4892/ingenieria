package guru.springframework.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import guru.springframework.domain.ConfEnvioObligado;
import guru.springframework.domain.ConfEnvioObligadoId;
import guru.springframework.repositories.ConfEnvioObligadoRepository;
import guru.springframework.services.ConfEnvioObligadoServices;

@Component("confEnvioObligadoService")
@Transactional
public class ConfEnvioObligadoImpl implements ConfEnvioObligadoServices{

    @Autowired
    private EntityManager em;

    @Autowired
    private ConfEnvioObligadoRepository confEnvioObligadoRepository;

    @Override
    public ConfEnvioObligado findById(ConfEnvioObligadoId id){
        return confEnvioObligadoRepository.findOne(id);
    }

    @Override
    public List<ConfEnvioObligado> getConfEnvioObligado(){
        return confEnvioObligadoRepository.findAll();
    }

    @Override
    public ConfEnvioObligado create(ConfEnvioObligado c){
        return confEnvioObligadoRepository.save(c);
    }

    @Override
    public void delete(ConfEnvioObligadoId id){
        confEnvioObligadoRepository.delete(id);
    }

    @Override
    public String getRazonSocial(Long idObli){
        Query query = em.createNativeQuery("SELECT RAZON_SOCIAL FROM FELECV3.OBLIGADO_FE WHERE IDENTIFICACION_OBLIGADO = :id").setParameter("id",idObli);
        Object nombre = query.getSingleResult();
        return (String)nombre;
    }

//    @Override
//    public List<ConfEnvioObligado> findByChriterias(String l,String e){
//        return confEnvioObligadoRepository.findByLongitudAndEstado(l,e);
//    }

}
