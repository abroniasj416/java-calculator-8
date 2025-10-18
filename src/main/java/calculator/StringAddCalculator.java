package calculator;

public class StringAddCalculator {
    private static final String DEFAULT_DELIM_REGEX = "[,:]"; // 기본 구분자

    public int add(String input) {
        // 빈 입력 처리
        if (input == null || input.isBlank()) {
            return 0;
        }

        // 커스텀 구분자 파싱
        DelimiterParser.Parsed parsed = DelimiterParser.parse(input, DEFAULT_DELIM_REGEX);

        // 커스텀 + 기본 구분자 모두 반영해 분리
        String[] tokens = parsed.numbers.split(parsed.delimRegex, -1);

        int sum = 0;
        for (String t : tokens) {
            if (t.isEmpty()) continue; // 임시 정책
            int n = Integer.parseInt(t); // 아직 검증 X
            sum += n;
        }

        // TODO: 숫자 형태 검증 및 음수 금지
        // TODO: 공백 트리밍 및 빈 토큰 정책 정리
        return sum;
    }
}
