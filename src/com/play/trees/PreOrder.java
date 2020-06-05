package com.play.trees;

public class PreOrder {

    public static void preorder(Node root){
        hepler(root);
    }

    private static void hepler(Node root) {
        if(root != null){
            System.out.print("  "+ root.key);
            hepler(root.left);
            hepler(root.right);

        }
    }
}
