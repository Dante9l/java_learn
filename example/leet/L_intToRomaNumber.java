package leet;

public class L_intToRomaNumber {
    public String intToRoman(int num){
        int[] i = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder str = new StringBuilder();

        for (int a =0; a< 13; a++){
            while (num / i[a] != 0){
                num -= i[a];
                str.append(s[a]);
            }
        }

        return str.toString();
    }
}
