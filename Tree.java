package com.sarvesh.javabasics;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) { 
        this.val = val; 
    }
}

public class Tree {

    public static void main(String[] args) {
        Tree engine = new Tree();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        
        System.out.println("Maximum Depth: " + engine.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
 
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        

        return Math.max(leftDepth, rightDepth) + 1;
    }
}