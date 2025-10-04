import java.util.ArrayList;
import java.util.List;

public class ListsExcercises {
    public static void main(String[] args) {
        System.out.println("Från lektionen: ");
        List<Integer> numbers = new ArrayList<>();
        //Här lägger jag in värden i listan på ett jobbigt sätt: en forloop
        for (int i = 0; i<5;i++){
            numbers.add((i+1)*2);
        }
//        for (int i = 0; i<5;i++){
//            numbers.add((i+1));
//        }
//        System.out.println(numbers.get(0));
//        for (int number :numbers){
//            System.out.println("Index of i " + number);
//        }
        System.out.println("Index 0: " + numbers.get(0));
        System.out.println("---");
        System.out.println("Övningsuppgifter: ");
        System.out.println("Övning 1: ");

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(12);
        numbers2.add(34);
        numbers2.add(77);
        numbers2.add(3);
        numbers2.add(101);

            int sum = 0;
        for (int i = 0; i < numbers2.size(); i++){
            sum += numbers2.get(i);
            System.out.println("Sum: " + sum);
        }

        System.out.println("Övning 2:");
        //Skapa metod för att hitta och returnera minsta/största tal
//        int numbersMin = numbers2.getFirst();
//        int numbersMax = numbers2.get(3);
        System.out.println("Övning 3: ");
        List<Integer> numbers4 = new ArrayList<>();
        //Här lägger jag in värden i listan på ett jobbigt sätt: en forloop
        for (int i = 0; i<5;i++){
            numbers4.add((i+1)*3);
        }
        for (int number :numbers4){
            System.out.println(number);
        }
            System.out.println("---");
        numbers4.remove(4);
        for (int number :numbers4){
            System.out.println(number);
        }
            System.out.println("---");
        numbers4.remove(0);
        for (int number :numbers4){
            System.out.println(number);
        }
            System.out.println("---");
    }

}
