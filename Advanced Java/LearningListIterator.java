import java.util.*;

class LearningListIterator{
    public static void main(String[] args){
         ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
         ListIterator <Integer> li = list.listIterator();

         while(li.hasNext()){
            li.next();
         }
        
        //printing list in reverse using hasprevious and previous
        //it will throw false if we directly run hasPrevious and previous after creating a arraylist becuase it is 
        //already at index 0 and there is nothing previous to it, so we use an hasnext and next to traverse to end of list
        //then use hasPrevious and previous to traverse back to before index 0 and print elements along the way!
         while(li.hasPrevious()){   
            System.out.println(li.previous());
         }

        // Inserting 100 after every element greater than 25
        ArrayList<Integer> list2 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        ListIterator <Integer> li2 = list2.listIterator();

        System.out.println("Before insertion of 100 after every element element greater than 25: " + list2);

        while(li2.hasNext()){
            int num = li2.next();

            if(num > 25){
                li2.add(100);
            }
        }
        System.out.println("After insertion of 100 after every element greater than 25: " + list2);

        // Replace element greater than 30 with 0 
        ArrayList<Integer> list3 = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60));
        ListIterator <Integer> li3 = list3.listIterator();
        
        System.out.println("Before replacing every no greater than 30 with 0: " + list3);
        while(li3.hasNext()){
            int num2 = li3.next();

            if(num2 > 30){
                li3.set(0);
            }

        }   
        
        System.out.println("After replacing every no greater than 30 with 0: " + list3);        
    }
}