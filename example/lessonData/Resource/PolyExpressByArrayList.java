package lessonData.Resource;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PolyExpressByArrayList {
    List<PolyNode> polylist;

    public PolyExpressByArrayList() {
        this.polylist = new ArrayList<>();
    }

    public void createPoly(double[] c, int[] e, int n) { // 建立多项式顺序表
        for (int i = 0; i < n; i++) {
            this.polylist.add(new PolyNode(c[i], e[i]));
        }
    }

    public void add(PolyNode node) { // 末尾添加一个多项式项
        this.polylist.add(node);
    }

    public void sort() {
        this.polylist.sort(Comparator.comparing(PolyNode::getExp).reversed());
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < polylist.size(); i++) {
            PolyNode a = polylist.get(i);
            if (i > 0 && a.coef > 0) {
                str.append("+");
            }
            if (a.exp == 0) {   //指数为0时不输出'x'
                str.append(a.coef);
            } else if (a.exp == 1) {    //指数为1时不输出指数
                str.append(a.coef).append("x");
            } else {
                str.append(a.coef).append("x^").append(a.exp);
            }
        }
        return str.toString();
    }

    public static PolyExpressByArrayList add(PolyExpressByArrayList l1,
                                             PolyExpressByArrayList l2) { // 两个多项式相加运算
        int i = 0, j = 0;
        PolyExpressByArrayList l3 = new PolyExpressByArrayList();
        while (i < l1.polylist.size() && j < l2.polylist.size()) {
            PolyNode a = l1.polylist.get(i);
            PolyNode b = l2.polylist.get(j);
            if (a.exp > b.exp) {
                l3.add(new PolyNode(a.coef, a.exp));
                i++;
            } else if (a.exp == b.exp) {
                double c = a.coef + b.coef;
                if (Math.abs(c) > 1e-6) {
                    l3.add(new PolyNode(a.coef + b.coef, a.exp));
                }
                i++;
                j++;
            } else {
                l3.add(new PolyNode(b.coef, b.exp));
                j++;
            }
        }
        while (i < l1.polylist.size()) {
            PolyNode a = l1.polylist.get(i);
            l3.add(new PolyNode(a.coef, a.exp));
            i++;
        }
        while (j < l2.polylist.size()) {
            PolyNode a = l2.polylist.get(j);
            l3.add(new PolyNode(a.coef, a.exp));
            j++;
        }
        return l3;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // 1. 重定向标准输入、输出流到abc.in、abc.out
        System.setIn(new FileInputStream("resources/ch2/abc.in"));
        //将标准输入流重定向至abc.in
        Scanner fin = new Scanner(System.in);

        //System.setOut(new PrintStream("resources/ch2/abc_link.out"));

        // 2. 初始化
        double[] c = new double[100];
        int[] e = new int[100];
        int n;

        // 3. 创建两个多项式
        n = fin.nextInt();              //输入第1个多项式的n
        for (int i = 0; i < n; i++) {   //输入第1个多项式系数数组a
            c[i] = fin.nextDouble();
        }
        for (int i = 0; i < n; i++) {   //输入第1个多项式指数数组b
            e[i] = fin.nextInt();
        }
        PolyExpressByArrayList l1 = new PolyExpressByArrayList();
        l1.createPoly(c, e, n);
        System.out.println("第1个多项式: " + l1);

        n = fin.nextInt();              //输入第2个多项式的n
        for (int i = 0; i < n; i++) {   //输入第2个多项式系数数组a
            c[i] = fin.nextDouble();
        }
        for (int i = 0; i < n; i++) {   //输入第2个多项式指数数组b
            e[i] = fin.nextInt();
        }
        PolyExpressByArrayList l2 = new PolyExpressByArrayList();
        l2.createPoly(c, e, n);
        System.out.println("第2个多项式: " + l2);

        // 4. 多项式按指数递减排序
        l1.sort();
        System.out.println("list1排序后: " + l1);
        l2.sort();
        System.out.println("list2排序后: " + l2);

        // 5. 两个多项式相加
        PolyExpressByArrayList l3 = PolyExpressByArrayList.add(l1, l2);//两多项式相加
        System.out.println("多项式相加后: " + l3);
    }
}

// 设置abc.in、abc.out的路径：
// System.setIn(new FileInputStream("./ch2/app/link/abc.in"));
// System.setOut(new PrintStream("./ch2/app/link/abc.out"));
// 打开Terminal，切换到src目录，运行以下命令
// javac -encoding utf8 .\ch2\app\link\PolyTest3.java
// java ch2.app.link.PolyTest3
