//final class cannot be inherited
class Animal{
    final int age = 5;
    final void sleep(){
        //age = 7; //final marked variable's value cannot be changed
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal{
    // final methods can be inherited but cannot be overridden in child class
    // void sleep(){
        
    // }
}
public class FinalKeyword {
    public static void main(String[] args) {
        Animal a = new Tiger();
        a.sleep();
    }
}
