package deqo.asan.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {
    private Stack<Item> stack;


    MyStack(){
        stack = new Stack<Item>();
    }
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    /**
     * Returns the number of ints in this stack.
     */
    public int getSize(){
        return stack.size();
    }
    /**
     * Pushes an int onto the top of this stack.
     * null int is allowed.
     */
    public void push(Item val){
        stack.add(val);
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException{
        if(this.getSize() > 0)
            return stack.peek();
        else
            throw new EmptyStackException();
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException{
        if(this.getSize() > 0){
            return stack.pop();
        }else{
            throw new EmptyStackException();
        }
    }
}
