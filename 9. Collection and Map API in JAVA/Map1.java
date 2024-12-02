import java.util.*;

public class Map1 
{
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        HashMap<String, Integer> map = new HashMap<>();

        hm.put(null, "virat");
        hm.put(02, "Rohan");
        hm.put(03,"deepak");

        System.out.println(hm);

        HashMap hm1 = new HashMap();
        hm1.put(null, "virat");
        hm1.put(02, "Rohan");
        hm1.put(03,"deepak");

        System.out.println(hm1);

        // Hashtable ht = new Hashtable();
        // LinkedHashMap lhm = new LinkedHashMap();
        // TreeMap tm = new TreeMap();
        
        
    }
}
