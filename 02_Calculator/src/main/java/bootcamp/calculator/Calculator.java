package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;
import java.math.*;

public class Calculator {
    public BigDecimal calculate(final Params params) {
        BigDecimal result;
        MathContext m = new MathContext(2);

        switch (params.getOperator()) {
            case "+": {
                result = params.getX().add(params.getY());
            }
            break;
            case "-": {
                result = params.getX().subtract(params.getY());
            }
            break;
            case "x": {
                result = params.getX().multiply(params.getY());
            }
            break;
            case "/": {
                result = params.getX().divide(params.getY(), 1, RoundingMode.HALF_DOWN);
            }
            break;
            default: {
                throw new IllegalArgumentException("operator not recognised");
            }
        }
        return result.round(m).stripTrailingZeros();
    }
}