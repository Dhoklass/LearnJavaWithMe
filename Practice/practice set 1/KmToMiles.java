import java.util.Scanner;
class KmToMiles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Km to convert to miles");
        double km = sc.nextDouble();
        double miles = km * 0.62;
        System.out.printf("%.2f km converted to miles is : %.2f miles",km, miles);
    }
}