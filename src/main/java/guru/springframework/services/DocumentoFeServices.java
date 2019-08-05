package guru.springframework.services;

import java.util.Date;
import java.util.List;

import guru.springframework.domain.felecv3.DocumentoFe;
import guru.springframework.domain.felecv3.DocumentoFeId;

public interface DocumentoFeServices{
    
    public DocumentoFe findById(DocumentoFeId id);
    
    public List<DocumentoFe> getDocumentoFe();
    
    public DocumentoFe create(DocumentoFe c);
    
    public void delete(DocumentoFeId id);
    
    public String fechaFactura(Long identificacionObligado, String noDocumento,Long numResoluDian,Short idTipoDocFe); 
    
//    public String getRazonSocial(Long idObli);
    
//    public List<ConfEnvioObligado> findByChriterias(String l,String e);

}
