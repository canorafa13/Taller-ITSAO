import java.util.Scanner;

public class Factorial {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Cuál número deseas calcular: ");
        int numero = entrada.nextInt();
        long factorial = 1;
        for (int contador = 1; contador <= numero; contador++){
            // Here coded
            factorial = factorial * contador;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        /// Ejercicio
    }


}
