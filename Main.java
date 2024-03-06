
import java.util.ArrayDeque;
 
public class Main {

    public static void main(String[] args) {
    	// Creating an  ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements in the deque
        arrayDeque.add("Anjali");
        arrayDeque.add("Prajakta");
        arrayDeque.add("Sayali");

      
        System.out.println("ArrayDeque: " + arrayDeque);

        // Adding elements at the beginning and end
        arrayDeque.addFirst("Shruti");
        arrayDeque.addLast("Kusum");

        
        System.out.println("ArrayDeque after adding elements at both ends: " + arrayDeque);

        // Removing elements from the beginning and end
        String firstElement = arrayDeque.removeFirst();
        String lastElement = arrayDeque.removeLast();

        
        System.out.println("First element removed: " + firstElement);
        System.out.println("Last element removed: " + lastElement);
        System.out.println("ArrayDeque after removing elements from both ends: " + arrayDeque);

        // Accessing elements without removing them
        String first = arrayDeque.peekFirst();
        String last = arrayDeque.peekLast();

        
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Printing the size of the deque
        System.out.println("Size of the ArrayDeque: " + arrayDeque.size());

        // Checking if the deque is empty
        System.out.println("Is ArrayDeque empty? " + arrayDeque.isEmpty());
    }
}