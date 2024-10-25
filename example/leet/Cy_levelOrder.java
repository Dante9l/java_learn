package leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cy_levelOrder {
    public List<List<Integer>> zigzagLevelOrder(_TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<_TreeNode> q = new LinkedList<>();
        q.offer(root);

        return null;
    }
}
