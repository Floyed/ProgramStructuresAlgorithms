package Tester;

import datastructures.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment1Tester {

    public Assignment1Tester() {
    }

    //=======================================================================
    // Part 1
    //=======================================================================

    public boolean isBalanced(TreeNode root) {
        int len = this.getLength(root);
        return len != -1;
    }

    public int getLength(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = this.getLength(root.left);
            int right = this.getLength(root.right);
            return left != -1 && right != -1 && Math.abs(left - right) <= 1 ? Math.max(left, right) + 1 : -1;
        }
    }


    //=======================================================================
    // Part 2
    //=======================================================================
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int ret = 2147483647;
            int level = 1;
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);

            while(!queue.isEmpty()) {
                int size = queue.size();

                for(int i = 0; i < size; ++i) {
                    TreeNode current = (TreeNode)queue.remove();
                    if (current.right == null && current.left == null) {
                        ret = Math.min(ret, level);
                    } else {
                        if (current.right != null) {
                            queue.add(current.right);
                        }

                        if (current.left != null) {
                            queue.add(current.left);
                        }
                    }
                }

                ++level;
            }

            return ret;
        }
    }


    //=======================================================================
    // Part 3
    //=======================================================================

    public void printLeafNodes(TreeNode root) {
        if (root != null) {
            this.printLeafNodes(root.left);
            if (root.left == null && root.right == null) {
                System.out.print(root.val + ", ");
            }

            this.printLeafNodes(root.right);
        }
    }

    //=======================================================================
    // Part 4
    //=======================================================================

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            this.traverse(root);
            return this.sum;
        }
    }

    public void traverse(TreeNode node) {
        if (node != null) {
            if (node.left != null && this.isLeaf(node.left)) {
                this.sum += node.left.val;
            }

            this.traverse(node.left);
            this.traverse(node.right);
        }
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

}
