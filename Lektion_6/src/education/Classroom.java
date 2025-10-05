package education;

public class Classroom {
    private Student[] students;
    private int studentCount;

    //konstruktor
    public Classroom (int size){
    students = new Student[size];
    studentCount = 0;
    }

    public void addStudent (Student student){
if (students.length > studentCount){
    students[studentCount] = student;
    studentCount ++;
} else
    System.out.println("Classroom is full!");
    }

    public void listStudents() {
        for (int i = 0; i < studentCount; i++){
            System.out.println(students[i].getName());
        }
    }

}
