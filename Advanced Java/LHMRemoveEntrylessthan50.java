import java.util.*;

class LHMRemoveEntrylessthan50{
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        map.put(1, 50);
        map.put(2, 20);
        map.put(3, 80);
        map.put(4, 30);
        map.put(5, 90);

        System.out.println(map);
        for(int i = 0; i < map.(); i++){
            if(map.getOrDefault(i, 0) < 50){
                map.remove(i);
            }
        }
        System.out.println(map);


    }
}