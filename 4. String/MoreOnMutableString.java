//About StringBuffer / StringBuilder and its capacity 
//Also about some of inbuilt methods of String

public class MoreOnMutableString{
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer(); 
        // System.out.println(sb.capacity()); // capacity is 16 here since characters are not added initially
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());
        // sb.append("a");
        //new capacity = (current capacity + 1)*2
        // System.out.println(sb.capacity()); // how many characters you can add 
        // System.out.println(sb.length()); // how many characters present

        // StringBuffer sb2 = new StringBuffer("Deepak"); 
        // System.out.println(sb2.capacity()); //capacity is 22 since characters are added initially
        //capacity = default initial capacity(16) + add no. of characters

        // System.out.println(sb2.charAt(1));
        // sb2.setCharAt(1, 'E');
        // System.out.println(sb2); //DEepak

        StringBuilder sb3 = new StringBuilder(150); // number gives capacity of String 
        System.out.println(sb3.capacity()); 
        sb3.append("java");
        System.out.println(sb3);
        sb3.trimToSize(); // reduces the capacity of string to actual initialized number of characters
        System.out.println(sb3.capacity());

        StringBuffer sb4 = new StringBuffer("DEEPAK");
        sb4.reverse();
        System.out.println(sb4);


    }
}