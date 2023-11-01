class Book{
    private int a;
    private int b;

    // Default constructor which is zero parameterized
    // public Book(){

    // }
    public Book(){
        System.out.println("Zero parameterized constructor by programmer");
    }

    public Book(int a , int b){
        this.a = a;
        this.b = b;
    }

    void disp(){
        System.out.println(a);
        System.out.println(b);
    }

}



public class MoreOnConstructor {
    public static void main(String[] args) {
        Book d = new Book(); //Constructor called

        Book d2 = new Book(10, 20);
        d2.disp();
    }
}
