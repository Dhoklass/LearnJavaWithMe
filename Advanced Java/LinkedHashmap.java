import java.util.*;

class LinkedHashmap{
    public static void main (String[] args){
        LinkedHashMap <String, Integer> lhm1 = new LinkedHashMap<>(10, 0.75f, true);
        lhm1.put("Anay",56);
        lhm1.put("Jay",32);
        lhm1.put("Aryan",52);
        lhm1.put("Darshan",49);

        System.out.println(lhm1);
        lhm1.put("Anay",57);
        
        lhm1.get("Jay");
        lhm1.get("Aryan");

        System.out.println(lhm1);


        for(Map.Entry<String,Integer> entry : lhm1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}