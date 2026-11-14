import java.util.*;

class Hashmap_practice{
    public static void main(String[] args) {
        HashMap <Integer,String> fruits = new HashMap <>(Map.of(1,"Apple",2,"Banana",3,"Mango",4,"Orange"));
        System.out.println(fruits.entrySet());

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Aman");
        students.put(103, "Yash");

        students.put(102, "Rohit");

        System.out.println("Before removing 101: ");
        students.forEach((key, value) -> System.out.println(key + " : " + value));

        students.remove(101);
        students.containsKey(103);
        
        System.out.println("After removing 101: ");
        students.forEach((key, value) -> System.out.println(key + " : " + value));

        // Printing student with highest marks

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Rahul", 75);
        marks.put("Aman", 92);
        marks.put("Yash", 85);
        marks.put("Rohit", 68);
        
        System.out.println("\n" + marks.entrySet());

        int highest_marks = marks.get("Rahul"); 
        int lowest_marks = marks.get("Rahul");
        String topper = "Rahul";
        String loser = "Rahul";

        for(String name : marks.keySet()){
            if(highest_marks < marks.get(name)){
                highest_marks = marks.get(name);
                topper = name;
            }

            if(lowest_marks > marks.get(name)){
                lowest_marks = marks.get(name);
                loser = name;
            }
        }

        System.out.println("Topper: " + topper);
        System.out.println("Marks: " + highest_marks);

        System.out.println("Loser: " + loser);
        System.out.println("Marks: " + lowest_marks);

    }
}