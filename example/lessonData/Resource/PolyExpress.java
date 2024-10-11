package lessonData.Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PolyNode {
    double coef;
    int exp;
    PolyNode next;

    public PolyNode() {
        this.next = null;
    }

    public PolyNode(double coef, int exp) {
        this.coef = coef;
        this.exp = exp;
        this.next = null;
    }

    public PolyNode(PolyNode elem) {
        this.coef = elem.coef;
        this.exp = elem.exp;
        this.next = null;
    }

    public int getExp() {
        return exp;
    }
}

public class PolyExpress {
    PolyNode head;

    public PolyExpress() {
        head = new PolyNode();
    }

    // 尾插法创建多项式
    public void createExp(double[] coef, int[] exp, int n) {
        PolyNode t = this.head;
        for (int i = 0; i < n; i++) {
            PolyNode s = new PolyNode(coef[i], exp[i]);
            t.next = s;
            t = s;
        }
        t.next = null;
    }

    // 根据指数倒序排序多项式
    public void sort() {
        PolyNode pre; // 用于遍历有序单链表
        // 判断是否为空链表
        PolyNode q = head.next;
        if (q == null) {
            return;
        }
        // 判断是否只有一个结点
        PolyNode p = head.next.next;
        if (p == null) {
            return;
        }
        // 将链表分成两部分：包含首结点的有序链表、p结点为首结点的单链表
        q.next = null;  // 构造只含一个数据结点的有序单链表
        // 遍历p结点为首结点的单链表
        while (p != null) {
            q = p.next;
            // 从头遍历有序单链表，找到比p结点的指数小的结点
            pre = head;
            while (pre.next != null && pre.next.exp > p.exp) {
                pre = pre.next;
            }
            p.next = pre.next;
            pre.next = p;
            p = q;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        PolyNode p = head.next;
        while (p != null) {
            if (p.coef > 0) {
                sb.append("+");
            }
            if (p.exp == 0) {
                sb.append(p.coef);
            } else if (p.exp == 1) {
                sb.append(p.coef).append("X");
            } else {
                sb.append(p.coef).append("X^").append(p.exp);
            }
            p = p.next;
        }
        String result = sb.toString();
        if (result.startsWith("+")) {
            result = result.substring(1);
        }
        return result;
    }

    // 有序单链表的二路归并
    public static PolyExpress add(PolyExpress l1, PolyExpress l2) {
        // 1. 初始化
        PolyExpress l3 = new PolyExpress();
        PolyNode p = l1.head.next;
        PolyNode q = l2.head.next;
        PolyNode t = l3.head;
        // 2. 遍历l1、l2
        PolyNode s;
        while (p != null && q != null) {
            if (p.exp > q.exp) {
                s = new PolyNode(p.coef, p.exp);
                t.next = s;
                t = s;
                p = p.next;
            } else if (p.exp < q.exp) {
                s = new PolyNode(q.coef, q.exp);
                t.next = s;
                t = s;
                q = q.next;
            } else {
                double coef = p.coef + q.coef;
                if (coef != 0) {
                    s = new PolyNode(coef, p.exp);
                    t.next = s;
                    t = s;
                }
                p = p.next;
                q = q.next;
            }
        }
        t.next = null;
        // 3. 判断l1、l2是否已经遍历完，没有就把剩余的元素增加到l3的后面
        if (p != null) {
            t.next = p;
        } else if (q != null) {
            t.next = q;
        }
        return l3;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // 重定向输入、输出流
        System.setIn(new FileInputStream("resources/ch2/abc.in"));
        //System.setOut(new PrintStream("resources/ch2/abc.out"));
        Scanner scanner = new Scanner(System.in);

        // 2. 初始化
        PolyExpress exp1 = new PolyExpress();
        PolyExpress exp2 = new PolyExpress();
        double[] coefs = new double[100];
        int[] exps = new int[100];

        // 3. 读取abc.in文件中的数据
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            coefs[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            exps[i] = scanner.nextInt();
        }
        exp1.createExp(coefs, exps, n);
        System.out.println("第1个多项式：" + exp1);

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            coefs[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            exps[i] = scanner.nextInt();
        }
        exp2.createExp(coefs, exps, n);
        System.out.println("第2个多项式：" + exp2);

        exp1.sort();
        System.out.println("第1个多项式排序后：" + exp1);
        exp2.sort();
        System.out.println("第2个多项式排序后：" + exp2);

        PolyExpress exp3 = PolyExpress.add(exp1, exp2);
        System.out.println("两个多项式相加：" + exp3);
    }
}
