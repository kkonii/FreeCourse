package domain;

public class Computer {
    private Integer strikeCount;
    private Integer ballCount;
    private Integer[] balls;

    public void resetComputer(){
        setStrikeCount(0);
        setBallCount(0);
    }

    public void increaseStrike(){
        strikeCount++;
    }

    public void increaseBall(){
        ballCount++;
    }
    public Integer getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(Integer strikeCount) {
        this.strikeCount = strikeCount;
    }

    public Integer getBallCount() {
        return ballCount;
    }

    public void setBallCount(Integer ballCount) {
        this.ballCount = ballCount;
    }

    public Integer[] getBalls() {
        return balls;
    }

    public void setBalls(Integer[] balls) {
        this.balls = balls;
    }
}
