package lessonData.ch2;

public class Node<E> {
    E data;
    Node<E> next;
    public Node(E data){ //constructor
        this.data = data;
        next = null;
    }
    public Node(Node<E> next){ //constructor
        this.next = next;
    }
    public Node(E data, Node<E> next){ //constructor
        this.data = data;
        this.next = next;
    }
    public E getData(){
        return data;
    }
    public Node<E> getNext(){
        return next;
    }
}
