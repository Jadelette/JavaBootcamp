package bootcamp.app;

import bootcamp.data.Params;
import bootcamp.process.calculator.Calculator;

import java.math.BigDecimal;

public class CalculatorApp {
    public static void main(final String[] args) {
        Params params = new Params(new BigDecimal(args[0]), new BigDecimal(args[1]), args[2]);
        System.out.print(new Calculator().calculate(params));
    }
}