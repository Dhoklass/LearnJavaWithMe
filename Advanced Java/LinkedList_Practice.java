import java.util.*;

class LinkedList_Practice{
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.addAll(List.of("Yash","Harsh", "Akash","Chinmay"));
        names.addFirst("Allan");
        names.addLast("Rahul");

        names.add(2,"Ajay");

        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(2));
        System.out.println(names.indexOf("Ajay"));

        System.out.println(names.isEmpty());
        System.out.println(names.remove("Ajay"));
        System.out.println(names.get(2));

        for(String i : names){
            System.out.println(i);
        }

        System.out.println(names.contains("Rahul"));

        System.out.println("\n\nLL2\n");

        LinkedList <Integer> l2 = new LinkedList<>(List.of(1,2,3,4,5));
        l2.add(0,5);
        l2.add(50);
        l2.add(3, 25);

        System.out.println(l2);

        l2.removeFirst();
        l2.removeLast();
        l2.remove(1);

        System.out.println(l2.descendingIterator());

        System.out.println("\n\nLL3\n");

        LinkedList <Integer> l3 = new LinkedList <>(List.of(10, 20, 10, 30, 20, 40, 10));
        LinkedList <Integer> l4 = new LinkedList <>();
        System.out.println(l3);
        for(int i : l3){
            if(!l4.contains(i)){
                l4.add(i);
            }
        }
        
        System.out.println(l4);

        System.out.println("\n\nLL5\n");
        LinkedList <Integer> l5 = new LinkedList <>(List.of(45, 12, 89, 23, 7, 65));
        
        int x = l5.getFirst();
        for(int i : l5){
            if(i > x){
                x = i;
            }
        }

        System.out.println("Largest Element : " + x);

        int y = l5.getFirst();
        for(int i : l5){
            if(i < x){
                x = i;
            }
        }
        
        System.out.println("Smallest Element : " + y);

        int z = 0;
        for(int i : l5){
            z = z + i;
        }
        
        System.out.println("Sum of l5: " + z);

        System.out.println("Average of l5: " + z/l5.size());
    }

}