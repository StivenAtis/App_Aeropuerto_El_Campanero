package Classes;

/**
 *
 * @author Booh
 */
public class clsEmailVerification {
    
    public static boolean es_un_email_valido(String email){
    
        char cantidad_arroba = '@';
        int pos=0;
        int contador = 0;
        
        //------------------------------------------------------------------------------------------------------------------
        
        pos = email.indexOf(cantidad_arroba);
        while (pos != -1){
            contador++;
            pos=email.indexOf(cantidad_arroba,pos+1);
            
            //Si el email no contiene o contiene más de una vez el caracter '@':
            if (contador != 1){
                System.out.println('\n' + "¡¡¡ Error !!!" + '\n');
                System.out.println("El correo contiene más de un @, o no contiene ninguno." + '\n');
            return false;
            }
        }
        
        //------------------------------------------------------------------------------------------------------------------
        
        String dominio = "@elcampanero.com";
        int index = 2;
        char[] chararray = email.toCharArray();
        
        //------------------------------------------------------------------------------------------------------------------

        
        //Si el email no contiene el dominio '@elcampanero.com':
        if (email.contains(dominio) == false){
            System.out.println('\n' + "¡¡¡ Correo erroneo !!!" + '\n');
            return false;
        }

        //------------------------------------------------------------------------------------------------------------------
    
    //Retorna verdadero si el correo es valido. 
    return true;
    }
    
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    
    public static boolean email_valido(String email){
    
        char cantidad_arroba = '@';
        int pos=0;
        int contador = 0;
        
        //------------------------------------------------------------------------------------------------------------------
        
        pos = email.indexOf(cantidad_arroba);
        while (pos != -1){
            contador++;
            pos=email.indexOf(cantidad_arroba,pos+1);
            
            //Si el email no contiene o contiene más de una vez el caracter '@':
            if (contador != 1){
                System.out.println('\n' + "¡¡¡ Error !!!" + '\n');
                System.out.println("El correo contiene más de un @, o no contiene ninguno." + '\n');
            return false;
            }
        }
        return true;
    }
    
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}
