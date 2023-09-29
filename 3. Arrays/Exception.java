//ArrayIndexOutOfBoundsException

public class Exception{
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        // System.out.println(a[1]);
        // System.out.println("Bye");

        // System.out.println(a[4]); 
        // Program execution stops here, not other statements will be executed hereafter
        // System.out.println("bye");

        //How to avoid Exception?
        // 1. System.out.println(a.length-1);

        // 2. Make habit of starting i=0 and i<4 
        // for(int i=0; i<4; i++){
        //     System.out.println(a[i]);
        //  }

        //3. Use of enhanced for loops
        for(int n: a){
            System.out.println(n);
        }


    }
}