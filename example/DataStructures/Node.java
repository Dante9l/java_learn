package org.example.DataStructures;

public class Node<E> {
    E data;
    Node<E> next;
    public Node(E data){ //constructor
        this.data = data;
        next = null;
    }
    public Node(){
        next = null;
    }
}
