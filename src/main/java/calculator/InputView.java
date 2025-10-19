package calculator;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        // 커스텀 구분자 형식이면 처리
        if (input.startsWith("//")) {

            // 테스트 코드처럼 "\\n"이 포함된 경우 → 실제 개행 문자로 치환
            if (input.contains("\\n")) {
                return input.replace("\\n", "\n");
            }

            // 실제 콘솔에서 두 줄 입력하는 경우
            String numbers = Console.readLine();
            return input + "\n" + numbers;
        }

        return input;
    }
}
