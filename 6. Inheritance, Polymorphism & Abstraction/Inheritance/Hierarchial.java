//Hierarchial Inheritance



class Animal{
    void display(){
        System.out.println("Animal need good sleep");
    }
}
class Tiger extends Animal
{

}
class Monkey extends Animal
{

}
class Donkey extends Animal
{

}
public class Hierarchial{
    public static void main(String[] args) {
        Donkey d = new Donkey();
        d.display();
    }
}
