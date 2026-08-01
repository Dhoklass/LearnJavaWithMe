import java.util.Random;
import java.util.Scanner;

class rockpaperscissor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a choice - 0. Rock, 1. Paper, 2. Scissor");
        int game = sc.nextInt();

        Random random = new Random();
        int num = random.nextInt(2);

        if(game == num){
            System.out.println("It's a tie!");
        }

        else if(game == 0 && num == 1){
            System.out.println("Computer beats user! \n Paper beats Rock!");

        }

        else if(game == 0 && num == 2){
            System.out.println("User beats Computer! \n Rock beats Scissor!");

        }

        else if(game == 1 && num == 0){
            System.out.println("User beats Computer! \n Paper beats rock!");

        }

        else if(game == 1 && num == 2){
            System.out.println("Computer beats User! \n Scissor CUTS Paper!");

        }

        else if(game == 2 && num == 0){
        System.out.println("Computer beats User! \n Rock BREAKS Scissor!");

        }

        else if(game == 2 && num == 1){
            System.out.println("User beats Computer! \n Scissor CUTS Paper");

        }        
    }
}