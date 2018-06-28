public class FunctionTest {

    public static void main(String[] args) {

        int[] intList = {};
        double[] floatlist = {};

        FunctionCopy funktsioon = new FunctionCopy(intList, floatlist);
  //      funktsioon.Calculate();
        funktsioon.output(funktsioon.Calculate());

    }
}