package kkonii.week1;

import java.util.List;
public class Problem1 {
    static Range range = new Range();
    static Calculation cal = new Calculation();
    static Result result = new Result();

    public static Integer solution(List<Integer> pobi, List<Integer> crong) {
        return result.game(pobi, crong);
    }
    static class Range{
        private static final Integer MAX_PAGE = 400;
        private static final Integer MIN_PAGE = 1;

        public boolean range(List<Integer> player){
            return isContinuous(player) && isCorrectRange(player) && isCorrectLength(player);
        }

        private boolean isCorrectRange(List<Integer> player){
            if(player.get(0) > MIN_PAGE && player.get(0) < MAX_PAGE && player.get(1) > MIN_PAGE && player.get(1) < MAX_PAGE) {
                return true;
            }
            return false;
        }

        private boolean isCorrectLength(List<Integer> player){
            if(player.size() != 2){
                return false;
            }
            return true;
        }

        private boolean isContinuous(List<Integer> player){
            if(player.get(1) - player.get(0) != 1){
                return false;
            }
            return true;
        }
    }

    static class Calculation{
        private Integer compare(Integer page){
            return Math.max(plus(page),multiple(page));
        }

        private Integer plus(Integer page){
            Integer sum = 0;

            while(page != 0){
                sum += page % 10;
                page /= 10;
            }

            return sum;
        }

        private Integer multiple(Integer page){
            Integer sum = 1;

            while(page != 0){
                sum *= page % 10;
                page /= 10;
            }

            return sum;
        }

        public Integer bigger(List<Integer> player){
            return compare(player.get(0)) > compare(player.get(1)) ? compare(player.get(0)) : compare(player.get(1));
        }
    }

    static class Result{
        public Integer game(List<Integer> pobi, List<Integer> crong){
            Integer result = cal.bigger(pobi) - cal.bigger(crong);

            if(!range.range(pobi) || !range.range(crong)) {
                return -1;
            }

            if(result > 0) {
                return 1;
            }
            if(result < 0) {
                return 2;
            }

            return 0;
        }
    }
}
