package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;

public interface CalculatorStrategy {
  BigDecimal calculate(final Params params);
}
