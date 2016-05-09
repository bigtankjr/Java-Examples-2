/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwordsfinalproject;

/**
 *
 * @author Benjamin Levels
 * Date: 4/20/2016
 * Advanced Java Programming
 * Final Project
 */

import java.util.*;

public class CountWordsFinalProject {

   public static void main(String[] args) {
    // Set text in a string
    String carlSchurzText = "You may tell me that my views are visionary,"
            + "that the destiny of this country is less exalted, that the "
    + "American people are less great than I think they are or ought to be – " 
    + "I answer, ideals are like stars, you will not succeed in touching them " 
    + "with your hands. But, like the seafaring man on the desert of water," 
    + "you choose them as your guides, and following them, you reach your destiny.";
    int dash = 23;
    // Create a TreeMap to hold words as key and count as value
    Map<String, Integer> map = new TreeMap<>();

    String[] greatWords = carlSchurzText.split("[ \n\t\r.,;:!?–(){}]");
    for (int k = 0; k < greatWords.length; k++) {
      String keyword = greatWords[k].toLowerCase();
      
      if (keyword.length() > 0) {
        if (!map.containsKey(keyword)) {
          map.put(keyword, 1);
        }
        else {
          int count = map.get(keyword);
          count++;
          map.put(keyword, count);
        }
      }
    }
    
    

    // Get all entries into a set
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    
    System.out.println("    WORDS      VALUES");
     for(int j = 0;j<dash;j++){
              System.out.print("-");}
              System.out.println();

    // Get key and value from each entry
    for (Map.Entry<String, Integer> entry: entrySet){
         
      String temp = entry.getKey();
      if(temp.length() == 9){
      System.out.println("|  " + entry.getKey() + "  |   " + entry.getValue() + "   |");
        for(int j = 0;j<dash;j++){
              System.out.print("-");
        }
              System.out.println();
      } else if (temp.length() == 8){
        System.out.println("|  " + entry.getKey() + "   |   " + entry.getValue() + "   |");
          for(int j = 0;j<dash;j++){
              System.out.print("-");
          }
              System.out.println();
        }else if (temp.length() == 7){
        System.out.println("|  " + entry.getKey() + "    |   " + entry.getValue() + "   |");
          for(int j = 0;j<dash;j++){
              System.out.print("-");
          }
              System.out.println();
        }else if (temp.length() == 6){
        System.out.println("|  " + entry.getKey() + "     |   " + entry.getValue() + "   |");
          for(int j = 0;j<dash;j++){
              System.out.print("-");
          }
              System.out.println();
        }else if (temp.length() == 5){
        System.out.println("|  " + entry.getKey() + "      |   " + entry.getValue() + "   |");
          for(int j = 0;j<dash;j++){
              System.out.print("-");
          }
              System.out.println();
        }else if (temp.length() == 4){
        System.out.println("|  " + entry.getKey() + "       |   " + entry.getValue() + "   |");
          for(int j = 0;j<dash;j++){
              System.out.print("-");
          }
              System.out.println();
        }else if (temp.length() == 3){
        System.out.println("|  " + entry.getKey() + "        |   " + entry.getValue() + "   |");
         for(int j = 0;j<dash;j++){
              System.out.print("-");
         }
              System.out.println();
        }else if (temp.length() == 2){
        System.out.println("|  " + entry.getKey() + "         |   " + entry.getValue() + "   |");
          for(int j = 0;j<dash;j++){
              System.out.print("-");
          }
              System.out.println();
        }else{
        System.out.println("|  " + entry.getKey() + "          |   " + entry.getValue() + "   |");
          for(int j = 0;j<dash;j++){
              System.out.print("-");
          }
              System.out.println();
        }
     
    }
  }
}


