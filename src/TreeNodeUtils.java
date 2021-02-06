import datastructures.TreeNode;

public class TreeNodeUtils {

    public static TreeNode createSimpleTestTree() {
        TreeNode head = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        head.left = two;
        head.right = three;
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        two.left = four;
        two.right = five;
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        three.left = six;
        three.right = seven;
        return head;
    }


}

