package org.example;

import org.dataStructure.tree.BinarySearchTree;
import org.dataStructure.tree.TreeNode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        time();
    }

    public static void time() {
        long total = 0;
        for (int i = 0; i < 1000000000; i++) {
            long start = System.nanoTime();
            BinarySearchTree binaryTree = new BinarySearchTree();
            binaryTree.insert(new TreeNode(5));
            binaryTree.insert(new TreeNode(1));
            binaryTree.insert(new TreeNode(9));
            binaryTree.insert(new TreeNode(2));
            binaryTree.insert(new TreeNode(7));
            binaryTree.insert(new TreeNode(3));
            binaryTree.insert(new TreeNode(6));
            binaryTree.insert(new TreeNode(4));
            binaryTree.insert(new TreeNode(8));
            binaryTree.remove(3);
            long duration = (System.nanoTime() - start);
            total += duration;
        }
        System.out.println("Total time: " + total);
    }
}