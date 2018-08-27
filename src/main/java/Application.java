import algorithm.ThreeCardsGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

public class Application {
    public static void main(String[] args) throws IOException {
        // Given
        StringBuilder numberString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i<20; i++) {
            numberString.append(" ").append(String.valueOf(random.nextInt(21)));
        }

        System.out.println(numberString);
        System.out.println("Ack your number!: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        // When
        ThreeCardsGame game = ThreeCardsGame.of(numberString.toString(), Integer.parseInt(br.readLine()));
//        ThreeCardsGame game = ThreeCardsGame.of("30 30 40", Integer.parseInt(br.readLine()));
        List<int[]> combination = game.combination();

        // Then
        combination.forEach(v-> System.out.println("answer: " + v));


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
