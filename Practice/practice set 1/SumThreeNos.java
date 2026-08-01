import java.util.Scanner;
class SumThreeNos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no's to get their sum: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.printf("Sum of %d,5 %d and %d is: %d", a, b, c, sum);        
    }
}