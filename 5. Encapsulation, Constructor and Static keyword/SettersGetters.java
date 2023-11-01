//Setters and Getters in Java

class Student3{
    private int age; //instance variable
    private String name;


    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

}

public class SettersGetters {
    public static void main(String[] args) {
        Student3 obj = new Student3();
        Student3 obj1 = new Student3();

        obj.setAge(20);
        obj.setName("Deepak");
        obj1.setAge(25);
        obj1.setName("ydv");
    
        int stud1Age = obj.getAge();
        stud1Age = obj1.getAge();
        System.out.println(stud1Age);
        System.out.println();

    }
    
}
