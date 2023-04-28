public class Estudiante extends Persona{
    long matricula = 0;

    /**Sobrecarga*/
    public void yoSoy(){
        System.out.println("Yo soy estudiante");
    }

    public void yoSoy(String materia){
        System.out.println("Yo soy estudiante de " + materia);
    }



    /**Sobreescitura de metodos**/
    @Override
    public void greeting() {
        super.greeting();
        System.out.println("Ayuda!!");
    }
}
