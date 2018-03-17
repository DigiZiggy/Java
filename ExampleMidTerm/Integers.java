import java.util.*;


public class Integers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] jada = new int[5];
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Input 1 integer please:");
                jada[i] = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("This in not an integer, please start again!");
                break;
            }

        }
        System.out.println("The following are your chosen numbers:");
        Arrays.stream(jada).forEach(System.out::println);

        System.out.println("And the sum of all those numbers is:");
        int sum = 0;
        for (int i = 0; i < jada.length; i++) {
            System.out.print(jada[i]);
            sum += jada[i];
            if (i == 4) {
                System.out.print(" = ");
            } else {
                System.out.print(" + ");
            }
        }
        System.out.print(sum);
    }
}
