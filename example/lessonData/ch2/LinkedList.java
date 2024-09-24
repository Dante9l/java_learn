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
    public boolean add(T value) {
        Node<T> tem = new Node<T>(value);
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = tem;
        length++;
        return true;
    }
    public boolean add(T value,int pos) {
        if(pos < 0 || pos > length + 1)
            return false;

        Node<T> tem = new Node<T>(value);
        int flag = 1;
        Node<T> pre = head;
        Node<T> q = head.next;
        while (flag < pos){
            pre = q;
            q = q.next;
            flag++;
        }
        pre.next = tem;
        tem.next = q;
        length++;
        return true;
    }
    public T remove(int pos) {
        if(pos < 0 || pos > length + 1)
            return null;

        int flag = 1 ;
        Node<T> temp = head;
        while (flag < pos){
            temp = temp.next;
            flag++;
        }
        T target = temp.next.data;
        temp.next = temp.next.next;
        length--;
        return target;
    }
    public T value(int pos) {
        if(pos < 0 || pos >= length) {
            return null;
        }

        int flag = 1;
        Node<T> temp = head;
        while (flag < pos){
            temp = temp.next;
            flag++;
        }
        T target = temp.next.data;
        return target;
    }
    public int find(T value) {
        if (head.next == null) {
            return -1;
        }
        int flag = 1;
        Node<T> temp = head;
        while (temp != null) {
            if (temp.next.data.equals(value)) {
                return flag;
            }
            temp = temp.next;
            flag ++;
        }
        return -1;
    }
    public boolean modify(T value, int pos) {
        if(pos < 0 || pos > length + 1) {
            return false;
        }
        Node<T> temp = head;
        int flag = 1;
        while (flag < pos){
            temp = temp.next;
            flag++;
        }
        temp.next.data = value;
        return true;
    }
    public void print(){
        Node<T> temp = head.next;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void middle(LinkedList list){
        Node slow = list.head.next;
        Node fast = list.head.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void reversePrint(Node node){
        if(node.next == null) {
            System.out.print("<-" + node.data);
            return;
        }
        LinkedList.reversePrint(node.next);
        System.out.print("<-" + node.data);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(20,1);
        list.add(21,2);
        list.add(22,3);
        list.add(23,4);
        list.add(24,5);
        list.print();
        list.remove(3);
        list.print();
        list.modify(55,3);
        list.print();
        System.out.println(list.find(55));
        System.out.println(list.value(3));
        LinkedList.reversePrint(list.head);
    }
}