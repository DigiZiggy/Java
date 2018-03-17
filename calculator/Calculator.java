package ee.ttu.iti0202.calculator;

public class Calculator {


    public static void main(String[] args) {
        System.out.println(convertName("Burroughs")); // "BUR-9hs"
        System.out.println(convertName("abc")); // "ABC-3bc"
        System.out.println(convertName("")); // "ERROR"
        System.out.println(addition(2, 3)); // "2 + 3 = 5
        System.out.println(repeat("a", 3)); // "aaa"
        System.out.println(line(4, false)); // "----"
        System.out.println(line(4, true)); // ">--<"

        // bonus
        System.out.println(center("ab", 5, LongerPad.LEFT));  // "  ab "
        System.out.println(center("ab", 5, LongerPad.RIGHT)); // " ab  "
        System.out.println(center("bacon", 3, LongerPad.LEFT));  // "aco"
        System.out.println(center("abcde", 2, LongerPad.LEFT));
        System.out.println(display(2, 3, "abc", "addition", 20));
        /*
         *              ABC-3bc
         * >------------------<
         * |     2 + 3 = 5    |
         * --------------------
         */
        System.out.println(display(1, 1, "cheese", "z", 1));
        /*
         * CHE-6se
         * >-----<
         * |ERROR|
         * -------
         */

    }

    private enum LongerPad {LEFT, RIGHT}

    /**
     * Return a string following a naming convention.
     * [first three letters in uppercase]-[length of string][last two letters of string in lowercase]
     * If length of string is less than 3, return "ERROR".
     *
     * @param s original name
     */
    private static String convertName(String s) {
        if (s.length() < 3) {
            return "ERROR";
        } else {
            return s.substring(0, 3).toUpperCase() + "-" + s.length() + s.substring(s.length() - 2, s.length()).toLowerCase();
        }
    }

    /**
     * Return an expression that sums the numbers a and b.
     * Example: a = 3, b = 7 -> "3 + 7 = 10"
     */
    private static String addition(int a, int b) {
        int sum = a + b;
        return a + " + " + b + " = " + sum;
    }

    /**
     * Return an expression that subtracts b from a.
     * Example: a = 3, b = 1 -> "3 - 1 = 2"
     */
    private static String subtraction(int a, int b) {
        int sub = a - b;
        return a + " - " + b + " = " + sub;
    }

    /**
     * Repeat the input string n times.
     */
    private static String repeat(String s, int n) {
        String result = "";
        for (int i = 0; i < n; i += 1) {
            result += s;
        }
        return result;
    }

    /**
     * Create a line separator using "-". Width includes the decorators if it has any.
     *
     * @param width     width of the line, which includes the decorator, if it has one
     * @param decorated if True, line starts with ">" and ends with "<", if False, consists of only "-"
     *                  If decorated and width is 1, return an empty string ("").
     */
    private static String line(int width, boolean decorated) {
        if (!decorated && width == 1) {
            return "";
        } else if (!decorated) {
            return repeat("-", width);
        } else {
            String result = "";
            for (int i = 0; i < width - 2; i += 1) {
                result += "-";
            }
            return ">" + result + "<";
        }
    }

    /**
     * Create a line separator using "-".
     *
     * @param width width of the line.
     */
    private static String line(int width) {
        return "";
    }

    /**
     * Center justify a string.
     * <p>
     * "a", 3, LongerPad.LEFT -> " a "
     * <p>
     * When the string does not fit exactly:
     * If LongerPad.LEFT make the left padding longer, otherwise the right padding should be longer.
     * "ab", 5, LongerPad.LEFT  -> "  ab "
     * "ab", 5, LongerPad.RIGHT -> " ab  "
     * <p>
     * If the width is smaller than the length of the string, return only the center part of the text.
     * "abcde", 2, LongerPad.LEFT  -> "bc" or "cd" (both are fine)
     * <p>
     * Return an empty string ("") if the width is negative.
     *
     * @param s     string to center
     * @param width width of the outcome
     * @param pad   left longer if LongerPad.LEFT, pad right longer if LongerPad.RIGHT
     * @return new center justified string
     */
    private static String center(String s, int width, LongerPad pad) {
        return "";
    }

    /**
     * Create a string representing the display.
     * Use LongerPad.LEFT when centering.
     * Width of the display must be set to the assigned width or expression width, whichever is bigger.
     * If the operation is not valid, display "ERROR".
     *
     * @param a         number
     * @param b         number
     * @param name      full name of calculator company
     * @param operation operation ("addition" or "subtraction") applied to numbers a and b
     * @param width     width of the display
     * @return string representing the final format
     */
    private static String display(int a, int b, String name, String operation, int width) {
        return "";
    }

}
