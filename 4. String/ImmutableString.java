

public class ImmutableString {
    public static void main(String[] args) {
        //ways to create String
        //1.
        String name = "Deepak";
        System.out.println(name);

        //2.
        String car = new String("Ferrari");
        System.out.println(car);

        //3.
        char ch[] = {'P', 'W'};
        String type = new String(ch);
        System.out.println(type);

        //stored in String Constant Pool
        //Here s1 and s2 are pointing to same "PW" since duplicate is not allowed in String Constant Pool 
        String s1 = "PW";
        String s2 = "PW";
        System.out.println(s1==s2);

        //Stored in heap area
        //s3 and s4 are pointing to two different String objects "PWSKILL" and "PWSKILL" respectively since duplicate is allowed in heap area(outside SCP) 
        String s3 = new String("PWSKILL");
        String s4 = new String ("PWSKILL");
        System.out.println(s3==s4);
    }
    
}
