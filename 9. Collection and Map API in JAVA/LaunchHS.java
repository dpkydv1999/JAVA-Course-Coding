
import java.util.*;
public class LaunchHS 
{
    public static void main(String[] args) 
    {
        HashSet hs = new HashSet();

        hs.add(25);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        
        //Duplicates are not allowed,if we try to add it would not throw any error rather it would return false
        // hs.add(50);


        System.out.println(hs);

        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add(25);
        hs1.add(30);
        hs1.add(40);
        hs1.add(50);

        System.out.println(hs1); //order of insertion is preserved
    }
}
