//Constructor 

class Student4{
    private int age;
    private String name;

    Student4(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
}



public class Constructor {
    public static void main(String[] args) {
        Student4 s = new Student4(24, "deepak");
        System.out.println("Student's age: " + s.getAge());
        System.out.println("Student's name: " + s.getName());
    }
    

}


