package Inheritance;

class Demo1{
    void disp(){
        System.out.println("Display in Demo1");
    }

}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}
public class MultiLevel {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.disp();
    }
    
}
