package lessonData.ch4;

public class SqString {
    private int maxSize = 10; // 串中字符数组的初始长度
    public char[] chars; // 存储元素的数组对象
    public int length; // 保存串的当前长度

    // 构造一个空串
    public SqString() {
    }

    // 构造一个能保存n个字符的串
    public SqString(int n) {
        this.maxSize = n;
        this.chars = new char[n];
        this.length = 0;
    }

    public SqString(char[] x) {
        this.maxSize = x.length;
        this.chars = new char[x.length];
        this.length = x.length;
        for (int i = 0; i < x.length; i++) {
            this.chars[i] = x[i];
        }
    }

    // 将串t复制给当前串
    public void copy(SqString t) {
        if (this.maxSize < t.maxSize) {
            this.maxSize = t.maxSize;
            this.chars = new char[this.maxSize];
        }
        for(int i = 0; i < t.chars.length; i++){
            this.chars[i] = t.chars[i];
        }
    }

    public boolean isEmpty() {
        return false;
    } // 判断当前串是否为空

    // 将当前串与串t进行比较，若当前串等于串t，则返回值=0；若当前串>串t，则返回值1；若当前串<串t，则返回值-1
    public int compare(SqString t) { //
        int i = 0;
        while (this.chars[i] == t.chars[i] && i < this.length && i < t.getLength()) {
            i++;
        }
        if (i == this.length && i == t.length) {
            return 0;
        } else if (i == t.getLength() && i < this.length) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getLength() {
        return this.length;
    } // 求当前串的长度

    public boolean clear() {
        return false;
    } // 清空当前串

    public void concat(SqString t) { // 将指定串t联接到当前串中
        if (this.maxSize < this.length + t.getLength()) {
        //若当前串无法容纳串t的内容，则先扩充当前串的容量
            //将当前串中的内容暂存到数组a中
            char[] a = new char[this.length];
            for (int i = 0; i < this.length; i++) {
                a[i] = this.chars[i];
            }

            //扩展当前串的容量
            this.maxSize = this.length + t.getLength();
            this.chars = new char[this.maxSize];

            //恢复当前串的原始状态
            for (int i = 0; i < a.length; i++) {
                this.chars[i] = a[i];
            }
        }
        for (int i = this.length - 1; i < t.length; i++){
            this.chars[i] = t.chars[i];
        }
    }

    // 从当前串中的第pos个字符开始连续提续len个字符而得到一个子串
    public SqString subString(int pos, int len) {
        //若提取的子串的起始位置与提取的子串的长度之和超过了当前串的长度，
        //则操作非常并返回空串对象
        if (pos + len > this.length) {
            return null;
        }


        SqString a = new SqString(len);
        int index = 0;

        for (int i = pos - 1; i < pos + len - 1; i++) {
            a.chars[index++] = this.chars[i];
        }
        return a;
    }

    // 从当前串中的第pos个字符开始直到最后一个字符全部提取出来，得到一个子串
    public SqString subString(int pos) { return null; } // 返回串t在当前串中首次出现的位置，若不存在串t，返回-1
    public int index(SqString t) {
        if (this.length < t.getLength()) { return -1; }
        int a = -1;  //设置标志变量a，其默认值表示不存在串t
        for (int i = 0; i < this.length; i++) {//从左往右查找串t
            int j = 0;
            while (j < t.getLength() && this.chars[i + j] == t.chars[j]) {
                if (this.chars[i + j] != t.chars[j]) {
                    break;
                }
                j++;
            }
            if (j == t.getLength())  {//如果找到了串t，则记录它在当前串中的起始位置
                a = i;
                break;
            }
        }
        return a;
    }

    public int lastIndex(SqString t) {
        return 0;
    } // 返回字符串t在当前串中最后一次出现的位置，若不存在t，返回-1

    public int replace(SqString t, SqString v) {
        return 0;
    } // 在当前串中用串v替换所有与串t相等的子串，并返回替换的次数

    public boolean insert(SqString t, int pos) {
        return false;
    } // 将串t插入到当前串的第pos个位置上

    public boolean delete(int pos, int n) {
        // Check if the position and length are valid
        if (pos < 0 || pos >= length || n <= 0 || pos + n > length) {
            return false; // Invalid position or length
        }

        // Shift characters to the left
        for (int i = pos; i < length - n; i++) {
            chars[i] = chars[i + n]; // Shift elements left
        }

        // Update the length
        length -= n;

        // Optionally clear the last n elements
        for (int i = length; i < length + n; i++) {
            chars[i] = '\0'; // Or any other placeholder value
        }
        return true;
    } // 删除当前串从第pos个字符开始的连续len个字符

    public boolean remove(SqString t) {
        return false;
    } // 在当前串中删除所有与串t相等的子串，并返回删除的次数

    public void toUpperCase() {
    } // 将当前串的所有字母全部转换为大写字母

    public void toLowerCase() {
    } // 将当前串的所有字母全部转换为小写字母

    @Override
    public String toString() {    //将串转换为字符串。
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < length; i++) {
            ans.append(chars[i]);
        }
        return ans.toString();
    }

    public static void findMaxChar(SqString s){
        int max = -1, ch = 0;
        for (int i = 0; i < s.length; i++){
           if (s.chars[i] == max) ch++;
           else if (s.chars[i] > max) {
               ch = 1;
               max = s.chars[i];
           }
        }
        System.out.printf("最大字符为%c,出现次数为%d", (char)max, ch);
    }

    public static void deleteSubString(SqString s){
        char[] tar = {'a', 'b', 'c'};
        for (int i = 0; i < s.length; i++){
            if (!(s.chars[i] == 'a')) continue;
            i++;
            if (!(s.chars[i] == 'b')) continue;
            i++;
            if (!(s.chars[i] == 'c')) continue;
            s.delete(i - 2, 3);
        }
    }

    public static void main(String[] args) {
        char[] cstr1 = {'a', 'b', 'c', 'd', 'd', 'a', 'F', 'T', 'm'};
        SqString sq = new SqString(cstr1);
        SqString.findMaxChar(sq);
        System.out.println();
        SqString.deleteSubString(sq);
        System.out.println(sq);
       }
}