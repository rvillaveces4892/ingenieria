package guru.springframework.services;

import java.util.List;

import guru.springframework.domain.ConfEnvioObligado;
import guru.springframework.domain.ConfEnvioObligadoId;

public interface ConfEnvioObligadoServices{
    
    public ConfEnvioObligado findById(ConfEnvioObligadoId id);
    
    public List<ConfEnvioObligado> getConfEnvioObligado();
    
    public ConfEnvioObligado create(ConfEnvioObligado c);
    
    public void delete(ConfEnvioObligadoId id);
    
    public String getRazonSocial(Long idObli);
    
//    public List<ConfEnvioObligado> findByChriterias(String l,String e);

}
