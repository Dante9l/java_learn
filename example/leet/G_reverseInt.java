package leet;

public class G_reverseInt {
    public int reverseInt(int x){
        int result = 0;
        while (x != 0) {
            // 提取x的最后一位
            int pop = x % 10;
            x /= 10;

            // 检查反转后的结果是否溢出
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // 溢出，返回0
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // 溢出，返回0
            }

            // 反转数字并构造新结果
            result = result * 10 + pop;
        }
        return result;
    }
}
