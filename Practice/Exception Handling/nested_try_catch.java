import java.util.Scanner;

class nested_try_catch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {10,20,30,40};
        System.out.println("Enter index of the marks you wanna choose: ");
        int m = sc.nextInt();
        System.out.println("Enter the no with which to divide: ");
        int n = sc.nextInt();
        
        try {
            try {
                System.out.println(marks[m] + " divide by " + n + " is: " + marks[m]/n);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException Occured!");
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occured!");
        }

        System.out.println("Thanks for using this program!");

    }
}