interface Car
{
    void driver();
}

public class AnnoymousInnerClass
{
    public static void main(String[] args) 
    {
        Car obj  = new Car() 
        {
            public void driver()
            {
                System.out.println("Driving");
            }
        };
        obj.driver();
        
    }
}