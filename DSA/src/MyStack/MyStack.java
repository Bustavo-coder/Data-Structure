package MyStack;

public class MyStack {
    int count = 0;
    String [] name = new String[5];

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(String name){
        if(isFull()){
            throw new IllegalArgumentException("Stack is full");
        }
      this.name[count++] = name;
    }

    private boolean isFull(){
        return count == name.length;
    }

    public String pop(){
        if(isEmpty()){
            throw new IllegalArgumentException("Stack is empty");
        }
        return name[--count];
    }
    public String peek(){
        if(isEmpty()){
            throw new IllegalArgumentException("Stack is empty");
        }
        return name[count-=1];
    }

    public int search(String name){
        int position = 1;
        for(int index = count-1; index >= 1; index--){
            if(iscontains(this.name[index], name)){
                return position;
            }else {
                position++;
            }
        }
        return  position;
    }
    private Boolean iscontains(String first , String second){
        return first.equalsIgnoreCase(second);
    }
}
