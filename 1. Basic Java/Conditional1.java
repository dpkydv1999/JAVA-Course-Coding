public class Conditional1 {

    public static void main(String[] args){

        // int age=18;
        // if(age>=18){
        //     System.out.println("Legal Adult");
        // }
        // else{
        //     System.out.println("Kid");
        // }

            // int age=18;
            // if(age>=18 && age<60){
            //     System.out.println("Adult");
            // }
            // else if(age>60){
            //     System.out.println("Old");
            // }
            // else{
            //     System.out.println("Kid");
            // }

            int age=17;
            if(age>=18 && age<60){
                if(age>20 && age<30){
                    System.out.println("In 20's");
                }
                else if(age>30 && age<40){
                    System.out.println("In 30's");
                }
                else{
                    System.out.println("Teen");
                }
            }
            else if(age>60){
                System.out.println("old");
            }
            else if(age>16 && age<18){
                System.out.println("Teenager");
            }
            else{
                System.out.println("kid");
            }
    }
    
}
