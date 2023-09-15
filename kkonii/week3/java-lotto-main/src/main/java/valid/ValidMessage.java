package valid;

public class ValidMessage {
    private static void validateLimit(Integer price) {
        if (price < 1000) {
            throw new IllegalArgumentException("[ERROR] 최소 입력 금액은 1000원 입니다.");
        }
    }

    private static void validateUnit(Integer price) {
        if (price % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 금액은 1000원 단위로 입력해야 합니다.");
        }
    }
}
