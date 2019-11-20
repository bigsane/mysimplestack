package deqo.asan.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item  val ;
    @Before
    public void setUp (){
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
/*package deqo.asan.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

/**
 * Created by emartin on 24/10/17.
 */
/*
public class ItemTest {
    private Item item;
    private int object1, object2;

    @Before
    public void setUp() {
        object1 = 10;
        object2 = 2017;
    }

    @Test
    public void testGet() {
        // Given the fixture
        // When
        item = new Item(object1);
        // then
        assertThat(item, sameInstance(object1));
        // When
        item.SetVal(object2);
        // then
        assertThat(item.GetVal(), sameInstance(object2));
    }
     public void testSet() {
        // Given the fixture
        // When
        item = new Item(object1);
        // then
        assertThat(item, sameInstance(object1));
        // When
        item.SetVal(object2);
        // then
        assertThat(item.GetVal(), sameInstance(object2));
    }
}
*/