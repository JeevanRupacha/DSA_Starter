package com.play.trees;


// left --- root ---- right

public class InOrder {

    public static void inorder(Node root){
        hepler(root);
    }

    private static void hepler(Node root) {
        if(root != null){
            hepler(root.left);
            System.out.print("  "+ root.key);
            hepler(root.right);

        }
    }
}
