class Calc{

    public int add(int n1,int n2)
    {
        int result= n1+n2;
        return result;
    }
    public int add(int n1, int n2, int n3){
        int res = n1+n2+n3;
        return res;
    }
    public double add(double n1, double n2){
        double res1 = n1+n2;
        return res1;
    }
    public int add(int[] nums) {
        return 0;
    }

}

public class MethodOverloading1 {

    public static void main(String[]args){

        Calc obj = new Calc();
        int result = obj.add(4, 5);
        int res = obj.add(4,6,3);
        double res1 =  obj.add(2.5,3.5);
        System.out.println(result);
        System.out.println(res);
        System.out.println(res1);

    }
    
}
