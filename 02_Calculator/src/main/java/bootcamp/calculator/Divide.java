package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Divide implements CalculatorStrategy {
  @Override
  public BigDecimal calculate(Params params) {
    BigDecimal result = params.getX().divide(params.getY(), 1, RoundingMode.HALF_DOWN);
    MathContext m = new MathContext(2);
    return result.round(m).stripTrailingZeros();
  }
}
