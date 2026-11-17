import java.util.*;

class LearningVector{
    public static void main(String[] args) {
        Vector <Integer> v1 = new Vector<>(20);
        
        // Adding Elements
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);

        v1.addElement(80);
        

        // Accesssing Elements
        System.out.println(v1.get(0));
        System.out.println(v1.elementAt(1));

        // Updating Elements
        v1.set(0,60);   // (index, element)
        v1.setElementAt(70, 1); // (element, index)

        System.out.println(v1);
        System.out.println(v1.size());

        // Removing Elements
        v1.remove(0);
        v1.removeElement(30);
        v1.removeElementAt(1);

        System.out.println(v1);
        v1.removeAllElements();
        System.out.println(v1);
        
        System.out.println(v1.isEmpty());
        v1.clear();
        v1.ensureCapacity(20);
        v1.trimToSize();
        System.out.println(v1.size());

    }
}