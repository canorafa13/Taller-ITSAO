public class Loops {
    public static void main(String args[]) {
        //loopFor();
        loopDoWhile();
        //loopWhile();
    }

    private static void loopWhile(){
        // Besar a un/una chic@
        boolean isLiked = false;
        int counter = 0;
        while (isLiked){
            // Here code
            System.out.println("Me gusta la chica");
            System.out.println("Se roba el beso");
            counter++;
            if (counter == 10){
                isLiked = false;
            }
        }
        System.out.println("Ya no me gusta la chica");
    }

    private static void loopDoWhile(){
        // Besar a un/una chic@
        boolean isLiked = false;
        int counter = 0;
        do{
            // Here code
            System.out.println("Se roba el beso");
            counter++;
            if (counter == 10){
                isLiked = false;
            }
        }while (isLiked);
        System.out.println("Ya no me gusta la chica");
    }

    private static void loopFor(){
        /// Daremos 10 vueltas al parque
        for (int vuelta = 1; vuelta <= 10; vuelta++){
            System.out.println("Corriendo la vuelta número: " + vuelta);
        }

        System.out.println("He dado mis 10 vueltas");
    }
}
