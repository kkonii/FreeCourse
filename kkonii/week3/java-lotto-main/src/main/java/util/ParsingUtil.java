package util;

import java.util.ArrayList;
import java.util.List;

public class ParsingUtil {
    public static List<Integer> parseStringList(String[] StringValue) {
        List<Integer> list = new ArrayList<>();

        for (String str : StringValue) {
            list.add(Integer.valueOf(str));
        }

        return list;
    }
}
