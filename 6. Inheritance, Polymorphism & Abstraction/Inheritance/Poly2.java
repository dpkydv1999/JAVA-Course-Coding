class AeroPlane3
{
    public void takeOff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
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
class FighterPlane3 extends AeroPlane3{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires small size runway");
    }
    public void fly()
    {
    System.out.println("PassengerPlane flies at heigh height");
    }
}
class Airport
{
    public void polymorph(AeroPlane3 ref)
    {
        ref.takeOff();
        ref.fly();
        System.out.println(".........");
    }
   
}
public class Poly2{
    public static void main(String[] args) {
        CargoPlane3 cp = new CargoPlane3();
        
        PassengerPlane3 pp = new PassengerPlane3();

        FighterPlane3 fp = new FighterPlane3();

        // cp.takeOff();
        // cp.fly();

        // pp.takeOff();
        // pp.fly();

        // fp.takeOff();
        // fp.fly();

        Airport a= new Airport();
        a.polymorph(cp);
        a.polymorph(pp);
        a.polymorph(fp);

    }
    
}
