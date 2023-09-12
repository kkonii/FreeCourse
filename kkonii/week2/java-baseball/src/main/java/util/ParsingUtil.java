package util;

public class ParsingUtil {

    public static Integer[] parseUserInput(String input, boolean isCorrect){
        Integer[] numbers = new Integer[InputLimit.LENGTH.getValue()];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = charToInteger(input, isCorrect, i);
        }

        return numbers;
    }

    private static Integer charToInteger(String input, boolean isCorrect, int i){
        Integer number = 0;

        number = Character.getNumericValue(input.charAt(i));

        return number;
    }
}
