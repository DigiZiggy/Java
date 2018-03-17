public class CalculatorClass {

    public static void main (String args[]) {

        Calculator a = new CalculatorHelper(5, 7);
        Calculator b = new CalculatorHelper(6, 9);

        System.out.println(a.ruutjuur(5));
        System.out.println(a.ruut(3));

        System.out.println(b.ruutjuur(5));
        System.out.println(b.ruut(3));
    }
}
