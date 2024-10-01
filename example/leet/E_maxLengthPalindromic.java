package leet;

import java.util.*;

public class E_maxLengthPalindromic {
    public static String manachersAlgorithm(String s){
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for (char c : s.toCharArray()) {
            sb.append(c).append('#');
        }
        String T = sb.toString();

        int n = T.length();
        int[] P = new int[n]; // 回文半径数组
        int C = 0, R = 0; // 中心和右边界

        for (int i = 0; i < n; i++) {
            int mirror = 2 * C - i; // 当前字符的镜像

            if (i < R) {
                P[i] = Math.min(R - i, P[mirror]);
            }

            // 尝试扩展回文
            int a = i + (1 + P[i]);
            int b = i - (1 + P[i]);
            while (a < n && b >= 0 && T.charAt(a) == T.charAt(b)) {
                P[i]++;
                a++;
                b--;
            }

            // 更新中心和右边界
            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }
        }

        // 找到最大回文半径
        int maxLen = 0, centerIndex = 0;
        for (int i = 0; i < n; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }

        // 返回最长回文子串
        int start = (centerIndex - maxLen) / 2; // 转换回原字符串的索引
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(manachersAlgorithm("babad"));
    }
}
