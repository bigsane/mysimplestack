package deqo.asan.mysimplestack;
import java.util.EmptyStackException;

public interface SimpleStack {
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty();
    /**
     * Returns the number of ints in this stack.
     */
    public int getSize();
    /**
     * Pushes an int onto the top of this stack.
     * null int is allowed.
     */
    public void push(Item val);
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException;
}
