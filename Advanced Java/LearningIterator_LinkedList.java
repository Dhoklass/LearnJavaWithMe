    import java.util.*;

    class LearningIterator_LinkedList{
        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>(List.of(5, 10, 15, 20, 25, 30, 35));
            
            System.out.println("Before removal of elements divisible by 3 and 5: " + numbers);

            Iterator <Integer> it = numbers.iterator();
            while(it.hasNext()){
                int num = it.next();
                if(num%3 == 0 && num%5 == 0){
                    it.remove();
                }
            }
            
            System.out.println("After removal of elements divisible by 3 and 5: " + numbers);
        }    
    }