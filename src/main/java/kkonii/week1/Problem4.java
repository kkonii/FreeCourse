package kkonii.week1;

public class Problem4 {
    public static String solution(String word) {
        char[] spellings  = word.toCharArray();

        for(int i=0;i<spellings.length;i++){
            if(Character.isLowerCase(spellings[i])) spellings[i] = (char)(219 - spellings[i]);
            if(Character.isUpperCase(spellings[i])) spellings[i] = (char)(155 - spellings[i]);
        }

        return String.valueOf(spellings);
    }
}