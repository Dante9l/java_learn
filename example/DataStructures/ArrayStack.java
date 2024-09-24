package DataStructures;

public class ArrayStack<T> {
    T[] array;
    private int top;
    private int capacity;
    public ArrayStack(){
        capacity = 1;
        array = (T[])new Object[capacity];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity - 1;
    }
    public void push(T data){
        if(isFull())
            doubleStack();
        array[++top] = data;
    }
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return array[top--];
    }
    public void delete(){
        top = -1;
    }
    private void doubleStack(){
        T[] newArray = (T[])new Object[capacity * 2];
        System.arraycopy(array, 0, newArray, 0, capacity);
        capacity *= 2;
        array = newArray;
    }
    public void print(){
        for(int i = 0; i <= top; i++)
            System.out.println(array[i]);
    }
}
