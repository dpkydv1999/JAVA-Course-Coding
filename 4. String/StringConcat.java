public class StringConcat {
    public static void main(String[] args) {
        // String s1 = new String("PW");
        
        // s1 = s1.concat("skill");
        // System.out.println(s1);

        // String s1 = "PWJAVA";
        // String s2 = s1.concat("skill");

        // String s3 = new String("PW");
        // s3 = s3.concat("skill");

        String s1 = "PW";
        String s2 = "PW" + "JAVA";
        String s3 = "PW" + "JAVA" + "BLR";
        String s4 = s1+s2;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //we can concatenate string with numbers using + operator
        String str = "pw" + 100 + 99;
        System.out.println(str);

        //we cannot concatenate string with numbers using concat method
        // str.concat(99);

    }
    
}
