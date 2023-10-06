class Book1{
    private String name;
    private int page;

    public Book1(){
        System.out.println("Default constructor is called. ");
        name = "Deepak";
        page = 100;
    }
    public Book1(String name){
        this.name = name;
        page = 300;
    }
    public Book1(String name, int page){
        this.name = name;
        this.page = page;
    }

    public void disp(){
        System.out.println(name);
        System.out.println(page);
    }



}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Book1 b1 = new Book1(); 
        b1.disp();

        Book1 b2 = new Book1("Rahul");
        b2.disp();

        Book1 b3 = new Book1("Rohit", 400);
        b3.disp();

    }
}
