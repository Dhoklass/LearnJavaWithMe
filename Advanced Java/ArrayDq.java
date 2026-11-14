
import java.util.ArrayDeque;
import java.util.List;

class ArrayDq{
    public static void main(String[] args) {
        
        ArrayDeque <Integer> d1 = new ArrayDeque <>();
        d1.addFirst(10);
        d1.addLast(20);
        d1.addLast(30);
        d1.addLast(40);
        d1.addLast(50);

        d1.removeFirst();
        d1.removeLast();

        System.out.println(d1.descendingIterator() + "\n");
        for(int i : d1){
            System.out.println(i);
        }
        

        ArrayDeque <Integer> d2 = new ArrayDeque <>(List.of(15, 25, 35, 45, 55));   
        System.out.println("\n" + d2.peekFirst());
        System.out.println(d2.peekLast());

        ArrayDeque <Integer> stack1 = new ArrayDeque <>();      // PUSH, POP AND PEEK
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        System.out.println(stack1);     //LIFO

        stack1.pop();
        stack1.pop();

        System.out.println(stack1);

        ArrayDeque <Integer> Queue = new ArrayDeque <>();   //FIFO       //OFFER, POLL AND PEEK
        Queue.offer(10);
        Queue.offer(20);
        Queue.offer(30);
        Queue.offer(40);

        System.out.println(Queue);

        Queue.poll();
        Queue.poll();

        System.out.println(Queue.peekFirst());
        System.out.println(Queue);
    }
}