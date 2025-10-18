package calculator;

public class Application {
    public static void main(String[] args) {
        // 입력만 받는다 (계산/출력은 이후에)
        String input = InputView.readExpression();

        int result = new StringAddCalculator().add(input);

        // 결과 출력
        OutputView.printResult(result);

        // TODO: 공백/빈 토큰 정책 리팩터링 반영 후 최종 안정화
    }
}
