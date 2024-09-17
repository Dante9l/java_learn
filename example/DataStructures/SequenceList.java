package org.example.DataStructures;

import java.util.concurrent.ThreadLocalRandom;

public class SequenceList<T> {
    final int DEFAULT_SIZE = 10;
    private T[] listArray;
    private int length;
    public boolean isEmpty(){
        return length == 0;
    }
    public int length(){
        return length;
    }
    public SequenceList(){
        listArray = (T[])new Object[DEFAULT_SIZE];
        length = 0;
    }
    public SequenceList(int initSize){
        if (initSize < 0){
            System.out.println("error");
            System.exit(1);
        }
        listArray = (T[])new Object[initSize];
        length = 0;
    }
    public boolean add(T x , int pos){
        if (pos < 1 || pos > length + 1){
            return false;
        }
        if (length == listArray.length){
            T[] p =(T[])new Object[length * 2];
            for (int i = 0; i < length; i++)
                p[i] = listArray[i];
            listArray = p;
        }
        for (int i = length; i >= pos; i--)
            listArray[i] = listArray[i - 1];
        listArray[pos - 1] = x;
        length++;
        return true;
    }
    public T delete(int pos){
        if (isEmpty() || pos < 1 || pos > length + 1){
        System.out.println("表为空或值不合法");
        return null;
        }
        T x = listArray[pos - 1];
        for (int i = pos; i < length; i++)
            listArray[i - 1] = listArray[i];
        length--;
        return x;
    }
    public boolean modify(T x,int pos){
        if (isEmpty() || pos < 1 || pos > length + 1){
            System.out.println("表为空或值不合法");
            return false;
        }
        listArray[pos - 1] = x;
        return true;
    }

    public int find(T x){
        if (isEmpty()) {
            System.out.println("表为空");
            return -1;
        }
        for (int i = 0; i < length; i++)
            if (listArray[i].equals(x))
                return i + 1;
        return -1;
    }
    public T get(int pos){
        if (isEmpty() || pos < 1 || pos > length + 1){
            System.out.println("表为空或值不合法");
            return null;
        }
        return listArray[pos - 1];
    }
    public void printAll(){
        for (int i = 0; i < length; i++)
            System.out.print(listArray[i] + "\t");
        System.out.println();
    }
    public void clear(){
        length = 0;
    }
    public T randomAccess(){
        return listArray[ThreadLocalRandom.current().nextInt(0,length + 1)];
    }
}
