import java.util.*;

public class ProductGreaterThan5 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 8, 10, 4};

        int product = Arrays.stream(arr)
                .filter(n -> n > 5)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of numbers greater than 5: " + product);
    }
}
