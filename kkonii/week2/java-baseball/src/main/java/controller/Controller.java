package controller;

import camp.nextstep.edu.missionutils.Console;
import service.Service;
import view.Guide;
import view.Input;
import view.Result;

public class Controller {
    private Service service = new Service();

    public void game(){
        startGame();
        playGame();
        exitGame();
    }

    private void startGame() throws IllegalArgumentException{
        Guide.startMessage();

        service.initComputer();
    }

    private void playGame(){
        service.play();
    }

    private void exitGame(){
        Input.requestRestartInput();

        if (service.getUserRestartInput().equals("1")) game();
    }
}
