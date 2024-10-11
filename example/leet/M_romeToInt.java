package leet;

import java.util.HashMap;
import java.util.Map;

public class M_romeToInt {
    public static int romeToInt(String s ){
        int num = 0;
        int flag = 0;

        Map<String, Integer> m = new HashMap<>();
        m.put("M", 1000);
        m.put("CM", 900);
        m.put("D", 500);
        m.put("CD", 400);
        m.put("C", 100);
        m.put("XC", 90);
        m.put("L", 50);
        m.put("XL", 40);
        m.put("X", 10);
        m.put("IX", 9);
        m.put("V", 5);
        m.put("IV", 4);
        m.put("I", 1);

        while (flag < s.length()) {
            if (flag + 1 < s.length() && m.containsKey(s.substring(flag, flag + 2))) {
                num += m.get(s.substring(flag, flag + 2));
                flag += 2; // 向前移动两个字符
            } else {
                num += m.get(s.substring(flag, flag + 1));
                flag += 1; // 向前移动一个字符
            }
        }

        return num;
    }
    //---------------------------------------------------------------------------------
    public static int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));

        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));

            sum += preNum < num ? -preNum : preNum;

            preNum = num;
        }

        sum += preNum;
        return sum;
    }

    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
