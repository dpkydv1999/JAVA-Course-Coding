

class Animal
{
    Animal()
    {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal
{
    Dog()
    {
        System.out.println("Dog is created");
    }
}

public class LaunchAnimal
{
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
