package variables;

public class TestCalculator {



    public static void main(String[] args) {
        CalculatorClass calc = new CalculatorClass();
        double result1 = calc.additoin(10,20);
        double result2 = calc.subtraction(30,20);
        double result3 = calc.multiplication(10, 5);
        double result4 = calc.division(60,5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
