package ee.ttu.iti0202.decoder;
import java.util.ArrayList;


public class Decoder {

    /**
     * Method deciphers given message based on the dictionary.
     *
     * The message consists of a series of numbers, which point to a letter's
     * index location in the dictionary. e.g. with a dictionary of "abcd" and
     * message of "3021" the deciphered message would be "dacb".
     *
     * If the index of the letter is comprised of 2 or more numbers, the message will
     * read as those numbers separated by plus signs. e.g. 1+3 => 13 ; 1+2+3 => 123.
     *
     * For every "$" symbol that appears in the message, the next
     * letter must be converted to upper case.
     *
     * Any other symbols appearing in the message should be added to the
     * deciphered message untouched.
     *
     * @param dictionary - dictionary to be used.
     * @param message - message to be deciphered.
     * @return - deciphered message.
     * Enter dictionary: abc
    Enter message: $001
    Decoded message: Aab
    Enter message: 112
    Decoded message: bbc
     */
    private static String decodeMessage(String dictionary, String message) {
        if (dictionary.length() == 0 || message.length() == 0) {
            return message;
        } else {
            char[] letters = dictionary.toCharArray();
            ArrayList<Character> dictList = new ArrayList<Character>();
            for (int i = 1; i < letters.length; i++) {
                dictList.add(letters[i]);
            }

            ArrayList<Character> result = new ArrayList<Character>();
            for (int i = 0; i < message.length(); i++) {
                if (message.charAt(i) == '+') {
                    if (result.size() > 0){
                        result.remove(result.size() - 1);
                    }
                    String num = message.substring(i - 1, i) + message.substring(i + 1, i + 2);
                    int number = Integer.parseInt(num);
                    i++;
                    if ((i - 3) >= 0 && message.charAt(i - 3) == '$') {
                        result.add(Character.toUpperCase(letters[number]));
                    } else {
                        result.add(letters[number]);
                    }
                } else if (message.charAt(i) == '$') {
                    if (Character.isDigit(message.charAt(i + 1)) && i + 1 < message.length()) {
                        result.add(Character.toUpperCase(letters[Character.getNumericValue(message.charAt(i + 1))]));
                        i++;
                    } else {
                        result.add(message.charAt(i));
                        i += 2;
                    }
                } else if (!Character.isDigit(message.charAt(i))) {
                    result.add(message.charAt(i));
                } else {
                    result.add(letters[Character.getNumericValue(message.charAt(i))]);
                }
            }
            StringBuilder out = new StringBuilder();
            for (Character s : result) {
                out.append(s);
            }
            return out.toString();
        }
    }

    public static void main(String[] args) {
        //    System.out.println(Decoder.decodeMessage("a", "....0")); // =>

        //    System.out.println(Decoder.decodeMessage("", "Hello world!")); // => Hello world!

        System.out.println(Decoder.decodeMessage("abcdefghijklmnopqrstuvwxyz", "$1+1 !")); // => Hello world!

        //    System.out.println(Decoder.decodeMessage("onetw", "$0 $000011+11111$111111$2, 3 .40")); // => One, two

        //    System.out.println(Decoder.decodeMessage("catnip", "$0$1$5$2$1$4$3")); // => CAPTAIN

        //    System.out.println(Decoder.decodeMessage("race", "0123210")); // => racecar

        // Bonus

        // Dictionary of 100 * "a" + "abcdefghijklmnopqrstuvwxyz"
        StringBuilder dictionary  = new StringBuilder();
        for (int i = 0; i < 100; i++) dictionary.append("a");
        dictionary.append("abcdefghijklmnopqrstuvwxyz");

        System.out.println(Decoder.decodeMessage(dictionary.toString(), "$1+0+71+0+41+1+11+1+11+1+4 1+2+21+1+41+1+71+1+11+0+3!")); // => Hello world!

    }

}
