import java.util.*;
class arrayList2{
    public static void main(String[] args){
        ArrayList <Integer> l1 = new ArrayList<>();
            l1.add(1);
            l1.add(3);
            l1.add(5);
            l1.add(7);
            l1.add(9);
            l1.add(0,10);
        
        ArrayList <Integer> l2 = new ArrayList<>();
            l2.add(11);
            l2.add(13);
            l2.add(15);

            l1.addAll(l2);
            
            for(int i : l1){
                System.out.println(i);
            }



    }
}