class Member{
    static int a;
    static int b;

    int m;
    int n;

    static{
        System.out.println("Control in static block:");
        a= 5;
        b= 8;
    }

    //Java initialization
    {
        System.out.println("Control in non static block:");
        m= 10;
        n= 12;
    }

    static void display(){
        System.out.println("Value of static var a: " +a);
        System.out.println("Value of static var b: " +b);
    }

    void display1(){
        System.out.println("Value of non static variable m: " +m);
        System.out.println("Value of non static variable n: " +n);
    }
    }



public class StaticVsNonStatic {
    public static void main(String[] args) {
        Member m = new Member();

        m.display();
        m.display1();
    }
    
}
