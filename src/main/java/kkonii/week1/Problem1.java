package kkonii.week1;

import java.util.List;
public class Problem1 {
    public static String solution(List<Integer> player) {

    }
    static class Range{
        public boolean range(List<Integer> player){
            return isContinuous(player) && isCorrectRange(player) && isCorrectLength(player);
        }

        private boolean isCorrectRange(List<Integer> player){
            if(player.get(0) > 1 && player.get(0) < 400 && player.get(1) > 1 && player.get(1) < 400) {
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
}
