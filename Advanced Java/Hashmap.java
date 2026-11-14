import java.util.*;

class Hashmap{
    public static void main(String[] args){
        HashMap <String, Integer> hm1 = new HashMap <>();
        hm1.put("India", 200);
        hm1.put("Zimbabwe",150);
        hm1.put("Australia",250);

        System.out.println(hm1);
        for(String i : hm1.keySet()){   // Printing only the keys!
            System.out.println(i);
        }

        
        for(int i : hm1.values()){   // Printing only the Values!
            System.out.println(i);
        }
        
        hm1.forEach((key, value) -> System.out.println(key + " -> " + value));      // Printing both Key and Value together!

        System.out.println("Contains Pakistan as key? :" + hm1.containsKey("Pakistan"));
        System.out.println("Contains 130 as value? :" + hm1.containsValue(150));
        
        System.out.println(hm1.entrySet());
        System.out.println("isEmpty? : " + hm1.isEmpty());
        System.out.println("Keyset: " + hm1.keySet());
        System.out.println("Values: " + hm1.values());

        //add 2 hashmaps
        HashMap <String, Integer> hm2 = new HashMap <>();
        hm1.put("Pakistan", 85);
        hm1.put("SriLanka",165);
        hm1.put("Bangladesh",90);

        hm1.putAll(hm2);
        System.out.println(hm1.entrySet());

        System.out.println(hm1.remove("Pakistan"));
        System.out.println(hm1.entrySet());

        System.out.println(hm1.hashCode());

        hm1.put("Nigeria",125);
        System.out.println(hm1.getOrDefault("Nigeria", 0));     //getOrDefault

    }
}   