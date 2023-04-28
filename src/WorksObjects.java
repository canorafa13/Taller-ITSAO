import java.util.Scanner;

public class WorksObjects {
    private static final int MAX_SIZE = 2;
    private static final Scanner entrada = new Scanner(System.in);
    public static void main(String args[]){

        //registrarEstudiantes();
        estudianteProfesor();
    }

    private static void estudianteProfesor(){
        EstudianteProfesor estudianteProfesor = new EstudianteProfesor();
        estudianteProfesor.name = "Profesor Jose";
        estudianteProfesor.age = 33;
        estudianteProfesor.matricula = 121212;
        estudianteProfesor.setMateria("Español");
        estudianteProfesor.greeting();
        estudianteProfesor.yoSoy("Ingles");
        estudianteProfesor.diasDeClases();
    }

    private static void registrarEstudiantes(){
        Estudiante[] estudiantes = new Estudiante[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++){
            estudiantes[i] = new Estudiante();

            System.out.println("******** Estudiante numero " + i + " **********");
            System.out.print("Introduzca el nombre del estudiante: ");
            estudiantes[i].name = entrada.next();

            System.out.print("Introduzca la edad del estudiante: ");
            estudiantes[i].age = entrada.nextInt();

            System.out.print("Introduzca la matricula del estudiante: ");
            estudiantes[i].matricula = entrada.nextLong();

        }

        for (int i = 0; i < MAX_SIZE; i++){
            estudiantes[i].greeting();
            estudiantes[i].yoSoy();
            estudiantes[i].yoSoy("Matematicas");
        }
    }

    private static void personas(){
        Persona[] personas = new Persona[MAX_SIZE];

        // Propiedades
        personas[0] = new Persona();
        personas[1] = new Estudiante();
//        personas[2] = new Profesor();

        personas[0].age = 40;
        personas[0].name = "Raul";
        personas[0].greeting();


        personas[1].name = "Juan";
        personas[1].age = 18;
        personas[1].greeting();
        ((Estudiante) (personas[1])).matricula = 129122;

        personas[2].name = "Rafael";
        personas[2].age = 26;
        personas[2].greeting();
        //((Profesor) personas[2]).materia = "Matematicas";

        /// Acciones
        personas[0].greeting();
        ((Estudiante) personas[1]).yoSoy();
        ((Profesor) personas[2]).diasDeClases();
    }
}
