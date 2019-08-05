package guru.springframework.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import guru.springframework.domain.ConfNotificacionObligado;
import guru.springframework.domain.ConfNotificacionObligadoId;
import guru.springframework.repositories.ConfNotificacionObligadoRepository;
import guru.springframework.services.ConfNotificacionObligadoServices;

@Component("confNotificacionObligadoService")
@Transactional
public class ConfNotificacionObligadoImpl implements ConfNotificacionObligadoServices{

    @Autowired
    private EntityManager em;

    @Autowired
    private ConfNotificacionObligadoRepository ConfNotificacionObligadoRepository;

    @Override
    public ConfNotificacionObligado findById(ConfNotificacionObligadoId id){
        return ConfNotificacionObligadoRepository.findOne(id);
    }

    @Override
    public List<ConfNotificacionObligado> getConfNotificacionObligado(){
        return ConfNotificacionObligadoRepository.findAll();
    }

    @Override
    public ConfNotificacionObligado create(ConfNotificacionObligado c){
        return ConfNotificacionObligadoRepository.save(c);
    }

    @Override
    public void delete(ConfNotificacionObligadoId id){
        ConfNotificacionObligadoRepository.delete(id);
    }


//    @Override
//    public List<ConfNotificacionObligado> findByChriterias(String l,String e){
//        return ConfNotificacionObligadoRepository.findByLongitudAndEstado(l,e);
//    }

}
