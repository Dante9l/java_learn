package org.example.DataStructures;

public class LinkedList<T> {
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
        Node<T> p=head;
        Node<T> q=head.next;
        while (num<pos) {
            p = q;
            q = q.next;
            num++;
        }
        s.next=q;
        p.next=s;
        length++;
        return true;
    }
    public T delete(int pos){
        if(isEmpty()||pos<0||pos>=length) {
            return null;
        }
        int num=1;
        Node<T> p=head;
        Node<T> q=head.next;
        while (num<pos) {
            p = q;
            q = q.next;
            num++;
        }
        p.next=q.next;
        length--;
        return q.data;
    }
    public boolean modify(T obj,int pos){
        if (isEmpty()||pos<0||pos>=length){
            return false;
        }
        int num=1;
        Node<T> p=head.next;
        while (num<pos) {
            p = p.next;
            num++;
        }
        p.data=obj;
        return true;
    }
    public int find(T obj){
        if (isEmpty()){
            return -1;
        }
        int num=1;
        Node<T> p=head.next;
        while (p!=null){
            if (!p.data.equals(obj)){
                p=p.next;
                num++;
            }
            else break;
        }
        if (p==null) return -1;
        return num;
    }
    public T get(int pos){
        if (isEmpty()||pos<0||pos>=length){
            return null;
        }
        int num=1;
        Node<T> p=head.next;
        while (num<pos) {
            p = p.next;
            num++;
        }
        return p.data;
    }
    public void printAll(){
        if (isEmpty()){
            System.out.println("empty");
        }
        else {
            Node<T> p = head.next;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
            System.out.println();
        }
    }
    public void clear(){
        head.next=null;
        length=0;
    }
}