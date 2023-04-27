public class OperadoresAritmeticos {
    public static void main(String args[]){
        //Valores
        int a = 10;
        int b = 5;


        // Suma
        int suma = a + b;

        // Resta
        int resta = a - b;

        // Multiplicacion
        int prod = a * b;

        // Division
        int div = a / b;

        // Elevar al cuadrado
        double pow = Math.pow(a, 2.0);



        // Raices
        double raiz2 = Math.pow(100, 0.5);
        double raiz3 = Math.pow(27, 0.33);

        System.out.printf("Suma: %d\n", suma);
        System.out.printf("Resta: %d\n", resta);
        System.out.printf("Producto: %d\n", prod);
        System.out.println("Division: " + div);
        System.out.println("Potencia de 2: "+ pow);
        System.out.println("Raiz de 2: "+ raiz2);
        System.out.println("Raiz de 27: "+ raiz3);
    }
}
