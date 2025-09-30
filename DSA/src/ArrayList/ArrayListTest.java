package ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    @Test
    @DisplayName("Test that my arrayList is empty")
    public void testArrayListIsEmpty() {
        MyArrayList lists = new MyArrayList();
        assertTrue(lists.isEmpty());
    }
    @Test
    @DisplayName("test that My List is not Empty when i add Elment to it")
    public void testArrayListIsNotEmpty() {
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        assertFalse(lists.isEmpty());
    }
    @Test
    @DisplayName("Test that when i add two Element my list is not empty")
    public void testArrayListIsNotEmpty2() {
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("cat");
        assertFalse(lists.isEmpty());
    }
    @Test
    @DisplayName("Test that when i add an element to my list the elemnt is in my array")
    public void testthatMyArraycontainsElement() {
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        assertTrue(lists.contains("fish"));
    }
    @Test
    @DisplayName("Test that when i add two element i can find the second element")
    public void testthatMyArraycontainsElement2() {
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("cat");
        assertTrue(lists.contains("cat"));
    }
    @Test
    @DisplayName("test that when i check for and element that not in my list")
    public void testListForNoElement() {
        MyArrayList lists = new MyArrayList();
        assertFalse(lists.contains("cat"));
    }
    @Test
    @DisplayName("test that when i add two element to my list the size of my list is 2")
    public void testMySize(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("cat");
        assertEquals(2,lists.size());
    }
    @Test
    @DisplayName("Test that when i add an element i get the index")
    public void testgetIndex(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        assertEquals(0,lists.indexOf("fish"));
    }
    @Test
    @DisplayName("test that when i add element to my list i can get position")
    public void testget_IndexOf_Element(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        assertEquals(lists.indexOf("fish"),0);
    }
    @Test
    @DisplayName("test that when i add to element i can get their position")
    public void testget_IndexOf_Element2(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("cat");
        assertEquals(lists.indexOf("cat"),1);
        assertEquals(lists.indexOf("fish"),0);
    }
    @Test
    @DisplayName("test that when i add two identical element it return the first position of the first Occurence")
    public void test_identical_Element(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("fish");
        assertEquals(lists.indexOf("fish"),0);
    }
    @Test
    @DisplayName("test that when the elements is not found in my array")
    public void testelementsIsNotFound(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        assertEquals(lists.indexOf(1),-1);
    }
    @Test
    @DisplayName("test that my list return the last instance index of duplicate elements")
    public void testlast_Element(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("fish");
        assertEquals(lists.lastIndexOf("fish"),1);
    }
  @Test
  @DisplayName("test that when i set an element at a Positon the element changes")
  public void testset_Element(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("cat");
        assertEquals(lists.set(0,"cow"),"fish");
    }
    @Test
    @DisplayName("test that my set raises index out of bound for invalid numbers")
    public void test_ForInvalidIndex(){
        MyArrayList lists = new MyArrayList();
        assertThrows(IndexOutOfBoundsException.class,()->lists.set(2,"fish"));
    }
    @Test
    @DisplayName("test that when i pss in an element index it returns the element index")
    public void test_Get_Element_ByIndex(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("cat");
        assertEquals("cat",lists.get(1));
    }
    @Test
    @DisplayName("test that when the position is Invalid to get element it throws index out of bound")
    public void test_That_Index_OutOf_Bound_throws(){
        MyArrayList lists = new MyArrayList();
        assertThrows(IndexOutOfBoundsException.class,()->lists.get(0));
    }
    @Test
    @DisplayName("Test nn")
    public void test_That_Index_OutOf_Bound(){
        MyArrayList lists = new MyArrayList();
        for(int i=0;i<40;i++){
            lists.add("fish");
        }
        assertEquals(lists.size(),40);
    }
    @Test
    @DisplayName("test that when i remove an element from my arrray it return the element")
    public void test_RemoveWith_Index(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("cat");
        lists.add("cow");
        assertEquals("cow", lists.remove(2));
    }
    @Test
    @DisplayName("test that when i remove an element the subsequnt element take the position")
    public void test_Remove_Element(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("cat");
        lists.add("cow");
        lists.remove(1);
        assertEquals(lists.get(1),"cow");
        assertEquals(lists.size(),2);
        lists.remove(0);
        assertEquals(lists.size(),1);
        assertEquals(lists.get(0),"cow");
    }
    @Test
    @DisplayName("test that if the index passed in lesser than 1 or greater than count it throws error")
    public void Remove_Throws(){
        MyArrayList lists = new MyArrayList();
        assertThrows(IndexOutOfBoundsException.class,()-> lists.remove(2));
    }
    @Test
    @DisplayName("test that when i remove an element with their name")
    public void test_Remove_Element_With_Name(){
        MyArrayList lists = new MyArrayList();
        lists.add("fish");
        lists.add("cat");
        lists.add("cow");
        lists.add("fish");
        assertTrue(lists.remove("fish"));
        assertEquals(lists.size(),2);
        assertEquals(lists.indexOf("cat"),0);
        assertEquals(lists.size(),3);
        System.out.println(lists.size());
        assertEquals(lists.indexOf("fish"),2);

    }

}
