import java.util.ArrayList;
import java.util.List;

public class ListsExcercises {
    public static void main(String[] args) {
        System.out.println("Från lektionen: ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i<5;i++){
            numbers.add((i+1)*2);
        }
        System.out.println(numbers.get(0));
    }
}
