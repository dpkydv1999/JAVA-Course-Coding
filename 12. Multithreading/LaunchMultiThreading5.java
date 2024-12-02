
import java.util.Scanner;

class Calc implements Runnable
{
    public void run()
    {
        System.out.println("Calculation task started:");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int result = num1+num2;

        System.out.println(result);
        System.out.println("calculaton task ended");
        System.out.println(".................................................");
    }
}

class Message extends Thread{
    public void run(){
        System.out.println("Displaying important message task");


        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Message: This is an important message");
                Thread.sleep(2000); // May throw InterruptedException
            }
        } catch (InterruptedException e) { // Handle InterruptedException specifically
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Displaying imporatnt message is ended");
    }
}
public class LaunchMultiThreading5 {
    public static void main(String[] args) {
        Calc c = new Calc();
        Message m = new Message();
        
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(m);

        t1.start();
        t2.start();


        
    }
    
}
