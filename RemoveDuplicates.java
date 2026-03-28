import java.util.*;
import java.util.stream.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 50);

        List<Integer> uniqueList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueList);
    }
}
