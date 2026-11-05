/*
Java Practice Exercise: Inventory Management System
Beginner–Intermediate
 Exception Handling + Loops


Build a small Inventory Management System in Java that allows a user to purchase products while handling invalid inputs and insufficient stock.
1. Requirements
Create three classes in one Java file:

1. InsufficientStockException
- Create a custom checked exception by extending Exception.
- Display the message: "Not enough stock available!".
2. Product
- Create these instance variables:
  - productName
  - stockQuantity
  - price
- Create a method:
  purchase(int quantity)
- Throw IllegalArgumentException if quantity is zero or negative.
- Throw InsufficientStockException if requested quantity exceeds available stock.
- Otherwise, reduce the stock and display the remaining quantity.
3. InventoryManagementSystem
- Create a Product object:
  - Product: Laptop
  - Stock: 10
  - Price: ₹50,000
- Display a menu inside a while loop:
  1. Purchase product
  2. Check available stock
  3. Exit
- Handle exceptions using nested try-catch blocks.
2. Test cases
User input	Expected result
Purchase -2	Invalid quantity
Purchase 0	Invalid quantity
Purchase 15	Insufficient stock
Purchase 4	Purchase successful; stock = 6
Check stock	Displays 6
Purchase 6	Purchase successful; stock = 0
Purchase 1	Insufficient stock

3. Concepts you must practise
- Custom checked exceptions (extends Exception)
- throw vs throws
- Unchecked exceptions (IllegalArgumentException)
- Nested try-catch
- Exception propagation
- while loops and switch statements
- Updating object instance variables
4. Bonus challenges
Once the basic program works:
1. Calculate and display the total purchase amount.
2. Handle invalid menu choices.
3. Ask the user whether they want to continue purchasing after an invalid quantity.
4. Add a custom InvalidMenuChoiceException.
*/
import java.util.Scanner;

class InsufficientStockException extends Exception{
    public InsufficientStockException(String message){
        super(message);
    }
}

class product{
    String productName;
    int stockQuantity;
    int price;
    
    public product(String productName, int stockQuantity, int price){
        this.productName = productName;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    int purchase(int quantity) throws InsufficientStockException{
        if(quantity < 0){
            throw new IllegalArgumentException();
        }

        if(quantity > stockQuantity){
            throw new InsufficientStockException("Insufficient Stock in Inventory!");
        }

        stockQuantity -= quantity;
        return stockQuantity;
    }
}

class InventoryManagementSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        product p1 = new product("Laptop", 10, 50000);
        product p2 = new product("Mobile", 15, 20000);

        System.out.println("1. Laptop \n2. Mobile");
        int m = sc.nextInt();
        switch (m) {
            case 1:
                 while (true) {
            
            System.out.println("1. Purchase product \n2. Check available stock \n3. Exit");
            System.out.println("Enter your input: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    try {
                        try {
                            System.out.println("Available quantity of laptops in warehouse are: " + p1.stockQuantity);
                            System.out.println("Enter the quantity you want to purchase of laptops: ");
                            int x = sc.nextInt();
                            p1.purchase(x);
                            System.out.println("Remaining Quantity: " + p1.stockQuantity);
                        } catch (InsufficientStockException e) {
                            System.out.println(e.getMessage());
                        }
                        
                    } catch (IllegalArgumentException e) {
                        System.out.println("Amount cannot be less than 0!");
                    }
                    
                    break;
                
                case 2:
                    System.out.println("Available quantity of laptops in warehouse are: " + p1.stockQuantity);
                    break;
                
                case 3:
                    System.out.println("Thanks for using this program!");
                    return;
                default:
                    throw new AssertionError();
         
    }
    }
                
                //break;

            case 2: 
                 while (true) {
            
            System.out.println("1. Purchase product \n2. Check available stock \n3. Exit");
            System.out.println("Enter your input: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    try {
                        try {
                            System.out.println("Available quantity of laptops in warehouse are: " + p2.stockQuantity);
                            System.out.println("Enter the quantity you want to purchase of laptops: ");
                            int x = sc.nextInt();
                            p2.purchase(x);
                            System.out.println("Remaining Quantity: " + p2.stockQuantity);
                        } catch (InsufficientStockException e) {
                            System.out.println(e.getMessage());
                        }
                        
                    } catch (IllegalArgumentException e) {
                        System.out.println("Amount cannot be less than 0!");
                    }
                    
                    break;
                
                case 2:
                    System.out.println("Available quantity of laptops in warehouse are: " + p2.stockQuantity);
                    break;
                
                case 3:
                    System.out.println("Thanks for using this program!");
                    return;
                default:
                    throw new AssertionError();
         
    }
    }
            default:
                throw new AssertionError();
        }
         
            
        /*
        while (true) {
            
            System.out.println("1. Purchase product \n2. Check available stock \n3. Exit");
            System.out.println("Enter your input: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    try {
                        try {
                            System.out.println("Available quantity of laptops in warehouse are: " + p1.stockQuantity);
                            System.out.println("Enter the quantity you want to purchase of laptops: ");
                            int x = sc.nextInt();
                            p1.purchase(x);
                            System.out.println("Remaining Quantity: " + p1.stockQuantity);
                        } catch (InsufficientStockException e) {
                            System.out.println(e.getMessage());
                        }
                        
                    } catch (IllegalArgumentException e) {
                        System.out.println("Amount cannot be less than 0!");
                    }
                    
                    break;
                
                case 2:
                    System.out.println("Available quantity of laptops in warehouse are: " + p1.stockQuantity);
                    break;
                
                case 3:
                    System.out.println("Thanks for using this program!");
                    return;
                default:
                    throw new AssertionError();
         
    }
    }*/
    }
}