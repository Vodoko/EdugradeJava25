public class ArraysExcercises {
    public static void main(String[] args) {
        System.out.println(" --- Övningsuppgifter Arrays ---");
        System.out.println("Övning 1");
        int nummer[] = new int[5];
        for (int i = 0; i < 5; i++) {
            nummer[i] = (i + 1) * 2;
//            System.out.println("I den här delen av forloopen är plats " + i + " värdet: " + nummer[i]);
        }
        System.out.println("Arrayen nummer innehåller: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(nummer[i]);
        }
        int summanArray = 0;
        for (int i = 0; i < nummer.length; i++) {
            summanArray = nummer[i] + summanArray;
        }
        System.out.println("Summan blev: " + summanArray);
        System.out.println("---");
        System.out.println("Övning 2");

        int nummer2[] = new int[10];
        for (int i = 0; i < 10; i++) {
            nummer2[i] = (i + 1) * 2;
        }

        int biggestNumber = 0;

        for (int i = 0; i < nummer2.length; i++){
            if (nummer2[i] > biggestNumber){
                biggestNumber = nummer2[i];
            }
        }
        System.out.println("På plats 10 i nummer2 är: " + nummer2[9]);
        System.out.println("Det största talet i nummer2 är: " + biggestNumber);

//        int smallestNumber = 200;
//        for (int i = 21; nummer2.length < i; i--){
//            if (nummer2[i] < smallestNumber){
//                smallestNumber = nummer2[i];
//            }
//        }
//        System.out.println("Det minsta talet i nummer2 är: " + smallestNumber);
//hitta minsta talet
        int[] numbers = {34, 67, 23, 89, 12};
        //skriv 1. metod för att hämta det minsta talet
        int findSmallest = findMin(numbers);
        // 2. en int som anropar metoden
        System.out.println("Det minsta talet är: " + findSmallest);
        // 3. en sout som visar talet

    }
public static int findMin (int[] array){
        int min = array[0];
        for (int i = 0; i<array.length; i++){
            if (i<array[i]){
                min = array[i];
            }
        }
        return min;
}
}
