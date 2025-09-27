package StackTest;

import Stack.MyStack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class TestStack {
    @Test
    @DisplayName("Test That My Stack Is Empty")
    public void testStackEmpty() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }
    @Test
    @DisplayName("Test That My stack Is Not Empty When i add Element")
    public void testStackNotEmpty() {
        MyStack stack = new MyStack();
        stack.add("Name");
        assertFalse(stack.isEmpty());
    }
    @Test
    @DisplayName("Test That When I add Two Items to my stack it does not remains empty")
    public void testStackIsNotEmpty_AfterAddingTwoItems(){
        MyStack stack = new MyStack();
        stack.add("Name");
        assertFalse(stack.isEmpty());
        stack.add("Address");
        assertFalse(stack.isEmpty());
    }
    @Test
    @DisplayName("Test That when I Have Two item and i remove one that my Stack Is Not Empty")
    public void testStackIsNotEmpty_AfterRemovingTwoItems(){
        MyStack stack = new MyStack();
        stack.add("Name");
        stack.add("Address");
        stack.pop();
        assertFalse(stack.isEmpty());
    }
    @Test
    @DisplayName("Test That when i add two item and i remove both My stack becomes empty")
    public void testStackIsEmpty_AfterRemovingBothItems(){
        MyStack stack = new MyStack();
        stack.add("Name");
        stack.add("Address");
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    @DisplayName("Test That When I pop an element i return the element removed")
    public void testStackThatWhenIPopAnElementItReturnsTheElement(){
        MyStack stack = new MyStack();
        stack.add("Name");
        stack.add("Address");
        assertEquals("Address",stack.pop());
    }
    @Test
    @DisplayName("Test That When I pop element twice it return the element popped")
    public void testStackThatWhenIPopElementTwiceItReturnsTheElementAnyMyStackIsEmpty(){
        MyStack stack = new MyStack();
        stack.add("Name");
        stack.add("Address");

        assertEquals("Address",stack.pop());
        assertEquals("Name",stack.pop());
        assertTrue(stack.isEmpty());
    }
    @Test
    @DisplayName("Test that when my stack if full and i add new element it raises Exceprions")
    public void testStackIfFullAndIAddNewElement(){
        MyStack stack = new MyStack();
        stack.add("Name");
        stack.add("Address");
        stack.add("Age");
        stack.add("PhoneNumber");
        stack.add("Email");

        assertThrows(IllegalArgumentException.class,()->{stack.add("Height");});
    }
    @Test
    @DisplayName("Test that when my stack is empty and i pope it raises IllegealArgument")
    public void testStackIfEmptyAndIPopIt(){
        MyStack stack = new MyStack();
        assertThrows(IllegalArgumentException.class,()->{stack.pop();});
    }
    @Test
    @DisplayName("test that when i peek on my stack it return the last Element")
    public void test_StackPeek(){
        MyStack stack = new MyStack();
        stack.add("Name");
        stack.add("Address");
        assertEquals("Address", stack.peek());
    }
    @Test
    @DisplayName("Test That When My Stack Is Empty and It Tried Peeking It throws Illegal Args")
    public void test_EmptyStackPeek(){
        MyStack stack = new MyStack();
        assertThrows(IllegalArgumentException.class,()->{stack.peek();});
    }
    @Test
    @DisplayName("Test That When I Serach For Mystack It returns the Position it located")
    public void Test_SearchMyStack(){
        MyStack stack = new MyStack();
        stack.add("Name");
        stack.add("Address");
        assertEquals(2,stack.search("Name"));
        assertEquals(1,stack.search("Address"));

    }
    @Test
    @DisplayName("test that when i search of element that are duplicate in the stack it returns the last Occurence")
    public void test_SearchFor_Duplicate(){
        MyStack stack = new MyStack();
        stack.add("Name");
        stack.add("Name");
        stack.add("Address");
        stack.add("Address");
        assertEquals(3,stack.search("Name"));
        assertEquals(1,stack.search("Address"));

    }

}
