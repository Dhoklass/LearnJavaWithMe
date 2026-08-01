import java.util.Scanner;
class taxSlab{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income per annum: ");
        double income = sc.nextDouble();
        double tax;

        if (income <= 0){
            System.out.println("Invalid income!");
        }

        if(income <= 250000){
            System.out.println("Congratulations! no tax for you!");
        }

        else if(income >= 250000 && income <= 500000){
            tax = income * 0.05;
            System.out.printf("You pay %.2f tax to the government!", tax);
        }

        else if(income >= 500000 && income <= 1000000){
            tax = income * 0.2;
            System.out.printf("You pay %.2f tax to the government!", tax);
        }

        else{
            tax = income * 0.3;
            System.out.printf("You pay %.2f tax to the government!", tax);
        }
        
    }
}