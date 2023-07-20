package academy.atl.newsletters.validators;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EmailValidatorTest {

    @Test
    public void elEmailDebeTenerUnArroba(){
        EmailValidators validator = new EmailValidators();
        boolean result = validator.esValido("asasas");
        assertFalse(result);
    }

    @Test
    public void elEmailDebeTenerPunto(){
        EmailValidators validator = new EmailValidators();
        boolean result = validator.esValido("asasas@gmail");
        assertFalse(result);
    }

    @Test
    public void elArrobaNoDebeEstarAlFinal(){
        EmailValidators validator = new EmailValidators();
        boolean result = validator.esValido("asasas.gmail@");
        assertFalse(result);
    }

    @Test
    public void elEmailNoDebeTenerEspacios(){
        EmailValidators validator = new EmailValidators();
        boolean result = validator.esValido("asasas gmail@");
        assertFalse(result);
    }

    @Test
    public void elEmailNoDebeTenerMas255Caracteres(){
        EmailValidators validator = new EmailValidators();
        boolean result = validator.esValido("asasassdgfdgfsdgfdgfdgdfgdfgdfgdfgdfgfdggmail@asasassdgfdgfsdgfdgfdgdfgdfgdfgdfgdfgfdggmail@asasassdgfdgfsdgfdgfdgdfgdfgdfgdfgdfgfdggmail@asasassdgfdgfsdgfdgfdgdfgdfgdfgdfgdfgfdggmail@asasassdgfdgfsdgfdgfdgdfgdfgdfgdfgdfgfdggmail@");
        assertFalse(result);
    }
}
