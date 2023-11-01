
abstract class AeroPlane3
{
    abstract public void takeOff();
    
    abstract public void fly();

    public void landing(){
        System.out.println("Aeroplane is landing");
    }
    
}
class CargoPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }
   public void landing1(){
    System.out.println("cargoplane is landing");
   }  
}
class PassengerPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
}
// class FighterPlane3 extends AeroPlane3{
//     public void takeOff()
//     {
//         System.out.println("PassengerPlane requires small size runway");
//     }
//     public void fly()
//     {
//     System.out.println("PassengerPlane flies at heigh height");
//     }
// }
public class LaunchAbs {
    public static void main(String[] args) {
        AeroPlane3 ref = new CargoPlane3();
        ref.takeOff();
        ref.fly();
        ref.landing();
        ((CargoPlane3) ref).landing1(); //down-casting

        // CargoPlane3 cargo = new CargoPlane3();
        // cargo.landing1();

        AeroPlane3 ref2 = new PassengerPlane3();
        ref2.takeOff();
        ref2.fly();
        ref2.landing();
        

        
    }
}
