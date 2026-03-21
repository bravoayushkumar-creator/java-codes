import java.util.Scanner;
public class swap_user {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        int temp=a;

        a=b;

        b=temp;
       // System.out.println(a+" "+b);
        System.out.println("after changing the value of a is: " +a);
        System.out.println("after changing the value of b is : " +b);


    }

}
