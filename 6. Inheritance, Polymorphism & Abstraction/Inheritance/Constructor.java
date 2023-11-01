

class Deep1{
    int a,b;
    public Deep1(){
        System.out.println("Parent");
    }
    public Deep1(int x, int y){
        System.out.println("Parameterized Parent ");
        a=x;
        b=y;
    }
}
class Deep2 extends Deep1
{
    int m,n;
   public Deep2(){
    this(10,20);
    System.out.println("child");
   } 
   public Deep2(int x, int y){
    System.out.println("Parameterized Child");
    m=x;
    n=y;
   }
}


public class Constructor {
    public static void main(String[] args) {
        Deep2 n = new Deep2();

        // Deep2 n1 = new Deep2(10,18); 
        
    }
    
}
