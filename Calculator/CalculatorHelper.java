public class CalculatorHelper implements Calculator {
    int a;
    int e;

    public CalculatorHelper(int arv_a, int arv_e) {
        a = arv_a;
        e = arv_e;
    }


        public double ruutjuur(int arv) {

        return Math.sqrt(arv);
        }

        public double ruut(int arv) {

        return Math.pow(arv, 2);
        }

        public double exponent(int arv_a, int arv_e) {
            return Math.pow(arv_a, arv_e);

    }
}

