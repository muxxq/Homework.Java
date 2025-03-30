import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Student> studenti = new ArrayList<>();
    studenti.add(new Student("Ion",5));
    studenti.add(new Student("Mara",9));
    studenti.add(new Student("Miclos",6));
    studenti.add(new Student("Jojo",3));
    studenti.add(new Student("Marian",5));

    System.out.println("Before sorting by grade: ");
        for(Student s : studenti){
            System.out.println(s);
            /*System.out.println(s.getNume());
            System.out.println(s.getNota());*/
        }

    studenti.sort(Comparator.comparingInt(Student::getNota));

    System.out.println("After sorting by grade: ");
        for(Student s : studenti){
            System.out.println(s);
            /*System.out.println(s.getNume());
            System.out.println(s.getNota());*/
        }
    }
}