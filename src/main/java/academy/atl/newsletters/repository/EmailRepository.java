package academy.atl.newsletters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepositoty {

    @PersistenceContext
    EntityManager baseDeDatos;

    @Transactional
    public void guardarEmail(String email){
        String consultaSql = "INSERT INTO `lead` (`email`)" +
                "VALUES ('"+ email +"')";
        baseDeDatos.createNativeQuery(consultaSql);
    }


}
