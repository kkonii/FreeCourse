package view;

public class Result {
    public static void countMessage(Integer ballCounts, Integer strikeCounts){
        String message = "";

        if(ballCounts > 0) message = message + ballCounts + "볼 ";
        if(strikeCounts > 0) message = message + strikeCounts + "스트라이크";
        if(ballCounts == 0 && strikeCounts == 0) message = "낫싱";

        System.out.println(message);
    }

    public static void exitGameMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
