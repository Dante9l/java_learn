package lessonData.ch2;

public class SequenceList<T> {
    final int defaultSize = 10; // 顺序表中一维数组的初始长度
    private T[] listArray; // 存储元素的数组对象
    private int length;    // 保存顺序表的当前长度

    public SequenceList() { // 构造一个空顺序表
        length = 0;  // 线性表初始为空
        listArray = (T[]) new Object[defaultSize];
    }

    public SequenceList(int n) { // 构造一个能最多容纳n个元素的空顺序表
        if (n <= 0) {
            System.out.println("error");
            System.exit(1);
        }
        length = 0; // 线性表初始为空
        listArray = (T[]) new Object[n];
    }

    public boolean add(T obj, int pos) {
        // 1. 判断输入的参数是否合法
        if (pos < 0 && pos > length + 1){
            System.out.println("error");
            return false;
        }
        // 2. 判断顺序表长度，进行数组扩容
        if (length == listArray.length) {
            T[] newList = (T[]) new Object[length * 2];
            for (int i = 0; i < length; i++)
                newList[i] = listArray[i];
            listArray = newList;
        }
        // 3. 移动元素，找到插入位置
        for (int i = length; i >= pos; i--) {
            listArray[i] = listArray[i - 1];
        }
        // 4. 插入obj元素
        listArray[pos - 1] = obj;
        length++;
        return true;
    }

    public T remove(int pos) {
        // 1. 判断空表
        if (isEmpty()) {
            System.out.println("顺序表为空");
            return null;
        }
        // 2. 判断输入参数pos是否正确
        else if (pos < 0 || pos > length - 1) {
            System.out.println("error");
            return null;
        }
        // 3. 取出待删除的元素
        T obj = listArray[pos - 1];
        // 4. pos之后的元素往前移动一个位置，返回删除元素
        for (int i = pos; i < length; i++) {
            listArray[i - 1] = listArray[i];
        }
        length--;
        return obj;
    }

    public int find(T obj) {
        if (isEmpty()) {
            System.out.println("顺序表为空");
            return -1;
        }
        for (int i = 0; i < length; i++) {
            if (listArray[i].equals(obj)) {
                return i + 1;
            }
        }
        return -1; // 未查找指定元素
    }

    public T value(int pos) {
        if (isEmpty()) {
            System.out.println("顺序表为空");
            return null;
        }
        if (pos < 1 || pos > length) {
            System.out.println("pos值不合法");
            return null;
        }
        return listArray[pos - 1];
    }

    // pos：待更新的位置，从1开始，obj：待更新的元素
    public boolean modify(T obj, int pos) {
        if (isEmpty()) {
            System.out.println("顺序表为空");
            return false;
        }
        if (pos < 1 || pos > length) { // 更新位置非法
            System.out.println("error");
            return false;
        }
        listArray[pos - 1] = obj;
        return true;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public void nextOrder() {
        for (int i = 0; i < length; i++) {
            System.out.print(listArray[i] + "\t");
        }
        System.out.println("\n");
    }

    public void clear() {
        length = 0;
    }

    @Override
    public String toString() {    //将线性表转换为字符串
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < length; i++) {
            ans.append(listArray[i]).append(" ");
        }
        return ans.toString();
    }

    public void swap(int i, int j) {
        T temp = listArray[i - 1];
        listArray[i - 1] = listArray[j - 1];
        listArray[j - 1] = temp;
    }

    public void setSize(int len) {
        if (len < 1 || len > length + 1) {
            throw new IllegalArgumentException("设置长度:n不在有效范围内");
        }
        length = len;
    }
    public static void reverse(SequenceList<Integer> s){
        int first = 1 , end = s.size();
        while(first < end)
            s.swap(first++,end--);
    }
    public static void deleteNagative(SequenceList<Integer> s){
        int Lindex = 1;
        for (int Rindex = 1; Rindex <= s.length; Rindex++) {
            if (s.value(Rindex) >= 0)
                s.swap(Lindex++ , Rindex);
        }
        s.length = Lindex - 1;
    }
    public static void deleteRangeNumber(SequenceList<Integer> s,int x, int y){
        int Lindex = 1;
        if (x > y) {
            x^=y;
            y^=x;
            x^=y;
        }
        for (int Rindex = 1; Rindex <= s.length; Rindex++) {
            if (s.value(Rindex) > y || s.value(Rindex) < x)
                s.swap(Lindex++ , Rindex);
        }
        s.length = Lindex - 1;
    }
    public static void moveNagative(SequenceList<Integer> s){
        int Lindex = 1;
        for (int Rindex = 1; Rindex <= s.length; Rindex++) {
            if (s.value(Rindex) < 0)
                s.swap(Lindex++ , Rindex);
        }
    }
    public static void main(String[] args) {
        SequenceList<Integer> list = new SequenceList<>(10);
        for (int i = 1; i <= 12; i++)
            list.add(i, i);
        list.add(-5 , 2);
        list.nextOrder();
        list.add(-8,12);
        list.add(-6,1);
        list.nextOrder();
        SequenceList.moveNagative(list);
        list.nextOrder();
        SequenceList.deleteNagative(list);
        list.nextOrder();
        SequenceList.deleteRangeNumber(list, 2, 5);
        list.nextOrder();

    }
}