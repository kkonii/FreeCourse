package controller;

import camp.nextstep.edu.missionutils.Console;
import service.Service;
import view.Guide;
import view.Input;
import view.Result;

public class Controller {
    private Service service = new Service();

    private void startGame() throws IllegalArgumentException{
        Guide.startMessage();

        service.initComputer();
    }

    private void playGame(){
        service.play();
    }
}
