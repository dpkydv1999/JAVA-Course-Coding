//Inbuilt Methods in String Class

public class InbuiltMethods {
    public static void main(String[] args) {
        String str = "PW Skill JAVA";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        int length = str.length();
        System.out.println(length);
        System.out.println(str.substring(3));
        System.out.println(str.substring(1, 5));

        System.out.println(str.indexOf("k"));
        System.out.println(str.indexOf("A"));
        System.out.println(str.lastIndexOf("A"));
    }
    
}
