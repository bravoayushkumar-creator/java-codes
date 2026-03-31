import java.util.*;
import java.util.stream.*;

public class SmallestGreaterThan20 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 5, 18, 22, 40};

        OptionalInt result = Arrays.stream(arr)
                .filter(n -> n > 20) // Step 1: filter
                .sorted()           // Step 2: sort
                .findFirst();       // Step 3: get smallest

        if (result.isPresent()) {
            System.out.println("Smallest number greater than 20: " + result.getAsInt());
        } else {
            System.out.println("No number greater than 20 found");
        }
    }
}
