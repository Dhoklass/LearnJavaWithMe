import java.util.*;
class hashmapCountWordFrequency{
    public static void main(String[] args) {
        HashMap <String, Integer> words = new HashMap<>();
        String[] arr = {"java", "python", "java","c++","python","java"};
        //String[] arr = str.split(" ");

        for(int i = 0; i < arr.length; i++){
            words.put(arr[i],words.getOrDefault(arr[i],0) + 1);
        }
        System.out.println(words);
    }
}