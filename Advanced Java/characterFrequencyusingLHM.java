
import java.util.LinkedHashMap;

class characterFrequencyusingLHM{
    public static void main(String[] args) {
        LinkedHashMap <Character, Integer> c = new LinkedHashMap<>();

        String str = "programming";
        
        for(int i = 0; i < str.length(); i++){
            c.put(str.charAt(i),c.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println(c.entrySet());
    }
}