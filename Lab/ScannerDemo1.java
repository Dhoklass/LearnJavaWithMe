import java.util.*;

class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Name");
        String str1 = scn.next();

        System.out.println("Enter PRN");
        int x = scn.nextInt();

        System.out.println("Enter last year percentage");
        float f = scn.nextFloat();

        System.out.println("Entered name is: " + str1);
        System.out.println("Entered PRN is: " + x);
        System.out.println("Entered Percentage is: " + f);

        scn.close();
    }
}