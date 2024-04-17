public class ExceptionHandling {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;

        try
        {
            System.out.println("in try block");
            result = num1/num2;
            
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong .." +e);
        }
        System.out.println(result);
        System.out.println("bye");
    }
}
