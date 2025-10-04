public class Arrayers {
    public static void main(String[] args) {
        System.out.println(" --- Lektion 6 Arrays --- ");
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;

        int heltal = 0;

        for (int i = 0; i < numbers.length; i++) {
            heltal = heltal + numbers[i];
        }
        System.out.println("Summan av arrayen numbers är: " + heltal);
    }
}
