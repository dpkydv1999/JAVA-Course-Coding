class Student{
    private int age;
    private String name;

    public void setData(){
        age = 20;
        name = "deepak";
    }

    public void show(){
        System.out.println(age + " " +name);
    }
}

public class Demo{
    public static void main(String[] args) {
        Student obj = new Student();
        // obj.age = 15;
        // obj.name = "deepak";

        obj.setData();
        obj.show();
    }
}