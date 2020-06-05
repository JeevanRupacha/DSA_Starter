package com.play.trees;

public class PostOrder {
    public static void postorder(Node root){
        hepler(root);
    }

    private static void hepler(Node root) {
        if(root != null){
            hepler(root.left);
            hepler(root.right);
            System.out.print("  "+ root.key);

        }
    }
}
