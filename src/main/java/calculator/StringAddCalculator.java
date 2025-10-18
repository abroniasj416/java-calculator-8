package calculator;

public class StringAddCalculator {
    private static final String DEFAULT_DELIM_REGEX = "[,:]"; // 기본 구분자

    public int add(String input) {
        // 빈 입력 처리
        if (input == null || input.isBlank()) {
            return 0;
        }

        // 기본 구분자로 분리
        String[] tokens = input.split(DEFAULT_DELIM_REGEX, -1);

        int sum = 0;
        for (String t : tokens) {
            if (t.isEmpty()) continue; // 임시 정책 (8단계에서 정리)
            int n = Integer.parseInt(t); // 아직 검증 X (6단계에서 추가)
            sum += n;
        }

        // TODO: 5. 커스텀 구분자 //...\n 지원
        // TODO: 6. 숫자/음수 검증
        // TODO: 8. 공백 트리밍 및 빈 토큰 정책 정리
        return sum;
    }
}
