package lessonData.ch3;

public class Queue<E> {
    final int MAX_SIZE = 100;
    private E[] data;
    private int front, rear;
    public Queue() {
        data = (E[]) new Object[MAX_SIZE];
        front = rear = -1;
    }
    public boolean isEmpty() {
        return front == rear;
    }
    public void enqueue(E item) {
        if((rear + 1) % MAX_SIZE == front)
            throw new IllegalArgumentException("Queue is full");
        rear = (rear + 1) % MAX_SIZE;
        data[rear] = item;
    }
    public E dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("Queue is empty");
        front = (front + 1) % MAX_SIZE;
        return data[front];
    }
    public E peek() {
        if(isEmpty())
            throw new IllegalArgumentException("Queue is empty");
        return data[(front + 1) % MAX_SIZE];
    }
}
