package calculator;

import camp.nextstep.edu.missionutils.Console;

final class InputView {
    private InputView() { }

    static String readExpression() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return Console.readLine();
    }
}
