import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class LaunchMultithreading1 
{
    public static void main(String[] args) {
        System.out.println("Calculation task started:");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number ");
        int num2 = sc.nextInt();

        int res = num1+num2;
        System.out.println("Result of addition is: "+res);

        System.out.println("Calculation task is ended");

        System.out.println("************************************************************");

        System.out.println("Printing task * started");
        for(int i=0;i<4;i++){
            System.out.println("*");
        }
        System.out.println("Printing task * ended");

        System.out.println("**************************************************");

        System.out.println("Displaying important message");
        for(int i=0;i<5;i++)
        {
            System.out.println("This is an important message");
    
        }

        System.out.println("Displaying important ended");

    }
}
