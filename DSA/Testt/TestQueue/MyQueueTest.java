import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import MyQueue.MyQueue;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    @Test
    @DisplayName("test that my queue is empty")
    public void testEmpty() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.isEmpty());
    }
    @Test
    @DisplayName("test that when i add element to my queue my queue is not more empty")
    public void testAdd_Element() {
        MyQueue queue = new MyQueue();
        queue.add("Adeyemi");
        assertFalse(queue.isEmpty());
    }
    @Test
    @DisplayName("test that when i use element it returns the element on the top of the Queue")
    public void testUse_Element() {
        MyQueue queue = new MyQueue();
        queue.add("Adeyemi");
        assertEquals(queue.element(),"Adeyemi");
    }
    @Test
    @DisplayName("test that when i remove an element from my queue it return the first element")
    public void testRemove_Element() {
        MyQueue queue = new MyQueue();
        queue.add("Adeyemi");
        assertEquals(queue.remove(),"Adeyemi");
    }
    @Test
    @DisplayName("test that when i add two elements to my queue i can remove both element")
        public void remove_ElementsFrom_MyQueue(){
        MyQueue queue = new MyQueue();
        queue.add("Adeyemi");
        queue.add("Khalid");
        queue.add("Farid");
        assertEquals(queue.remove(),"Adeyemi");
        assertEquals(queue.remove(),"Khalid");
        assertEquals(queue.remove(),"Farid");
    }
    @Test
    @DisplayName("test that when my queue is full i can add more element to my queue")
    public void testWhenQueueIsFull(){
        MyQueue queue = new MyQueue();
        queue.add("Adeyemi");
        queue.add("Khalid");
        queue.add("Farid");
        queue.add("Yemisi");
        queue.add("Adeyemi");
        assertThrows(IllegalStateException.class, () -> queue.add("Farid"));
    }
    @Test
    @DisplayName("Test that when my queue ie empty i can not remove")
    public void testWhenQueueIsEmpty(){
        MyQueue queue = new MyQueue();
        assertThrows(NoSuchElementException.class,()->queue.remove());
    }
    @Test
    @DisplayName("test that when my queue ie empty i can not get the element")
    public void testWhenQueueIeEmpty(){
        MyQueue queue = new MyQueue();
        assertThrows(NoSuchElementException.class,()->queue.element());
    }
    @Test
    @DisplayName("test that i can not add an element that null to my queue")
    public void testCanNotAddNull(){
        MyQueue queue = new MyQueue();
        assertThrows(NullPointerException.class,()->queue.add(null));
    }


}