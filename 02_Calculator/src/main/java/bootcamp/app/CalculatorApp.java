package bootcamp.app;

import bootcamp.calculator.*;
import bootcamp.data.Params;

import java.math.BigDecimal;

public class CalculatorApp {
  public static void main(final String[] args) {
    final String x = args[0];
    final String y = args[1];
    final String operator = args[2];
    Params params = new Params(x, y, operator);
    Calculator calculator = new Calculator(params);

    BigDecimal result = calculator.calculate(params);

    System.out.println(result);
  }
}
