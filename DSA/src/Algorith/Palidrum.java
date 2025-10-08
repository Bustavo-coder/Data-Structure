package Algorith;

public class Palidrum {
    static void main() {

    }
    public static boolean[] palidrumChecker(String [] words){
        boolean [] check = new boolean[words.length];
        for(int i = 0; i < words.length; i++){
            String reverse = "";
            for(int j = words[i].length()-1; j >= 0; j--){
                reverse += words[i].charAt(j);
            }
            check[i] = reverse.equalsIgnoreCase(words[i]);
        }
        return check;
    }
}
