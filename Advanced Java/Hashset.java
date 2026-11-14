import java.util.*;
class Hashset{      // Does not guarantee insertion order.
    public static void main(String[] args){
        HashSet <Integer> h1 = new HashSet<>(List.of(10,20,30,40));
        HashSet <Integer> h2 = new HashSet<>(List.of(30,40,50,60));
        System.out.println(h1);
        
        // h1.retainAll(h2);       // Finding Unique elements between 2 sets
        // System.out.println(h1);

        // h1.addAll(h2);      // Finding Union of 2 sets
        // System.out.println(h1);

        //Finding the difference between two sets
        // Difference means finding elements that exist in the first set but not in the second.

        // h1.removeAll(h2);
        // System.out.println(h1);

        h1.add(50);
        System.out.println(h1.contains(10));
        System.out.println(h1.size());

        //Using hashset to remove duplicates present in a LinkedList

        LinkedList <Integer> l1 = new LinkedList<>(List.of(10, 20, 10, 30, 20, 40, 10));
        HashSet <Integer> h3 = new HashSet <>(l1);

        System.out.println(h3);

        String str = "programming";
        HashSet <Character> h4 = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            h4.add(str.charAt(i));
        }
        System.out.println(h4);

    }
}