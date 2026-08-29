/*
Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following methods:
1. Constructor to generate the random number
2. takeUserInput() to take a user input of number
3. isCorrectNumber() to detect whether the number entered by the user is true
4. getter and setter for noofGuesses
Use properties such as noofGuesses(int), etc to get this task done!
*/



import java.util.Random;
import java.util.Scanner;

//OOP approach -

class game{
    int userInput;
    int randomNumber;
    int noofGuesses;

    Scanner sc = new Scanner(System.in);

    public game(){
        Random rand = new Random();
        randomNumber = rand.nextInt(100);

    }

    public void setUserInput(){
        int x = sc.nextInt();
        userInput = x;    
    }

    public int getUserInput(){
        return userInput;
    }

    public void correctNo(){
        System.out.println("---------------------------------------");
        System.out.println("---------- Guess The Number -----------");
        System.out.println("---------------------------------------\n");
        System.out.println("\nRules: \n1.Person with less score wins!\n2.less score means less no of guesses!\n");
        while (true) { 
        System.out.println("Enter a number to guess: ");
        setUserInput();

        if(userInput == randomNumber){
            System.out.println("You got it!");
            noofGuesses += 1;
            System.out.println("Score: " + noofGuesses);
            break; 
            
        }

        else if(userInput < randomNumber){
            System.out.println("up!");
            noofGuesses += 1;
        }

        else{
            System.out.println("down!");
            noofGuesses += 1;
        }
        }

    }
}

class guessTheNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        //normal approach -

        //Random rand = new Random();
        //int randomNumber = rand.nextInt(100);

        // while (true) { 
        // System.out.println("Enter a number to guess: ");
        // int x = sc.nextInt();


        // if(x == randomNumber){
        //     System.out.println("you got it!");
        //     break;
        // }
        // else if(x < randomNumber){
        //     System.out.println("up!");
        // }
        // else{
        //     System.out.println("down!");
        // }
            
        // }
        
        game g1 = new game();
        g1.correctNo();




    }
}