/*
Practice Question: Bank Account Management System
Difficulty: Intermediate
 Exception Handling

Problem statement
Create a Java program for a simple Bank Account Management System.

A customer has an initial bank balance of ₹5,000 and wants to withdraw money.

Your program should validate the withdrawal amount and handle different exceptions.
Requirements
1. Create a custom exception

Create a custom exception named:

InsufficientBalanceException
- It should extend the Exception class.
- It should accept a String message through its constructor.
- Use super() to pass the message to the parent class.
2. Create a BankAccount class

Create a class named BankAccount with:
- An integer variable balance = 5000.
- A method named withdraw(int amount).
Inside the withdraw method:
- If the withdrawal amount is less than or equal to 0, throw an IllegalArgumentException.
- If the withdrawal amount is greater than the available balance, throw your custom InsufficientBalanceException.
- Otherwise, deduct the amount from the balance and display the remaining balance.
3. Implement throws

Your withdraw() method must declare the custom exception using the throws keyword.

4. Implement throw

Use the throw keyword to explicitly throw exceptions when the conditions are violated.

5. Implement nested try-catch

In your main() method:
- Create an outer try-catch block to handle InsufficientBalanceException.
- Inside the outer try block, create another (nested) try-catch block to handle IllegalArgumentException.
- Make sure the program continues after the inner exception is handled.
*/

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
    
    // @Override
    // public String toString(){
    //     return "Insufficient Balance!";
    // }

    // @Override
    // public String getMessage(){
    //     return "Insufficient Balance!";
    // }
}

class BankAccount{
    int Balance = 5000;
    
    int withdraw(int amount) throws IllegalArgumentException, InsufficientBalanceException{
        if(amount <= 0){
            throw new IllegalArgumentException();
        }

        if(amount > Balance){
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        int c = Balance -= amount;
        return c;
    }
}

class BankAccountManagementSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to withdraw: ");
        int amt = sc.nextInt();

        BankAccount b1 = new BankAccount();
        try {
            //b1.withdraw(amt);
            try{
                b1.withdraw(amt);
                System.out.println("Withdrawal Successful! \nRemaining Balance: " + (b1.Balance));
            }
            catch(IllegalArgumentException e){
                System.out.println("Amount cannot be 0 or less than 0!");

            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        
    }
}