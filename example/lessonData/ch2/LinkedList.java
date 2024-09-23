package lessonData.ch2;

public class LinkedList<T> {
    private Node<T> head;
    private int length;
    public LinkedList() {
        length = 0;
        head = new Node<T>((T) null);
    }
    public Node<T> getHead() {
        return head;
    }
    public int size() {
        return length;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public void clear(){
        length = 0;
    }
}
