package com.play.trees;

public class DeletNode {

    public static Node delete(Node root, int key){
        if(root == null) {return root; }

        //this runs until it finds the required key to delete
        if(key < root.key){
          root.left = delete(root.left, key);
        }else if(key > root.key ){
            root.right = delete(root.right, key);
        }
        ///runs after it finds the key to delete
        else{
            if(root.left == null && root.right == null){
                return root = null;
            }else if(root.left == null){
                 root = delete(root,root.right.key);
            }else if(root.right == null){
                root = delete(root,root.left.key);
            }else{
                int maxValue = Math.max(root.right.key,root.left.key);
                root.key = maxValue;
                root =delete(root.right, maxValue);
            }

        }

        return root;
    }
}
