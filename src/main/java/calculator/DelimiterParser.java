package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class DelimiterParser {
    // //{delim}\n{numbers}
    private static final Pattern CUSTOM = Pattern.compile("^//(.+)\\n(.*)$");

    static Parsed parse(String input, String defaultRegex) {
        Matcher m = CUSTOM.matcher(input);
        if (!m.matches()) {
            return new Parsed(defaultRegex, input);
        }
        String rawDelim = m.group(1);
        String numbers = m.group(2);

        // 정규식 특수문자 이스케이프
        String escaped = Pattern.quote(rawDelim);
        String delimRegex = defaultRegex + "|" + escaped;
        return new Parsed(delimRegex, numbers);
    }

    static final class Parsed {
        final String delimRegex;
        final String numbers;
        Parsed(String delimRegex, String numbers) {
            this.delimRegex = delimRegex;
            this.numbers = numbers;
        }
    }

    private DelimiterParser() { }
}
