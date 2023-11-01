public class LaunchStatic {
    static int a;

    //Executing before main method i.e during class loading time
    static //Static Initialization Block
    {
        System.out.println("Static Block:");
        a= 10;
        System.out.println(a);

    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    
}
