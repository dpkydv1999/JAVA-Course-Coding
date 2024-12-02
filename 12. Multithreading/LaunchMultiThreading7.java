import java.util.Scanner;

class MyThread1 extends Thread
{
    public void run()
    {
        String name1 = Thread.currentThread().getName();

        if(name1.equals("CALC"))
        {
            calc();
        }
        else{
            importantMessage();
        }
    }

    public void calc()
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

    public void importantMessage()
    {
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

public class LaunchMultiThreading7 
{
    public static void main(String[] args) {
        System.out.println("Main thread");

        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.setName("CALC");
        t2.setName("IMPORTANT");

        t1.start();
        t2.start();
    }
}
