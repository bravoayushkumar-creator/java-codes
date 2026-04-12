import java.util.*;
public class fact_user {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int a=sc.nextInt();
        int fact=1;
        for (int i=1;i<=a;i++){
            fact=fact*i;

        }
        System.out.println("the factorial of your number is :"+fact);


    }
}
