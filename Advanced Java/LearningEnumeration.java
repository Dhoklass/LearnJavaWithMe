import java.util.*;

class LearningEnumeration{
    public static void main(String[] args) {
        Vector <String> v1 = new Vector<>(List.of("Yash", "Rahul", "Aman", "Rohit", "Karan"));
        Enumeration <String> e1 = v1.elements();

        while(e1.hasMoreElements()){
            String n = e1.nextElement();
            if(n.length() > 4){
                System.out.println(n);
            }
        }

        // Enumeration with numbers
        Vector<Integer> numbers = new Vector<>(List.of(10, 25, 30, 45, 50, 65, 70));
        Enumeration<Integer> e2 = numbers.elements();

        int sum = 0;
        int countEven = 0;
        int countGreaterThan40 = 0;
        while(e2.hasMoreElements()){
            int n = e2.nextElement();
            sum += n;
            
            if(n % 2 == 0){
                countEven += 1; 
            }

            if(n > 40){
                countGreaterThan40 += 1;
            }

        }

        System.out.println("Sum: " + sum);
        System.out.println("Count of Even nos: " + countEven);
        System.out.println("Count of nos greater than 40: " + countGreaterThan40);

        // Enumeration with strings
        int totalWords = 0;
        int count = 0;
        

        Vector<String> words = new Vector<>(List.of("Java", "Python", "C", "JavaScript", "Go", "Spring"));
        Enumeration<String> e3 = words.elements();
        String longestWord = words.getFirst();

        while(e3.hasMoreElements()){
            String m = e3.nextElement();
            totalWords++ ;
            if(m.length() > 4){
                count += 1;
            }

            if(m.length() > longestWord.length()){
                longestWord = m;
            }

            
        }
        System.out.println("Total words: " + totalWords);
        System.out.println("Count of elements greater than 4: " + count);
        System.out.println("Longest Word: " + longestWord);
    }
}