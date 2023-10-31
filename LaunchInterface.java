interface A{
    int a=10;
    void show();
}
interface X extends A{
    void abc();
}

class B implements X{
    public void show(){
        System.out.println("in show");
    }
    public void abc(){
        System.out.println("in abc");
    }
}
public class LaunchInterface {
    public static void main(String[] args) {
        // System.out.println(A.a);
        // A a = new A();

         B obj = new B();
        obj.show();
        // obj.abc();
        obj.abc();
        
    }
}
