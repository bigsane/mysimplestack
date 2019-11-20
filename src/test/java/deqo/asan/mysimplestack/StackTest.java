package deqo.asan.mysimplestack;

import org.junit.Before;
import org.junit.Test;
import java.util.EmptyStackException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;


/**
 * Created by emartin on 24/10/17.
 */
public class StackTest {
    protected MyStack simpleStack;
    protected Item item1, item2;

    @Before // "Fixture": executé avant chaque test
    public void setUp() {
        simpleStack = new MyStack();
        item1 = new Item(20);
        item2 = new Item(2019);
    }

    /*
     * Remarques :
     * - L'interface de SimpleStack est une structure de données standard (pile)
     * - La fonction "push" et le mot-clé "new" ont un rôle particulier :
     *   ils peuvent être vus comme des constructeurs
     * - Les autres fonctions sont des opérateurs ou observateurs
     *
     * Idée suivie pour cette classe de test :
     * - tester chaque opérateur/observateur
     * - en l'appliquant aux diverses combinaisons possibles des constructeurs de pile
     */

    @Test
    public void testIsEmpty() {
        // Given the fixture
        // then
        assertThat(simpleStack.isEmpty(), is(true));
        // When
        simpleStack.push(item1);
        // then
        assertThat(simpleStack.isEmpty(), is(false));
    }

    @Test
    public void testGetSize() {
        // Given the fixture
        // then
        assertThat(simpleStack.getSize(), is(0));
        // When
        simpleStack.push(item1);
        // then
        assertThat(simpleStack.getSize(), is(1));
        // When
        simpleStack.push(item2);
        // then
        assertThat(simpleStack.getSize(), is(2));
    }


    @Test
    public void testPeekOK() throws Exception {
        // Given
        simpleStack.push(item1);
        simpleStack.push(item2);
        // When
        final Item item = simpleStack.peek();
        // then
        assertThat(item, sameInstance(item2));
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekException() {
        // Given the fixture
        Item nothing = simpleStack.peek();
    }

    @Test
    public void testPopOK() throws Exception {
        // Given
        simpleStack.push(item1);
        simpleStack.push(item2);
        // When
        final Item actual2 = simpleStack.pop();
        // then
        assertThat(actual2, sameInstance(item2));
        // When
        final Item actual1 = simpleStack.pop();
        // then
        assertThat(actual1, sameInstance(item1));
        // and
        assertThat(simpleStack.isEmpty(), is(true));
    }

    @Test(expected = EmptyStackException.class)
    public void testPopException() {
        // Given the fixture
        Item nothing = simpleStack.pop();
    }
}
