package deqo.asan.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item valnull, val ;
    @Before
    public void setUp (){
        valnull = new Item();
        int i = 10;
        val = new Item(i);
    }
    @Test
    public void getVal() {
        /*assertEquals(null,valnull);
        assertTrue(val != null);*/
        int it = 10;
        Item i = new Item(it);
        assertEquals(i.GetVal(),it);
    }

    @Test
    public void setVal() {
        /*assertEquals(null,valnull);
        assertTrue(val != null);*/
        int it = 10;
        Item i = new Item();
        i.SetVal(it);
        assertEquals(it,i.GetVal());
    }
}