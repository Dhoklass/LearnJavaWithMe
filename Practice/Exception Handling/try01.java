import java.util.Scanner;

//  Without try - catch

// class try01{
//     public static void main(String[] args){
//         int [] marks = new int[3];
//         marks[0] = 12;
//         marks[1] = 15;
//         marks[2] = 9;
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a index: ");
//         int x =  sc.nextInt();
//         System.out.println("Number at index " + x + " is " + marks[x]);

//         System.out.println("\nprogram continues executing!");   // This line is not printed without try - catch 
//                                                                 // as it is terminated by the error displayed by 
//                                                                 // the above line if wrong index is provided 

//     }
// }


// With try - catch
class try01{
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 12;
        marks[1] = 15;
        marks[2] = 9;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a index: ");
        int x =  sc.nextInt();
        System.out.println("Enter a divisor: ");
        int y =  sc.nextInt();

            try {
                System.out.println("Number at index " + x + " is " + marks[x]);
                System.out.println("marks " + marks[x] + " divided by " + y + " = " + marks[x]/y);
        
            } catch (ArithmeticException e){    // Checks condition 1
                System.out.println("Can't divide by zero!");
                System.out.println(e);
                System.out.println(e.getMessage()); 

            } catch (ArrayIndexOutOfBoundsException e) {    // Checks condition 2
                System.out.println("Error,  Invalid index entered");        // Error message displayed by the code
                System.out.println(e);      // Catching the error and printing it to the console!
                System.out.println(e.getMessage());

            } catch(Exception e){   // Checks for any other error occurances other then the 2 defined above
                System.out.println("Some Error occured!");
                System.out.println(e);
                System.out.println(e.getMessage());
            
            } finally{
                System.out.println("\nExecuted successfully!");         // Executes even if catch executes or not!
            }

        System.out.println("\nprogram continues executing!");   // Executes even after error is caught

    }
}