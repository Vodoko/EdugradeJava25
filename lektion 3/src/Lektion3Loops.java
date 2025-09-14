public class Lektion3Loops {
    public static void main(String[] args) {

        System.out.println("Uppgift 1.1");
        for (int i = 0; i <= 2; i++) {
            System.out.println("Värdet av i: " + i);
        }
        System.out.println("---");
        System.out.println("Uppgift 1.2");

        int summaTal = 0;

        for (int i = 0; i <= 100; i++) {
            summaTal += i;
            //System.out.println(summaTal);
            //System.out.println("Värdet av i: " + i);
        }
        System.out.println("Summan blev: " + summaTal);

        System.out.println("---");
        System.out.println("Uppgift 1.3");

        int multiTal = 5;
int multiplikationer = 1;

        for (int i = 1; i <= multiplikationer; i++) {
            System.out.println("Om vi multiplicerar 5 med " + i + " så får vi: " + ((i) * multiTal));

        }

        System.out.println("---");
        System.out.println("Uppgift 2.1");

        int talUppgift21 = 1;
        while (talUppgift21 <= 20) {
            if (talUppgift21 % 2 == 0) {
                System.out.println(talUppgift21);
            }
            talUppgift21 ++;
        }

        System.out.println("---");
        System.out.println("Uppgift 2.2");
        

    }
}
