package kkonii.week1;

public class Problem2 {
    static Process process = new Process();

    public static String solution(String cryptogram) {
        StringBuffer cryptoBuffer = new StringBuffer(cryptogram);

        return process.removeDuplicateIndexes(cryptoBuffer);
    }

    static class Process{
        private Integer firstDuplicatedIndex(StringBuffer buffer){
            for(int i=0;i<buffer.length()-1;i++){
                if(buffer.charAt(i) == buffer.charAt(i+1)) return i;
            }
            return -1;
        }

        private String removeDuplicateIndexes(StringBuffer buffer){
            while(firstDuplicatedIndex(buffer) != -1){
                buffer.delete(firstDuplicatedIndex(buffer),firstDuplicatedIndex(buffer)+2);
            }
            return buffer.toString();
        }
    }
}