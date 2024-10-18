package lessonData.ch3;

public class Stack<E> {
    final int initCapacity = 10;
    private int capacity;
    private E[] data;
    private int top;
    public Stack(){
        data = (E[]) new Object[initCapacity];
        capacity = initCapacity;
        top = -1;
    }
    private void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity];
        for(int i = 0; i < top; i++)
            newData[i] = data[i];
        capacity = newCapacity;
        data = newData;
    }
    public boolean isEmpty(){return top == -1;}
    public void push(E e){
        if(top == capacity - 1)
            resize(2 * (top + 1));
        data[++top] = e;
    }
    public E pop(){
        if(isEmpty())
            throw new IllegalArgumentException("Stack is empty");
        E e = data[top--];
        if(top + 1 == capacity / 4 && capacity > initCapacity)
            resize(capacity / 2);
        return e;
    }
    public E peek(){
        if (isEmpty())
            throw new IllegalArgumentException("Stack is empty");
        return data[top];
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean flag = false;

        for (char c : s.toCharArray()) {
            if (c == '@') {
                flag = true;
                continue;
            }
            if (!flag)
                stack.push(c);
            else
                isMatching(stack.pop(), c);
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return (open == 'I' && close == 'O');
    }

    public static String toOx(int i){
        Stack<Integer> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        while (i != 0){
            stack.push(i % 8);
            i /= 8;
        }

        while (!stack.isEmpty()) str.append(stack.pop());
        return str.toString();
    }

    private static int precedence(char op) {
        return (op == '+' || op == '-') ? 1 : (op == '*' || op == '/') ? 2 : (op == '^') ? 3 : -1;
    }

    // 判断是否为操作符
    private static boolean isOperator(char c) {
        return "+-*/^".indexOf(c) != -1;
    }

    // 中缀表达式转后缀表达式
    public static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (char c : expression.toCharArray()) {
            // 操作数直接加入输出
            if (Character.isLetterOrDigit(c))
                output.append(c);
            // 左括号压栈
            else if (c == '(')
                stack.push(c);

            // 右括号处理
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                stack.pop(); // 弹出左括号
            }
            // 处理操作符
            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    output.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // 弹出剩余的操作符
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }
    public static void main(String[] args) {
        System.out.println(isValid("123456@654321"));
        System.out.println(isValid("123321"));
        System.out.println(isValid("123@32"));
        System.out.println(toOx(100));
        System.out.println(infixToPostfix("(56-2)/(4+2)"));
    }
}