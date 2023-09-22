package valid;

import domain.ExceptionMessage;

public class Validator {
    private String regex = "^[0-9]*$";

    public void validatePrice(String money) {
        if (!money.matches(regex)) {
            throw new IllegalArgumentException(ExceptionMessage.TYPE_ERROR.getMessage());
        }

        Integer price = Integer.valueOf(money);

        if (price < 1000) {
            throw new IllegalArgumentException(ExceptionMessage.MIN_PRICE_ERROR.getMessage());
        }

        if (price % 1000 != 0) {
            throw new IllegalArgumentException(ExceptionMessage.PRICE_UNIT_ERROR.getMessage());
        }
    }

    public void validateNumbers(String inputValue) {
        String regex = "\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2}";

        if (!inputValue.matches(regex)) {
            throw new IllegalArgumentException(ExceptionMessage.REGEX_ERROR.getMessage());
        }
    }
}
