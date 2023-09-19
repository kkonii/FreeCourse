package domain;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Buyer {
    private List<Integer> lotto;
    private int bonus;

    public String input() {
        return Console.readLine();
    }
}
