package util;

public class InputException {
    public static boolean isCorrectInput(String input){
        return isCorrectRegex(input) && isCorrectLength(input);
    }
    private static boolean isCorrectLength(String input){
        if (input.length() != InputLimit.LENGTH.getValue()) throw new IllegalArgumentException("3자리 숫자를 입력하지 않았습니다.");
        return true;
    }

    private static boolean isCorrectRegex(String input) {
        String input_regex = "^[" + InputLimit.RANGE_MIN.getValue() + "-" + InputLimit.RANGE_MAX.getValue() + "]*$";

        if (!input.matches(input_regex)) throw new IllegalArgumentException("1-9까지의 숫자가 아닌 입력값입니다.");
        return true;
    }
}
