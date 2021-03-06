/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testavltree;

/**
 *
 * @author levelsfam
 */
public class AVLTree<E extends Comparable<E>> extends BST<E> {
      /** Create an empty AVL tree */
      public AVLTree() {
      }
    
      /** Create an AVL tree from an array of objects */
      public AVLTree(E[] objects) {
        super(objects);
      }
   
     @Override /** Override createNewNode to create an AVLTreeNode */
     protected AVLTreeNode<E> createNewNode(E e) {
       return new AVLTreeNode<E>(e);
     }
   
     @Override /** Insert an element and rebalance if necessary */
     public boolean insert(E e) {
       boolean successful = super.insert(e);
       if (!successful)
         return false; // e is already in the tree
       else {
         balancePath(e); // Balance from e to the root if necessary
       }
   
       return true; // e is inserted
     }
   
     /** Update the height of a specified node */
     private void updateHeight(AVLTreeNode<E> node) {
       if (node.left == null && node.right == null) // node is a leaf
         node.height = 0;
       else if (node.left == null) // node has no left subtree
         node.height = 1 + ((AVLTreeNode<E>)(node.right)).height;
       else if (node.right == null) // node has no right subtree
         node.height = 1 + ((AVLTreeNode<E>)(node.left)).height;
       else
         node.height = 1 +
           Math.max(((AVLTreeNode<E>)(node.right)).height,
           ((AVLTreeNode<E>)(node.left)).height);
     }
   
     /** Balance the nodes in the path from the specified
      * node to the root if necessary
      */
     private void balancePath(E e) {
       java.util.ArrayList<TreeNode<E>> path = path(e); 
       for (int i = path.size() - 1; i >= 0; i—–) {
         AVLTreeNode<E> A = (AVLTreeNode<E>)(path.get(i)); 
         updateHeight(A); 
         AVLTreeNode<E> parentOfA = (A == root) ? null : 
           (AVLTreeNode<E>)(path.get(i - 1));
   
         switch (balanceFactor(A)) {
           case -2:
             if (balanceFactor((AVLTreeNode<E>)A.left) <= 0) {
               balanceLL(A, parentOfA); // Perform LL rotation
             }
             else {
               balanceLR(A, parentOfA); // Perform LR rotation
             }
            break;
           case +2:
             if (balanceFactor((AVLTreeNode<E>)A.right) >= 0) {
             }
             else {
               balanceRL(A, parentOfA); // Perform RL rotation
             }
         }
       }
     }
   
     /** Return the balance factor of the node */
     private int balanceFactor(AVLTreeNode<E> node) {
       if (node.right == null) // node has no right subtree
         return -node.height;
       else if (node.left == null) // node has no left subtree
         return +node.height;
         return ((AVLTreeNode<E>)node.right).height -
           ((AVLTreeNode<E>)node.left).height;
     }
   
     /** Balance LL (see Figure ) */
     private void balanceLL(TreeNode<E> A, TreeNode<E> parentOfA) {
       TreeNode<E> B = A.left; // A is left-heavy and B is left-heavy
   
       if (A == root) {
       }
       else {
         if (parentOfA.left == A) {
           parentOfA.left = B;
         }
         else {
           parentOfA.right = B;
         }
       }
   
      A.left = B.right; // Make T2 the left subtree of A
      B.right = A; // Make A the left child of B
      updateHeight((AVLTreeNode<E>)A); 
      updateHeight((AVLTreeNode<E>)B);
    }
  
    /** Balance LR (see Figure ) */
    private void balanceLR(TreeNode<E> A, TreeNode<E> parentOfA) {
      TreeNode<E> B = A.left; // A is left-heavy
      TreeNode<E> C = B.right; // B is right-heavy
  
      if (A == root) {
        root = C;
      }
      else {
        if (parentOfA.left == A) {
          parentOfA.left = C;
        }
        else {
          parentOfA.right = C;
        }
