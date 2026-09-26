// Write a program that asks the user for two numbers and divides them.
// Catch the case where the user enters 0 as the second number, printing "Cannot divide by zero".

import java.util.Scanner;

class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number x: ");
        double x = sc.nextDouble();

        System.out.println("Enter number y: ");
        double y = sc.nextDouble();

        try {
            if(y == 0){
                throw new ArithmeticException("Cannot divide by zero"); 
            }
            System.out.println(x + " Divided by " + y + " is " + x/y);
            
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
            //System.out.println(e);
            //System.out.println(e.getMessage()); 
        } finally{
            System.out.println("Thank you for using the calculator! ");
        }
    }
}