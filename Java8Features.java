interface A
{
    void show();
    default void abc()
    {
        System.out.println("default methods");
    }
    static void config()
    {
        System.out.println("static methods");
    }
}
class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class Java8Features {
    public static void main(String[] args) {
        // A.abc();
        A. config(); //call for static methods
        A obj = new B();
        obj.show();
        obj.abc();


    }
    
}
