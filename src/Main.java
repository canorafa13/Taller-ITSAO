import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Dame el valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Dame el valor de B: ");
        int b = scanner.nextInt();
        System.out.print("Dame el valor de C: ");
        int c = scanner.nextInt();

        if (a > b){
            if (a > c){
                // Yo se que a es el mayor
                System.out.println("El valor de A es mayor");
                if (c > b){
                    System.out.println("El valor de B es menor");
                }else{
                    System.out.println("El valor de C es menor");
                }
            }else{
                // C es ma´s grande
                System.out.println("El valor de C es mayor");
                System.out.println("El valor de B es menor");
            }
        }else if (b > c){
            // Si a no es igual a b, hacemos esto
            System.out.println("El valor de B es mayor");
            if (a > c){
                System.out.println("El valor de C es menor");
            }else{
                System.out.println("El valor de A es menor");
            }
        }else{
            System.out.println("El valor de C es mayor");
            System.out.println("El valor de A es menor");
        }
    }
}