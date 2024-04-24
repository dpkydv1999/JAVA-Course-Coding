import java.util.*;

public class LaunchTS 
{
    public static void main(String[] args) 
    {
        TreeSet ts = new TreeSet();

        ts.add(25);
        ts.add(5);
        ts.add(3);
        ts.add(200);
        ts.add(67);

        System.out.println(ts);

        // ts.add(25); 
        // System.out.println(ts); //duplicates are not valid
        
        System.out.println(ts.higher(25));

        System.out.println(ts.lower(25));

        System.out.println(ts.ceiling(25));
        System.out.println(ts.floor(25));


        
    }
}
