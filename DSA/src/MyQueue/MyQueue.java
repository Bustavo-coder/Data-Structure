package MyQueue;

import java.util.NoSuchElementException;

public class MyQueue{
    int count ;
    Object [] object = new Object[5];
    int top = 0;
    public Boolean isEmpty() {
        return count == 0;
    }
    public void add(Object object) {
        if(isFull()) throw new IllegalStateException("Queue is full");
        if(object==null) throw new NullPointerException("Object is Null Can not be added to my queue");
        this.object[count++] = object;
    }
    private boolean isFull(){
        return count == object.length;
    }
    public Object element(){
        if(isEmpty()) throw new NoSuchElementException("Queue is empty");
        return object[top];
    }
    public Object remove(){
        if(isEmpty()) throw new NoSuchElementException("Queue is empty");
        return object[top++];
    }

}