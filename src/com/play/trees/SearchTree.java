package com.play.trees;

public class SearchTree {

    public static Node search(Node roots, int key){
        if(roots == null || roots.key == key){
            return roots;
        }

        if(key < roots.key) return search(roots.left, key);

        return search(roots.right,key);

    }
}
