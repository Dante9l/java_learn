package DataStructures;

public class SqStack<E> {
    final int INITSIZE = 10;
    private int capacity;
    private E[] data;
    private int top;
    public SqStack(){
        data = (E[]) new Object[INITSIZE];
        capacity = INITSIZE;
        top = -1;
    }
    public void updateCapacity(int newCapacity){
        if(newCapacity < 0){
            throw new IllegalArgumentException("newCapacity should be positive");
        }
        E[] newData = (E[]) new Object[newCapacity];
        for(int i = 0; i < capacity; i++){
            newData[i] = data[i];
        }
        data = newData;
        capacity = newCapacity;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(E e){
        if(top == capacity - 1){
            updateCapacity(capacity * 2);
        }
        data[++top] = e;
    }
    public E pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        if (capacity > INITSIZE && top + 1 == capacity / 4)
            updateCapacity(capacity / 2);
        return data[top--];
    }
    public E peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return data[top];
    }
}
