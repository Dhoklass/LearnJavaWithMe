
import java.util.*;

class LearningHashTable{
    public static void main(String[] args){
        Hashtable <Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "Banana");
        ht1.put(2, "Apple");
        ht1.put(3, "Mango");
        ht1.put(4, "Kiwi");

        System.out.println(ht1);
        System.out.println(ht1.containsKey(2));

        ht1.put(3, "PineApple");
        System.out.println(ht1);

        Enumeration <Integer> e1 = ht1.keys();

        for(int i = 0; i < ht1.size(); i++){
            int key = e1.nextElement();

            if(key > 3){
                ht1.remove(key);
            }
        }

        System.out.println(ht1);
    }
}