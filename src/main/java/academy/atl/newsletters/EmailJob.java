package academy.atl.newsletters;

import jdk.jfr.Enabled;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Permite ejecutar funciones de noche.
 */
@EnableScheduling
public class EmailJob {

    /**
     * La notación Scheduled permite ejecutar una función con
     * una fecha u hora programada,
     * según una condición pasada como parametro.
     * (Tareas Automatizadas)
     * Ejem: Generar backUp de la base de datos
     */

    @Scheduled(cron = "0 5 * * 0") // Ejecutar a las 5:00 AM de cada domingo (0 = domingo)
    public void enviarCampanaDeMarketing(){
        // Coloca aquí el código para enviar la campaña de marketing
        System.out.println("Enviando campaña de marketing...");
    }

    /**
     * Hacer un Get
     * Traer un listado completo de E-mail
     */
}
