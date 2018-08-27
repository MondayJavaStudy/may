import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
    }

    private static void collectionsLearn() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple2");
        fruits.add("Apple3");
        fruits.add("Apple4");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
            }
        }

        fruits.forEach(System.out::println);

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruitName = iterator.next();
            if (fruitName.equals("Apple")) {
                System.out.println(fruitName);
            }
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        List<String> data = Arrays.asList("123", "va", "mm", "asdf", "~~~");
    }
}
