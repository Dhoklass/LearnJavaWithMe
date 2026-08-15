import java.util.Scanner;
class twod_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] twod = new int[2][3];
        twod [0][0] = 101;
        twod [0][1] = 102;
        twod [0][2] = 103;
        twod [1][0] = 201;
        twod [1][1] = 202;
        twod [1][2] = 203;

        System.out.println(twod[0][1]); 
        
        for(int i=0;i<twod.length; i++){
            for(int j=0; j<twod[i].length; j++){
                System.out.print(twod[i][j] + " ");
                //System.out.println(" ");
            }
            System.out.println("\n");
            }

        
        
    }
}