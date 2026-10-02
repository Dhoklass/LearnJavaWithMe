import java.util.*;


class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        // 1. List.of() adds multiple entries at once!
        ArrayList<Integer> l3 = new ArrayList<>(List.of(4,5,6));    

        l2.add(1);
        l2.add(2);
        l2.add(3);

        l1.add(10);
        l1.add(12);
        l1.add(14);
        l1.add(16);
        l1.add(18);
        l1.add(0, 20); // 2. ADDS 20 AT INDEX 0

        // 3. Adds l2 to l1 from a given index
        l1.addAll(0, l2);    
        l1.addAll(l3);

        // 4. l1.clear();     //returns a shallow copy of the arraylist!

        //5. checks if the number is present or not and returns boolean true or false
        System.out.println("contains 7: " + l1.contains(7));   


        System.out.println("Index of 12: " + l1.indexOf(12));

        // for(int x : l1){
        //     System.out.println(x);
        // }

        // OR

        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + ", ");
        }

        // 6. get(i) to print the value at given index
        System.out.println("\n\n" + l1.get(0));     
        
        // 7. set(i) to set or replace a value at given index with a new value
        l1.set(0, 7);       

        System.out.println("\n" + l1.get(0));   

        // 8. Prints the size of array
        System.out.println("\nSize of array l1: " + l1.size());  

        // 9. Returns True if array is Empty else False
        System.out.println("l1 is Empty? : " + l1.isEmpty());     

        // REMOVE

        // 10. Removes element at given index
        System.out.println("Removes element at given index: " + l1.remove(0));      

        // 11. Confirming that element is removed by printing the 1st element
        System.out.println(l1.get(0));

        // 12. Remove element by VALUE, returns boolean True if removed <Integer>
        // System.out.println(l1.remove(Integer.valueOf(2)));   
        System.out.println(l1.remove((Integer)2));      // Does the same thing

        // 13. Remove element by VALUE, returns boolean True if removed  <String>   
        // System.out.println(l1.remove("Banana"));

        // 14. RemoveAll listed elements
        System.out.println(l1.removeAll(List.of(10,20)));

        // Printing l1
        for(int x : l1){
            System.out.print(x + ", ");
        }
        

        // 15. remove by condition
        // fruits.removeIf(f -> f.startsWith("B"));

        // 16. Remove all except these!
        l1.retainAll(List.of(3,4,5,6));           

        System.out.println("\n\n");

        // Printing l1
        for(int x : l1){
            System.out.print(x + ", ");
        }

        // 17. REMOVE ALL 
        l1.clear();
        for(int x : l1){
            System.out.print(x + ", ");
        }

        System.out.println("\n\nSearch - \n");

        //Search 
        ArrayList <String> list = new ArrayList<>(List.of("A", "B", "C", "D", "B"));

        for(String x : list){
            System.out.print(x + ", ");
        }

        // 18.  Returns TRUE if list contains provided value
        System.out.println("\n\nList contains B: " + list.contains("b".toUpperCase()));

        // 19.  Returns Index of the provided value
        System.out.println("Index of C: " + list.indexOf("C"));
        System.out.println("Index of E: " + list.indexOf("E")); // Returns -1 if not found
        System.out.println("LastIndex of B: " + list.lastIndexOf("B"));

        // LOOPS

        System.out.println("\n\nUsing classical Loop: ");
        // 1. Classic for loop (when you need the index)
        for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + ", ");
            }

        System.out.println("\n\nUsing forEach: ");
        // 2. Enhanced for-each (when you only need values)
        for (String s : list) {
                System.out.print(s + ", ");
            }
        
        System.out.println("\n\nUsing forEach with Lambda");
        // forEach with lambda
        list.forEach(s -> System.out.print(s + ", "));

        System.out.println("\n\n\n");

        //Sort

        ArrayList<Integer> list2 = new ArrayList<>(List.of(4,9,1,7,3));

        for(int x : list2){
            System.out.print(x + ", ");
        }
        
        System.out.println("\n");

        // Ascending order: 
        list2.sort(null);
        // Collections.sort(list2);
        
        for(int x : list2){
            System.out.print(x + ", ");
        }
        
        // Descending order: 
        list2.sort(Collections.reverseOrder());
        // Collections.sort(list2, Collections.reverseOrder());

        for(int x : list2){
            System.out.print(x + ", ");
        }

        // Other Collections helpers
        // Collections.reverse(list2);
        // Collections.shuffle(list2);
        // Collections.max(list2);
        // Collections.min(list2);
        // Collections.swap(list2, 0, 2);     // swap elements at index 0 and 2
        // Collections.frequency(list2, "B");  // how many times B appears

        





    }
}