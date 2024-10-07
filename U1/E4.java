/*
 * ¿Cuál es el propósito del siguiente método fibonacci?
 */

public class E4 {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

//Calcula el enésimo número en la secuencia de Fibonacci.