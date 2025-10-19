package calculator;

public class StringAddCalculator {
    private static final String DEFAULT_DELIM_REGEX = "[,:]"; // 기본 구분자

    public int add(String input) {
        // 빈 입력 처리
        if (input == null || input.isBlank()) {
            return 0;
        }

        // 선행/후행 공백 제거
        String trimmed = input.trim();

        // 커스텀 구분자 파싱(정규식 이스케이프 포함)
        DelimiterParser.Parsed parsed = DelimiterParser.parse(trimmed, DEFAULT_DELIM_REGEX);
        String[] tokens = parsed.numbers.split(parsed.delimRegex, -1);

        int sum = 0;
        for (String tokenRaw : tokens) {
            String token = tokenRaw.trim();
            if (token.isEmpty()) continue; // 최종 정책: 빈 토큰 무시

            // 숫자 형태 검증
            if (!token.chars().allMatch(Character::isDigit)) {
                throw new IllegalArgumentException("숫자만 입력 가능합니다.");
            }

            int n = Integer.parseInt(token);

            // 음수 금지
            if (n < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다.");
            }

            sum += n;
        }

        return sum;
    }
}
