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

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || !Stack.isMatchingPair(stack.pop(), c))
                    return false;

            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

}