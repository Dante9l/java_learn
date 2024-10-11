package leet;

public class N_exitsStr {
    public static String main(String[] strs) {
        if (strs.length == 0) return "";
        String str = strs[0];

        for (String s : strs){
            if (s.isEmpty())
                return "";
            while (s.indexOf(str) != 0)
                str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
