//static block vs Java initialization Block
public class LaunchSbVsJib {
    static int age;

    static{
        System.out.println("Static block:");
        age = 25;
    }

    static void display2(){
        System.out.println("display2 static block");
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        display2();
    }
    
}

