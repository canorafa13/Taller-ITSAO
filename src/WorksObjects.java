public class WorksObjects {
    public static void main(String args[]){
        Persona rafael = new Persona();
        Persona lupita = new Persona();

        rafael.name = "Rafael Cano Martinez";
        rafael.age = 26;

        lupita.name = "Guadalupe Hernandez";
        lupita.age = 26;

        rafael.greeting();
        lupita.greeting();
    }
}
