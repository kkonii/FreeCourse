package service;

import domain.Computer;
import domain.User;
import util.ParsingUtil;
import util.RandomUtil;
import view.Guide;
import view.Input;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Service {
    Computer computer = null;
    User user = new User();

    private Integer[] getUserInput(){
        Input.requestUserInput();
        String input = readLine();

        try{
            boolean isCorrect = ParsingUtil.isCorrectInput(input);

            return ParsingUtil.parseUserInput(input, isCorrect);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("게임을 종료합니다.");
        }
        return new Integer[3];
    }

    private Integer[] getRandomNumbers(){
        return RandomUtil.threeRandomNumbers();
    }

    public void startGame(){
        Guide.startMessage();

        user.setNumbers(getUserInput());
    }
}
