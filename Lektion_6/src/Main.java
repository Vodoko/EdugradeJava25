import education.Classroom;
import education.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Lektion 6! ---");

        Student student1 = new Student("Valdemar Segerström");

//        example1();
        example2();
    }
    private static void example1(){
        Student student1 = new Student("Valdemar Segerström");
        Classroom java25 = new Classroom(5);
        java25.addStudent(student1);
        java25.addStudent(new Student("Farbror Eriksson"));
        java25.addStudent(new Student("Mister Mountaineer"));
        java25.addStudent(new Student("Miss Greece"));
        java25.addStudent(new Student("Skelleftep Boi"));
        java25.listStudents();
    }
private static void example2() {
    String[] names = {"Valdemar", "Eriksson", "Mountaineer", "Greece", "Skeleboi"};
    Classroom java25 = new Classroom(5);
    for (int i = 0; i < names.length; i++){
        java25.addStudent(new Student(names[i]));
    }
    java25.listStudents();
}
}