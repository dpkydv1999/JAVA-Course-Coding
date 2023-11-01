public class IncrementationAndDecrementation{

    public static void main(String[] args){
        int a=5;
        int b;
        // a++;
        // System.out.println(a);

        // a--;
        
        // b=a++ + ++a + --a;
        b= a++ + ++a + ++a + a++ + --a + a--;
    
        System.out.println(a);
      

      
        System.out.println(b);
    }
}