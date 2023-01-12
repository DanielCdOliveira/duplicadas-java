import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        array1.add("Banana");
        array1.add("Melancia");
        array1.add("Kiwi");
        array1.add("Uva");
        array1.add("Abacaxi");
        array2.add("Laranja");
        array2.add("Pêra");
        array2.add("Melancia");
        array2.add("Banana");
        array2.add("Limão");
        for (int i = 0; i < array1.size(); i++) {
            if (array2.contains(array1.get(i))) {
                System.out.println(array1.get(i));
            }
        }
    }
}
