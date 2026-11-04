import java.util.*;

class LinkedList_Practice{
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.addAll(List.of("Yash","Harsh", "Akash","Chinmay"));
        names.addFirst("Allan");
        names.addLast("Darshan");

        names.add(2,"Ajay");

        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(2));
        System.out.println(names.indexOf("Ajay"));

        System.out.println(names.isEmpty());
        System.out.println(names.remove("Ajay"));
        System.out.println(names.get(2));


    }
}