//Multiple Inheritance
//Java does not allow Multiple Inheritance
package Inheritance;

class Parent1 //extends Object
{
    int age=19;
}
class Parent2 //extends Object
{
    int age = 50;
}
//Multiple Inheritance is not allowed in Java
class Child extends Parent1 //, Parent2
{

}

public class Multiple{
    public static void main(String[] args) {
        
    }
}