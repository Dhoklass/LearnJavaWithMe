
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

        // Removing negative elements
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, -20, 30, -40, 50, -60, 70));

        System.out.println("Before removal of Negative nos: " + numbers);
        Iterator <Integer> it4 = numbers.iterator();
        while(it4.hasNext()){
            int n = it4.next();

            if(n < 0){
                it4.remove();
            }
        }
        System.out.println("After removal of Negative nos: " + numbers);
    
        // Removing elements greater than Average
        ArrayList<Integer> gnumbers = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60));

        int sum = 0;
        for( int i : gnumbers){
            sum += i;
        }
        int avg = sum/gnumbers.size();

        System.out.println("Before removing no's greater than average: " + gnumbers);
        Iterator <Integer> it5 = gnumbers.iterator();
        while (it5.hasNext()) {
            
            int m = it5.next();
            
            if(m > avg){
                it5.remove();
            }
        }
        System.out.println("After removing no's greater than average: " + gnumbers);
    }
}