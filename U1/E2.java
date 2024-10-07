/*
 * Observa el siguiente código. ¿Qué hace el método inversa?
 */

public class E2 {
    public static void main(String[] args) {
    System.out.println(inversa("Hola"));
    }

    public static String inversa(String str) {
        if(str.isEmpty()){
            return str;
        }else{
            return inversa(str.substring(1)) + str.charAt(0);
        }
    }
}

// Invierte la cadena de texto.