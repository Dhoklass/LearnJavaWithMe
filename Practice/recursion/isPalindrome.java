import java.util.Scanner;
class isPalindrome{
    static boolean isPalindrome(String n){
        //base condition
        if(n.length()<=1){
            return true; // return true when n <= 1 because 0 backwords is still and 
            // single letter backwards is still the same letter  
            // eg: "a" and hence a palindrome. 
        }
        //now we compare the first character and last character of the string deducting them after comparing one by one!
        char firstChar = n.charAt(0);
        char lastChar = n.charAt(n.length() - 1);

        if(firstChar == lastChar){
            return isPalindrome(n.substring(1, n.length() - 1));
        }

        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to find if it's palindrome or not: ");
        String x = sc.next();
        
        System.out.println("is palindrome: " + isPalindrome(x));
        
    }
}