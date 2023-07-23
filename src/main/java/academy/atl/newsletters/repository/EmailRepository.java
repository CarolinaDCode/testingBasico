package academy.atl.newsletters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepository {

    @PersistenceContext
    private EntityManager baseDeDatos;

    @Transactional
    public void guardarEmail(String emailDelUsuario){
        /**
         * Consulta HQL: Hibernate ...
         * Evitando el Hacking de Inyección SQL
         */
        String consultaSql = "INSERT INTO lead (email) VALUES (:paramEmail)";
        baseDeDatos.createQuery(consultaSql)
                   .setParameter("paramEmail", emailDelUsuario)
                   .executeUpdate();

        /**
         * Consulta SQL
         */
        /**
        String consultaSql = "INSERT INTO `lead` (`email`)" +
                "VALUES ('"+ email +"')";
        baseDeDatos.createNativeQuery(consultaSql).executeUpdate();
         */
    }

    @Transactional
    public void eliminarEmail(String emailDelUsuario) {
        String consultaSql = "DELETE FROM lead WHERE email = :paramEmail";
        baseDeDatos.createQuery(consultaSql)
                   .setParameter("paramEmail", emailDelUsuario)
                   .executeUpdate();
    }
}
