package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;
import java.math.MathContext;

public class Add implements CalculatorStrategy {
  @Override
  public BigDecimal calculate(Params params) {
    BigDecimal result = params.getX().add(params.getY());
    MathContext m = new MathContext(2);
    return result.round(m).stripTrailingZeros();
  }
}
