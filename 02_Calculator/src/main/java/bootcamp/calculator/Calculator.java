package bootcamp.calculator;

import bootcamp.data.Params;

import java.math.BigDecimal;

public class Calculator {
    private CalculatorStrategy strategy;

    public Calculator(Params params) {
        strategy = new CalculatorStrategyFactory(params.getOperator()).build();
    }

    public BigDecimal calculate(Params params){
        return strategy.calculate(params);
    }
}