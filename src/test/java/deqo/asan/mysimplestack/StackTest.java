package deqo.asan.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    MyStack pileVide,pile ;
    @Before
    public void setUp (){
        pileVide = new MyStack();
        pile =new MyStack();
        Item i1=new Item(10);
        pile.push(i1);

    }

    @Test
    public void isEmpty() {
        assertTrue(pileVide.isEmpty());
        assertFalse(pile.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals(pileVide.getSize(), 0);
        assertTrue(pile.getSize() > 0);
    }

    @Test
    public void push() {
        int t1 = pile.getSize();
        Item i = new Item(10);
        pile.push(i);
        int t2 = pile.getSize();
        assertTrue(t2 > t1);
    }

    @Test
    public void peek() {
        Item i1 = new Item(10);
        pile.push(i1);
        int t1 = pile.getSize();
        Item i = pile.peek();
        int t2 = pile.getSize();
        assertEquals(t2,t1);
        assertEquals(i1,i);
    }

    @Test
    public void pop() {
        Item i1 = new Item(10);
        pile.push(i1);
        int t1 = pile.getSize();
        Item i = pile.pop();
        int t2 = pile.getSize();
        assertTrue(t2 < t1);
        assertEquals(i1,i);
    }
}