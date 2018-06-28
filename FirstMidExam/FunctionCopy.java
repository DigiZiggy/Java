import java.util.*;


public class FunctionCopy implements Func {

    public static int[] intJada;
    public static double[] floatJada;


    public FunctionCopy(int[] intJada, double[] floatJada) {
        this.floatJada = floatJada;
        this.intJada = intJada;

    }

    public double Calculate() {

        Scanner input = new Scanner(System.in);

        System.out.println("The following calculation will be made: [(float + int/int + int/int + float) / " +
                "(int/int + float + int/int)] + [((float - float) * int/int) / float * float]");
        int[] intJada = new int[10];
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Input 1 integer number please:");
                intJada[i] = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("This in not an integer, please start again!");
                break;
            }
        }

        Double[] floatJada = new Double[7];
        for (int i = 0; i < 7; i++) {
            try {
                System.out.println("Input 1 float number please:");
                floatJada[i] = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("This in not a float, please start again!");
                break;
            }
        }


        Double sum1 = floatJada[0] + ((double) intJada[0] / (double) intJada[1]) + ((double) intJada[2] / (double) intJada[3]) + floatJada[1];

        Double sum2 = ((double) intJada[4] / (double) intJada[5]) + floatJada[2] + ((double) intJada[6] / (double) intJada[7]);

        Double first = sum1 / sum2;

        Double secondSum1 = ((floatJada[3] - floatJada[4]) * ((double) intJada[8] / (double) intJada[9]));

        Double secondSum2 = (floatJada[5] * floatJada[6]);

        Double second = secondSum1 / secondSum2;

        Double finalSum = first + second;


        System.out.println("Those are the entered floats: " + Arrays.toString(floatJada));
        System.out.println("And following are the entered full integers: " + Arrays.toString(intJada));
        System.out.println("And the value of the function calculated is:");
        System.out.println("Answer: " + finalSum);
        output(finalSum);
        return finalSum;

    }

        public double output(double vastus){
            return vastus;
        }
    }
