package algorithm;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreeCardsGame {
    private int[] sortedArrays;
    private SortedSet<int[]> matchSets = new TreeSet<>();
    private int pickNumber;
    private List<int[]> matchs = new ArrayList<>();

    private ThreeCardsGame() {
    }

    static ThreeCardsGame of(String cardsAndPickCard) {
        String[] strings = StringUtils.splitString(cardsAndPickCard, "\n");
        return ThreeCardsGame.of(strings[0], Integer.parseInt(strings[1]));
    }

    private static ThreeCardsGame of(String numbers, Integer pickNumber) {
        return ThreeCardsGame.of(StringUtils.splitString(numbers, " "), pickNumber);
    }

    private static ThreeCardsGame of(String[] split, Integer pickNumber) {
        ThreeCardsGame instance = new ThreeCardsGame();
        instance.sortedArrays = Arrays.stream(split).mapToInt(Integer::parseInt).sorted().toArray();
        instance.pickNumber = pickNumber;
        return instance;
    }

    private List<int[]> merge(int[] pickCards) {
        // if not using Set type then do merge
        return Collections.emptyList();
    }

    private List<int[]> sort(int[] pickCards) {
        // if not using SortedSet then do sort
        return Collections.emptyList();
    }

    private List<Integer> filter(int[] sortedArrays, int limitNumber) {
        return IntStream.of(sortedArrays)
                .boxed()
                .filter(n -> n <= limitNumber)
                .collect(Collectors.toList());
    }

    public List<int[]> combination() {
        List<Integer> filtered = filter(sortedArrays, pickNumber);
        filtered.forEach(v-> System.out.println(v));
        return sort(sortedArrays);
    }

    public int[] getSortedArrays() {
        return sortedArrays;
    }

    public SortedSet<int[]> getMatchSets() {
        return matchSets;
    }

    public int getPickNumber() {
        return pickNumber;
    }

    public List<int[]> getMatchs() {
        return matchs;
    }

    @Override
    public String toString() {
        return "ThreeCardsGame{" +
                ", sortedNumbers=" + Arrays.toString(sortedArrays) +
                ", sortedNumbers.length" + sortedArrays.length +
                ", matchSets=" + matchSets +
                ", pickNumber=" + pickNumber +
                '}';
    }
}
