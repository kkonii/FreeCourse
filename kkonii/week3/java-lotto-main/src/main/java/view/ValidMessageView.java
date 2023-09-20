package view;

import util.ParsingUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    private static void viewSplitRegexMessage(String inputValue) {
        String regex = "\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2}";

        if (!inputValue.matches(regex)) {
            throw new IllegalArgumentException("[ERROR] 올바른 입력형식이 아닙니다. ','로 구분해서 입력해주세요.");
        }
    }

    private static void viewNumberOfInputMessage(List<Integer> inputs) {
        if (inputs.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호의 입력 갯수는 6개 입니다.");
        }
    }

    private static void viewRangeOfInputMessage(List<Integer> inputs) {
        for (Integer input : inputs) {
            if (input < 1 || input > 45) {
                throw new IllegalArgumentException("[ERROR] 1-45 사이의 숫자를 입력해 주세요.");
            }
        }
    }
}
