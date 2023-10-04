//Private Members
//Shadowing Problem
class School{
    private int age; //instance variable
    private String name;

    public void setData1(int age) //local variable
    {
        age = age; // Shadowing problem
        
    }
    public void setData2(){
        name = "dpk";
    }

    public void show(){
        System.out.println(age + " " +name);
    }

}
public class PrivateMember {
    public static void main(String[] args) {
        School obj = new School();
        School obj1 = new School();

        obj.setData1(20);
        obj1.setData1(18);
        // obj1.setData2();
        obj.show();
        obj1.show();

    }
    
}
