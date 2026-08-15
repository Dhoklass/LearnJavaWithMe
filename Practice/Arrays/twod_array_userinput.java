import java.util.Scanner;
class twod_array_userinput{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows to insert in matrix: ");
        int x = sc.nextInt();
        System.out.println("Enter no of columns to insert in matrix: ");
        int y = sc.nextInt();

        int[][] arr = new int[x][y];

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.printf("Enter value for [%d] [%d]:\n",i,j);
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i< x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}