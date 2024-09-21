package org.example.DataStructures;

public class CSqQueue<E> {
    final int MAXSIZE = 100;
    private E[] data;
    private int front, rear;
    public CSqQueue(){
        data = (E[]) new Object[MAXSIZE];
        front = rear = 0;
    }
    public boolean isEmpty() {
        return front == rear;
    }
    public boolean isFull(){
        return (rear+1)%MAXSIZE == front;
    }
    public void push(E x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        data[rear] = x;
        rear = (rear+1)%MAXSIZE;
    }
    public E pop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        E x = data[front];
        front = (front+1)%MAXSIZE;
        return x;
    }
    public E peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return data[front];
    }
    public int size(){
        return (rear-front+MAXSIZE)%MAXSIZE;
    }
}
