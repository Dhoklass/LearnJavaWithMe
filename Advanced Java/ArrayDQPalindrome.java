import java.util.*;

class ArrayDQPalindrome{
    public static void main(String[] args) {
        ArrayDeque<Integer> Palindrome =
    new ArrayDeque<>(List.of(1, 2, 3, 2, 1));

boolean palin = true;

while (Palindrome.size() > 1) {

    int first = Palindrome.pollFirst();
    int last = Palindrome.pollLast();

    if (first != (last)) {
        palin = false;
        break;
    }
}

if (palin) {
    System.out.println("Is Palindrome!");
} else {
    System.out.println("Is not a Palindrome!");
}
    }
}