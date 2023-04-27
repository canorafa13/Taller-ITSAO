import java.util.Scanner;

public class Areas {
    private static Scanner Entrada = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Me da el lado del cuadrado: ");
        int lado = Entrada.nextInt();


        double area = calcularAreaCuadrado(lado);

        System.out.println("El área es: " + area);

        /// Solicitar los valores de entrada
        System.out.print("Me da la base del triangulo: ");
        double base = Entrada.nextDouble();
        System.out.print("Me da la altura del triangulo: ");
        double altura = Entrada.nextDouble();

        double areaTriagulo = calcularAreaTriangulo(base, altura);
        System.out.println("El área del triagulo es: " + areaTriagulo);

    }

    private static double calcularAreaCuadrado(int lado){
        return lado * lado;
    }

    /// Calcular el area de un triagulo = B * A / 2
    private static double calcularAreaTriangulo(double base, double altura){
        double area = base * altura / 2;
        return area;
    }

    // Calcular el área de un circulo = Pi * (r ^ 2)
    private static double calcularAreaCirculo(double radio){
        double areaCirculo = Math.PI * Math.pow(radio, 2.0);
        return areaCirculo;
    }
}
