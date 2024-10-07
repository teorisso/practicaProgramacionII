/*
¿Qué hará el siguiente código si se pasa n = 0 como argumento?
 */

public class E3 {
    public static void main(String[] args) {
        imprimirNumeros(0);
    }

    public static void imprimirNumeros(int n) {
        if (n>0) {
            imprimirNumeros(n-1);
            System.out.println(n);
        }
    }
}

// No imprimirá nada.

