interface Computer
{
    void compileCode();
    
}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 10 errors");
    }
}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 10 errors, faster");
    }
}
class Developer{
    
    public void buildApp(Computer obj)
    {
        System.out.println("Building App");
        
        obj.compileCode();
    }
}
public class MoreInterface {
    public static void main(String[] args) {
        // Laptop lp = new Laptop();
        Computer obj = new Desktop();
        Developer dev = new Developer();
        dev.buildApp(obj);
        
    }
}
