import java.util.Scanner;
class DatatypeDetector{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to find it's datatype!");
        int x = sc.nextInt();
        if (sc.hasNextInt()){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}

//incorrect code