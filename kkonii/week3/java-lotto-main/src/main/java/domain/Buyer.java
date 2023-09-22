package domain;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Buyer {
    private List<Integer> lotto;
    private int bonus;

    public String input() {
        return Console.readLine();
    }

    private void validate(Integer bonus) {
        //보너스 번호의 1-45범위 검사
        if (bonus < 1 || bonus > 45) {
            throw new IllegalArgumentException(ExceptionMessage.NUMBER_RANGE_ERROR.getMessage());
        }

        //중복되는 숫자 입력 검사
        if (lotto.contains(bonus)) {
            throw new IllegalArgumentException(ExceptionMessage.BONUS_NUMBER_DUPLICATE_ERROR.getMessage());
        }
    }

    public void setLotto(List<Integer> lotto) {
        this.lotto = lotto;
    }
}
