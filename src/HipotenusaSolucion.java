import java.util.Scanner;

public class HipotenusaSolucion {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        // Datos de entrada
        System.out.print("Favor de ingresar el cateto 1: ");
        int c1 = scanner.nextInt();
        System.out.print("Favor de ingresar el cateto 2: ");
        int c2 = scanner.nextInt();

        // Dato de salida
        double hipo; // ??


        hipo = calcularHipotenusa(c1, c2);

        System.out.printf("La hipotenusa es: " + hipo);
    }


    public static double calcularHipotenusa(int cateto1, int cateto2){
        double cateto1Cuadrado = Math.pow(cateto1, 2);
        double cateto2Cuadrado = Math.pow(cateto2, 2);

        double sumaCatetos = cateto1Cuadrado + cateto2Cuadrado;

        double hipotenusa = Math.pow(sumaCatetos, 0.5);


        return hipotenusa;
    }
}
