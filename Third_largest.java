import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Third_largest {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 40, 5, 30, 15);

        int thirdLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not enough elements"));

        System.out.println("3rd Largest Number = " + thirdLargest);
    }
}
