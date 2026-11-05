import java.util.Scanner;
class practice02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

        System.out.println("Enter the index of array: ");
        int number = sc.nextInt();

        System.out.println("Enter the number you want to divide the value of array by: ");
        int number2 = sc.nextInt();

        try{
            System.out.println(marks[number]/number2);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Occured!\n" + e);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException!\n" + e);
        }
    }
}