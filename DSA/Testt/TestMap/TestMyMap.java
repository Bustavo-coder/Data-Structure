package TestMap;

import Map.MyMap;
import Set.MySet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyMap {
    @Test
    @DisplayName("test that my map returns the Empty")
public void test_isEmpty() {
        MyMap map = new MyMap();
        assertTrue(map.isEmpty());
    }
    @Test
    @DisplayName("test that when i add element my map is not empty")
    public void test_addElement() {
        MyMap map = new MyMap();
        map.put("Name",1);
        assertFalse(map.isEmpty());
    }
    @Test
    @DisplayName("test that when i add an element to my map i can get the size")
    public void test_size() {
        MyMap map = new MyMap();
        map.put("Name",1);
        map.put("farid",2);
        map.put("yemi",4);
        assertEquals(3, map.size());
    }
    @Test
    @DisplayName("test that when i remove a key value my size reduce")
    public void test_removeKey() {
        MyMap map = new MyMap();
        map.put("Name",1);
        map.put("farid",2);
        map.put("yemi",4);
        map.remove("yemi");
        assertEquals(2, map.size());
    }
    @Test
    @DisplayName("test that i can not use null as my key")
    public void test_removeNullKey() {
        MyMap map = new MyMap();
        assertThrows(NullPointerException.class,()->map.put(null,"ade"));
    }
    @Test
    @DisplayName("test that =when i add an element to My Map it returns the null if key does not exist")
    public void test_addKey() {
        MyMap map = new MyMap();
        assertNull(map.put("ade",23));
    }
    @Test
    @DisplayName("test that when i add key that is in my map before it return the old key Value")
    public void test_addKeyBefore() {
        MyMap map = new MyMap();
        map.put("Name",1);
        assertEquals(1, map.put("Name",2));
    }
    @Test
    @DisplayName("test that when i pass have the key i can get the value")
    public void getValue() {
        MyMap map = new MyMap();
        map.put("Name",1);
        map.put("farid",2);
        map.put("yemi",4);
        map.put("Farid","ade");
        assertEquals("ade", map.get("Farid"));
    }
    @Test
    @DisplayName("test that when i pass a key that my map does not have it returns null")
    public void test_UnAvailable_Key(){
        MyMap map = new MyMap();
        map.put("Name",1);
        map.put("farid",2);
        map.put("yemi",4);
        map.put("Farid","ade");
        assertEquals("ade", map.get("Farid"));
        assertNull(map.get(1));
    }
    @Test
    @DisplayName("test that i can remove a key from my Map")
    public void remove_Element(){
        MyMap map = new MyMap();
        map.put("Name",1);
        map.put("farid",2);
        map.put("yemi",4);
        assertEquals(4,map.remove("yemi"));
    }
   @Test
    @DisplayName("test that when i remove two key from my map the size reduce")
    public void test_removeTwoKey(){
        MyMap map = new MyMap();
        map.put("Name",1);
        map.put("farid",2);
        map.put("yemi",4);
        map.remove("Name");
        map.remove("farid");
        assertEquals(1,map.size());
    }
    @Test
    @DisplayName("test that when i remove a key that not in my map")
    public void test_removeKeyNotInMap(){
        MyMap map = new MyMap();
        assertNull( map.remove("Name"));
    }
    @Test
    @DisplayName("test that i check if a key is in my map")
    public void test_getAllKeys() {
        MyMap map = new MyMap();
        map.put("Name",1);
        map.put("farid",2);
        map.put("yemi",4);
        assertTrue(map.containsKey("yemi"));
    }
    @Test
    @DisplayName("test that when i pass a null pointer has a key it throws")
    public void test_ForNullPointer_Key(){
        MyMap map = new MyMap();
        assertThrows(NullPointerException.class,()->map.containsKey(null));
    }
    @Test
    @DisplayName("test that i can check if a value is in my map")
    public void test_ForValue(){
        MyMap map = new MyMap();
        map.put("Name",1);
        map.put("farid",2);
        assertTrue(map.containsValue(1));
    }
    @Test
    @DisplayName("test that i can get all the keys in my map")
    public void test_GetAllKeysInMap(){
        MyMap map = new MyMap();
        map.put("Name",1);
        map.put("farid",2);
        map.put("yemi",4);
        System.out.println(map.toString());
    }
    }

