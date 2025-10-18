package calculator;

public class Application {
    public static void main(String[] args) {
        // 입력만 받는다 (계산/출력은 이후에)
        String input = InputView.readExpression();

        int result = new StringAddCalculator().add(input); // 빈/공백 입력 시 0

        // TODO: 7. 결과를 화면에 출력
    }
}
