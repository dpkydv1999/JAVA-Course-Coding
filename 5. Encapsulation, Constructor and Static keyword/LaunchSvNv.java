class Alpha{
    static int a;
    static int b;

    int m;
    int n;

    static{
        System.out.println("Static Block:");
        a = 10;
        b = 12; 
    }

    {
        System.out.println("Non static Block:");
        m= 100;
        n= 200;
    }
}

public class LaunchSvNv {
    public static void main(String[] args) {
        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();
        
        //static variable can be accessed by below expression.
        // Alpha.a;
        // Alpha.b;

        // for instance variables
        // a1.m;
        // a2.n;
    }
    
}
