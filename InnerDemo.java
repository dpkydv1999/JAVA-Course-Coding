// inner class types - member, static and Anonymous inner class
class A
{
    public void show()
    {
        System.out.println("in show");
    }
     
    class B
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
     static class C
     {
        public void config()
        {
            System.out.println("static class");
        }
     }
}
public class InnerDemo {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        //member inner class
        A.B obj1 = obj.new B();
        obj1.display();

        A.C obj2 = new A.C();
        obj2.config();


    }
    
}
