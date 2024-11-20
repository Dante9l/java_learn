package lessonData.ch5;

class TreeNode {
    char value; // 节点值
    TreeNode left; // 左子节点
    TreeNode right; // 右子节点

    public TreeNode(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    private TreeNode root;

    public BinaryTree(char value) {
        root = new TreeNode(value);
    }

    // 先序遍历输出每层的结点
    public void preOrderLevelOrder() {
        if (root == null) {
            return;
        }
        preOrderLevelOrderHelper(root, 0); // 从根节点开始
    }

    // 辅助方法：先序遍历并输出每层的结点
    private void preOrderLevelOrderHelper(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        // 输出当前层的结点
        System.out.println("Level " + level + ": " + node.value);

        // 递归遍历左子树
        if (node.left != null) {
            preOrderLevelOrderHelper(node.left, level + 1);
        }
        // 递归遍历右子树
        if (node.right != null) {
            preOrderLevelOrderHelper(node.right, level + 1);
        }
    }

    public void printLeafNodes() {
        if (root == null) {
            return;
        }
        printLeafNodesHelper(root);
    }

    // 辅助方法：递归输出所有叶子节点
    private void printLeafNodesHelper(TreeNode node) {
        if (node == null) {
            return;
        }

        // 如果是叶子节点（没有左子树和右子树），输出该节点的值
        if (node.left == null && node.right == null) {
            System.out.println("Leaf: " + node.value);
        }

        // 递归遍历左子树
        if (node.left != null) {
            printLeafNodesHelper(node.left);
        }

        // 递归遍历右子树
        if (node.right != null) {
            printLeafNodesHelper(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree('A');
        bt.root.left = new TreeNode('B');
        bt.root.right = new TreeNode('C');
        bt.root.left.left = new TreeNode('D');
        bt.root.left.right = new TreeNode('E');
        bt.root.right.left = new TreeNode('F');
        bt.root.right.right = new TreeNode('G');

        bt.printLeafNodes();
    }
}