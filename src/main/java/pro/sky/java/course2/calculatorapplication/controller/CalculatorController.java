package pro.sky.java.course2.calculatorapplication.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculatorapplication.service.CalculatorService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator/")
public class CalculatorController {
    private final CalculatorService calculatorService;

    @GetMapping
    public String welcome(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1", required = false) Double a, @RequestParam(name = "num2", required = false) Double b) {
        if (a==null || b==null) return "Пустое поле запроса";
        double plus = calculatorService.plus(a, b);
        return a + " + " + b + " = " + plus;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1", required = false) Double a, @RequestParam(name = "num2", required = false) Double b) {
        if (a==null || b==null) return "Пустое поле запроса";
        double minus = calculatorService.minus(a, b);
        return a + " - " + b + " = " + minus;
    }

    @GetMapping("/multiple")
    public String multiple(@RequestParam(name = "num1", required = false) Double a, @RequestParam(name = "num2", required = false) Double b) {
        if (a==null || b==null) return "Пустое поле запроса";
        double multiple = calculatorService.multiple(a, b);
        return a + " * " + b + " = " + multiple;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", required = false) Double a, @RequestParam(name = "num2", required = false) Double b) {

        double divide;
        try {
         divide = calculatorService.divide(a, b);
        } catch (Throwable e) {
            return e.getMessage();
        }

        return a + " / " + b + " = " + divide;
    }

}
