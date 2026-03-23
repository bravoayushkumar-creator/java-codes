import java.util.Arrays;
import java.util.List;
import java.util.*;

public class reduce_1 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(34,56,45,76,67,35,67);
        int sum =list.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum is "+sum);
    }
}
