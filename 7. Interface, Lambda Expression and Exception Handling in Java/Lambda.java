@FunctionalInterface
interface Car
{
    void driver(int avg, int ts);
}
public class Lambda {
    public static void main(String[] args) 
    {
        Car obj  = (int avg, int ts) ->System.out.println("Driving " +avg + ":" +ts);
        obj.driver(15, 18);
        
    }
}
