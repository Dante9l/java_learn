package org.example.DataStructures;

public class LinkStack<E> {
    private Node<E> head;
    private int size;
    public LinkStack(){
        head = new Node<E>();
        size = 0;
    }
    public boolean isEmpty(){
        return head.next == null;
    }
    public boolean push(E e){
        Node<E> newNode = new Node<E>(e);
        newNode.next = head.next;
        head.next = newNode;
        size++;
        return true;
    }
    public E pop(){
        if(isEmpty()){
            return null;
        }
        Node<E> oldNode = head.next;
        head.next = head.next.next;
        size--;
        return oldNode.data;
    }
    public E peek(){
        if(isEmpty()){
            return null;
        }
        return head.next.data;
    }
}
