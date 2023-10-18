//Introduction to Inheritance
//Private members of a class will not take part in inheritance
//constructor will also not take part in inheritance but executed by super() which calls constructor of parent class 


class Human //super class or parent class or base class
{
    private String name;

    Human()
    {
        System.out.println("Human class constructor");
    }
    int age;
    void sleep(){
        age=15;
        System.out.println("Human needs good sleep.");
        System.out.println(age);
    }

}
class Student extends Human // subclass or child class or derived class
{
    // public Student() //default constructor
    // {
         //super(); //calls constructor in parent class
    // }
    void display(){

        System.out.println("The age is: " +age);
        //System.out.println("The name is: " +name);

    }

}
public class Inheritance1{
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
        st.display();
    }
}