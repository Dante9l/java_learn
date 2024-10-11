package leet;

public class H_StringToInt {
    public int myAtoi(String s){
        s = s.trim();
        if(s.isEmpty())
            return 0;

        int sign = 1;
        int result = 0;
        int index = 0;
        int n = s.length();

        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        else if(s.charAt(index) == '+'){
            index++;
        }

        while (index < n && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index++) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10)
                return Integer.MAX_VALUE * sign;

            result = result * 10 + digit;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        H_StringToInt h = new H_StringToInt();
        System.out.println(h.myAtoi("  -42"));
    }
}
