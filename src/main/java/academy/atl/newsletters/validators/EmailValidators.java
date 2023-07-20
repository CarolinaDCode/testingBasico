package academy.atl.newsletters.validators;

public class EmailValidators {


    public boolean esValido(String email) {

        //Revisar que el email tenga un arroba
        if(!email.contains("@")){
            return false;
        }

        //Revisar que el email tenga punto
        if(!email.contains(".")){
            return false;
        }

        //Revisar que el arroba no sea la ultima letra
        if(email.endsWith("@")){
            return false;
        }

        //Revisar que el Email no tenga espacios
        if(email.contains(" ")){
            return false;
        }

        //Revisar que el Email no tenga más de 255 caracteres
        if(email.length() > 255){
            return false;
        }
        return true;
    }
}
