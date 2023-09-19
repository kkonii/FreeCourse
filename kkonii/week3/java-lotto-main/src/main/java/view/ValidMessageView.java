package view;

public class ValidMessageView {
    public static void viewMessage(String money) {
        validateType(money);

        Integer price = Integer.valueOf(money);

        validateLimit(price);
        validateUnit(price);
    }

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

    private static void validateType(String money) {
        String regex = "^[0-9]*$";

        if (!money.matches(regex)) {
            throw new IllegalArgumentException("[ERROR] 금액은 숫자 이외의 문자는 입력할 수 없습니다.");
        }
    }
}
