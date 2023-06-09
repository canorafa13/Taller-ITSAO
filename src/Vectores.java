import java.util.Arrays;
import java.util.Scanner;

public class Vectores {
    private static Scanner entrada = new Scanner(System.in);
    private static int MAX_SIZE_VECTOR = 5;
    public static void main(String args[]){
        // Leer 10 valores en consola
        /// Definicion de un vector
        //vectorOnlyPositives();
        //vectorAddValues();
        //addTwoVectors();
        intersectionVectors();
    }

    private static void intersectionVectors(){
        int[] vectorA = fillVector(MAX_SIZE_VECTOR);
        int[] vectorB = fillVector(MAX_SIZE_VECTOR);

        printVector(vectorA);
        printVector(vectorB);

        for (int position = 0; position < MAX_SIZE_VECTOR; position++){
            if(vectorA[position] == vectorB[position]){
                System.out.println("Intersección en la posicion: " + position + ", con el valor: " + vectorA[position]);
            }
        }
    }

    private static void addTwoVectors(){
        int[] vectorA = fillVector(MAX_SIZE_VECTOR);
        int[] vectorB = fillVector(MAX_SIZE_VECTOR);
        int[] vectorC = new int[MAX_SIZE_VECTOR];
        for (int position = 0; position < MAX_SIZE_VECTOR; position++){
            vectorC[position] = vectorA[position] + vectorB[position];
        }
        printVector(vectorA);
        printVector(vectorB);
        printVector(vectorC);


    }
    private static void vectorAddValues(){
        int[] vector = new int[MAX_SIZE_VECTOR];
        for (int incremento = 0; incremento < vector.length; incremento++){
            vector[incremento] = pedirValores(incremento);
        }
        printVector(vector);
        System.out.printf("Suma de todos los valores %d con ayuda\n", Arrays.stream(vector).sum());


    }

    private static void vectorOnlyPositives(){
        int[] vector = new int[MAX_SIZE_VECTOR];
        for (int incremento = 0; incremento < vector.length;){
            int check = pedirValores(incremento);
            if (check > 0){
                vector[incremento] = check;
                incremento++;
            }else{
                System.out.println("Desecharemos el valor introducido");
            }
        }
    }

    private static void vectorError(){
        int[] vector = new int[MAX_SIZE_VECTOR];
        for (int incremento = 0; incremento < vector.length; incremento++){
            vector[incremento] = pedirValores(incremento);
        }
    }

    private static void vector(){
        int[] vector = new int[MAX_SIZE_VECTOR];
        for (int incremento = 0; incremento < vector.length; incremento++){
            vector[incremento] = pedirValores(incremento);
        }
        int countNegativos = 0;
        int countPositivos = 0;
        int countZeros = 0;
        for (int incremento = 0; incremento < vector.length; incremento++){
            if (vector[incremento] < 0){
                // Este valor es negativo
                countNegativos++;
            } else if (vector[incremento] > 0) {
                countPositivos++;
            }else{
                countZeros++;
            }
        }
        System.out.println("Tengo " + countNegativos + " negativos");
        System.out.println("Tengo " + countPositivos + " positivos");
        System.out.println("Tengo " + countZeros + " ceros");
    }

    private static int pedirValores(int index){
        System.out.printf("Me da el valor[%d]: ", index);
        return entrada.nextInt();
    }

    private static void printVector(int[] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.printf("%d, ", vector[i]);
        }
        System.out.println();
    }

    private static int[] fillVector(int size){
        int[] vector = new int[size];
        for (int incremento = 0; incremento < vector.length; incremento++){
            vector[incremento] = pedirValores(incremento);
        }
        return vector;
    }
}
