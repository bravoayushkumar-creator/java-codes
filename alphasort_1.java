import java.util.*;

public class alphasort_1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul", "Ayush", "Rohit", "Ankit");

        List<String> sortedNames = names.stream()
                .sorted()
                .toList();

        System.out.println(sortedNames);
    }
}