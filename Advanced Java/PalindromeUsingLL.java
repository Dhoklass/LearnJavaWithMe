import java.util.*;
class PalindromeUsingLL{
    public static void main(String[] args) {
        LinkedList <Integer> l6 = new LinkedList <>(List.of(10, 20, 30, 20, 10));

        int left = 0; // setting the index of left most element of l6
        int right = l6.size() - 1;
        boolean isPalindrome = true;
        for(int i : l6){
            while(!l6.get(left).equals(l6.get(right))){     //using the left == 0 here as index in get to get the left most element of l6
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if(isPalindrome == true){
            System.out.println("l6 is Palindrome!");
        }
        else{
            System.out.println("l6 is not Palindrome!");
        }
        
         
    }
}