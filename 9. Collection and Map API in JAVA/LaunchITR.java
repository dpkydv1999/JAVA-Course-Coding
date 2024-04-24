import java.util.*;
public class LaunchITR 
{
   
    public static void main(String[] args) 
    {
        ArrayList arr = new ArrayList();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr);

        // //for loop
        // for(int i=0;i<arr.size();i++)
        // {
        //     System.out.println(arr.get(i));
            
        // }

        // //for each loop
        // for(Object o:arr)
        // {
        //     System.out.println(o);
        // }

       Iterator itr=arr.iterator();
       while (itr.hasNext()) 
       {
        // Integer i =(Integer) itr.next();
        System.out.println(itr.next());
       }

       //Backward direction using  ListIterator
       ListIterator litr = arr.listIterator(arr.size());
       while (litr.hasPrevious()) 
       {
        System.out.println(litr.previous());
       }

    }
}
