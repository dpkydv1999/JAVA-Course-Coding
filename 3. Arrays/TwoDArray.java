public class TwoDArray {

  public static void main(String[] args) {
  //  int nums [] [] = new int[3][2];
    // nums[0][0] = 5;
    // nums[0][1] = 3;
    // nums[1][0] = 2;
    // nums[1][1] = 1;
    // nums[2][0] = 4;
    // nums[2][1] = 6;

    int nums [] [] = {
                      {5,3},
                      {2,1},
                      {4,6}

                      };


   for(int i=0; i<=2; i++){

    for(int j=0; j<=1; j++){
        System.out.print(nums[i][j] + " ");
    }
    
    System.out.println();
   }
  }
}
