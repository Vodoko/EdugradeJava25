import java.util.ArrayList;
import java.util.List;

public class OperationerExcercises {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 234;
        numbers[1] = 1;
        numbers[2] = 33;
        numbers[3] = 12;
        numbers[4] = 23;

        bubbleSort(numbers);

        System.out.println("\nArray after sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("  ---  ");
        List<String> stringsWords = new ArrayList<>();
        stringsWords.add("Ett ord");
        stringsWords.add("Två ord");
        stringsWords.add("Tre ord");
        stringsWords.add("Fyra ord");
        stringsWords.add("Fem ord");

        System.out.println(stringsWords);

        stringsWords.set(2, "Nytt ord");
        System.out.println(stringsWords);
    }

    // Bubble Sort Implementation
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Byt plats
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

