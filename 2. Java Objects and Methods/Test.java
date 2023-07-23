public class Test{
    int a = 50;
    String name = "Deepak";
    public static void main(String[] args) {
        //declare the variable 
        //create the object
        
        int num=10; //primitive variable
        Test obj1 = new Test(); //Reference variable  
        Test obj2 = new Test();

        obj1.name="N";

        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);


    }
}