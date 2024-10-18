package leet;

import java.util.*;

public class Q_mixChar {
    public static List<String> letterCombinations(String digits){
        Map<Character, List<String>> map = new HashMap<>();
        map.put('2', Arrays.asList("a","b","c"));
        map.put('3', Arrays.asList("d","e","f"));
        map.put('4', Arrays.asList("g","h","i"));
        map.put('5', Arrays.asList("j","k","l"));
        map.put('6', Arrays.asList("m","n","o"));
        map.put('7', Arrays.asList("p","q","r","s"));
        map.put('8', Arrays.asList("t","u","v"));
        map.put('9', Arrays.asList("w","x","y","z"));
        List<String> list = new ArrayList<>();

        if (digits.isEmpty()) return list;
        else {
            Q_mixChar.backTrack(list, map, digits, 0, new StringBuilder());
            return list;
        }
    }

    private static void backTrack(List<String> list, Map<Character, List<String>> map, String digits, int index, StringBuilder path){
        if(index == digits.length()){
            list.add(path.toString());
            return;
        }

        List<String> letter = map.get(digits.charAt(index));

        for (String s : letter){
            path.append(s);
            Q_mixChar.backTrack(list, map, digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        List<String> l = letterCombinations("23");
        for (String s : l){
            System.out.println(s);
        }
    }
}