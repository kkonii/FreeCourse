package valid;

public class ValidMessage {
    private static void validateLimit(Integer price) {
        if (price < 1000) {
            throw new IllegalArgumentException("[ERROR] 최소 입력 금액은 1000원 입니다.");
        }
    }
}
