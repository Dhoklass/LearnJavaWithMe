import java.util.Scanner;
class Comparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int givenNum = 10;

        if(num > givenNum){
            System.out.println("user entered number " + num + " is greater than given number " + givenNum);
        }
                        
        else{
            System.out.println(num + " is smaller than " + givenNum);
        }
    }
}