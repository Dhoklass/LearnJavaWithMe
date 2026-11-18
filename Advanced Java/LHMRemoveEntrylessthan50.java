import java.util.*;

    class MyLRU extends LinkedHashMap<Integer,String>{
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest){
            return size() > 3;  
        }
    }

    class LHMRemoveEntrylessthan50{
        public static void main(String[] args) {
            // LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

            // map.put(1, 50);
            // map.put(2, 20);
            // map.put(3, 80);
            // map.put(4, 30);
            // map.put(5, 90);

            // System.out.println(map);
            // Iterator <Map.Entry<Integer, Integer>> e1 = map.entrySet().iterator();
            // while(e1.hasNext()){
            //     Map.Entry<Integer, Integer> entry = e1.next();

            //     if(entry.getValue() < 50){
            //         e1.remove();
            //     }                
            // }
            // System.out.println(map);

            //     // merging 2 linkedhashmaps
            //     HashMap <Integer,String> hm2 = new HashMap<>();
            //     hm2.put(1, "A");
            //     hm2.put(2, "B");
            //     hm2.put(3, "C");
        
            //     System.out.println(hm2);
            //     HashMap <Integer,String> hm3 = new HashMap<>();
            //     hm3.put(4, "D");
            //     hm3.put(5, "E");
            //     hm3.put(2, "Z");

            //     hm2.putAll(hm3);

            //     System.out.println(hm2);

            //     // Finding character with frequency  = 1
            //     String str = "aabbcddee";
            //     LinkedHashMap <Character, Integer> lhm1 = new LinkedHashMap<>();

            //     for(int i = 0; i < str.length(); i++){
            //         char ch = str.charAt(i);
            //         lhm1.put(ch, lhm1.getOrDefault(ch, 0) + 1);
            //     }

            // for(Map.Entry<Character, Integer> entry : lhm1.entrySet()) {

            //    if(entry.getValue() == 1){
            //     System.out.println(entry.getKey());
            //    }

            //     }
                
            // // sort by insertion order
            // LinkedHashMap <Integer, Integer> lhm = new LinkedHashMap<>(10, 0.75f, false);
            // LinkedHashSet <Integer> hs = new LinkedHashSet<>();

            // int[] arr = {5, 2, 3, 5, 2, 8, 9, 3, 1};
            

            // for(int i = 0; i < arr.length; i++){
            //     lhm.put(arr[i],arr[i]);
            //     hs.add(arr[i]);
                
            // }
            // System.out.println(lhm.keySet());
            // System.out.println(hs);

            // predicting access order
            LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
            
            map.put(1,"Java");
            map.put(2,"Python");
            map.put(3,"C++");
            map.put(4,"JavaScript");
            
            System.out.println(map.get(2));
            System.out.println(map.get(4));
            System.out.println(map.get(1));

            System.out.println(map);

            // removeEldestEntry
            LinkedHashMap <Integer, String> lhm2 = new LinkedHashMap<>(10, 0.75f, true);
            
            MyLRU cache = new MyLRU();


            cache.put(1,"Banana");
            cache.put(2,"Apple");
            cache.put(3, "Mango");

            System.out.println(cache);

            System.out.println(cache.get(2));
            
            cache.put(4,"PineApple");

            System.out.println(cache);

            
        }
    }