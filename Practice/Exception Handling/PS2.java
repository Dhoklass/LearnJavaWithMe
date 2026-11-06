// Write a program that allows you to keep accessing an array until a valid index is given,
// if max retries exceed 5, print "error".
import java.util.Scanner;
class PS2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {12,14,8,7,15};
        
        int limit = 5;
        while (true) { 
            try {
                System.out.println("Enter your choice: ");
                int n = sc.nextInt();
                System.out.println("Marks at given index are: " + marks[n]);
                break;
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index not found in array!");
            }
            limit--;
            if(limit <= 0){
                System.out.println("Error! Wrong input given 5 times, code is locked. ");
                return;
            }   
        }
    }
}