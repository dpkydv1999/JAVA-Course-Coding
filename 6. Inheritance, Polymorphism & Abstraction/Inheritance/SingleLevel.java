//Single-Level Inheritance

package Inheritance;
class Animal{

    void display(){
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal{

}

public class SingleLevel {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.display();
    }
    
}
