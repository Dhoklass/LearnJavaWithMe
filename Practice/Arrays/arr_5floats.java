import java.util.Scanner;
class arr_5floats{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create an array of 5 floats and calculate their sum
        int [] arr1 = new int[5];
        int total = 0;
        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter no to insert in position " + i + ": ");
            arr1[i] = sc.nextInt();
            total += arr1[i];
        }

        
        for(int i=0;i<arr1.length;i++){
            System.out.println("no at position " + i + " is " + arr1[i]);
        }   

        System.out.println("\nSum of the array is: " + total);
    }
}