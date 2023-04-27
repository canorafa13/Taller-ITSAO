import java.util.Scanner;

public class Multiplos {
    private static Scanner input = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Multiplos de: ");
        int numero = input.nextInt();

        //System.out.print("Número dentro de los multiplos: ");
        //int numeroRandom = input.nextInt();

        System.out.print("Número minimo de multiplos a imprimir: ");
        int min = input.nextInt();

        System.out.print("Número máximo de multiplos a imprimir: ");
        int max = input.nextInt();

        printMultiplesInRange(numero, min, max);

        //printTenMultiples(numero, max);
        //isMultiple(numeroRandom, numero);
    }

    public static void printMultiplesInRange(int numero, int minMultiples, int maxMultiples){
        for (int incremento = minMultiples; incremento <= maxMultiples; incremento++){
            System.out.printf("%d ", (numero * incremento));
        }
        System.out.println();
    }

    /// Ejercicio, cambiar el 10, por el maximo de multiplos requeridos por el usuario
    public static void printTenMultiples(int numero, int maxMultiplos){
        for (int incremento = 1; incremento <= maxMultiplos; incremento++){
            System.out.printf("%d ", (numero * incremento));
        }
        System.out.println();
    }

    private static void isMultiple(int numero, int multiplo){
        /// Residuo
        int residuo = numero % multiplo;

        // Operador lógico
        if (residuo == 0){
            //Par
            System.out.println("El " + numero + ", si es multiplo de: " + multiplo);
        }else{
            // Impar
            System.out.println("No es multiplo");
        }
    }
}
