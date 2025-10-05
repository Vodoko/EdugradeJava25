import education.Classroom;
import education.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Lektion 6! ---");

        Student student1 = new Student("Valdemar Segerström");

        Classroom java25 = new Classroom(5);
        java25.addStudent(student1());
        java25.addStudent(new Student("Valdemar Eriksson"));


    }
}