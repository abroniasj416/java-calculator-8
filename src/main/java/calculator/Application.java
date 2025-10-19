package calculator;

public class Application {
    public static void main(String[] args) {
        String input = InputView.readInput();
        StringAddCalculator calculator = new StringAddCalculator();
        int result = calculator.add(input);
        OutputView.printResult(result);
    }
}

