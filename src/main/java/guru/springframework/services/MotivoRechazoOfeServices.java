package guru.springframework.services;

import java.util.List;

import guru.springframework.domain.felecv3.MotivoRechazoOfe;
import guru.springframework.domain.felecv3.MotivoRechazoOfeId;

public interface MotivoRechazoOfeServices{
    
    public MotivoRechazoOfe findById(MotivoRechazoOfeId id);
    
    public List<MotivoRechazoOfe> getMotivoRechazoOfe();
    
    public MotivoRechazoOfe create(MotivoRechazoOfe c);
    
    public void delete(MotivoRechazoOfeId id);
    
//    public String fechaFactura(Long identificacionObligado, String noDocumento,Long numResoluDian,Short idTipoDocFe); 
    
//    public String getRazonSocial(Long idObli);
    
//    public List<ConfEnvioObligado> findByChriterias(String l,String e);

}
