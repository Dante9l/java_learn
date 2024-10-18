package leet;


import java.util.Stack;

public class T_isValid {
    public boolean isValid(String s){
        Stack stack = new Stack<String>();

        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);

            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                if (!isMatching((char) stack.pop(), c))
                    return false;
            }
        }

        return stack.isEmpty();
    }
    private boolean isMatching(char open, char close){
        return (open == '(' && close == ')' ||
                open == '[' && close == ']' ||
                open == '{' && close == '}');
    }
}
