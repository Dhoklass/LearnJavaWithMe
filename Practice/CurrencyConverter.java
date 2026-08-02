import java.util.Scanner;
public class CurrencyConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 coin  = 0.0045 USD, please enter your coins to calculate the money!");
        double coin = sc.nextDouble();
        double usd = 0.0045;
        double money  = usd * coin;
        
        System.out.printf("Your %.0f coins are equal to %.2f USD", coin, money);

        
    } 
}