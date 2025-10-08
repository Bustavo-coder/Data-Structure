package TestSet;

import ArrayList.MyArrayList;
import Set.MySet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMySet {
    @Test
    @DisplayName("test that my set is empty")
    public void testThatMySetIsEmpty() {
        MyArrayList set = new MySet();
        set.add("cow");
        assertThrows(IllegalArgumentException.class,()->set.add("cow"));
    }
}
