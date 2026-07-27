import java.util.Scanner;
class Divisibility{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number to check it's divisibility by 5 and 11: ");
    int num = scan.nextInt();
    if(num % 5 == 0 && num % 11 == 0){
        System.out.println(num + "is divisibe by 5");
    } 

    }
}