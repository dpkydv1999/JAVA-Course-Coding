public class JaggedArray {


    public static void main(String[] args) {

        // int abcd [] = new abcd[3][];
        // abcd[0] = new int[4];
        // abcd[1] = new int[3];
        // abcd[2] = new int[2];

        // abcd[0][0] = 5;
        // abcd[0][1] = 3;

        int abcd [] [] = {
                        {5,3,4,6},
                        {2,1,4},
                        {4,6}

                        };
        for(int i=0;i<=2; i++){

            for(int j=0; j<abcd[i].length; j++){
                    System.out.print(abcd[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
