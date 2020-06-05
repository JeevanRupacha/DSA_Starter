package com.play.trees;

public class BSTTraversal {

    public static void  bstPrint(Node root){
        int lavel = findLavel(root);

        for(int i=0;i<lavel; i++){     ///O(n)
            bstPrintHelper(i,root);
        }
    }

    private static void bstPrintHelper(int lavel,Node root){


        if(root == null){
            return ;
        }
        if(lavel == 0 ){
            System.out.println("fun calling .......");
            System.out.println(" "  + root.key);
            return ;
        }
        else if(lavel > 0){
//            if(root.left == null){
//                bstPrintHelper(lavel-1,root.right);   ////O( 2 pow n)
//            }
//
//            if(root.right == null){
//                bstPrintHelper(lavel-1,root.left);    ////O(2 pow n)
//
//            }
//            System.out.println(root.left.key);
//            System.out.println(root.right.key);

          bstPrintHelper(lavel-1,root.left);    ////O(2 pow n)
          bstPrintHelper(lavel-1,root.right);   ////O( 2 pow n)
        }
    }

    public static int findLavel(Node root){
        if(root == null){
            return 0;
        }
        int maxLavel = Math.max(findLavel(root.left),findLavel(root.right));
        return 1+ maxLavel;
    }
}
