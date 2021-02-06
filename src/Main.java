import Tester.Assignment1Tester;
import datastructures.TreeNode;

public class Main {
    public static void main(String[] args) {

        TreeNode simpleTree = TreeNodeUtils.createSimpleTestTree();
        Assignment1Tester assignment1Tester = new Assignment1Tester();
        System.out.println(assignment1Tester.isBalanced(simpleTree));
        System.out.println(assignment1Tester.minDepth(simpleTree));
        assignment1Tester.printLeafNodes(simpleTree);
        System.out.println();
        System.out.println(assignment1Tester.sumOfLeftLeaves(simpleTree));

    }
}
