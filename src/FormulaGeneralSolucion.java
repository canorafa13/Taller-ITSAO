import java.util.Scanner;

public class FormulaGeneralSolucion {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        // Definir los valores de a, b y c
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double x; // ?? Es la incognica que debemos calcular con la formula general

        x = calcularFormulaGeneral(a, b, c);



        System.out.println("El valor de X es igual a: " + x);

    }

    public static double calcularFormulaGeneral(int a, int b, int c){

        double resta = Math.pow(b, 2) - (4 * a * c);

        double raiz2 = Math.pow(resta, 0.5);

        double dividendo = -b - (raiz2);


        double divisor = 2 * a;

        double x = dividendo/divisor;

        return x;
    }
}
