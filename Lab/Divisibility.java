import java.util.Scanner;
class Divisibility{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number to check it's divisibility by 5 and 11: ");
    int num = scan.nextInt();

    if(num % 5 == 0 && num % 11 == 0){
        System.out.println(num + " is divisibe by 5 and 11");
    } 

    else if (num % 5 == 0 && num % 11 != 0){
        System.out.println(num + " is divisble by 5 but not by 11");
    }

    else if(num % 11 == 0 && num % 5 != 0){
        System.out.println(num + " is divisible by 11 but not 5");
    }
    
    else{
        System.out.println(num + " is not divisible by 5 and 11");

    }

    }
}