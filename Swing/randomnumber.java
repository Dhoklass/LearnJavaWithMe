import java.util.*;
class randomnumber{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int i = rand.nextInt(1, 101);
        
        int attempts = 0;
        while (true) { 
        System.out.print("Enter a number to guess the number game!! : ");
        int x = sc.nextInt();
        
        attempts++;
            System.out.println("Attempts left: " + (7 - attempts));
            if(x > i){
                System.out.println("too high!");
            }
            else if(x < i){
                System.out.println("too low!");
            }
            else if(x == i){
                System.out.println("You Guessed it! ");
                break;
            }
            if(attempts == 7){
                System.out.println("You Lost!\n" + "The correct No was: " + i);
                
                return;
            }
            
        }
    }

    
}