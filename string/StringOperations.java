package ee.ttu.iti0202.string;
import java.util.ArrayList;


public class StringOperations {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("aaabbbc")); // abc
        System.out.println(removeDuplicates("")); //
        System.out.println(removeDuplicates("tere")); // tere

        System.out.println(countDigits("12ab3")); // 3
        System.out.println(countDigits("abc")); // 0
        System.out.println(countDigits("1111222")); // 7

        System.out.println(xyBalance("hsahjs")); // true
        System.out.println(xyBalance("aaxbbyaaaxgggyyggxy")); // false
        System.out.println(xyBalance("yaaxbb")); // false
    }

    private static String removeDuplicates(String word) {
        if (word.length() <= 1) {
            return word;
        }
        char[] letters = word.toCharArray();
        ArrayList<Character> result = new ArrayList<Character>();
        char previous = letters[0];
        result.add(previous);
        for (int i = 1; i < letters.length; i++) {
            if (!(previous == letters[i])) {
                result.add(letters[i]);
            }
            previous = letters[i];
        }
        StringBuilder out = new StringBuilder();
        for (Character s : result) {
            out.append(s);
        }
        return out.toString();
    }

    private static Integer countDigits(String digits) {
        int count = 0;
        for (int i = 0; i < digits.length(); i++) {
            if (Character.isDigit(digits.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static Boolean xyBalance(String str) {
        int x = str.lastIndexOf("x");
        int y = str.lastIndexOf("y");
        return x == -1 && y == -1 || x < y;
    }
}
