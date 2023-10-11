import java.util.Arrays;

class Method1{
    static int a;
    static int b;

    int m;
    int n;

    static void disp1(){
        System.out.println("Static method disp1");
    }
    void disp2(){
        System.out.println("Non static method disp2");
    }
}

public class StaticMethodVsNonStaticMethod {
    
    public static void main(String[] args) {
       Method1.disp1();

        Method1 d = new Method1();
        d.disp2(); 

        d.disp1();

        // Arrays.sort(args); //Inbuilt methods
    }
    
    
}
