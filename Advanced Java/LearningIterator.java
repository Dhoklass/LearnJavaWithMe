
import java.util.*;

class LearningIterator{
    public static void main(String[] args) {
        ArrayList <Integer> lessthan = new ArrayList<>( List.of(10, 60, 30, 80, 40, 90, 20));

        Iterator <Integer> it = lessthan.iterator();

        System.out.println(lessthan);

        while(it.hasNext()){
            int num = it.next();

            if(num > 50){
                it.remove();
            }
        }

        System.out.println(lessthan);

        // Remove duplicate elements
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 10, 30, 20, 40, 30));
        HashSet <Integer> hs = new HashSet<>();
        
        Iterator <Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            int num2 = it2.next();

            if(hs.contains(num2)){
                it2.remove();
            }
            else{
                hs.add(num2);
            }
        }
        System.out.println("List: " + list);
        System.out.println("hashset: " + hs);

        //removing strings with less than 5 characters
        ArrayList<String> names = new ArrayList<>(List.of("Java", "Python", "C++", "Spring", "HTML", "JavaScript"));

        Iterator <String> it3 = names.iterator();
        System.out.println("Names before removal: " + names);
        while(it3.hasNext()){
            String name = it3.next();

            if(name.length() < 5){
                it3.remove();
            }
        }
        System.out.println("Names after removal: " + names);
    }
}