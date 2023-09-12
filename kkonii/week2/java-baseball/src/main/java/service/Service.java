package service;

import camp.nextstep.edu.missionutils.Console;
import domain.Computer;
import domain.User;
import util.InputException;
import util.ParsingUtil;
import util.RandomUtil;
import view.Guide;
import view.Input;
import view.Result;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Service {
    Computer computer = new Computer();
    User user = new User();

    private Integer[] getUserInput(){
        Input.requestUserInput();
        String input = readLine();

        try{
            boolean isCorrect = InputException.isCorrectInput(input);

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

    public void initComputer(){
        computer.resetComputer();
        computer.setBalls(getRandomNumbers());
    }

    public void initUser(){
        user.setNumbers(getUserInput());
    }

    private void increaseAllUserCounts(){
        for(int i=0;i<3;i++){
            increaseCounts(user.getNumbers(), computer.getBalls(), i);
        }
    }

    private Integer getContainsIndex(Integer userNumber, Integer[] computerNumbers){
        List<Integer> computerNumbersList = Arrays.asList(computerNumbers);

        return computerNumbersList.indexOf(userNumber);
    }

    private void increaseCounts(Integer[] userNumbers, Integer[] computerNumbers, int j){
        Integer getIndex = getContainsIndex(userNumbers[j], computerNumbers);

        if(getIndex == j) {
            computer.increaseStrike();
        }

        if(getIndex >= 0 && getIndex != j) {
            computer.increaseBall();
        }
    }

    public void play(){
        Integer strikeCounts = 0;
        Integer ballCounts = 0;

        while(strikeCounts < 3){
            computer.resetComputer();
            initUser();
            increaseAllUserCounts();
            Result.countMessage(computer.getBallCount(), computer.getStrikeCount());
            strikeCounts = computer.getStrikeCount();
            ballCounts = computer.getBallCount();
        }

        Result.exitGameMessage();
    }

    public String getUserRestartInput(){
        return Console.readLine();
    }
}
