package calculator;

public class StringAddCalculator {
    public int add(String input) {
        // 빈 입력 처리
        if (input == null || input.isBlank()) {
            return 0;
        }

        // TODO: 기본 구분자(, :)로 분리하여 합산
        // TODO: 커스텀 구분자 //...\n 지원
        // TODO: 비숫자/음수 입력에 대해 IllegalArgumentException
        // TODO: 공백 트리밍 및 빈 토큰 정책 정리

        // 임시(다음 단계 전까지) — 아직 합산 로직 없음
        return 0;
    }
}
