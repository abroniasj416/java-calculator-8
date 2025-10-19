package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");

        String input = Console.readLine();
        // 커스텀 구분자 형식이면 한 줄 더 읽어서 합침
        if (input.startsWith("//")) {
            String numbers = Console.readLine();
            input = input + "\n" + numbers;
        }

        StringAddCalculator calculator = new StringAddCalculator();
        int result = calculator.add(input);
        System.out.println("결과 : " + result);
    }
}
