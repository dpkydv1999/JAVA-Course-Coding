public class EnhancedFor {

    public static void main(String[] args) {
        
        // int nums[] = {2,4,5,7};

        int abcd [] [] = {
            {5,3,4,6},
            {2,1,4},
            {4,6}

            };

        for(int a[]:abcd){
            for(int b: a){
            System.out.print(b+ " ");
        }
        System.out.println();
        }
    }
    
}
