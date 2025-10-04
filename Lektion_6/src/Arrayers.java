public class Arrayers {
    public static void main(String[] args) {
        System.out.println(" --- Lektion 6 Arrays --- ");
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 8;
        numbers[4] = 13;

//        int heltal = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++) {
//            heltal = heltal + numbers[i];
//        System.out.println("Summan av arrayen numbers är: " + heltal);
//        }

//        int numberOfEvenNumbers = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                numberOfEvenNumbers++;
//            }
//            System.out.println("Talet som checkas är: " + numbers[i]);
//            System.out.println("Antal jämna tal är: " + numberOfEvenNumbers);
//        }
        int minstaTal = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minstaTal) {
                minstaTal = numbers[i];
            }
        }
        System.out.println("Minsta talet i arrayen är: " + minstaTal);
    }
}
