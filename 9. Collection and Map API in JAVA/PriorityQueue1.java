import java.util.*;

public class PriorityQueue1 
{
    public static void main(String[] args) 
    {
        PriorityQueue pq = new PriorityQueue();
        
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);

        pq.add(25);

        //pq.add("java"); mixed data are not allowed

        System.out.println(pq);
    }
}
