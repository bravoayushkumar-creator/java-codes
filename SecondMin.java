import java.util.*;

public class SecondMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 3, 8,56,8976,34,0, 3);

        Integer secondMin = list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second Minimum: " + secondMin);
    }
}
