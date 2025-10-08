package Algorith;

public class Numbers {
    public static int [] checkNumber(int[] numbers, int number) {
        int[] counter = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) continue;
                if(numbers[i] + numbers[j] == number) {
                    counter[0] = numbers[i];
                    counter[1] = numbers[j];
                    break;
                }
            break;
            }
        }
        return counter;
    }
}