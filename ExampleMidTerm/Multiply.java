public class Multiply {

    private Double number1;
    private Double number2;

    //konstruktor 1
    Multiply(){
        number1 = 0.0;
        number2 = 0.0;
    }
    // konstruktor 2
    Multiply(Double a, Double b){
        number1 = a;
        number2 = b;
    }

    Double calculate() {
        return number1 + number2;
    }


}
