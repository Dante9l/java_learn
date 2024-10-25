package lessonData.ch5;

import lessonData.ch2.SequenceList;

class Node<T> {
    private T data;
    public Node<T> lChild;
    public Node<T> rChild;

    public Node() {
        data = null;
        lChild = null;
        rChild = null;
    }

    public Node(T elem) {
        data = elem;
        lChild = null;
        rChild = null;
    }

    public T getData() {
        return data;
    } // 获取数据域

    public void setData(T data) {
        this.data = data;
    } // 设置数据域

    public Node<T> getlChild() {
        return lChild;
    } // 获取左孩子

    public void setlChild(Node<T> lChild) {
        this.lChild = lChild;
    }

    public Node<T> getrChild() {
        return rChild;
    } // 获取右孩子

    public void setrChild(Node<T> rChild) {
        this.rChild = rChild;
    }
}

class BinaryTree<T> {
    private final int maxNodes = 100;
    public Node<T> root;
    String bstr;

    public BinaryTree() { // 创建一棵空二叉树
        this.root = new Node<T>();
    }

    public BinaryTree(T x) { // 创建一棵以数据元素x为根结点的二叉树
        this.root = new Node<T>(x);
    }

    private int elementCount = 0;

    public void creatBTree(SequenceList<T> treeElement) {
        root = creatByPreOrder(treeElement);
    }

    // 根据先序遍历的先序序列字符串创建一棵二叉树
    private Node<T> creatByPreOrder(SequenceList<T> treeElement) {
        Node<T> node;
        ++elementCount;
        if (elementCount > treeElement.size() ||
                "#".equals(treeElement.value(elementCount))) {
            node = null;
        } else {
            node = new Node<T>(treeElement.value(elementCount));
            node.setlChild(creatByPreOrder(treeElement));
            node.setrChild(creatByPreOrder(treeElement));
        }
        return node;
    }

    // 在当前二叉树的parent节点中插入一个新的左子结点，若已存在左子树，则将该左子树变成新左子结点的左子树
    public boolean insertLeft(T x, Node<T> parent) {
        if (parent == null) {
            return false;
        }
        Node<T> p = new Node<T>(x);
        if (parent.lChild == null) {
            parent.lChild = p;
        } else {
            p.lChild = parent.lChild;
            parent.lChild = p;
        }
        return true;
    }

    // 在当前二叉树的parent节点中插入一个新的右子结点，若已存在右子树，则将该右子树变成新右子结点的左子树
    public boolean insertRight(T x, Node<T> parent) {
        if (parent == null) {
            return false;
        }
        Node<T> p = new Node<T>(x);
        if (parent.rChild == null) {
            parent.rChild = p;
        } else {
            p.rChild = parent.rChild;
            parent.rChild = p;
        }
        return true;
    }

    // 删除在当前二叉树的parent节点中的左子树
    public boolean deleteLeft(Node<T> parent) {
        if (parent == null) {
            return false;
        } else {
            parent.lChild = null;
            return true;
        }
    }

    public boolean deleteRight(Node<T> parent) {
        if (parent == null) {
            return false;
        } else {
            // 删除在当前二叉树的parent节点中的右子树
            parent.rChild = null;
            return true;
        }
    }

    public boolean search(T x) {
   return false;
    } // 在当前二叉树中查找数据x

    public void preOrder(Node<T> node) { // 前序遍历递归实现
        if (node == null) { // 递归调用的结束条件
            return;
        } else {
            System.out.print(node.getData()); // 访问当前根节点的数据域
            preOrder(node.lChild); // 前序递归遍历node的左子树
            preOrder(node.rChild); // 前序递归遍历node的右子树
        }
    }

    public void inOrder(Node<T> node) {
        if (node == null) {
            return;
        } else {
            inOrder(node.lChild);
            System.out.print(node.getData());
            inOrder(node.rChild);
        }
    }

    public void postOrder(Node<T> node) {
        if (node == null) {
            return;
        } else {
            postOrder(node.lChild);
            postOrder(node.rChild);
            System.out.print(node.getData());
        }
    }

    public void levelOrder() {
        Node<T>[] queue = new Node[this.maxNodes];
        if (this.root == null) return;

        int front = -1, rear = 0;
        queue[rear] = this.root; // 根引用入队

        while (front != rear) { // 队列非空执行循环
            System.out.print(queue[++front].getData()); // 访问结点数据域
            if (queue[front].lChild != null)  // 结点非空左孩子入队
                queue[++rear] = queue[front].lChild;

            if (queue[front].rChild != null)  // 结点非空右孩子入队
                queue[++rear] = queue[front].rChild;
        }
    }

    // 按指定方式遍历二叉树
    // i=0表示先序遍历，=1表示中序遍历，=2表示后序遍历，=3表示层次遍历
    public void traversal(int i) {
        switch (i) {
            case 0:
                preOrder(this.root);
                break;
            case 1:
                inOrder(this.root);
                break;
            case 2:
                postOrder(this.root);
                break;
            default:
                levelOrder();
        }
    }

    public int getHeight(Node<T> parent) {
        int lh, rh, max;
        if (parent != null) {
            lh = getHeight(parent.lChild);
            rh = getHeight(parent.rChild);
            max = Math.max(lh, rh);
            return (max + 1); // 1为根节点
        } else {
            return 0;
        }
    }

    @Override
    public String toString() { // 返回二叉链的括号表示串
        bstr = "";
        toString1(root);
        return bstr;
    }

    private void toString1(Node<T> t) { // 被DispBTNode方法调用
        if (t != null) {
            bstr += t.getData(); // 输出根结点值
            if (t.lChild != null || t.rChild != null) {
                bstr += "("; // 有孩子结点时输出"("
                toString1(t.lChild); // 递归输出左子树
                if (t.rChild != null) {
                    bstr += ","; // 有右孩子结点时输出","
                }
                toString1(t.rChild); // 递归输出右子树
                bstr += ")"; // 输出")"
            }
        }
    }

    public static void main(String[] args) {
        // 根据先序遍历序列构建二叉树
        String[] arr = {"A", "B", "D", "#", "G", "#", "#", "#", "C", "E", "#", "#", "F", "#", "#"};
        SequenceList<String> sq = new SequenceList<>();
        for (int i = 0; i < arr.length; i++) {
            sq.add(arr[i], i + 1);
        }
        BinaryTree<String> bt = new BinaryTree<>();
        bt.creatBTree(sq);
        System.out.println("bt: " + bt); // "A(B(D(,G)),C(E,F))";
        System.out.printf("bt的高度=%d\n", bt.getHeight(bt.root));

        System.out.print("二叉树前序遍历：");
        bt.traversal(0);
        System.out.print("\n二叉树中序遍历：");
        bt.traversal(1);
        System.out.print("\n二叉树后序遍历：");
        bt.traversal(2);
        System.out.print("\n二叉树层次遍历：");
        bt.traversal(3);
    }
}
