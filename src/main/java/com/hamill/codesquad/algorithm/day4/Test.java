package com.hamill.codesquad.algorithm.day4;

public class Test {
    public static void main(String[] args) {
        LinkedTree tree = new LinkedTree();

        TreeNode n7 = tree.makeBT(null, 'D', null);
        TreeNode n6 = tree.makeBT(null, 'E', null);
        TreeNode n5 = tree.makeBT(null, 'G', null);
        TreeNode n4 = tree.makeBT(null, 'F', n5);
        TreeNode n3 = tree.makeBT(n6, 'C', n4);
        TreeNode n2 = tree.makeBT(n7, 'B', null);
        TreeNode n1 = tree.makeBT(n2, 'A', n3);

        System.out.println("예제출력1");
        tree.preorder(n1);
        System.out.println();
        tree.inorder(n1);
        System.out.println();
        tree.postorder(n1);
    }
}
