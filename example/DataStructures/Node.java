package org.example.DataStructures;

public class Node<T extends Number> {
    T data;
    Node<T> next;
    public Node(Node<T> n){
        next = n;
    }
    public Node(T obj, Node<T> n){
        data = obj;
        next = n;
    }
    public T getData(){
        return data;
    }
    public Node<T> getNext(){
        return next;
    }
}
