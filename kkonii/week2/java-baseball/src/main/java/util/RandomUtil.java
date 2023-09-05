package util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomUtil {
    public static Integer[] threeRandomNumbers(){
        Integer[] numbers = new Integer[3];

        for (int i=0;i<numbers.length;i++){
            Integer randomNumber = Randoms.pickNumberInRange(1, 9);

            numbers[i] = getOnlyNumber(numbers, i, randomNumber);
        }

        return numbers;
    }

    private static Integer getOnlyNumber(Integer[] numbers, int i, Integer randomNumber){
        while(isDuplicated(numbers, i, randomNumber)){
            randomNumber = Randoms.pickNumberInRange(1, 9);
        }

        return randomNumber;
    }

    private static boolean isDuplicated(Integer[] numbers, int i, Integer randomNumber){
        for (int j=0;j<i;j++) {
            if (numbers[j] == randomNumber) return true;
        }
        return false;
    }
}
