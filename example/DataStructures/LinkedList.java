package org.example.DataStructures;

public class LinkedList<T extends Number> {
    private Node<T> head;
    private int length;
    public LinkedList(){
        length=0;
        head=new Node<T>(null);
    }
    public void creatListF(T[] t){
        for (T value : t) {
            Node<T> s = new Node<T>(value);
            s.next = head.next;
            head.next = s;
        }
    }
}