// Java code to illustrate hashCode()
import java.util.*;

public class StackDemo {
    public static void main(String[] args)
    {
        // Creating an empty Stack
        Stack<Integer> stack = new Stack<>();

        // Use add() method to add elements into the Stack
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        // Displaying the Stack
        System.out.println("Stack: " + stack);

        // Displaying the hashCode value of Stack
        System.out.println("The hashCode value is: "
                + stack.hashCode());
    }
}
