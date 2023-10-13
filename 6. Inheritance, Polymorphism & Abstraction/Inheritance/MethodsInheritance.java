//Types of Methods in Inheritance
package Inheritance;

class AeroPlane
{
    void takeOff()
    {
        System.out.println("AeroPlane is taking off.");
    }
    //Overridden Method
    void fly()
    {
        System.out.println("AeroPlane is flying.");
    }
}
class CargoPlane extends AeroPlane
{
    //Overridding Method
    void fly()
    {
        System.out.println("CargoPlane flies at lower heights.");
    }
    //specialized method
    void cargoGoods()
    {
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends AeroPlane
{
    void fly()
    {
        System.out.println("PassengerPlane flies at medium heights.");
    }
    //specialized method
    void carryPassenger()
    {
        System.out.println("PassengerPlane carries passengers.");
    }

}
public class MethodsInheritance {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
    }
}
