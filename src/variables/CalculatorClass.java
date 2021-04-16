package variables;

public class CalculatorClass extends TestCalculator{

    // using non-void method where we have to return value

    public double additoin (double num1, double num2) {
        double total1 = num1 + num2;
        return total1;
    }
    public double subtraction (double num3, double num4) {
        double total2 = num3 - num4;
        return total2;
    }
    public double multiplication (double num5, double num6 ) {
        double total3 = num5 * num6;
        return total3;
    }
    public double division (double num7, double num8) {
        double total4 = num7 / num8;
        return total4;
    }
}
