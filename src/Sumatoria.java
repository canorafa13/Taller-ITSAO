import java.util.Scanner;

public class Sumatoria {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Cuál número deseas calcular: ");
        long numero = entrada.nextLong();
        sumatoriaConLoops(numero);
        sumatoriaConFormula(numero);
    }

    private static void sumatoriaConFormula(long numero){
        long sumatoria = (numero * (numero + 1)) / 2;
        System.out.println("La sumatoria hasta " + numero + " es: " + sumatoria);
    }

    private static void sumatoriaConLoops(long numero){
        long sumatoria = 1;
        for (long contador = 1; contador <= numero; contador++){
            // Here coded
            sumatoria = sumatoria + contador;
        }
        System.out.println("La sumatoria hasta " + numero + " es: " + sumatoria);

    }

}
