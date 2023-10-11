package Inheritance;

class Human //super class or parent class or base class
{
    int age;
    void sleep(){
        age=15;
        System.out.println("Human needs good sleep.");
        System.out.println(age);
    }

}
class Student extends Human // subclass or child class or derived class
{

}
public class Inheritance1{
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
    }
}