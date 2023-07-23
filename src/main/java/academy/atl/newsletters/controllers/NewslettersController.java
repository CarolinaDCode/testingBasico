package academy.atl.newsletters.controllers;

import academy.atl.newsletters.models.Lead;
import academy.atl.newsletters.repository.EmailRepository;
import academy.atl.newsletters.validators.EmailValidators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewslettersController {

    @Autowired
    private EmailRepository repositorioDeEmail;

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Lead lead){

        String email = lead.getEmail();

        EmailValidators emailValidators = new EmailValidators();
        if(!emailValidators.esValido(lead.getEmail())){
            return "Email no es válido";
        }

        repositorioDeEmail.guardarEmail(email);
        //Guadar el email en la base de datos
        return "Email Guardado" + email;
    }

    @PostMapping("/api/newsletter/unsuscribe")
    public String eliminarEmail(@RequestBody Lead lead){
        String email = lead.getEmail();
        repositorioDeEmail.eliminarEmail(email);
        return "Email eliminado: " + email;
    }
}
