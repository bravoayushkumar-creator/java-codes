package hello;
@FunctionalInterface
interface calc{
    void calculate();

}
public class Functional_4 {
    public static void main(String[] args){
        calc a1=()->{
        int num1=10,num2=30;
        System.out.println(("sum"+(num1+num2)));


        };
        a1.calculate();
    }
}
