import java.util.*;

class HashMapCountCharacterFrequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  count character frequency 
        HashMap <Character, Integer> p = new HashMap<>();
        System.out.println("Enter a string to count the repitition of variables in it! : ");
        String str = sc.next();


        int frequency = 0;
        for(int i = 0; i < str.length(); i++){
            //p.getOrDefault(str.charAt(i),frequency);
            p.put(str.charAt(i), p.getOrDefault(str.charAt(i),frequency) + 1);
        }
        System.out.println(p.entrySet());
    }
}