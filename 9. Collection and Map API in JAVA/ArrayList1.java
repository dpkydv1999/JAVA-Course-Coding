import java.util.*;

public class ArrayList1
{
    public static void main(String[] args) 
    {
        ArrayList al1 = new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1);

        ArrayList al2 = new ArrayList();

        al2.add("deepak");
        al2.add(1);
        al2.add("java");

        System.out.println(al2);

        al2.addAll(al1);
        System.out.println(al2);

        al2.add(1, "yadav");
        System.out.println(al2);
        
    }
}
