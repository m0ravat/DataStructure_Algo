package org.dataStructure.tree;

public class TraverseTree {
    public void inOrderTraverse(TreeNode root) {
        inOrderTraverse(root.left);
        System.out.println(root.data);
        inOrderTraverse(root.right);
    }
    public void postOrderTraverse(TreeNode root){
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.println(root.data);
    }
    public void preOrderTraverse(TreeNode root){
        System.out.println(root.data);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
}
