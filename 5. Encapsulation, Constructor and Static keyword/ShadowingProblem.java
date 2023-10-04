//Shadowing Problem
//this keyword
class Student2{
    private int age; //instance variable
    private String name;

    public void setData1(int age) //local variable
    {
        this.age = age; // Shadowing problem solved by using this keyword which always point to current object
        
    }
    public void setData2(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(age + " " +name);
    }

}
public class ShadowingProblem {
    public static void main(String[] args) {
        Student2 obj = new Student2();
        Student2 obj1 = new Student2();

        obj.setData1(20);
        obj1.setData1(18);
        obj.setData2("Deepak");
        obj1.setData2("ydv");
        // obj1.setData2();
        obj.show();
        obj1.show();

    }

    
}
