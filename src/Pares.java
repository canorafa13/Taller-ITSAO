public class Pares {
    public static void main(String args[]){
        //calcularRagoPares(269, 9);
        calculoSumaProducto(5);
    }

    private static void calculoSumaProducto(int n){
        int suma = 0;
        int producto = 1;


        int contador = 1;
        while (contador <= n){
            /// Residuo
            int residuo = contador % 2;
            // Operador lógico
            if (residuo == 0){
                //Par
                suma = suma + contador;
            }else{
                // Impar
                producto = producto * contador;
            }
            contador++;
        }

        System.out.println("La suma de los pares es de: " + suma);
        System.out.println("El producto de los impares es de: " + producto);
    }

    private static void calcularRagoPares(int min, int max){
        int contador = min;
        while (contador <= max){
            /// Residuo
            int residuo = contador % 2;
            // Operador lógico
            if (residuo == 0){
                //Par
                System.out.println("El número " + contador + " es par");
            }
            contador++;
        }
    }

    private static void calcularCiesPares(){
        int contador = 1;
        while (contador <= 200){
            /// Residuo
            int residuo = contador % 2;
            // Operador lógico
            if (residuo == 0){
                //Par
                System.out.println("El número " + contador + " es par");
            }
            contador++;
        }
    }

    private static void parOrImpar(){
        int valor = 900;
        /// Residuo
        int residuo = valor % 2;

        // Operador lógico
        if (residuo == 0){
            //Par
            System.out.println("El número es par");
        }else{
            // Impar
            System.out.println("El número es impar");
        }
    }
}
