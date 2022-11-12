package pro.sky.java.course2.calculatorapplication.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculatorapplication.exception.DivisionByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double plus(Double a, Double b) {
        return a + b;
    }

    @Override
    public double minus(Double a, Double b) {
        return a - b;
    }

    @Override
    public double multiple(Double a, Double b) {
        return a * b;
    }

    @Override
    public double divide(Double a, Double b) {
        if(b==0) {throw new DivisionByZeroException();}
        return (double) a / b;
    }
}
