package guru.springframework.services;

import java.util.List;

import guru.springframework.domain.ConfEnvioObligado;
import guru.springframework.domain.ConfEnvioObligadoId;
import guru.springframework.domain.ConfNotificacionObligado;
import guru.springframework.domain.ConfNotificacionObligadoId;

public interface ConfNotificacionObligadoServices{
    
	public ConfNotificacionObligado findById(ConfNotificacionObligadoId id);
    
    public List<ConfNotificacionObligado> getConfNotificacionObligado();
    
    public ConfNotificacionObligado create(ConfNotificacionObligado c);
    
    public void delete(ConfNotificacionObligadoId id);
    
}
