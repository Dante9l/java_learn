package lessonData.ch2;

public class LinkedList<T> {
    private Node<T> head;
    private int length;
    public LinkedList() {
        length = 0;
        head = new Node<T>((T) null);
    }
    public LinkedList(Node head){
        this.head = new Node<T>((T) null);
        this.head.next = head;
        while (head.next != null){
            head = head.next;
            length++;
        }
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
    public static Node middle(Node head){
        Node slow = head.next;
        Node fast = head.next.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void reversePrint(Node node){
        if(node.next == null) {
            System.out.print("<-" + node.data);
            return;
        }
        LinkedList.reversePrint(node.next);
        System.out.print("<-" + node.data);
    }
    public static LinkedList deleteNumber(LinkedList<Integer> list, int value){
        Node temp = list.head;
        while (temp.next != null)
            if(temp.next.data.equals(value))
                temp.next = temp.next.next;
             else
                temp = temp.next;

        return list;
    }
    public static LinkedList moveNegative(LinkedList<Integer> list){
        Node pre = list.head;
        Node cur = list.head.next;
        while (pre.next != null){
            if((int)cur.data < 0){
                pre.next = cur.next;
                cur.next = list.head.next;
                list.head.next = cur;
                cur = pre.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return list;
    }
    public static LinkedList select(LinkedList<Integer> a,LinkedList<Integer> b){
        Node temp = a.head;
        Node temp2 = b.head;
        while (temp.next != null){

        }
        return a;
    }
    public static Node contains(Node d, LinkedList t){
        Node head = t.head.next;
        while(head != null){
            if (d.data.equals(head.data))
                return null;
            head = head.next;
        }
        return d;
    }
    public static LinkedList<Integer> diff(LinkedList<Integer> one, LinkedList<Integer> two){
        LinkedList<Integer> diff = new LinkedList();
        Node h = diff.head, tem = one.head.next;

        while (tem != null){
            if (LinkedList.contains(tem, two) != null) {
                h.next = new Node(contains(tem, two).data);
                h = h.next;
            }
            tem = tem.next;
        }
        return diff;
    }
    public static LinkedList merge(LinkedList<Integer> a, LinkedList<Integer> b){
        Node curOne = a.head.next, curTwo = b.head.next;
        LinkedList<Integer> target = new LinkedList<>();
        Node cur = target.head;

        while(curOne != null && curTwo != null){
            if ((int)curOne.data < (int)curTwo.data){
                cur.next = curOne;
                curOne = curOne.next;
            } else {
                cur.next = curTwo;
                curTwo = curTwo.next;
            }
            cur = cur.next;
        }

        if (curOne != null)
            cur.next = curOne;
        else if(curTwo != null)
            cur.next = curTwo;
        return target;
    }


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2,1);
        list.add(3,2);
        list.add(3,3);
        list.add(5,4);
        list.print();
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(-1,1);
        list2.add(2,2);
        list2.add(3,3);
        list2.add(8,4);
        list2.print();
        LinkedList.diff(list, list2).print();
    }
}