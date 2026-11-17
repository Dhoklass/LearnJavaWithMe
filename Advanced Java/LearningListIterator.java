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

        System.out.println("\nBefore insertion of 100 after every element greater than 25: " + list2);

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
        
        System.out.println("\nBefore replacing every no greater than 30 with 0: " + list3);
        while(li3.hasNext()){
            int num2 = li3.next();

            if(num2 > 30){
                li3.set(0);
            }

        }   
        
        System.out.println("After replacing every no greater than 30 with 0: " + list3);

        // Removing elements grater than 30  
        ArrayList<Integer> list4 = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60));
        ListIterator <Integer> li4 = list4.listIterator();
        
        System.out.println("\nBefore removing every no greater than 30: " + list4);
        while(li4.hasNext()){
            int num3 = li4.next();

            if(num3 > 30){
                li4.remove();
            }

        }   
        
        System.out.println("After removing every no greater than 30: " + list4);      

        // Removing elements smaller than 40  
        ArrayList<Integer> list5 = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60));
        ListIterator <Integer> li5 = list5.listIterator();
        
        System.out.println("\nBefore removing every no smaller than 40: " + list5);
        while(li5.hasNext()){
            li5.next();
        }
        
        while(li5.hasPrevious()){
            int num4 = li5.previous();

            if(num4 < 40){
                li5.remove();
            }

        }   
        
        System.out.println("After removing every no smaller than 40: " + list5);

        // Remove duplicates
        ArrayList<Integer> list6 = new ArrayList<>(List.of(10, 20, 10, 30, 20, 40, 30, 50));
        HashSet <Integer> hs = new HashSet<>();
        ListIterator <Integer> li6 = list6.listIterator();

        System.out.println("\nBefore removing duplicates: " + list6);
        while(li6.hasNext()){
            int num5 = li6.next();

            if(hs.contains(num5)){
                li6.remove();
            }
            else{
                hs.add(num5);
            }
        }
        System.out.println("After removing duplicates: " + list6);
    }

}