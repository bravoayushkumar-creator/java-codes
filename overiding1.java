 class O2animal {
    void sound(){
        System.out.println("the animal is eating ");

    }
}
class dog3 extends O2animal{
    void sound(){
        System.out.println("dog is barking");

    }
}
class cat3 extends O2animal{
    void sound(){
        System.out.println("cat is meowing");
    }

}
public class overiding1{
    public static void main(String[] args){
        O2animal a =new dog3();
        a.sound();
        O2animal b= new cat3();
        b.sound();
    }
}
