package academy.atl.newsletters.controllers;

import academy.atl.newsletters.models.Lead;
import academy.atl.newsletters.validators.EmailValidators;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewslettersController {

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Lead lead){

        EmailValidators emailValidators = new EmailValidators();
        if(!emailValidators.esValido(lead.getEmail())){
            return "Email no es válido";
        }

        return "Email: " + lead.getEmail();
    }
}
