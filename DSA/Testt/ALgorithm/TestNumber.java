package ALgorithm;

import Algorith.Numbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumber {
    @Test
    @DisplayName("test the result")
    public void test() {
        int [] num = {3,2,7,10,5,5};
        int [] result = Numbers.checkNumber(num,8);
        int [] newRewult = {5,3};
        assertArrayEquals(result,newRewult);
    }
    @Test
    @DisplayName("test when i nuumber can devide it return ")
    public void test1() {
        int [] num = {4,5,7,8,9,1,1};
        int [] newResult = {0,0};
        int [] result = Numbers.checkNumber(num,8);
        assertArrayEquals(newResult,result);
    }

}
