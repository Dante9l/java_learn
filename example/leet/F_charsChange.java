package leet;

import java.util.ArrayList;
import java.util.List;

public class F_charsChange {
    public  String charsChange(String s, int numRows){
        if (numRows == 1) return s;

        List<StringBuilder> rows =new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRows = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()){
            rows.get(curRows).append(c);
            if (curRows == 0 || curRows == numRows - 1)
                goingDown = !goingDown;
            curRows += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows)
            result.append(row);
        return result.toString();
    }
}
