
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class reduce_5{
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(34,56,45,76,67,35,67);
        double avg =list.stream().reduce(1,(a,b)->a*b)/list.size();
        System.out.println("avg is "+avg);
    }
}
//vipin sir