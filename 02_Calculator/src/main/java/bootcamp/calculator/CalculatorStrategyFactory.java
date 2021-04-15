package bootcamp.calculator;

public class CalculatorStrategyFactory {
  private final String operator;

  public CalculatorStrategyFactory(String operator) {
    this.operator = operator;
  }

  public CalculatorStrategy build() {
    switch (operator) {
      case "+": {
        return new Add();
      }
      case "-": {
        return new Subtract();
      }
      case "x": {
        return new Multiply();
      }
      case "/": {
        return new Divide();
      }
      default: {
        throw new IllegalArgumentException("operator not recognised");
      }
    }
  }
}
