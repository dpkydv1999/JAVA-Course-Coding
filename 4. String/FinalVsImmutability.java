//Final vs Immutability in String

public class FinalVsImmutability {
    public static void main(String[] args) {
        final int a = 10;
        //a= 20; compile time error
        System.out.println(a);

        StringBuffer sb = new StringBuffer("virat");
        sb.append("kohli");
        sb = new StringBuffer("sachin");
        System.out.println(sb);

        final StringBuffer sbi = new StringBuffer("virat");
        sbi.append("kohli");
        // sbi = new StringBuffer("sachin"); error
        System.out.println(sbi);

    }
    
}
