package lessonData.ch3;

import lessonData.ch2.Node;

public class LinkStack<E> {
    private Node<E> top = new Node<>(null);
    private int length;
    public LinkStack(){
        length = 0;
    }
    public boolean isEmpty(){
        return top.next == null;
    }
    public void push(E data){
        if (top.next == null)
            top.next = new Node<>(data);
        else {
            Node a = new Node<>(data);
            a.next = top.next;
            top.next = a;
        }
        length++;
    }
    public E pop(){
        if (isEmpty()) throw new IllegalArgumentException("empty");
        length--;
        return top.next.data;
    }
}
