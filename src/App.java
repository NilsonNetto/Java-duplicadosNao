import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String[] array1 = { "Morango", "Uva", "Acerola", "Manga" };
        List<String> array2 = new ArrayList<>();
        array2.add("Banana");
        array2.add("Manga");
        array2.add("Morango");
        array2.add("Kiwi");

        List<String> duplicatedArray = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            String analisada = array1[i];
            if (array2.contains(analisada)) {
                duplicatedArray.add(analisada);
            }
        }

        System.out.println("Itens duplicados: " + duplicatedArray.toString());
    }
}
