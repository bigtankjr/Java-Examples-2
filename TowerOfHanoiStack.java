/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoistack;

/**
 *
 * @author levelsfam
 */
  import java.util.Scanner;
   
   public class TowerOfHanoiStack {
     /** Main method */
     public static void main(String[] args) {
       // Create a Scanner
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number of disks to be stacked: ");
       int n = input.nextInt();
  
      // Find the solution by using a stack
      System.out.println("Move disks into stack");
      moveStackedDisks(n);
    }
  
    /** The method for finding the solution to move n disks
        from stack */
    public static void moveStackedDisks(int n) {
      for(int i = 1; i < n+1; i++){
          System.out.println("Move disk " + i + " into stack.");
      }
      System.out.println();
      while(n > 0){
          System.out.println("Move disk " + n + " out of the stack.");
          n--;
      }
      
    }
  }  
