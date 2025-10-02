package ArrayList;

import java.util.Arrays;

public class MyArrayList {
    private int count = 0;
    private int initialCapacity;
    private Object [] elements;
    public MyArrayList() {
        this.elements = new Object [10];
    }
    public MyArrayList(int initialCapacity) {
        this.elements = new Object [initialCapacity];
    }

    public boolean isEmpty(){
        return count == 0;
    }
    public void add(Object o){
        this.elements[count] = o;
        count++;
        if(count >= this.elements.length){
            increaseArraySize();
        }
    }
    private void increaseArraySize(){
        Object [] newArray = new Object [count * 2];
        for(int index = 0; index < count; index++){
            newArray[index] = elements[index];
        }
        this.elements = newArray;
    }

    public boolean contains(Object o){
        if(count > 0){
            for (Object a : this.elements) {
                if (a.equals(o)) return true;
            }}
        return false;
    }
    public int size(){
        return count;
    }


    public int indexOf(Object o){
        for(int i=0;i<count;i++){
            if(o.equals(this.elements[i])) return i;
        }
        return -1;
    }
    public int lastIndexOf(Object o){
        int index = -1;
        for(int position= 0; position < count;position++){
            if(o.equals(this.elements[position]))index = position;
        }
        return index;
    }
    public Object set(int index, Object o) {
        if (index < 0 || index >= count) throw new IndexOutOfBoundsException("Array index out of bounds");
        Object oldElement = this.elements[index];
        this.elements[index] = o;
        return oldElement;
    }
    public Object get(int index){
        if(index < 0 || index >= count ) throw new IndexOutOfBoundsException("Array index out of bounds");
        return elements[index];
    }
    public Object remove(int index){
        if(index < 0 || index >= count) throw new IndexOutOfBoundsException("Array index out of bounds");
        Object newElement = elements[index];
        elements[index] = null;
        Object store = 0;
        int counter = index + 1;
        for(int position = index;position< size();position++){
          if(elements[position] == null){
           store = elements[position];
           elements[position] = elements[counter];
            elements[counter] = store;
            counter++;
          }
        }
        this.count--;
        return newElement;
    }
    public Boolean remove(Object o){
        int position = indexOf(o);
        remove(position);
        return position > -1;
    }
   public boolean add(int index, Object o){
       if(index < 0 || index >= size()) throw new IndexOutOfBoundsException("Array index out of bounds");
       int counter = count - 1;
       for(int positon = count;positon > index;positon--){
           elements[positon] = elements[counter--];
       }
       elements[index] = o;
       count++;
          return true;

   }
}
