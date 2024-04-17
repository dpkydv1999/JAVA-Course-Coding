import java.util.*;

public class ArrayDeque1 
{
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();

        ad1.add(100);
        ad1.add(200);
        ad1.add(200);

        System.out.println(ad1);

        ad1.addFirst(10);
        ad1.addLast(300);
        ad1.add("java");

        System.out.println(ad1);

        ArrayDeque ad2 = new ArrayDeque();
        ad2.offer(5);
        ad2.offerFirst(3);
        ad2.offerLast(10);

        System.out.println(ad2);
    }
}
