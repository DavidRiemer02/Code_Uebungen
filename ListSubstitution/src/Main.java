import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(new Integer[] {1,3,1,2,1,3,4});
        Set<Integer> valuesToSubstitute = new HashSet<>(Arrays.asList(new Integer[] {1,2,8}));
        System.out.println(replace(inputList, valuesToSubstitute, 6));
        System.out.println(inputList);
    }


    public static Map<Integer, Double> replace(List<Integer> input, Set<Integer> toSubstitute, Integer substitute) {
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < input.size(); i++) {
            if (toSubstitute.contains(input.get(i))) {
                map.put(input.get(i), map.getOrDefault(input.get(i), 0.0) + 1);
                input.set(i, substitute);
            }
        }
        return map;
    }
}
