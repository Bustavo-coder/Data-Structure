package Map;
import ArrayList.MyArrayList;
import Set.MySet;

import java.util.Arrays;

public class MyMap {
    int counter = 0;
    MyArrayList lists = new MyArrayList();
    MySet keys = new MySet();
    public boolean isEmpty(){
        return counter == 0;
    }
    public Object put(Object key,Object value){
        if(key == null)throw new NullPointerException("Does Not Allow Null Key");
        counter++;
        if(keys.contains(key)){
            int index = keys.indexOf(key);
            Object oldObj = lists.get(index);
            lists.set(index,value);
            return oldObj;
        }
        keys.add(key);
        lists.add(value);
        return null;
    }
    public int size(){
        return counter;
    }
    public Object remove(Object key){
        if(keys.contains(key)){
            int index = keys.indexOf(key);
            keys.remove(key);
            Object oldValue = lists.remove(index);
            counter--;
            return oldValue;
        }
        return null;
    }
    public Object get(Object key){
        if(keys.contains(key)) return lists.get(keys.indexOf(key));
        else return null;
    }
    public boolean containsKey(Object key){
        if(key == null) throw new NullPointerException("Does Not Allow Null Key");
        return keys.contains(key);
    }
    public boolean containsValue(Object value){
        return lists.contains(value);
    }
    public Object keySet(){
        return keys;
    }
    public Object values(){
        return lists;
    }

    @Override
    public String toString() {
        String newString = "[";
        for(int i = 0; i < lists.size(); i++){
            newString += lists.get(i) + " : " + keys.get(i) + "\n";
        }
        return newString;
    }
}
