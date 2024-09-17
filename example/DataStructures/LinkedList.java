package org.example.DataStructures;

public class LinkedList<T extends Number> {
    private Node<T> head;
    private int length;
    public LinkedList(){
        length=0;
        head=new Node<T>(null);
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int size(){
        return length;
    }
    public Node<T> getHead() {
        return head;
    }
    public boolean add(T obj,int pos){
        if(pos<0||pos>length){
            return false;
        }
        Node<T> s = new Node<T>(obj,null);
        int num=1;
        Node<T> node=head;
        Node<T> next=head.next;
        while (num<pos) {
            node = next;
            next = next.next;
            num++;
        }
        s.next=next;
        node.next=s;
        length++;
        return true;
    }
    public boolean add(T obj){
        Node<T> s = new Node<T>(obj,null);
        Node<T> node=head;
        Node<T> next=head.next;
        while (next!=null) {
            node = next;
            next = next.next;
        }
        node.next=s;
        length++;
        return true;
    }
    public T delete(int pos){
        if(isEmpty()||pos<0||pos>=length) {
            return null;
        }
        int num=1;
        Node<T> node=head;
        Node<T> next=head.next;
        while (num<pos) {
            node = next;
            next = next.next;
            num++;
        }
        node.next=next.next;
        length--;
        return next.data;
    }
    public boolean modify(T obj,int pos){
        if (isEmpty()||pos<0||pos>=length){
            return false;
        }
        int num=1;
        Node<T> next=head.next;
        while (num<pos) {
            next = next.next;
            num++;
        }
        next.data=obj;
        return true;
    }
    public int find(T obj){
        if (isEmpty()){
            return -1;
        }
        int num=1;
        Node<T> next=head.next;
        while (next!=null){
            if (!next.data.equals(obj)){
                next=next.next;
                num++;
            }
            else break;
        }
        if (next==null) return -1;
        return num;
    }
    public T get(int pos){
        if (isEmpty()||pos<0||pos>=length){
            return null;
        }
        int num=1;
        Node<T> next=head.next;
        while (num<pos) {
            next = next.next;
            num++;
        }
        return next.data;
    }
    public void printAll(){
        if (isEmpty()){
            System.out.println("empty");
        }
        else {
            Node<T> next = head.next;
            while (next != null) {
                System.out.print(next.data + " ");
                next = next.next;
            }
            System.out.println();
        }
    }
    public void clear(){
        head.next=null;
        length=0;
    }
    public void deleteNative(){
        Node<T> node=head;
        Node<T> next = (node != null) ? node.next : null;

        while (next!=null){
            if (next.data.doubleValue() < 0) {
                node.next = next.next;
            } else {
                node = next;
            }
            next = node.next;
        }
    }
    public void deleteNumber(int x,int y){
        Node<T> node=head;
        Node<T> next = (node != null) ? node.next : null;

        while (next!=null){
            if (next.data.doubleValue() < y|| next.data.doubleValue() > y) {
                node.next = next.next;
            } else {
                node = next;
            }
            next = node.next;
        }
    }
}