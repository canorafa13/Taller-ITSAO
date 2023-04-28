public class EstudianteProfesor extends Estudiante implements Profesor{
    @Override
    public void diasDeClases() {
        System.out.println("De lunes a Sabado");
    }


    public void setMateria(String materi) {
        materia[0] = materi;
    }


    public String getMateria() {
        return materia[0];
    }
}
