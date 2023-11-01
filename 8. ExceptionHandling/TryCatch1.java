//About Exception and how to handle it by using try and catch block  
public class TryCatch1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        int result =0;

        try
        {
            result = num1/num2;
            System.out.println("in try block");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Something went wrong.." +e);
        }
        System.out.println(result);
        System.out.println("bye");
    }
}
