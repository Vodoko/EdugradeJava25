public class Lektion3Villkor {
    public static void main(String[] args) {

        System.out.println("Uppgift 1.1");
        int tal = 3;
        if ((tal % 2)== 0) {
            System.out.println("Talet är jämnt!");
        } else {
            System.out.println("Talet är inte jämnt");
        }

        System.out.println("---");
        System.out.println("Uppgift 1.2");

int age = 20;



        if (age <= -1){
            System.out.println("Personen är inte född än!");
        } else if (age >= 120) {
            System.out.println("Troligen lever inte denna person!");
        } else if (age >= 65) {
            System.out.println("Personen är en pensionär!");
        } else if (age < 18) {
            System.out.println("Personen är minderårig!");
        } else System.out.println("Personen är mynding!");

        System.out.println("---");
        System.out.println("Uppgift 1.3");

        int talEtt = 112;
        int talTwo = 10;
        int talTre = 17;

        if ((talEtt > talTwo) && (talEtt>talTre)) {
            System.out.println("Tal ett är störst!");
        } else if ((talTwo > talEtt) && (talTwo>talTre)) {
            System.out.println("Tal två är störst!");
        } else System.out.println("Tal tre är störst!");

        System.out.println("---");
        System.out.println("Uppgift 2.1");

        // Ta en vilken månad det är och skriv ut det!

        int month = 2;

        switch (month) {
            case 1:
                System.out.println("Januari");
                break;

            default:
                System.out.println("Februari");
        }

        System.out.println("Uppgift 2.2");

        int betyg = 6;
        switch (betyg) {
            case 0:
                System.out.println("F");
                break;
            case 1:
                System.out.println("E");
                break;

                case 2:
                    System.out.println("D");
                    break;

            case 3:
                System.out.println("C");
                break;
                case 4:
                    System.out.println("B");
                    break;
                    case 5:
                        System.out.println("A");
                        break;
            default:
                System.out.println("S+");
        }

        System.out.println("Uppgift 2.3");


    }
}
