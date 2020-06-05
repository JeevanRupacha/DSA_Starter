package com.play.trees;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTree {
   static Node root;

    public BinaryTree(){
        root = null;
    }

    public static void insertToNode(int key){
        root = insertHelper(root, key);
    }

    public static Node insertHelper(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(root.key < key){
            root.right = insertHelper(root.right, key);
        }else if(root.key > key){
            root.left = insertHelper(root.left, key);
        }
        return root;

    }






//    @Override
//    public String toString() {
//        return root.left +" " +root.right;
//    }

        @Test
    public void addingTest() {
            BinaryTree.insertToNode(8);
            BinaryTree.insertToNode(4);
            BinaryTree.insertToNode(6);
            BinaryTree.insertToNode(12);
            BinaryTree.insertToNode(10);
            BinaryTree.insertToNode(7);
            BinaryTree.insertToNode(3);
            BinaryTree.insertToNode(1);


            Assert.assertEquals(root.left.key, 4);
            Assert.assertEquals(root.left.right.key, 6);
            Assert.assertEquals(root.key, 8);
            Assert.assertEquals(root.right.key,12);
            Assert.assertEquals((SearchTree.search(BinaryTree.root,6).key),6);
//
//            DeletNode.delete(root, 8);
//            System.out.println((SearchTree.search(BinaryTree.root,1)).key);
//            System.out.println(root.key);
//            System.out.println(BSTTraversal.findLavel(root));

            InOrder.inorder(root);

//            BSTTraversal.bstPrint(root);

//            Assert.assertEquals(BinaryTree.search(root, 6).key, 6);

    }

//    public static void main(String[] args) {
//        BinaryTree.insertToNode(8);
//        BinaryTree.insertToNode(4);
//        BinaryTree.insertToNode(6);
//
//        System.out.println(root.left.key);
//        System.out.println(root.left.left);
//    }

}
