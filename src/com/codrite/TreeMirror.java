package com.codrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeMirror {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return answer(root);
    }

    public List<List<Integer>> answer(TreeNode tree) {
        if(tree.left == null && tree.right == null)
            return Collections.emptyList();

        List<List<Integer>> all = new ArrayList<>();

        List<Integer> n = new ArrayList<>();
        n.add(tree.val);
        all.add(n);

        all.addAll(swap(tree.left, tree.right, 1));

        return all;
    }

    List<List<Integer>> swap(TreeNode left, TreeNode right, int level) {
        if(left.right == null && left.left == null)
            return Collections.emptyList();

        List<List<Integer>> k = new ArrayList<>();

        List<Integer> m = new ArrayList<>();
        if(level%2==0){
            if(left.left != null)
                m.add(left.left.val);
            if(left.right != null)
                m.add(left.right.val);
            if(right.left != null)
                m.add(left.left.val);
            if(right.right != null)
                m.add(right.right.val);
            k.add(m);

            k.addAll(swap(left.left, left.right, level+1));
            k.addAll(swap(right.left, right.right, level+1));
        } else {
            if(right.right != null)
                m.add(right.right.val);
            if(right.left != null)
                m.add(left.left.val);
            if(left.right != null)
                m.add(left.right.val);
            if(left.left != null)
                m.add(left.left.val);
            k.add(m);

            k.addAll(swap(right.left, right.right, level+1));
            k.addAll(swap(left.left, left.right, level+1));
        }

        return k;
    }

}
