package util;

public class ParsingUtil {
    public static Integer[] parseUserInput(String input){
        Integer[] numbers = new Integer[3];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = charToInteger(input);
        }

        return numbers;
    }

    private static Integer charToInteger(String input){
        Integer number = null;

        for(int i=0;i< input.length();i++){
            number = Character.getNumericValue(input.charAt(i));
        }

        return number;
    }
}
