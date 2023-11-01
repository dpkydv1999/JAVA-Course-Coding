//try and catch block for multiple exception
public class TryCatch2 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        int values[] = {1,2,4,5};
        String name = null;

        try
        {
            System.out.println("in try block");
            result = num1/name.length();
            
            System.out.println(values[7]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero" +e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in your limits" +e);
        }
        catch(NullPointerException e)
        {
            System.out.println("String Exception" +e);
        }
        catch(Exception e)
        {
            System.out.println("something went wrong"+e);
        }
        System.out.println(result);
        System.out.println("bye");
    }
    
}
