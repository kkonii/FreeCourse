package domain;

public enum ExceptionMessage {
    HEADLINE("[ERROR] "),
    MIN_PRICE_ERROR("최소 입력 금액은 1000원 입니다."),
    PRICE_UNIT_ERROR("금액은 1000원 단위로 입력해야 합니다."),
    TYPE_ERROR("숫자만 입력하세요."),
    REGEX_ERROR("올바른 입력형식이 아닙니다. ','로 구분해서 입력해주세요."),
    LOTTO_SIZE_ERROR("로또 번호의 입력 갯수는 6개 입니다."),
    NUMBER_RANGE_ERROR("1-45 사이의 숫자를 입력해 주세요."),
    LOTTO_DUPLICATE_ERROR("로또에 중복되는 숫자가 있습니다."),
    BONUS_NUMBER_DUPLICATE_ERROR("6자리 로또에 입력한 숫자는 입력할 수 없습니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return HEADLINE + message;
    }

}
