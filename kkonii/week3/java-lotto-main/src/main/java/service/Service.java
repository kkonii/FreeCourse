package service;

import domain.Buyer;
import domain.Lotto;
import domain.LottoMaker;
import valid.ValidMessage;
import view.InputView;
import view.OutputView;

public class Service {
    private Buyer buyer = new Buyer();

    public void gameStart() {
        InputView.askPrice();

        String price = buyer.input();

        ValidMessage.viewMessage(price);

        OutputView.noticeTicketNumber(Integer.valueOf(price)/1000);
    }
}
