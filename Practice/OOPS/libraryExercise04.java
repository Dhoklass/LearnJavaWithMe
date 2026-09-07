// You have to implement a library using Java Class Library
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
import java.util.Scanner;
class library{
    int BookCount;
    int issueBookCount;
    int returnBookCount;
    int availableBooksCount;

    Scanner sc = new Scanner(System.in);

    String [] lib = new String[100];
    String [] issued = new String[100];

    void addBook(){
        System.out.println("Enter book's name to add in library: ");
        String y = sc.next();
        lib[BookCount] = y;
        BookCount += 1;
        System.out.println("books in library: " + BookCount);
    }

    void getbook(){
        
    }

    void issueBook(){
        System.out.println("Enter book's name you want to issue from the list: ");
        String y = sc.next();

        int foundIndex = -1;
        for(int i = 0;i<BookCount;i++){
            if(lib[i].equals(y)){
                foundIndex = i;
                break;
                // System.out.println(y + "\nBook issued!");
                
                
            }
        }
        if (foundIndex == -1){
            System.out.println("Book not found!");
            return;
        }

        //how do i shift the lib left?

        issued[issueBookCount] = y;
        issueBookCount += 1;
        BookCount -= 1;
        System.out.println("book issued! ");
        System.out.println("Books issued to students: "+ issueBookCount);
        System.out.println("Books in library after issuing: "+ BookCount);
    }

    void returnBook(){
        returnBookCount += 1;
    }

    void showAvailbleBooks(){
        System.out.println("books in library: " + BookCount);
        // for(String x:lib){
        //     System.out.println(x);}

        for(int i = 0;i<BookCount;i++){
            System.out.println(lib[i]);
        
        }
                
    }



   void open() {
    // Flag to control when the loop should stop
    boolean running = true; 

    while (running) {
        System.out.println("\n1. Add Book\n2. Issue Book\n3. Return Book\n4. Show Available Books\n5. Exit");
        System.out.print("Enter your choice: ");
        int userInput = sc.nextInt();
        
        switch (userInput) {
            case 1:
                addBook();
                break;
            case 2:
                issueBook();
                break;
            case 3:
                returnBook();
                break;
            case 4:
                showAvailbleBooks();
                break;
            case 5:
                System.out.println("Exiting the system. Goodbye!");
                running = false; // Turns off the loop condition
                break;
            default:
                System.out.println("Invalid choice! Please select between 1 and 5.");
                break;
        }
    }
}

}

class libraryExercise04{
    public static void main(String[] args) {
    library l1 = new library();
    //l1.addBook();
    //l1.getbook();
    l1.open();

    }
}