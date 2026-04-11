import java.util.Scanner;

public class negative_positive {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number that you want:");
        int x= sc.nextInt();
        //System.out.println("enter the number");
        if(x < 0) x = -x;
        System.out.println("number becomes even that is now :"+x);
    }
}
