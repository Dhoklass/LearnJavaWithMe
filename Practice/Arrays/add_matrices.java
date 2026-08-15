import java.util.Scanner;

class add_matrices{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows to insert in matrix 1: ");
        int x = sc.nextInt();
        System.out.println("Enter no of columns to insert in matrix 1: ");
        int y = sc.nextInt();

        System.out.println("Enter no of rows to insert in matrix 2: ");
        int a = sc.nextInt();
        System.out.println("Enter no of columns to insert in matrix 2: ");
        int b = sc.nextInt();

        System.out.println("\nEnter values for matrix 1: \n");
        int[][] arr1 = new int[x][y];

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.printf("Enter value for [%d] [%d]:\n",i,j);
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter values for matrix 2: \n");
        int[][] arr2 = new int[a][b];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.printf("Enter value for [%d] [%d]:\n",i,j);
                arr2[i][j] = sc.nextInt();
            }
        }         
        
        System.out.println("matrix 1: ");
        for(int i = 0; i< x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("matrix 2: ");
        for(int i = 0; i< a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        if(x == a && y == b){
            int[][] arr3 = new int[a][b];
            for (int i = 0; i < a; i ++) {
                for(int j = 0; j < b;j++){
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                                    }
            }

            System.out.println("\nAddition of matrix 1 and matrix 2 is: \n");
            for(int i = 0; i< a; i++){
                for(int j = 0; j < b; j++){
                System.out.print(arr3[i][j] + " ");

            }
            System.out.print("\n");
        }

    }
        
        else{
            System.out.println("\nmatrix A and matrix B cannot be added.\nThe dimensions must be the same!\n");

        }   
    }
}