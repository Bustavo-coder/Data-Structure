package Set;

import ArrayList.MyArrayList;
public class MySet extends MyArrayList {
   @Override
    public void add(Object value) {
      for(Object obj : elements){
          if(obj== value)throw new IllegalArgumentException("Duplicate value");
      }
      super.add(value);
   }
}
