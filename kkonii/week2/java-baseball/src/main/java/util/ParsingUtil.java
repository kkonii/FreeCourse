package util;

public class ParsingUtil {
    public static Integer[] parseUserInput(String input, boolean isCorrect){
        Integer[] numbers = new Integer[3];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = charToInteger(input, isCorrect);
        }

        return numbers;
    }

    private static Integer charToInteger(String input, boolean isCorrect){
        Integer number = null;

        for(int i=0; isCorrect && i<input.length() ;i++){
            number = Character.getNumericValue(input.charAt(i));
        }

        return number;
    }


    public static boolean isCorrectInput(String input){
        return isCorrectRegex(input) && isCorrectLength(input);
    }
    private static boolean isCorrectLength(String input) throws IllegalArgumentException{
        if (input.length() != 3) throw new IllegalArgumentException("3자리 숫자를 입력하지 않았습니다.");
        return true;
    }

    private static boolean isCorrectRegex(String input) throws IllegalArgumentException{
        if (!input.matches("^[1-9]*$")) throw new IllegalArgumentException("1-9까지의 숫자가 아닌 입력값입니다.");
        return true;
    }

}
