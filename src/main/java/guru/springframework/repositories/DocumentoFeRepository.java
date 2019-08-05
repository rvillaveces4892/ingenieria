package guru.springframework.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.ConfEnvioObligado;
import guru.springframework.domain.ConfEnvioObligadoId;
import guru.springframework.domain.felecv3.DocumentoFe;
import guru.springframework.domain.felecv3.DocumentoFeId;

public interface DocumentoFeRepository extends JpaRepository<DocumentoFe, DocumentoFeId>{
    
//    List<ConfEnvioObligado> findByLongitudAndEstado(String d, String e);
    
//    @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
//    User findByLastnameOrFirstname(@Param("lastname") String lastname,
//                                   @Param("firstname") String firstname);
    
//   @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
//    User findByEmailAddress(String emailAddress);
    
//  @Procedure("plus1inout")
//  Integer explicitlyNamedPlus1inout(Integer arg);

}