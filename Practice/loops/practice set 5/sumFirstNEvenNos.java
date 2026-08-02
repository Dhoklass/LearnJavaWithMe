import java.util.Scanner;
class sumFirstNEvenNos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many N even nos you want to get sum of: ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i <= n){
            if(i%2 == 0){
            System.out.println("" + i);
            sum += i;
            }
            i++;
        }
        System.out.println("Sum of even nos is: " + sum);
    }
}