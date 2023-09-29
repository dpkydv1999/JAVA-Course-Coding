//Anonymous Array

class Calculation{
    public int add(int arr[]){
        int result = 0;
        for(int n:arr){
            result = result +n;
        }
        return result;
    } 
}
public class AnonymousArray {
    public static void main(String[] args) {
        // int nums[] = {5,3,4,7};
        Calculation obj = new Calculation();
       int result = obj.add(new int[] {5,3,4,7});
      
       System.out.println(result);
        
    }   
}
