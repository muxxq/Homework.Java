import java.util.ArrayList;
import java.util.List;

public class Curs
{
    private String nume;
    private List<Profesor> profesori;
    private List<Student> studenti;

    public Curs(String nume)
    {
        this.nume = nume;
        this.profesori = new ArrayList<>();
        this.studenti = new ArrayList<>();
    }

    public void addStudentToCourse(Student student)
    {
        studenti.add(student);
    }
    public void removeStudentFromCourse(Student student)
    {
        studenti.remove(student);
    }
    public void addTeacherToCourse(Profesor profesor)
    {
        profesori.add(profesor);
    }
    public void removeTeacherFromCourse(Profesor profesor)
    {
        profesori.remove(profesor);
    }
}
