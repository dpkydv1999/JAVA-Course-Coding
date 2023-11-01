public class StringComparison {
    public static void main(String[] args) {
        // String s1 = "DEEPAK";
        // String s2 = new String("DEEPAK");

        // "==" operator compares the reference of the object
        // "equals()" operator compares the contents of two objects
        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));

        // String s1 = "DEEPAK";
        // String s2 = "DEEPAK";
        // String s3 = "deepak";
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));

        String s1 = "ktm";
        String s2 = new String("Ktm");
        String s3 = new String ("ktm");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s3.equals(s1));
    }
    
}
