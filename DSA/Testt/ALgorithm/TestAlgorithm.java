package ALgorithm;

import Algorith.Palidrum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAlgorithm {
    @Test
    @DisplayName("test that function is working")
    public void test() {
        String [] words = {"Racecar","Hello","cohort","madam","pap"};
        boolean [] check = Palidrum.palidrumChecker(words);
        boolean [] result = {true,false,false,true,true};
        assertArrayEquals(check,result);
    }
}
