package bootcamp.app;

import bootcamp.calculator.Calculator;
import bootcamp.data.Params;
import java.math.BigDecimal;

/**
 * TODO: The application should be able to handle 3 arguments (first number, second number, operation).
 * The application should write the results to the standard output.
 */
public class CalculatorApp {
    public static void main(final String[] args) {

        final BigDecimal x = new BigDecimal(args[0]); //required to convert CLI arg from String to BD
        final BigDecimal y = new BigDecimal(args[1]);
        final String operator = args[2]; //not necessary, but more readable

        Params params = new Params(x,y,operator);
        Calculator calculator = new Calculator();

        BigDecimal result = calculator.calculate(params);

        System.out.println(result);
    }
}
