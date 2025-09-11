public class Lecture_2 {
    public static void main(String[] args) {

    int age = 30;
    double height = 1.75;
    char initial = 'A';
    String name = "Alice";
    boolean isStudent = true;

    System.out.println(age);
    System.out.println(height);
    System.out.println(initial);
    System.out.println(name);
    System.out.println(isStudent);

    System.out.println("---");

        System.out.println(name);
        System.out.println(((Object) name));
        System.out.println(((Object) name).getClass().getName());

        System.out.println("---");
        System.out.println("Uppgifter Del 2.1");

        int nrOne = 10;
        int nrTwo = 20;
        System.out.println("tal ett är " + nrOne);
        System.out.println("och tal två är " + nrTwo);
        System.out.println("och tillsammans är de " + nrOne + nrTwo);
// Eftersom det blir en string så adderas inte talen ihop på rätt sätt
        System.out.println(nrOne + nrTwo);

        System.out.println("---");
        System.out.println("Uppgifter Del 2.2");

        int a = 15;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a <= b);


        System.out.println("---");
        System.out.println("Uppgifter Del 2.3");
        int x = 10;
        int y = 5;
        int z = 20;

        System.out.println( x > y );
        System.out.println( z > y);
        System.out.println("---");
        boolean xVsy = (x > y);
        boolean zVsy = (z > y);
        System.out.println(xVsy && zVsy);
        System.out.println(xVsy || zVsy);
        System.out.println(!(x > y));

        System.out.println("---");
        System.out.println("Uppgifter Del 2.4");

        System.out.println(((10 + 5) *2) > 20);


    }

}
