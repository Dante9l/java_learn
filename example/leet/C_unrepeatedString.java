package leet;

import java.util.HashMap;
import java.util.Map;

public class C_unrepeatedString {
    public int lengthOfLongestSubstring(String s){
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 如果当前字符已经存在，并且它的索引在当前窗口的范围内
            if (map.containsKey(ch) && map.get(ch) >= start) {
                // 更新窗口的起始位置到重复字符之后的位置
                start = map.get(ch) + 1;
            }

            // 更新或添加当前字符的最新索引
            map.put(ch, i);

            // 更新最大长度
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }
}
