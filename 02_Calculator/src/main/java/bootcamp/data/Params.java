package bootcamp.data;

import bootcamp.calculator.*;

import java.math.BigDecimal;

public class Params {
  private final BigDecimal x;
  private final BigDecimal y;
  private final String operator;

  public Params(final String x, final String y, final String operator) {
    this.x = new BigDecimal(x);
    this.y = new BigDecimal(y);
    this.operator = operator;
  }

  public BigDecimal getX() {
    return x;
  }

  public BigDecimal getY() {
    return y;
  }

  public String getOperator() {
    return operator;
  }
}
