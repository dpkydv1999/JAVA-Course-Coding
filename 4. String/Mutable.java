public class Mutable {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("deepak");
        System.out.println(sb);

        //StringBuffer sb = " "; Invalid
        sb.append("yadav");
        System.out.println(sb); 



    }
    
}
