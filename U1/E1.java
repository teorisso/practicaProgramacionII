/*
 * ¿Cuál es la salida del siguiente código cuando se pasa una variable por valor?
 */

public class E1 {
    public static void main(String[] args) {
        int x = 5;
        modificar (x);
        System.out.println(x);
    }

    public static void modificar(int x) {
        x = 10;
    }
}

//5