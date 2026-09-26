import java.util.Scanner;

class NFE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age but in string: ");
        String x = sc.next();

        try {
                System.out.println("Your age is: " + Integer.parseInt(x));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered!");
            System.out.println(e.getMessage());

        }
        
    }
}