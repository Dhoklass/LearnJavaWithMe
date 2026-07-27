import java.util.Scanner;
class ProfitLoss{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Selling Price: ");
        double SP = scan.nextDouble();

        System.out.println("Enter Cost Price: ");
        double CP = scan.nextDouble();

        if(SP > CP){
        double profit = SP - CP;
        double profitPercent = ((profit/CP) * 100);
        System.out.println("Profit: " + profit);
        System.out.printf("Profit %%: %.2f %%", profitPercent);
        }
        
        else{
        double loss = CP - SP;
        double lossPercent = ((loss/CP) * 100);
        System.out.println("Loss: " + loss);
        System.out.printf("Loss %%: %.2f %% ", lossPercent);
        }
        
    }
}