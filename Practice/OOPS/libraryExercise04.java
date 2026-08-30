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
    }

    void returnBook(){
        returnBookCount += 1;
    }

    void showAvailbleBooks(){
        
    }



    void library(){
        while (true) {
            System.out.println("1. Add Book\n2. Issue Book\n3. Return Book\n 4. Show Availble Books");
            
            
        }
    }
}

class libraryExercise04{
    public static void main(String[] args) {
    library l1 = new library();
    l1.addBook();
    l1.getbook();

    }
}